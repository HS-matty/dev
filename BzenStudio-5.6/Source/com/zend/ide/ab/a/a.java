package com.zend.ide.ab.a;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JScrollBar;

class a extends ComponentAdapter
{
  final d a;

  a(d paramd)
  {
  }

  public void componentResized(ComponentEvent paramComponentEvent)
  {
    d.b(this.a).setVisibleAmount(d.a(this.a).c());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.a
 * JD-Core Version:    0.6.0
 */