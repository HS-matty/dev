package com.zend.ide.p.d;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bb
  implements PropertyChangeListener
{
  final bp a;

  private bb(bp parambp)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.setFileHidingEnabled(!((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  bb(bp parambp, f paramf)
  {
    this(parambp);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bb
 * JD-Core Version:    0.6.0
 */