package com.zend.ide.cb.c;

import com.zend.ide.cb.a.n;
import com.zend.ide.util.ct;
import com.zend.ide.util.dj;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ib
  implements PropertyChangeListener
{
  final w a;

  private ib(w paramw)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    int i = ((Integer)paramPropertyChangeEvent.getNewValue()).intValue();
    if (i < 1)
      throw new dj(ct.a(1404));
    if (i != w.c(this.a))
    {
      w.b(this.a, i);
      if (w.b(this.a) != null)
        w.b(this.a).a(w.c(this.a));
    }
  }

  ib(w paramw, x paramx)
  {
    this(paramw);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.ib
 * JD-Core Version:    0.6.0
 */