package com.zend.ide.desktop.a;

import com.zend.ide.l.k;
import com.zend.ide.l.u;
import com.zend.ide.o.bc;
import com.zend.ide.o.bt;
import com.zend.ide.o.cf;
import com.zend.ide.o.dk;
import com.zend.ide.o.fk;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.c;
import java.beans.PropertyChangeListener;
import java.io.File;

public class b
  implements k, cu
{
  private fk a;
  private bt m;
  private com.zend.ide.l.g b;
  private com.zend.ide.y.e c;
  private PropertyChangeListener d = new d(this, null);
  private PropertyChangeListener e = new f(this, null);
  private PropertyChangeListener f = new e(this, null);
  private PropertyChangeListener g = new g(this, null);
  private boolean h;
  String i;
  int j;
  String k;
  boolean l;

  public b(fk paramfk, bt parambt, com.zend.ide.l.g paramg)
  {
    this.a = paramfk;
    this.m = parambt;
    this.b = paramg;
    c();
  }

  private void c()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.c = new com.zend.ide.y.e(localf);
    localf.a("debugging.localDebugging", this.f);
    localf.a("debugging.debugPort", this.d);
    localf.a("debugging.serverHost", this.e);
    localf.a("debugging.tempFilesLocation", this.g);
    this.c.a("debugging.debugPort");
    this.c.a("debugging.serverHost");
    this.c.a("debugging.localDebugging");
    this.c.a("debugging.tempFilesLocation");
  }

  public Object m()
  {
    cf localcf = null;
    localcf = (cf)this.a.s();
    localcf.a(this.h);
    localcf.a(this.j);
    localcf.a(this.i);
    localcf.b(this.k);
    localcf.b(this.l);
    return localcf;
  }

  public void a(Object paramObject)
  {
    cf localcf = (cf)paramObject;
    this.h = localcf.c();
    this.i = localcf.e();
    this.j = localcf.d();
    this.k = localcf.f();
    this.l = localcf.g();
    if (com.zend.ide.l.f.b != null)
      com.zend.ide.l.f.b.a(this.h);
    if (this.h)
    {
      localcf.a(((Integer)com.zend.ide.y.b.a("debugging.debugPort").c()).intValue());
      localcf.a(com.zend.ide.y.b.a("debugging.serverHost").c().toString());
      localcf.b(((File)com.zend.ide.y.b.a("debugging.tempFilesLocation").c()).getPath());
      localcf.b(((Boolean)com.zend.ide.y.b.a("debugging.localDebugging").c()).booleanValue());
    }
    this.a.c(localcf);
    this.m.c(localcf);
  }

  public boolean b(Object paramObject)
  {
    if (!this.b.e())
      return false;
    if (this.a.p().g() != 0)
      return true;
    return this.a.u().c() != 0;
  }

  public Object b()
  {
    return "debugger";
  }

  public Object d()
  {
    return new cf();
  }

  public boolean a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.a.d()))
    {
      int n = ba.b(this.a.c(), ct.a(733), ct.a(734), 2);
      if (n != 0)
        return false;
      this.a.L();
    }
    return true;
  }

  static com.zend.ide.l.g a(b paramb)
  {
    return paramb.b;
  }

  static boolean b(b paramb)
  {
    return paramb.h;
  }

  static fk c(b paramb)
  {
    return paramb.a;
  }

  static bt a(b paramb)
  {
    return paramb.m;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.a.b
 * JD-Core Version:    0.6.0
 */