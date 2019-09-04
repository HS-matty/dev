package com.zend.ide.desktop.d;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class l
  implements PropertyChangeListener
{
  final a a;

  private l(a parama)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    a.b(this.a, paramPropertyChangeEvent.getNewValue().toString().equalsIgnoreCase("PHP5"));
    if (a.l(this.a) != null)
      a.m(this.a);
  }

  l(a parama, e parame)
  {
    this(parama);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.d.l
 * JD-Core Version:    0.6.0
 */