package org.testing.Lab1.Ex9;

public class Rectangle {
  private int height;
  private int width;

  public Rectangle() {
  }

  public Rectangle(int height, int width) {
    this.height = height;
    this.width = width;
  }


  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }
  public int getArea() {
    return this.height * this.width;
  }

  public int getPerimeter() {
    return 2 * (this.width + this.height);
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "height=" + height +
        ", width=" + width +
        '}';
  }

}
