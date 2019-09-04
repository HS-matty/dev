package com.zend.ide.cb.a;

import com.zend.ide.d.co;
import com.zend.ide.n.gz;
import com.zend.ide.y.m;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class h
  implements PropertyChangeListener
{
  final yc a;

  private h(yc paramyc)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (yc.a(this.a) != null)
      yc.a(this.a).a(m.a().c());
  }

  h(yc paramyc, g paramg)
  {
    this(paramyc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.h
 * JD-Core Version:    0.6.0
 */