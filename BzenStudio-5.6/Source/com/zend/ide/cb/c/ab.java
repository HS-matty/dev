package com.zend.ide.cb.c;

import com.zend.ide.cb.a.l;
import com.zend.ide.cb.a.n;
import com.zend.ide.d.co;
import com.zend.ide.y.m;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ab
  implements PropertyChangeListener
{
  final w a;

  private ab(w paramw)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    w.b(this.a).a(m.a().c());
    this.a.d().a(m.a().c());
  }

  ab(w paramw, x paramx)
  {
    this(paramw);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.ab
 * JD-Core Version:    0.6.0
 */