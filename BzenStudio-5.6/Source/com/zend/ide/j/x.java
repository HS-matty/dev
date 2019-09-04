package com.zend.ide.j;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class x
  implements PropertyChangeListener
{
  final m a;

  private x(m paramm)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    m.a(!((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  x(m paramm, w paramw)
  {
    this(paramm);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.x
 * JD-Core Version:    0.6.0
 */