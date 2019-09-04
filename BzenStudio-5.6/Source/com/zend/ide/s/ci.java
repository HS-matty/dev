package com.zend.ide.s;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ci
  implements PropertyChangeListener
{
  final k a;

  private ci(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.a(((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  ci(k paramk, y paramy)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.ci
 * JD-Core Version:    0.6.0
 */