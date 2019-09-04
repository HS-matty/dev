package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class u
  implements PropertyChangeListener
{
  final cj a;

  private u(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    this.a.a(((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  u(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.u
 * JD-Core Version:    0.6.0
 */