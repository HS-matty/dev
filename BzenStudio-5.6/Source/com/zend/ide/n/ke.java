package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ke
  implements PropertyChangeListener
{
  final k a;

  private ke(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    k.c(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  ke(k paramk, mc parammc)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ke
 * JD-Core Version:    0.6.0
 */