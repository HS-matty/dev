package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bf
  implements PropertyChangeListener
{
  final cj a;

  private bf(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    cj.d(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  bf(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bf
 * JD-Core Version:    0.6.0
 */