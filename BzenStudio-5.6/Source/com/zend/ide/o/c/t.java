package com.zend.ide.o.c;

import com.zend.ide.util.bh;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class t
  implements PropertyChangeListener
{
  private t()
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    boolean bool = ((Boolean)b.a("debugging.useOutputEncoding").c()).booleanValue();
    if (bool)
      h.a((bh)b.a("debugging.outputEncoding").c());
    else
      h.a(bh.a());
  }

  t(i parami)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.t
 * JD-Core Version:    0.6.0
 */