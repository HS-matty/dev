package com.zend.ide.n;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class e extends ComponentAdapter
{
  final gt a;

  e(gt paramgt)
  {
  }

  public void componentShown(ComponentEvent paramComponentEvent)
  {
    gt.b(this.a).requestFocus();
    gt.b(this.a).setSelectedIndex(0);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.e
 * JD-Core Version:    0.6.0
 */