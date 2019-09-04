package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class zd
  implements PropertyChangeListener
{
  private zd()
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    bm.a(((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  zd(fb paramfb)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zd
 * JD-Core Version:    0.6.0
 */