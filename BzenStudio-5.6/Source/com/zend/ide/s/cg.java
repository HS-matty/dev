package com.zend.ide.s;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class cg
  implements PropertyChangeListener
{
  final k a;

  private cg(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    k.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  cg(k paramk, y paramy)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.cg
 * JD-Core Version:    0.6.0
 */