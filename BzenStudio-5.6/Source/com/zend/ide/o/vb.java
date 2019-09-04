package com.zend.ide.o;

import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class vb
  implements ChangeListener
{
  final fp a;
  final ub b;

  vb(ub paramub, fp paramfp)
  {
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    SwingUtilities.invokeLater(new wb(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.vb
 * JD-Core Version:    0.6.0
 */