package com.gabriel.tutorial.maven.boxing;

public class Box {
  private Dimensions dimensions;
  private double weight;

  Box(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return dimensions + " (" + weight + " kg)";
  }

}
