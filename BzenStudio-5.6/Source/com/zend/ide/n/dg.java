package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class dg
  implements PropertyChangeListener
{
  final gz a;

  private dg(gz paramgz)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.setTabSize(((Integer)paramPropertyChangeEvent.getNewValue()).intValue());
  }

  dg(gz paramgz, cy paramcy)
  {
    this(paramgz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dg
 * JD-Core Version:    0.6.0
 */