package com.zend.ide.v;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class gb
  implements PropertyChangeListener
{
  final r a;

  private gb(r paramr)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    r.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  gb(r paramr, fb paramfb)
  {
    this(paramr);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.gb
 * JD-Core Version:    0.6.0
 */