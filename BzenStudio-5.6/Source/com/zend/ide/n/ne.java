package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ne
  implements PropertyChangeListener
{
  final k a;

  private ne(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    k.b(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  ne(k paramk, mc parammc)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ne
 * JD-Core Version:    0.6.0
 */