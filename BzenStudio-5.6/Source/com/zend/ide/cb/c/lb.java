package com.zend.ide.cb.c;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class lb
  implements PropertyChangeListener
{
  final w a;

  private lb(w paramw)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    w.b(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  lb(w paramw, x paramx)
  {
    this(paramw);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.lb
 * JD-Core Version:    0.6.0
 */