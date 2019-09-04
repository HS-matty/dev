package com.zend.ide.o;

import com.zend.ide.o.d.a;
import com.zend.ide.o.d.bj;
import com.zend.ide.util.bh;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class bq
  implements PropertyChangeListener
{
  final de a;

  private bq(de paramde)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    bh localbh1 = bh.a();
    de.a(this.a).a(localbh1);
    bh localbh2 = localbh1;
    boolean bool = ((Boolean)b.a("debugging.useOutputEncoding").c()).booleanValue();
    if (bool)
      localbh2 = (bh)b.a("debugging.outputEncoding").c();
    de.b(this.a).a(localbh2);
  }

  bq(de paramde, by paramby)
  {
    this(paramde);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.bq
 * JD-Core Version:    0.6.0
 */