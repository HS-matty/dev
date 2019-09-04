package com.zend.ide.p;

import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JPopupMenu;

class gb
  implements Runnable
{
  final Point a;
  final nb b;

  gb(nb paramnb, Point paramPoint)
  {
  }

  public void run()
  {
    pb.c(this.b.a).show(pb.a(this.b.a), this.a.x, this.a.y + pb.a(this.b.a).getVisibleRect().height);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.gb
 * JD-Core Version:    0.6.0
 */