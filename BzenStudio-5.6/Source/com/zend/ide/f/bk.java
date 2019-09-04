package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bk
  implements PropertyChangeListener
{
  final cj a;

  private bk(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    cj.c(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  bk(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bk
 * JD-Core Version:    0.6.0
 */