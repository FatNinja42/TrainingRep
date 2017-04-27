package com.gabriel.tutorial.maven;

import com.gabriel.tutorial.maven.boxing.Box;
import com.gabriel.tutorial.maven.boxing.BoxFactory;
import com.gabriel.tutorial.maven.boxing.Dimensions;

/**
 * Created by gabriel.georgiu on 4/26/2017.
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello again World!");

    BoxFactory boxFactory = new BoxFactory();
    Dimensions dimensions = new Dimensions(10, 5, 20);
    Box box = boxFactory.createEmptyBox(dimensions);
    System.out.println("The box created: " + box);
  }
}
