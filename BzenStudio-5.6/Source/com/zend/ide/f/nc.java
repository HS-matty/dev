package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class nc
  implements PropertyChangeListener
{
  final r a;

  private nc(r paramr)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    r.a(this.a, true);
  }

  nc(r paramr, mc parammc)
  {
    this(paramr);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.nc
 * JD-Core Version:    0.6.0
 */