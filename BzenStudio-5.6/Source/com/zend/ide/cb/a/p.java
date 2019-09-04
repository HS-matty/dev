package com.zend.ide.cb.a;

import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class p extends MouseMotionAdapter
{
  final db a;

  private p(db paramdb)
  {
  }

  public void mouseDragged(MouseEvent paramMouseEvent)
  {
    Point localPoint1 = paramMouseEvent.getPoint();
    Point localPoint2 = db.a(this.a).getLocation();
    localPoint2.translate(0, localPoint1.y - db.b(this.a).y);
    Rectangle localRectangle = paramMouseEvent.getComponent().getParent().getBounds();
    Insets localInsets = paramMouseEvent.getComponent().getParent().getInsets();
    int i = localRectangle.y + localInsets.top + db.c(this.a);
    int j = localRectangle.height - localInsets.bottom - db.c(this.a) - db.d(this.a);
    if (localPoint2.y < i)
      localPoint2.setLocation(localPoint2.x, i);
    else if (localPoint2.y > j)
      localPoint2.setLocation(localPoint2.x, j);
    db.a(this.a).setLocation(localPoint2);
    db.a(this.a, localPoint2.y);
    db.e(this.a);
    db.f(this.a);
    db.a(this.a, (db.a(this.a).getY() + db.d(this.a) / 2) / db.g(this.a));
  }

  p(db paramdb, eb parameb)
  {
    this(paramdb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.p
 * JD-Core Version:    0.6.0
 */