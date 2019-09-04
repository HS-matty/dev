package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class k
  implements PropertyChangeListener
{
  final bz a;

  private k(bz parambz)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    bz.b(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  k(bz parambz, h paramh)
  {
    this(parambz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.k
 * JD-Core Version:    0.6.0
 */