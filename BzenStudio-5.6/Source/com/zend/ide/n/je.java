package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class je
  implements PropertyChangeListener
{
  final k a;

  private je(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    k.e(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  je(k paramk, mc parammc)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.je
 * JD-Core Version:    0.6.0
 */