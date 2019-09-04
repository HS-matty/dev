package com.zend.ide.o;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class da
  implements PropertyChangeListener
{
  final fp a;

  private da(fp paramfp)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.b(((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  da(fp paramfp, cz paramcz)
  {
    this(paramfp);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.da
 * JD-Core Version:    0.6.0
 */