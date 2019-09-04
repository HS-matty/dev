package com.zend.ide.be.a;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;

class bw extends AbstractBorder
{
  private boolean a;

  public bw(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.setColor(Color.white);
    int i;
    int j;
    if (this.a)
    {
      i = paramInt2 + paramInt4 - 1;
      j = 1;
      while (j < paramInt3)
      {
        paramGraphics.drawLine(j, i, j, i);
        j += 3;
      }
    }
    else
    {
      i = paramInt1 + paramInt3 - 1;
      j = 1;
      while (j < paramInt4)
      {
        paramGraphics.drawLine(i, j, i, j);
        j += 3;
      }
    }
  }

  public Insets getBorderInsets(Component paramComponent)
  {
    if (this.a)
      return new Insets(0, 0, 1, 0);
    return new Insets(0, 0, 0, 1);
  }

  public Insets getBorderInsets(Component paramComponent, Insets paramInsets)
  {
    paramInsets.left = (paramInsets.top = paramInsets.right = paramInsets.bottom = 0);
    if (this.a)
      paramInsets.bottom = 1;
    else
      paramInsets.right = 1;
    return paramInsets;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bw
 * JD-Core Version:    0.6.0
 */