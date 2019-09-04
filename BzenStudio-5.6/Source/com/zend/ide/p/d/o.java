package com.zend.ide.p.d;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Graphics;
import javax.swing.Icon;

class o
  implements Icon
{
  Icon a = null;
  int b = 0;
  final bw c;

  o(bw parambw)
  {
  }

  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    if (paramComponent.getComponentOrientation().isLeftToRight())
      this.a.paintIcon(paramComponent, paramGraphics, paramInt1 + this.b * 10, paramInt2);
    else
      this.a.paintIcon(paramComponent, paramGraphics, paramInt1, paramInt2);
  }

  public int getIconWidth()
  {
    return this.a.getIconWidth() + this.b * 10;
  }

  public int getIconHeight()
  {
    return this.a.getIconHeight();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.o
 * JD-Core Version:    0.6.0
 */