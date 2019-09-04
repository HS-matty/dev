package com.zend.ide.p.e.a;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicArrowButton;

class d extends BasicArrowButton
{
  final e a;

  public d(e parame, int paramInt, Color paramColor1, Color paramColor2, Color paramColor3, Color paramColor4)
  {
    super(paramInt, paramColor1, paramColor2, paramColor3, paramColor4);
  }

  public Dimension getPreferredSize()
  {
    int i = 16;
    if (e.a(this.a) != null)
    {
      switch (e.b(this.a).getOrientation())
      {
      case 1:
        i = e.c(this.a).getWidth();
        break;
      case 0:
        i = e.d(this.a).getHeight();
      }
      i = Math.max(i, 5);
    }
    return new Dimension(i, i);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.a.d
 * JD-Core Version:    0.6.0
 */