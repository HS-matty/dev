package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ba
  implements PropertyChangeListener
{
  final cj a;

  private ba(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    cj.a(this.a, ((Integer)paramPropertyChangeEvent.getNewValue()).intValue());
  }

  ba(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.ba
 * JD-Core Version:    0.6.0
 */