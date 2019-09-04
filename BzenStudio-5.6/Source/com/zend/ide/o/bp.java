package com.zend.ide.o;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bp
  implements PropertyChangeListener
{
  final fk a;

  private bp(fk paramfk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    fk.c(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  bp(fk paramfk, m paramm)
  {
    this(paramfk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.bp
 * JD-Core Version:    0.6.0
 */