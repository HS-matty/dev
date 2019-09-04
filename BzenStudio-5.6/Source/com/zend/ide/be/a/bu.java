package com.zend.ide.be.a;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;

class bu extends AbstractBorder
{
  int a = 3;

  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt4 - this.a;
    paramGraphics.setColor(paramGraphics.getColor().darker());
    paramGraphics.drawLine(3, this.a, 3, i);
    paramGraphics.drawLine(6, this.a, 6, i);
    paramGraphics.setColor(Color.white);
    paramGraphics.drawLine(4, this.a, 4, i);
    paramGraphics.drawLine(7, this.a, 7, i);
  }

  public Insets getBorderInsets(Component paramComponent)
  {
    return getBorderInsets(paramComponent, new Insets(0, 0, 0, 0));
  }

  public Insets getBorderInsets(Component paramComponent, Insets paramInsets)
  {
    paramInsets.left = (paramInsets.top = paramInsets.right = paramInsets.bottom = 0);
    paramInsets.left = 10;
    return paramInsets;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bu
 * JD-Core Version:    0.6.0
 */