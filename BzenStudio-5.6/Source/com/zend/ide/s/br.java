package com.zend.ide.s;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class br
  implements PropertyChangeListener
{
  final bp a;

  private br(bp parambp)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    bp.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  br(bp parambp, bq parambq)
  {
    this(parambp);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.br
 * JD-Core Version:    0.6.0
 */