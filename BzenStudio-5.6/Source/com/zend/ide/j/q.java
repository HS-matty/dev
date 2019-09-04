package com.zend.ide.j;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class q
  implements PropertyChangeListener
{
  final e a;

  private q(e parame)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (this.a.a != null)
      this.a.a.a(((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  q(e parame, n paramn)
  {
    this(parame);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.q
 * JD-Core Version:    0.6.0
 */