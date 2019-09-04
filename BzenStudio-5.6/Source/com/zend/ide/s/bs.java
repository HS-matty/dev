package com.zend.ide.s;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bs
  implements PropertyChangeListener
{
  final k a;

  private bs(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.i = ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue();
  }

  bs(k paramk, y paramy)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.bs
 * JD-Core Version:    0.6.0
 */