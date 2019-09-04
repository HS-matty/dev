package com.zend.ide.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class v
  implements PropertyChangeListener
{
  final cj a;

  private v(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    cj.j(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  v(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.v
 * JD-Core Version:    0.6.0
 */