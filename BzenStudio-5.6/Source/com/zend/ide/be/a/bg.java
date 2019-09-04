package com.zend.ide.be.a;

import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;

class bg extends MouseInputAdapter
{
  private Component a;
  private int b;
  private Point c;
  private int d;
  private int e;
  private int f;
  private int g;
  final g h;

  public bg(g paramg, Component paramComponent, int paramInt)
  {
    this.a = paramComponent;
    this.b = paramInt;
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    this.c = paramMouseEvent.getPoint();
    this.d = g.a(this.h).getWidth();
    this.e = g.a(this.h).getHeight();
    Component localComponent = g.b(this.h) != null ? g.b(this.h) : g.c(this.h);
    if (this.b == 3)
    {
      this.f = g.d(this.h);
      this.g = (localComponent.getX() + localComponent.getWidth());
    }
    else if (this.b == 2)
    {
      this.f = localComponent.getX();
      this.g = (this.d - g.d(this.h));
    }
    else if (this.b == 0)
    {
      this.f = g.d(this.h);
      this.g = (localComponent.getY() + localComponent.getHeight());
    }
    else if (this.b == 1)
    {
      this.f = localComponent.getY();
      this.g = (this.e - g.d(this.h));
    }
  }

  public void mouseDragged(MouseEvent paramMouseEvent)
  {
    a(paramMouseEvent);
    g.a(this.h).invalidate();
    g.a(this.h).validate();
  }

  void a(MouseEvent paramMouseEvent)
  {
    int i;
    double d1;
    if (this.b == 3)
    {
      i = this.a.getLocation().x + g.d(this.h) + paramMouseEvent.getPoint().x - this.c.x;
      d1 = a(i) / this.d;
      g.a(this.h, g.b(d1));
    }
    else if (this.b == 2)
    {
      i = this.a.getLocation().x + paramMouseEvent.getPoint().x - this.c.x;
      d1 = 1.0D - a(i) / this.d;
      g.b(this.h, g.b(d1));
    }
    else if (this.b == 0)
    {
      i = this.a.getLocation().y + g.d(this.h) + paramMouseEvent.getPoint().y - this.c.y;
      d1 = a(i) / this.e;
      g.c(this.h, g.b(d1));
    }
    else if (this.b == 1)
    {
      i = this.a.getLocation().y + paramMouseEvent.getPoint().y - this.c.y;
      d1 = 1.0D - a(i) / this.e;
      g.d(this.h, g.b(d1));
    }
  }

  private int a(int paramInt)
  {
    paramInt = paramInt < this.f ? this.f : paramInt;
    paramInt = paramInt > this.g ? this.g : paramInt;
    return paramInt;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bg
 * JD-Core Version:    0.6.0
 */