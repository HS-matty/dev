package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class od
  implements PropertyChangeListener
{
  final xc a;

  private od(xc paramxc)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    xc.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  od(xc paramxc, nd paramnd)
  {
    this(paramxc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.od
 * JD-Core Version:    0.6.0
 */