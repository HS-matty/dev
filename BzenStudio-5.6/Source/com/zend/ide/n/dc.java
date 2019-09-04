package com.zend.ide.n;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class dc
  implements PropertyChangeListener
{
  final gz a;

  private dc(gz paramgz)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.setBackground((Color)paramPropertyChangeEvent.getNewValue());
  }

  dc(gz paramgz, cy paramcy)
  {
    this(paramgz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dc
 * JD-Core Version:    0.6.0
 */