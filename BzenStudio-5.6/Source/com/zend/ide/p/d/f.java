package com.zend.ide.p.d;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingUtilities;

class f extends WindowAdapter
{
  final Container a;
  final bp b;

  f(bp parambp, Container paramContainer)
  {
  }

  public void windowClosing(WindowEvent paramWindowEvent)
  {
    this.b.cancelSelection();
    SwingUtilities.invokeLater(new ab(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.f
 * JD-Core Version:    0.6.0
 */