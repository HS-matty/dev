package com.zend.ide.w.b;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class d extends WindowAdapter
{
  final bp a;

  d(bp parambp)
  {
  }

  public void windowClosing(WindowEvent paramWindowEvent)
  {
    bp.a(this.a).j();
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.d
 * JD-Core Version:    0.6.0
 */