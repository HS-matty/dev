package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class dw
  implements PropertyChangeListener
{
  private dw()
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    f.b(((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  dw(df paramdf)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dw
 * JD-Core Version:    0.6.0
 */