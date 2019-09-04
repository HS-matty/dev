package com.zend.ide.n.td;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class q
  implements PropertyChangeListener
{
  final l a;

  private q(l paraml)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    l.d(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  q(l paraml, m paramm)
  {
    this(paraml);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.q
 * JD-Core Version:    0.6.0
 */