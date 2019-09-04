package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class yd
  implements PropertyChangeListener
{
  final cj a;

  private yd(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    cj.k(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  yd(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.yd
 * JD-Core Version:    0.6.0
 */