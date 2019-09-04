package com.zend.ide.o;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class l
  implements PropertyChangeListener
{
  final dj a;

  private l(dj paramdj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.a((Color)paramPropertyChangeEvent.getNewValue());
  }

  l(dj paramdj, k paramk)
  {
    this(paramdj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.l
 * JD-Core Version:    0.6.0
 */