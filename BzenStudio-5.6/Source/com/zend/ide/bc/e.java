package com.zend.ide.bc;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class e
  implements PropertyChangeListener
{
  final c a;

  private e(c paramc)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    c.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  e(c paramc, d paramd)
  {
    this(paramc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bc.e
 * JD-Core Version:    0.6.0
 */