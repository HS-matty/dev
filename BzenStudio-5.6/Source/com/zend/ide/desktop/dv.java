package com.zend.ide.desktop;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class dv
  implements PropertyChangeListener
{
  final br a;

  private dv(br parambr)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    br.b(this.a);
  }

  dv(br parambr, bt parambt)
  {
    this(parambr);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.dv
 * JD-Core Version:    0.6.0
 */