package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class dt
  implements PropertyChangeListener
{
  final cj a;

  private dt(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    cj.g(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  dt(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.dt
 * JD-Core Version:    0.6.0
 */