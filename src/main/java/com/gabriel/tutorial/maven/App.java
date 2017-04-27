package com.gabriel.tutorial.maven;

import com.gabriel.tutorial.maven.domain.MyPersonalObject;
import com.gabriel.tutorial.maven.generator.MyObjectGenerator;
import com.gabriel.tutorial.maven.repository.ObjectRepository;

/**
 * Created by gabriel.georgiu on 4/26/2017.
 */
public class App {
    public static void main(String[] args) {
        ObjectRepository repository = new ObjectRepository();
        MyPersonalObject object = MyObjectGenerator.generateObject("Important object", "Don't lose it!");
        repository.add(object);
        System.out.println(repository.get("Important object"));
    }
}
