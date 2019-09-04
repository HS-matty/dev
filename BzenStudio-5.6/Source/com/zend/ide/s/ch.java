package com.zend.ide.s;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ch
  implements PropertyChangeListener
{
  final k a;

  private ch(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    k.d(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  ch(k paramk, y paramy)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.ch
 * JD-Core Version:    0.6.0
 */