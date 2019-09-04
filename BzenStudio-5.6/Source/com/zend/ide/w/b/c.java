package com.zend.ide.w.b;

import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class c extends MouseMotionAdapter
{
  final n a;

  private c(n paramn)
  {
  }

  public void mouseDragged(MouseEvent paramMouseEvent)
  {
    Point localPoint1 = paramMouseEvent.getPoint();
    Point localPoint2 = n.a(this.a).getLocation();
    localPoint2.translate(localPoint1.x - n.b(this.a).x, 0);
    Rectangle localRectangle = paramMouseEvent.getComponent().getParent().getBounds();
    Insets localInsets = paramMouseEvent.getComponent().getParent().getInsets();
    int i = localRectangle.x + localInsets.left + n.c(this.a);
    int j = localRectangle.width - localInsets.right - n.c(this.a) - n.d(this.a);
    if (localPoint2.x < i)
      localPoint2.setLocation(i, localPoint2.y);
    else if (localPoint2.x > j)
      localPoint2.setLocation(j, localPoint2.y);
    n.a(this.a).setLocation(localPoint2);
    n.a(this.a, localPoint2.x);
    n.e(this.a);
    n.f(this.a);
  }

  c(n paramn, o paramo)
  {
    this(paramn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.c
 * JD-Core Version:    0.6.0
 */