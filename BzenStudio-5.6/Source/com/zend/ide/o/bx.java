package com.zend.ide.o;

import com.zend.ide.o.c.bq;
import com.zend.ide.o.c.y;
import com.zend.ide.util.cu;

public class bx
  implements cu
{
  private fk a;
  private fq b;
  private y c;
  private bq d;
  private com.zend.ide.o.c.bp e;
  private fm f;

  public bx(fk paramfk)
  {
    this.a = paramfk;
  }

  public fq b()
  {
    if (this.b == null)
      this.b = g();
    return this.b;
  }

  public y a()
  {
    if (this.c == null)
      this.c = b();
    return this.c;
  }

  public bq d()
  {
    if (this.d == null)
      this.d = i();
    return this.d;
  }

  public com.zend.ide.o.c.bp e()
  {
    if (this.e == null)
      this.e = j();
    return this.e;
  }

  public fm f()
  {
    if (this.f == null)
      this.f = k();
    return this.f;
  }

  private fq g()
  {
    fq localfq = new fq(this.a);
    com.zend.ide.util.bp.a(localfq);
    localfq.a(this.a);
    return localfq;
  }

  private y b()
  {
    y localy = new y(this.a);
    com.zend.ide.util.bp.a(localy);
    return localy;
  }

  private bq i()
  {
    bq localbq = new bq(this.a);
    localbq.a(this.a);
    com.zend.ide.util.bp.a(localbq);
    return localbq;
  }

  private com.zend.ide.o.c.bp j()
  {
    com.zend.ide.o.c.bp localbp = new com.zend.ide.o.c.bp(this.a);
    localbp.a(this.a);
    com.zend.ide.util.bp.a(localbp);
    return localbp;
  }

  private fm k()
  {
    fm localfm = new fm(this.a);
    localfm.a(this.a);
    com.zend.ide.util.bp.a(localfm);
    return localfm;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.bx
 * JD-Core Version:    0.6.0
 */