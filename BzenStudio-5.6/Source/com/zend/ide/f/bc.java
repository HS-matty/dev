package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bc
  implements PropertyChangeListener
{
  final cj a;

  private bc(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    cj.e(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  bc(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bc
 * JD-Core Version:    0.6.0
 */