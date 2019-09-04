package com.zend.ide.cb.c;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class kb
  implements PropertyChangeListener
{
  final w a;

  private kb(w paramw)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    w.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  kb(w paramw, x paramx)
  {
    this(paramw);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.kb
 * JD-Core Version:    0.6.0
 */