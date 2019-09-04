package com.zend.ide.desktop;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class cb
  implements PropertyChangeListener
{
  final co a;

  private cb(co paramco)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    co.a(this.a, ((Integer)paramPropertyChangeEvent.getNewValue()).intValue());
  }

  cb(co paramco, bz parambz)
  {
    this(paramco);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.cb
 * JD-Core Version:    0.6.0
 */