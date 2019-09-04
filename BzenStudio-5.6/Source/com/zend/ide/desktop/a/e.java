package com.zend.ide.desktop.a;

import com.zend.ide.l.g;
import com.zend.ide.o.fk;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class e
  implements PropertyChangeListener
{
  final b a;

  private e(b paramb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if ((!b.a(this.a).e()) || (b.b(this.a)))
      b.c(this.a).a(((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
  }

  e(b paramb, c paramc)
  {
    this(paramb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.a.e
 * JD-Core Version:    0.6.0
 */