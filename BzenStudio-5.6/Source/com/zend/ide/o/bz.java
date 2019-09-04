package com.zend.ide.o;

import com.zend.ide.t.m;
import com.zend.ide.util.c.h;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bz
  implements PropertyChangeListener
{
  final de a;

  private bz(de paramde)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    boolean bool = ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue();
    de.a(this.a).a(bool);
    h.c().a(new ob(this));
  }

  bz(de paramde, by paramby)
  {
    this(paramde);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.bz
 * JD-Core Version:    0.6.0
 */