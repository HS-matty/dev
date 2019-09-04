package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class dh
  implements PropertyChangeListener
{
  final gz a;

  private dh(gz paramgz)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.setLineWrap(((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  dh(gz paramgz, cy paramcy)
  {
    this(paramgz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dh
 * JD-Core Version:    0.6.0
 */