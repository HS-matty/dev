package com.zend.ide.u;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ba
  implements PropertyChangeListener
{
  final b a;

  private ba(b paramb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    b.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  ba(b paramb, u paramu)
  {
    this(paramb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.ba
 * JD-Core Version:    0.6.0
 */