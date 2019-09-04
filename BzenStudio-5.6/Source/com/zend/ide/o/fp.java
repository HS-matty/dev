package com.zend.ide.o;

import com.zend.ide.bc.a;
import com.zend.ide.g.l;
import com.zend.ide.g.m;
import com.zend.ide.j.h;
import com.zend.ide.n.bw;
import com.zend.ide.util.bp;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.Component;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.Iterator;
import javax.swing.Action;
import javax.swing.BorderFactory;

public class fp extends m
{
  protected fk l;
  private fl b;
  private StringBuffer n = new StringBuffer(1024);
  private PropertyChangeListener o = new da(this, null);
  private boolean p;
  private cm q;
  private dn r;
  private Action f;
  private Action m;
  private boolean s;
  private String t;

  public fp(fk paramfk)
  {
    this.l = paramfk;
    this.q = new cm(this);
    paramfk.a(this.q);
    bp.a(this);
    c("debug_output");
    this.r = new dn(this);
    paramfk.bd().a(this.r);
    m();
    setBorder(BorderFactory.createEmptyBorder());
    a.a(this, "DEBUG_OUTPUT_WINDOW");
    addChangeListener(new cz(this));
  }

  protected void m()
  {
    this.h.a("debugging.showHeader", this.o);
    this.i.a("debugging.showHeader");
  }

  private void a()
  {
    if (getSelectedComponent() != null)
      ((ub)getSelectedComponent()).a();
  }

  private String a(String paramString1, String paramString2, boolean paramBoolean)
  {
    String str;
    if ((paramBoolean) || (paramString1.equals(paramString2)))
    {
      str = h.m.g(paramString2).getName();
    }
    else
    {
      if (paramString1.equals(""))
        paramString1 = paramString2;
      str = h.m.g(paramString1).getName();
    }
    return str;
  }

  protected l k()
  {
    if (this.s)
      return new ub(this);
    return new ac(this);
  }

  private void n()
  {
    if (this.n.length() > 0)
    {
      String str = this.n.toString();
      this.n.setLength(0);
      this.b.c(str);
      if (this.s)
        a();
      a(this.b);
    }
  }

  protected void e(String paramString)
  {
    this.n.append(paramString);
    if (this.n.length() > 1024)
      n();
  }

  protected void b(boolean paramBoolean)
  {
    if (o() == paramBoolean)
      return;
    n();
    this.p = (!this.p);
    Iterator localIterator = j();
    while (localIterator.hasNext())
    {
      fl localfl = (fl)localIterator.next();
      localfl.a(paramBoolean);
    }
  }

  protected boolean o()
  {
    return this.p;
  }

  public void a(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }

  public Action b()
  {
    if (this.f == null)
      this.f = new sb(this);
    return this.f;
  }

  public Action c()
  {
    if (this.m == null)
      this.m = new rb(this);
    return this.m;
  }

  public void setSelectedComponent(Component paramComponent)
  {
    super.setSelectedComponent(paramComponent);
    if (this.s)
      b(this.t);
  }

  private void b(String paramString)
  {
    this.t = paramString;
    ub localub = (ub)getSelectedComponent();
    if (localub == null)
      return;
    localub.e(paramString);
  }

  static void a(fp paramfp, String paramString)
  {
    paramfp.b(paramString);
  }

  static StringBuffer a(fp paramfp)
  {
    return paramfp.n;
  }

  static String a(fp paramfp, String paramString1, String paramString2, boolean paramBoolean)
  {
    return paramfp.a(paramString1, paramString2, paramBoolean);
  }

  static fl a(fp paramfp, fl paramfl)
  {
    return paramfp.b = paramfl;
  }

  static fl b(fp paramfp)
  {
    return paramfp.b;
  }

  static void c(fp paramfp)
  {
    paramfp.n();
  }

  static boolean d(fp paramfp)
  {
    return paramfp.s;
  }

  static void e(fp paramfp)
  {
    paramfp.a();
  }

  static String e(fp paramfp)
  {
    return paramfp.t;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fp
 * JD-Core Version:    0.6.0
 */