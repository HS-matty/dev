package com.zend.ide.f;

import com.zend.ide.f.b.j;
import com.zend.ide.m.bd;
import com.zend.ide.util.c.f;

class t
  implements com.zend.ide.util.c.d
{
  final de b;

  t(de paramde)
  {
  }

  public Object k()
  {
    com.zend.ide.b.d[] arrayOfd1 = bm.f();
    com.zend.ide.b.d[] arrayOfd2 = bm.j();
    bd[] arrayOfbd = bm.g();
    if ((kd.b()) && (arrayOfd1.length > 0) && (arrayOfd2.length > 0) && (arrayOfbd.length > 0))
    {
      de.a(this.b, new Object[arrayOfd2.length + arrayOfd1.length + 1]);
      de.a(this.b)[0] = j.k;
      System.arraycopy(arrayOfd2, 0, de.a(this.b), 1, arrayOfd2.length);
      System.arraycopy(arrayOfd1, 0, de.a(this.b), arrayOfd2.length + 1, arrayOfd1.length);
      de.b(this.b).d();
      de.a(this.b, null);
      this.b.b();
      return null;
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.t
 * JD-Core Version:    0.6.0
 */