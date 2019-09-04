package com.zend.ide.n.td;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class o
  implements PropertyChangeListener
{
  final l a;

  private o(l paraml)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    l.b(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  o(l paraml, m paramm)
  {
    this(paraml);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.o
 * JD-Core Version:    0.6.0
 */