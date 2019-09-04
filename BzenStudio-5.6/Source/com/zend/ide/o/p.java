package com.zend.ide.o;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class p
  implements PropertyChangeListener
{
  final fk a;

  private p(fk paramfk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    fk.a(this.a).a((Color)paramPropertyChangeEvent.getNewValue());
  }

  p(fk paramfk, m paramm)
  {
    this(paramfk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.p
 * JD-Core Version:    0.6.0
 */