package com.gabriel.tutorial.maven.boxing;

public class Dimensions {
  private double widthX;
  private double widthY;
  private double height;

  public Dimensions(double widthX, double widthY, double height) {
    this.widthX = widthX;
    this.widthY = widthY;
    this.height = height;
  }

  public double getWidthX() {
    return widthX;
  }

  public double getWidthY() {
    return widthY;
  }

  public double getHeight() {
    return height;
  }

  @Override
  public String toString() {
    return widthX + " x " + widthY + " x " + height;
  }
}
