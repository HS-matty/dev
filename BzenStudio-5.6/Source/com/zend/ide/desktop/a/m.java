package com.zend.ide.desktop.a;

import com.zend.ide.f.zc.b.c;
import com.zend.ide.f.zc.b.j;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

class m
  implements PropertyChangeListener
{
  final k a;

  private m(k paramk)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (k.a(this.a) != null)
    {
      String str = k.a(this.a).d();
      j[] arrayOfj = (j[])(j[])paramPropertyChangeEvent.getNewValue();
      int i = 0;
      for (int j = 0; (i == 0) && (j < arrayOfj.length); j++)
      {
        j localj = arrayOfj[j];
        if (!localj.d().equals(str))
          continue;
        if (!localj.c().equals(k.a(this.a).c()))
        {
          k.a(this.a, localj);
          k.b(this.a).a(0, k.a(this.a));
        }
        i = 1;
      }
      if (i == 0)
      {
        k.a(this.a, com.zend.ide.f.zc.b.l.b());
        k.b(this.a).a(0, k.a(this.a));
        com.zend.ide.f.zc.b.l.f();
      }
    }
  }

  m(k paramk, l paraml)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.a.m
 * JD-Core Version:    0.6.0
 */