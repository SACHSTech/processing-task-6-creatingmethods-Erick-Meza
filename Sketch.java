import processing.core.PApplet;

/**
 * A program that will draw shapes in rows with different colours
 * @author: Erick M
 */

public class Sketch extends PApplet {

  /**
   * Called once at the beginning of execution, put your size all in this method
   */

  public void settings() {
    // put your size call here
    size(800, 420);
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  public void setup() {
    background(0, 20, 0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */

  public void draw() {

    // Draws the ftc logo in rows with different colours
    ftcLogo(800, 20, 60, 255, 0, 0);
    ftcLogo(800, 80, 60, 255, 165, 8);
    ftcLogo(800, 140, 60, 255, 255, 0);
    ftcLogo(800, 200, 60, 0, 255, 0);
    ftcLogo(800, 260, 60, 10, 120, 172);
    ftcLogo(800, 320, 60, 0, 0, 255);
    ftcLogo(800, 380, 60, 143, 59, 222);

    // Draws the ellipses under the ftc logo in rows
    secondObject(800, 60, 60);
    secondObject(800, 120, 60);
    secondObject(800, 180, 60);
    secondObject(800, 240, 60);
    secondObject(800, 300, 60);
    secondObject(800, 360, 60);

    // Determines the coordinates of an object based on length and width
    fltObjectXOne(5);
    fltObjectXTwo(5);
    fltObjectYOne(5);
    fltObjectYTwo(5);

  }

  /**
   * Creates a method to draw the FTC logo
   * @param fltWidth
   * @param fltHeight
   * @param fltImageNumber
   * @param fltRedValue
   * @param fltGreenValue
   * @param fltBlueValue
   */

  private void ftcLogo(float fltWidth, float fltHeight, float fltImageNumber, float fltRedValue, float fltGreenValue,
      float fltBlueValue) {

    // Defines the stroke weight and colour
    strokeWeight(2);
    stroke(fltRedValue, fltGreenValue, fltBlueValue);

    // Creates a loop to change the colour of the drawing
    for (int i = 80; i < fltWidth - 60; i += fltImageNumber) {
      fill(0, 0, 0, 0);
      triangle(i, fltHeight, i, fltHeight + 20, i + 20, fltHeight + 10);
      ellipse(i + 20, fltHeight + 10, 20, 20);
      quad(i + 20, fltHeight + 10, i + 34, fltHeight - 2, i + 46, fltHeight + 10, i + 34, fltHeight + 20);
    }
  }

  /**
   * Creates a method to create the objects under the ftc logo
   * @param fltWidth
   * @param fltHeight
   * @param fltImageNumber
   */

  private void secondObject(float fltWidth, float fltHeight, float fltImageNumber) {

    // defines the stroke colour, weight, and fill colour
    stroke(0, 0, 0);
    strokeWeight(1);
    fill(255, 255, 255);

    // Creates a loop to print out circles in a row
    for (int i = 100; i < fltWidth - 80; i += fltImageNumber) {
      ellipse(i, fltHeight, 5, 5);
    }
  }

  /**
   * A method that determines the first coordinate of an object
   * @param fltWidth
   * @return (width / 2f) - fltWidth / 2
   */

  private float fltObjectXOne(float fltWidth) {

    // Calculates and returns the resulting coordinate
    return ((width / 2f) - fltWidth / 2);
  }

  /**
   * A method that determines the second coordinate of an object
   * @param fltWidth
   * @return (width / 2f) + fltWidth / 2
   */

  private float fltObjectXTwo(float fltWidth) {

    // Calculates and returns the resulting coordinate
    return ((width / 2f) + fltWidth / 2);
  }

  /**
   * A method that determines the third coordinate of an object
   * @param fltLength
   * @return (height / 2f) - fltLength / 2
   */

  private float fltObjectYOne(float fltLength) {

    // Calculates and returns the resulting coordinate
    return ((height / 2f) - fltLength / 2);
  }

  /**
   * A method that determines the fourth coordinate of an object
   * @param fltLength
   * @return (height / 2f) + fltLength / 2
   */

  private float fltObjectYTwo(float fltLength) {

    // Calculates and returns the resulting coordinate
    return ((height / 2f) + fltLength / 2);
  }
}
