package com.zend.ide.w.b;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

class p
  implements ComponentListener
{
  final n a;

  private p(n paramn)
  {
  }

  public void componentResized(ComponentEvent paramComponentEvent)
  {
    if (n.g(this.a) < 0)
      n.h(this.a);
    double d = (n.a(this.a).getX() + n.d(this.a) / 2) / n.i(this.a);
    n.a(this.a, (int)(paramComponentEvent.getComponent().getWidth() * d) - n.d(this.a) / 2);
    this.a.layoutContainer(n.a(this.a).getParent());
    n.b(this.a, n.a(this.a).getParent().getWidth());
  }

  public void componentMoved(ComponentEvent paramComponentEvent)
  {
  }

  public void componentShown(ComponentEvent paramComponentEvent)
  {
  }

  public void componentHidden(ComponentEvent paramComponentEvent)
  {
  }

  p(n paramn, o paramo)
  {
    this(paramn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.p
 * JD-Core Version:    0.6.0
 */