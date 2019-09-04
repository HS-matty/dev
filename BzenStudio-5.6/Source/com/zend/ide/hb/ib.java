package com.zend.ide.hb;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ib
  implements PropertyChangeListener
{
  final vb a;

  ib(vb paramvb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    vb.a(this.a, (Color)paramPropertyChangeEvent.getNewValue());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.ib
 * JD-Core Version:    0.6.0
 */