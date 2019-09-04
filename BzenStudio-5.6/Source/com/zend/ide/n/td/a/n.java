package com.zend.ide.n.td.a;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class n
  implements PropertyChangeListener
{
  final k a;

  private n(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    k.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  n(k paramk, l paraml)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.n
 * JD-Core Version:    0.6.0
 */