package com.zend.ide.s;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class cl
  implements PropertyChangeListener
{
  final k a;

  private cl(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.a(((Integer)paramPropertyChangeEvent.getNewValue()).intValue());
  }

  cl(k paramk, y paramy)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.cl
 * JD-Core Version:    0.6.0
 */