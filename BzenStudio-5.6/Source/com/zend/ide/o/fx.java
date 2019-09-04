package com.zend.ide.o;

import com.zend.ide.n.bw;
import com.zend.ide.util.cl;
import java.io.InputStream;

public class fx
  implements ga
{
  private de a = new de(this);
  private bt b = new bt(parambw, this.a);
  private fk c = new fk(parambw, this.a);
  private fw d = new fw(parambw, this.a);
  private gj e = new gj(this.c, this.a);
  private gd f = this.c;

  public fx(bw parambw)
  {
  }

  public fk c()
  {
    return this.c;
  }

  public bt a()
  {
    return this.b;
  }

  public void a(String paramString, int paramInt)
  {
    if ((this.f instanceof ch))
      ((ch)this.f).a(paramString, paramInt);
    else
      cl.a("Class cast problem: " + this.f + "instead of DebugListener");
  }

  public void e()
  {
    if ((this.f instanceof ch))
      ((ch)this.f).e();
    else
      cl.a("Class cast problem: " + this.f + "instead of DebugListener");
  }

  public void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    a(paramString3, paramString4);
    this.f.a(paramString1, paramString2, paramString3, paramString4);
  }

  public void a(String paramString)
  {
    this.f.a(paramString);
  }

  public void b(String paramString)
  {
    this.f.b(paramString);
  }

  public void f()
  {
    this.f.f();
  }

  public void g()
  {
    this.f.g();
  }

  public void a(bh parambh)
  {
    if ((this.f instanceof ch))
      ((ch)this.f).a(parambh);
    else
      cl.a("Class cast problem: " + this.f + "instead of DebugListener");
  }

  public void b(bh parambh)
  {
    this.f.b(parambh);
  }

  public void h()
  {
    this.f.h();
  }

  public void j()
  {
    this.f.j();
  }

  public void a()
  {
    this.f.a();
  }

  public void b()
  {
    this.f.b();
  }

  public void bk()
  {
    this.f.bk();
  }

  public InputStream c(String paramString)
  {
    if ((this.f instanceof ge))
      return ((ge)this.f).c(paramString);
    cl.a("Class cast problem: " + this.f + "instead of SessionManager");
    return null;
  }

  private void a(String paramString1, String paramString2)
  {
    if ((paramString1.indexOf("start_profile") != -1) || (paramString2.indexOf("start_profile") != -1))
      this.f = this.b;
    else if ((paramString1.indexOf("get_file_content=") != -1) || (paramString2.indexOf("get_file_content") != -1))
      this.f = this.d;
    else if ((paramString1.indexOf("testConnection") != -1) || (paramString2.indexOf("testConnection") != -1))
      this.f = this.e;
    else
      this.f = this.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fx
 * JD-Core Version:    0.6.0
 */