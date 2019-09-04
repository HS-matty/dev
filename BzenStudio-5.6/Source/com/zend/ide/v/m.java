package com.zend.ide.v;

import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class m
  implements PropertyChangeListener
{
  final d a;
  final n b;

  m(n paramn, d paramd)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    Object localObject = paramPropertyChangeEvent.getNewValue();
    if (localObject != null)
      n.a(this.b, (Component)localObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.m
 * JD-Core Version:    0.6.0
 */