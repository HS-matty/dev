package com.zend.ide.be.a;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

class d
  implements Icon
{
  private d()
  {
  }

  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    paramGraphics.setColor(Color.black);
    paramGraphics.drawLine(paramInt1 + 4, paramInt2 + 7, paramInt1 + 10, paramInt2 + 13);
    paramGraphics.drawLine(paramInt1 + 5, paramInt2 + 7, paramInt1 + 11, paramInt2 + 13);
    paramGraphics.drawLine(paramInt1 + 10, paramInt2 + 7, paramInt1 + 4, paramInt2 + 13);
    paramGraphics.drawLine(paramInt1 + 11, paramInt2 + 7, paramInt1 + 5, paramInt2 + 13);
  }

  public int getIconWidth()
  {
    return 16;
  }

  public int getIconHeight()
  {
    return 16;
  }

  d(c paramc)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.d
 * JD-Core Version:    0.6.0
 */