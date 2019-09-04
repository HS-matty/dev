package com.zend.ide.desktop.a;

import com.zend.ide.f.zc.b.c;
import com.zend.ide.f.zc.b.h;
import com.zend.ide.f.zc.b.j;
import com.zend.ide.f.zc.b.l;
import com.zend.ide.l.eb;
import com.zend.ide.l.g;
import com.zend.ide.util.cu;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;

public class k
  implements com.zend.ide.l.k, cu
{
  public g a;
  private e b;
  private PropertyChangeListener c = new m(this, null);
  private j d;
  private c e;

  public k(g paramg)
  {
    this.a = paramg;
    a();
  }

  public Object m()
  {
    if (this.d == null)
      this.d = l.b();
    if (this.e == null)
    {
      this.e = new c("JavaBuildPath");
      this.e.a(0, this.d);
    }
    eb localeb = new eb();
    localeb.a(this.d);
    localeb.a(this.e);
    return localeb;
  }

  public Object d()
  {
    c localc = new c("JavaBuildPath");
    j localj = h.b();
    localc.a(0, localj);
    eb localeb = new eb();
    localeb.a(localj);
    localeb.a(localc);
    return localeb;
  }

  public Object b()
  {
    return "javaBridge";
  }

  public boolean b(Object paramObject)
  {
    return false;
  }

  public void a(Object paramObject)
  {
    eb localeb = (eb)paramObject;
    this.d = localeb.a();
    this.e = localeb.b();
  }

  public boolean a(boolean paramBoolean)
  {
    return true;
  }

  private void a()
  {
    f localf = new f();
    this.b = new e(localf);
    localf.a("javaBridge.JREs", this.c);
    this.b.a("javaBridge.JREs");
  }

  static j a(k paramk)
  {
    return paramk.d;
  }

  static j a(k paramk, j paramj)
  {
    return paramk.d = paramj;
  }

  static c b(k paramk)
  {
    return paramk.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.a.k
 * JD-Core Version:    0.6.0
 */