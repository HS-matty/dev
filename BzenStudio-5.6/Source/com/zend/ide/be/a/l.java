package com.zend.ide.be.a;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

class l
  implements Icon
{
  private l()
  {
  }

  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    paramGraphics.setColor(Color.black);
    paramGraphics.drawLine(paramInt1 + 4, paramInt2 + 11, paramInt1 + 10, paramInt2 + 11);
    paramGraphics.drawLine(paramInt1 + 4, paramInt2 + 12, paramInt1 + 10, paramInt2 + 12);
  }

  public int getIconWidth()
  {
    return 16;
  }

  public int getIconHeight()
  {
    return 16;
  }

  l(k paramk)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.l
 * JD-Core Version:    0.6.0
 */