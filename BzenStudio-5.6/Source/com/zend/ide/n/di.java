package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class di
  implements PropertyChangeListener
{
  final gz a;

  private di(gz paramgz)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.setWrapStyleWord(((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  di(gz paramgz, cy paramcy)
  {
    this(paramgz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.di
 * JD-Core Version:    0.6.0
 */