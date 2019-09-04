package com.zend.ide.n;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class sf
  implements PropertyChangeListener
{
  final gv a;

  private sf(gv paramgv)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    boolean bool = ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue();
    Boolean localBoolean = (Boolean)paramPropertyChangeEvent.getOldValue();
    if ((localBoolean != null) && (bool != localBoolean.booleanValue()))
    {
      gv.a(bool ? 0 : 2);
      this.a.repaint();
    }
  }

  sf(gv paramgv, rf paramrf)
  {
    this(paramgv);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.sf
 * JD-Core Version:    0.6.0
 */