package com.zend.ide.be.a;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.Icon;

class bq
  implements Icon
{
  public static final Icon a = new bq(1);
  public static final Icon b = new bq(7);
  public static final Icon c = new bq(5);
  public static final Icon d = new bq(3);
  private int e;

  private bq(int paramInt)
  {
    this.e = paramInt;
  }

  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    paramGraphics.setColor(Color.WHITE);
    paramGraphics.translate(paramInt1, paramInt2);
    switch (this.e)
    {
    case 1:
      paramGraphics.fillPolygon(new Polygon(new int[] { 3, 13, 8 }, new int[] { 11, 11, 5 }, 3));
      break;
    case 7:
      paramGraphics.fillPolygon(new Polygon(new int[] { 11, 11, 6 }, new int[] { 3, 13, 8 }, 3));
      break;
    case 5:
      paramGraphics.fillPolygon(new Polygon(new int[] { 3, 13, 8 }, new int[] { 6, 6, 11 }, 3));
      break;
    case 3:
      paramGraphics.fillPolygon(new Polygon(new int[] { 7, 7, 12 }, new int[] { 3, 13, 8 }, 3));
    case 2:
    case 4:
    case 6:
    }
    paramGraphics.translate(-paramInt1, -paramInt2);
  }

  public int getIconWidth()
  {
    return 16;
  }

  public int getIconHeight()
  {
    return 16;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bq
 * JD-Core Version:    0.6.0
 */