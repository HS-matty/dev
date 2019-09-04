package com.zend.ide.n.td.a;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class m
  implements PropertyChangeListener
{
  final k a;

  private m(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    k.a(this.a, ((Integer)paramPropertyChangeEvent.getNewValue()).intValue());
  }

  m(k paramk, l paraml)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.m
 * JD-Core Version:    0.6.0
 */