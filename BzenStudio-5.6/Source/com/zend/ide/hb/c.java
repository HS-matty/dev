package com.zend.ide.hb;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingUtilities;

class c extends WindowAdapter
{
  final qb a;

  c(qb paramqb)
  {
  }

  public void windowClosing(WindowEvent paramWindowEvent)
  {
    qb.c(this.a).a(-1);
  }

  public void windowGainedFocus(WindowEvent paramWindowEvent)
  {
    SwingUtilities.invokeLater(new q(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.c
 * JD-Core Version:    0.6.0
 */