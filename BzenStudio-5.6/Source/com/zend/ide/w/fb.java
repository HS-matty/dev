package com.zend.ide.w;

import com.zend.ide.h.be;
import com.zend.ide.h.bl;
import com.zend.ide.l.u;
import com.zend.ide.util.d.a;
import com.zend.ide.y.c;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.HashMap;

public class fb
{
  protected a a;
  protected be b;
  protected eb c;
  protected b d;
  protected u e;
  protected boolean f;
  private mb g = new mb(this);
  private bl h = new bl();
  private e i;
  private PropertyChangeListener j;
  private PropertyChangeListener k;
  private lb l;
  private HashMap m;

  public fb(b paramb, u paramu, be parambe)
  {
    this.d = paramb;
    this.b = parambe;
    this.e = paramu;
    this.c = new eb(paramu);
    this.m = new HashMap(50);
    a();
    this.b.setCellRenderer(this.g);
    this.f = ((Boolean)com.zend.ide.y.b.a("vcs.statusEnabled").c()).booleanValue();
  }

  protected void a()
  {
    f localf = new f();
    this.i = new e(localf);
    this.k = new jb(this, null);
    localf.a("vcs.statusEnabled", this.k);
    this.i.a("vcs.statusEnabled");
    this.a = new a(6);
    this.j = new ib(this, null);
    localf.a("vcs.statusAdded", this.j);
    this.i.a("vcs.statusAdded");
    localf.a("vcs.statusMergedWithConflicts", this.j);
    this.i.a("vcs.statusMergedWithConflicts");
    localf.a("vcs.statusModified", this.j);
    this.i.a("vcs.statusModified");
    localf.a("vcs.statusNotVersioned", this.j);
    this.i.a("vcs.statusNotVersioned");
    localf.a("vcs.statusUpToDate", this.j);
    this.i.a("vcs.statusUpToDate");
  }

  public void a(File paramFile)
  {
    if (!this.f)
      return;
    String str = paramFile.getPath();
    int n = this.d.a(str, null);
    if (a(n))
    {
      this.c.b(str);
    }
    else
    {
      this.c.d(str);
      this.m.remove(str);
    }
    this.b.repaint();
  }

  public void a(File paramFile1, File paramFile2)
  {
    this.c.d(paramFile1.getPath());
    if (paramFile2 != null)
      b(paramFile2);
  }

  public void b(File paramFile)
  {
    if (!this.f)
      return;
    String str = paramFile.getPath();
    int n = this.d.a(str, null);
    if (a(n))
      this.c.b(str);
    this.b.repaint();
  }

  public void a(File[] paramArrayOfFile)
  {
    if (!this.f)
      return;
    d(paramArrayOfFile);
  }

  public void b(File[] paramArrayOfFile)
  {
    c(paramArrayOfFile);
  }

  public void c(File[] paramArrayOfFile)
  {
    if (!this.f)
      return;
    if (paramArrayOfFile != null)
      this.m = this.c.a(paramArrayOfFile, this.m);
    d(paramArrayOfFile);
  }

  private void d(File[] paramArrayOfFile)
  {
    if ((this.l == null) || (!this.l.isAlive()))
    {
      this.l = new lb(this, paramArrayOfFile);
      this.l.start();
    }
  }

  public void b()
  {
    this.c.a(this.e.c());
  }

  public void c()
  {
    if (!this.c.a(this.e.c()))
      d(null);
  }

  public void d()
  {
    this.c.b(this.e.c());
    this.m.clear();
  }

  private boolean a(int paramInt)
  {
    return paramInt != 0;
  }

  static bl a(fb paramfb)
  {
    return paramfb.h;
  }

  static HashMap b(fb paramfb)
  {
    return paramfb.m;
  }

  static mb c(fb paramfb)
  {
    return paramfb.g;
  }

  static void a(fb paramfb, File[] paramArrayOfFile)
  {
    paramfb.d(paramArrayOfFile);
  }

  static boolean a(fb paramfb, int paramInt)
  {
    return paramfb.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.fb
 * JD-Core Version:    0.6.0
 */