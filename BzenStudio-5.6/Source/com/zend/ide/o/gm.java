package com.zend.ide.o;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class gm
  implements PropertyChangeListener
{
  final x a;

  private gm(x paramx)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    x.a(this.a, (Integer)paramPropertyChangeEvent.getNewValue());
  }

  gm(x paramx, z paramz)
  {
    this(paramx);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.gm
 * JD-Core Version:    0.6.0
 */