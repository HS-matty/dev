package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class de
  implements PropertyChangeListener
{
  final lb a;

  private de(lb paramlb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    lb.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  de(lb paramlb, zd paramzd)
  {
    this(paramlb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.de
 * JD-Core Version:    0.6.0
 */