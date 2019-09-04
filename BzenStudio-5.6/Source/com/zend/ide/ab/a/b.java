package com.zend.ide.ab.a;

import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class b extends MouseAdapter
{
  final t a;

  private b(t paramt)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    d.a(this.a.h).requestFocusInWindow();
    int i = a(paramMouseEvent.getY(), t.b(this.a));
    int j = i / t.b(this.a);
    long l = j * 16;
    int k = a(paramMouseEvent.getX() + t.c(this.a).left + 2, t.d(this.a));
    int m = (k / t.d(this.a) - 12) / 3;
    if ((m < 0) || (m > 15))
      return;
    if (t.a(this.a) + l + m <= d.d(this.a.h))
    {
      d.c(this.a.h, t.a(this.a) + l + m);
      d.c(this.a.h);
      this.a.repaint();
    }
  }

  private int a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
      return 0;
    int i = paramInt1 % paramInt2;
    return paramInt1 - i;
  }

  b(t paramt, e parame)
  {
    this(paramt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.b
 * JD-Core Version:    0.6.0
 */