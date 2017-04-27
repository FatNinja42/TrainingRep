package com.gabriel.tutorial.maven.generator;

import com.gabriel.tutorial.maven.domain.MyPersonalObject;

/**
 * Created by gabriel.georgiu on 4/27/2017.
 */
public class MyObjectGenerator {
    public static MyPersonalObject generateObject(String name, String description) {
        return new MyPersonalObject(name, description);
    }
}
