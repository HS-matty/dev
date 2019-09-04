package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class dv
  implements PropertyChangeListener
{
  private dv()
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    f.c(((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  dv(df paramdf)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dv
 * JD-Core Version:    0.6.0
 */