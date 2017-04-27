package com.gabriel.tutorial.maven.boxing;

public class BoxFactory {

  public BoxFactory() {

  }

  public Box createEmptyBox(Dimensions dimensions) throws IllegalArgumentException {

    if (!isValid(dimensions)) {
      throw new IllegalArgumentException("Invalid dimensions supplied");
    }

    Box box = new Box(dimensions);
    box.setWeight(1);
    return box;
  }

  private boolean isValid(Dimensions dimensions) {

    if (dimensions == null) {
      return false;
    }
    
    boolean widthXInRange = dimensions.getWidthX() > 0 && dimensions.getWidthX() < 100;
    boolean widthYInRange = dimensions.getWidthY() > 0 && dimensions.getWidthY() < 100;
    boolean heightInRange = dimensions.getHeight() > 0 && dimensions.getHeight() < 50;

    return widthXInRange && widthYInRange && heightInRange;
  }


}
