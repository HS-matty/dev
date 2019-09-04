package com.zend.ide.i;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class h
  implements PropertyChangeListener
{
  final p a;

  private h(p paramp)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    p.a(this.a, paramPropertyChangeEvent.getNewValue().toString());
  }

  h(p paramp, f paramf)
  {
    this(paramp);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.h
 * JD-Core Version:    0.6.0
 */