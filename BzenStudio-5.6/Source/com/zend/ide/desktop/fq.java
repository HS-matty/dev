package com.zend.ide.desktop;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class fq
  implements PropertyChangeListener
{
  final eo a;

  private fq(eo parameo)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    eo.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  fq(eo parameo, dw paramdw)
  {
    this(parameo);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.fq
 * JD-Core Version:    0.6.0
 */