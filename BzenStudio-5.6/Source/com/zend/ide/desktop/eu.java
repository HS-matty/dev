package com.zend.ide.desktop;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class eu
  implements PropertyChangeListener
{
  final ek a;

  private eu(ek paramek)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    ek.a(this.a, ((Integer)paramPropertyChangeEvent.getNewValue()).intValue());
  }

  eu(ek paramek, eh parameh)
  {
    this(paramek);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.eu
 * JD-Core Version:    0.6.0
 */