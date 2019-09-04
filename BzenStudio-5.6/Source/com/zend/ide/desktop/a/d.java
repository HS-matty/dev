package com.zend.ide.desktop.a;

import com.zend.ide.l.g;
import com.zend.ide.o.bt;
import com.zend.ide.o.fk;
import com.zend.ide.util.ct;
import com.zend.ide.util.dj;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class d
  implements PropertyChangeListener
{
  final b a;

  private d(b paramb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    int i = ((Integer)paramPropertyChangeEvent.getNewValue()).intValue();
    if ((i < 0) || (i >= 65536))
      throw new dj(ct.a(1061));
    if ((!b.a(this.a).e()) || (b.b(this.a)))
    {
      b.c(this.a).a(i);
      b.a(this.a).a(i);
    }
  }

  d(b paramb, c paramc)
  {
    this(paramb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.a.d
 * JD-Core Version:    0.6.0
 */