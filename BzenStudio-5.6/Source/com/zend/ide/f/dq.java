package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class dq
  implements PropertyChangeListener
{
  final cj a;

  private dq(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    cj.i(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  dq(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.dq
 * JD-Core Version:    0.6.0
 */