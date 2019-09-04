package com.zend.ide.o;

import com.zend.ide.bd.c;
import com.zend.ide.i.s;
import com.zend.ide.util.c.f;
import com.zend.ide.util.g;

class gf
  implements Runnable
{
  final s a;
  final bt b;

  gf(bt parambt, s params)
  {
  }

  public void run()
  {
    String str = this.a.e();
    this.b.bl().a(this.a.f());
    this.b.bl().a(true);
    this.b.bl().h();
    c.b().e().a(str, true);
    long l = this.b.bm() * 1000;
    this.b.j.a(l, l);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.gf
 * JD-Core Version:    0.6.0
 */