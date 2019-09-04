package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ae
  implements PropertyChangeListener
{
  final lb a;

  private ae(lb paramlb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    lb.b(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  ae(lb paramlb, zd paramzd)
  {
    this(paramlb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ae
 * JD-Core Version:    0.6.0
 */