package com.zend.ide.u;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextField;

class x extends WindowAdapter
{
  final ce a;

  x(ce paramce)
  {
  }

  public void windowClosing(WindowEvent paramWindowEvent)
  {
    this.a.d();
  }

  public void windowOpened(WindowEvent paramWindowEvent)
  {
    ce.e(this.a).selectAll();
    ce.e(this.a).grabFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.x
 * JD-Core Version:    0.6.0
 */