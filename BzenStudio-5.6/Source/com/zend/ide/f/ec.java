package com.zend.ide.f;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

class ec
  implements Border
{
  final j a;

  ec(j paramj)
  {
  }

  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.setColor(Color.GRAY);
    paramGraphics.drawLine(paramInt1 + 1, paramInt2 + paramInt4 - 1, paramInt1 + paramInt3 - 2, paramInt2 + paramInt4 - 1);
  }

  public Insets getBorderInsets(Component paramComponent)
  {
    return new Insets(0, 0, 1, 0);
  }

  public boolean isBorderOpaque()
  {
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.ec
 * JD-Core Version:    0.6.0
 */