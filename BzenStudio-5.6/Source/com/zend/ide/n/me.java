package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class me
  implements PropertyChangeListener
{
  final k a;

  private me(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    k.d(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  me(k paramk, mc parammc)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.me
 * JD-Core Version:    0.6.0
 */