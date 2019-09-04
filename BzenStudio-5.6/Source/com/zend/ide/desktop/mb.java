package com.zend.ide.desktop;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class mb
  implements PropertyChangeListener
{
  final eo a;

  private mb(eo parameo)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    eo.a(this.a);
  }

  mb(eo parameo, dw paramdw)
  {
    this(parameo);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.mb
 * JD-Core Version:    0.6.0
 */