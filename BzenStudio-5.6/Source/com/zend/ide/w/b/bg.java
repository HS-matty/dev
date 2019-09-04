package com.zend.ide.w.b;

import java.awt.Point;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

class bg
  implements Runnable
{
  final Point a;
  final bf b;

  bg(bf parambf, Point paramPoint)
  {
  }

  public void run()
  {
    bf.b(this.b).getViewport().setViewPosition(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bg
 * JD-Core Version:    0.6.0
 */