package com.zend.ide.o.n;

import com.zend.ide.util.ct;
import com.zend.ide.util.dj;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class h
  implements PropertyChangeListener
{
  final f a;

  private h(f paramf)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    int i = ((Integer)paramPropertyChangeEvent.getNewValue()).intValue();
    if ((i < 0) || (i >= 65536))
      throw new dj(ct.a(1061));
    if (this.a.c())
    {
      this.a.b();
      this.a.a();
    }
  }

  h(f paramf, g paramg)
  {
    this(paramf);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.n.h
 * JD-Core Version:    0.6.0
 */