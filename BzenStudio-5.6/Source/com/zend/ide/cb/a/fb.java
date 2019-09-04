package com.zend.ide.cb.a;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

class fb
  implements ComponentListener
{
  final db a;

  private fb(db paramdb)
  {
  }

  public void componentResized(ComponentEvent paramComponentEvent)
  {
    if (db.h(this.a) < 0)
      db.i(this.a);
    db.a(this.a, (int)(paramComponentEvent.getComponent().getHeight() * db.j(this.a)) - db.d(this.a) / 2);
    db.b(this.a, db.a(this.a).getParent().getHeight());
    this.a.layoutContainer(db.a(this.a).getParent());
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

  fb(db paramdb, eb parameb)
  {
    this(paramdb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.fb
 * JD-Core Version:    0.6.0
 */