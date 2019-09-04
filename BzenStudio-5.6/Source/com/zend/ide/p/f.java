package com.zend.ide.p;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JOptionPane;

class f extends ComponentAdapter
{
  final ba a;

  f(ba paramba)
  {
  }

  public void componentShown(ComponentEvent paramComponentEvent)
  {
    this.a.setValue(JOptionPane.UNINITIALIZED_VALUE);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.f
 * JD-Core Version:    0.6.0
 */