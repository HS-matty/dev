package com.zend.ide.n.td;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class p
  implements PropertyChangeListener
{
  final l a;

  private p(l paraml)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    l.c(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  p(l paraml, m paramm)
  {
    this(paraml);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.p
 * JD-Core Version:    0.6.0
 */