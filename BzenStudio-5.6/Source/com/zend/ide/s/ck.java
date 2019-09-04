package com.zend.ide.s;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ck
  implements PropertyChangeListener
{
  final k a;

  private ck(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.b(((Integer)paramPropertyChangeEvent.getNewValue()).intValue());
  }

  ck(k paramk, y paramy)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.ck
 * JD-Core Version:    0.6.0
 */