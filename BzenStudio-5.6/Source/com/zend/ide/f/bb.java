package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bb
  implements PropertyChangeListener
{
  final cj a;

  private bb(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    cj.h(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  bb(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bb
 * JD-Core Version:    0.6.0
 */