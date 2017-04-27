package com.gabriel.tutorial.maven.boxing;

public class BoxFactory {

  public BoxFactory() {

  }

  public Box createEmptyBox(Dimensions dimensions) {
    Box box = new Box(dimensions);
    box.setWeight(1);
    return box;
  }
}
