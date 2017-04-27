package com.gabriel.tutorial.maven.repository;

import com.gabriel.tutorial.maven.domain.MyPersonalObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabriel.georgiu on 4/27/2017.
 */
public class ObjectRepository {
    private List<MyPersonalObject> personalObjects;

    public ObjectRepository() {
        personalObjects = new ArrayList<>();
    }

    public void add(MyPersonalObject object) {
        personalObjects.add(object);
    }

    public String get(String name) {
        return personalObjects.stream()
                .filter(o -> o.getName().equals(name))
                .findFirst()
                .toString();
    }
}
