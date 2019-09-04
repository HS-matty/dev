package com.zend.ide.o;

import com.zend.ide.be.d;
import com.zend.ide.be.l;
import com.zend.ide.i.s;
import com.zend.ide.j.bd;
import com.zend.ide.n.bw;
import com.zend.ide.p.ba;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.b;
import com.zend.ide.y.i;
import com.zend.ide.z.bo;
import com.zend.ide.z.g;
import com.zend.ide.z.k;
import com.zend.ide.z.m;
import com.zend.ide.z.u;
import java.io.File;
import java.io.InputStream;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class bt extends x
  implements bn, fy, fz, cu
{
  private com.zend.ide.p.b.a i;
  private s q;
  private i k;
  private m m;
  private int n = 0;
  private com.zend.ide.z.h o;
  private String p = "";
  private String r = "IP Server";
  private int s = 0;
  private boolean t;
  private yb u;
  private com.zend.ide.o.b.c v;
  private boolean w;

  public bt(bw parambw, de paramde)
  {
    super(parambw, paramde);
    d();
    c();
    super.A();
    this.u = new yb(this);
    this.u.a();
    this.v = new com.zend.ide.o.b.c();
    this.j = com.zend.ide.util.c.h.c().b(new gn(this, null));
    this.i = new gl(this, null);
  }

  public void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.j.d();
    bl().setVisible(false);
    if (com.zend.ide.util.f.a.a.b())
      return;
    if (paramString3.indexOf("local=1") != -1)
      this.w = true;
    this.t = true;
    e();
    d(paramString3, paramString4);
    this.p = paramString4;
    this.i.g();
    this.i.a(ct.a(943));
  }

  private void c()
  {
    this.k = new i(this.f.c());
    this.k.a("debugging.profileURL", "profileURLAction");
  }

  private void d()
  {
    ActionMap localActionMap = C();
    Object localObject = new gh(this, null);
    localActionMap.put("profileURLAction", (Action)localObject);
    localObject = new zb(this);
    localObject = new com.zend.ide.util.a.f((Action)localObject);
    localActionMap.put("RunProfilerAction", (Action)localObject);
    this.o = new com.zend.ide.z.h(this);
  }

  protected void a(String paramString1, String paramString2)
  {
  }

  public boolean e()
  {
    return this.e.l();
  }

  public boolean a()
  {
    return (this.t) && (this.e.d());
  }

  public void j()
  {
    try
    {
      this.m = new m(new g(this));
      this.m.d().e(this.p);
      this.m.a(this.w);
      if (this.m.b() != null)
      {
        this.n += 1;
        bo localbo = new bo(this.o, this.m, ct.a(934, "" + this.n));
        i();
        this.e.f();
        a(localbo);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
      i();
      this.i.h();
      ba.a(com.zend.ide.bd.c.b().h(), ct.a(1021), ct.a(933), 0);
    }
    finally
    {
      this.w = false;
    }
  }

  public void i()
  {
    this.t = false;
    this.e.k();
  }

  public k k()
  {
    k localk = this.e.o();
    this.i.h();
    return localk;
  }

  public InputStream b(String paramString1, int paramInt, String paramString2)
  {
    String str = paramString2;
    if ((str == null) && (this.q != null))
      str = this.q.f();
    a(paramString1, paramInt, str, this.e.j());
    return null;
  }

  protected void d(int paramInt)
  {
    this.e.c(paramInt);
  }

  private s l()
  {
    if (this.q == null)
      this.q = new s(com.zend.ide.bd.c.b().h());
    return this.q;
  }

  private void e(String paramString)
  {
    if (a())
    {
      ba.a(com.zend.ide.bd.c.b().h(), ct.a(1817), ct.a(936), 1);
      return;
    }
    s locals = l();
    if (locals.f().equals(""))
      locals.a(n());
    locals.a(w());
    locals.u();
    if (locals.h() == 1)
      SwingUtilities.invokeLater(new gf(this, locals));
  }

  private void a(bo parambo)
  {
    d locald = com.zend.ide.bd.c.b().c();
    l locall = parambo.b();
    locall.c(ct.a(934, new StringBuilder().append("").append(this.n).toString()) + ":");
    locald.a(ct.a(934, "" + this.n), locall);
  }

  public int w()
  {
    if (this.s == 0)
      return this.e.j();
    return this.s;
  }

  private String n()
  {
    return this.r;
  }

  public void a(int paramInt)
  {
    this.s = paramInt;
  }

  public void f()
  {
  }

  public void g()
  {
  }

  public void h()
  {
  }

  public void a()
  {
  }

  public void b()
  {
  }

  public void a(String paramString)
  {
  }

  public void b(String paramString)
  {
  }

  public void b(bh parambh)
  {
  }

  public void bk()
  {
  }

  public boolean b()
  {
    boolean bool = ((Boolean)b.a("debugging.localDebugging")).booleanValue();
    if (bool)
      return c();
    return d();
  }

  public boolean c()
  {
    return false;
  }

  public boolean d()
  {
    String str1 = bg();
    File localFile = com.zend.ide.j.h.m.g(str1);
    String str2 = de.b(str1);
    if ((localFile.exists()) && (!(localFile instanceof bd)))
    {
      this.d = localFile.getParentFile();
      String str3 = de.b(this.d.getAbsolutePath());
      e(str2, str3);
    }
    else
    {
      this.d = null;
      c(str2);
    }
    try
    {
      this.v.b(b, w());
    }
    catch (RuntimeException localRuntimeException)
    {
      throw localRuntimeException;
    }
    return true;
  }

  public boolean d(boolean paramBoolean)
  {
    return false;
  }

  public bb q()
  {
    return null;
  }

  public JComponent c()
  {
    return null;
  }

  public void d(String paramString)
  {
  }

  public String r()
  {
    return null;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return null;
  }

  public void a(bn parambn)
  {
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
    if (paramObject == null)
      return;
    if (!(paramObject instanceof cf))
    {
      this.s = ((Integer)b.a("debugging.debugPort").c()).intValue();
      this.r = b.a("debugging.serverHost").c().toString();
      return;
    }
    try
    {
      cf localcf = (cf)paramObject;
      this.s = localcf.d();
      this.r = localcf.e();
      l().a(localcf.e());
    }
    catch (ClassCastException localClassCastException)
    {
      cl.a(localClassCastException);
    }
  }

  public bs t()
  {
    return null;
  }

  static void a(bt parambt, String paramString)
  {
    parambt.e(paramString);
  }

  static boolean a(bt parambt, boolean paramBoolean)
  {
    return parambt.t = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.bt
 * JD-Core Version:    0.6.0
 */