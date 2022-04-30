package objects;

import java.awt.Shape;
import java.awt.geom.GeneralPath;

import roomplanner.Object2D;

public class Chair extends Object2D {
  public Chair() {
    xPosition = 160;
    yPosition = 80;
    colour = "blau";
    orientation = 0;
    isVisible = true;
    width = 45;
    height = 45;
    draw();
  }

  public Chair(int initX, int initY) {
    xPosition = initX;
    yPosition = initY;
    colour = "blau";
    orientation = 0;
    isVisible = true;
    width = 45;
    height = 45;
    draw();
  }

  protected Shape giveCurrentShape() {
    GeneralPath stuhl = new GeneralPath();
    stuhl.moveTo(0, 0);
    stuhl.lineTo(width, 0);
    stuhl.lineTo(width + (width / 20 + 1), height);
    stuhl.lineTo(-(width / 20 + 1), height);
    stuhl.lineTo(0, 0);
    stuhl.moveTo(0, (width / 10 + 1));
    stuhl.lineTo(width, (width / 10 + 1));
    return transform(stuhl);
  }

  public void skaliere(double faktor) {
    width = (int) Math.round(width * faktor);
    height = (int) Math.round(height * faktor);
    draw();
  }
}
