package com.zend.ide.w.c;

import com.zend.ide.util.ct;
import com.zend.ide.w.ab;
import com.zend.ide.w.c.a.gb;
import com.zend.ide.w.c.a.hb;
import com.zend.ide.w.c.a.ib;
import com.zend.ide.w.c.a.jb;
import com.zend.ide.w.c.a.kb;
import com.zend.ide.w.c.a.lb;
import com.zend.ide.w.c.a.mb;
import com.zend.ide.w.c.a.nb;
import com.zend.ide.w.c.a.ob;
import com.zend.ide.w.c.a.pb;
import com.zend.ide.w.c.a.sb;
import com.zend.ide.y.b;
import java.io.File;
import javax.swing.JOptionPane;

public class g
{
  private f a = new f(0);
  private f b = new f(1);
  private f c = new f(2);
  private f d = new f(3);
  private f e = new f(5);
  private f f = new f(6);
  private f g = new f(7);
  private f h = new f(9);
  private f i = new f(8);
  private pb j;
  private ib k;
  private gb l;
  private ob m;
  private hb n;
  private kb o;
  private sb t;
  private lb p;
  private jb q;
  private nb r;
  private mb s;

  private static f a(ab paramab, f paramf)
  {
    if (paramf != null)
      paramab.a(paramf);
    paramab.a(false);
    paramab.pack();
    paramab.B();
    paramab.setVisible(true);
    if (paramab.a() == 1)
      return (f)paramab.b();
    return null;
  }

  public f a()
  {
    if (k())
    {
      f localf = a(u(), this.a);
      if (localf == null)
        return null;
      this.a = localf;
    }
    return this.a;
  }

  public f b()
  {
    if (l())
    {
      f localf = a(v(), this.b);
      if (localf == null)
        return null;
      this.b = localf;
    }
    return this.b;
  }

  public f a(File[] paramArrayOfFile)
  {
    if (m())
    {
      gb localgb = w();
      String str = b(paramArrayOfFile);
      localgb.a(str, paramArrayOfFile.length);
      f localf = a(localgb, this.c);
      if (localf == null)
        return null;
      this.c = localf;
    }
    return this.c;
  }

  public static boolean c()
  {
    int i1 = JOptionPane.showConfirmDialog(com.zend.ide.bd.c.b().h(), ct.a(1655), ct.a(1656), 2);
    return i1 == 0;
  }

  private static String b(File[] paramArrayOfFile)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i1 = 0; i1 < paramArrayOfFile.length; i1++)
    {
      localStringBuffer.append('\n');
      localStringBuffer.append(paramArrayOfFile[i1].getName());
    }
    return localStringBuffer.toString().trim();
  }

  public f d()
  {
    if (n())
    {
      f localf = a(x(), this.d);
      if (localf == null)
        return null;
      this.d = localf;
    }
    return this.d;
  }

  public f a(boolean paramBoolean)
  {
    if (o())
    {
      f localf = a(b(paramBoolean), this.e);
      if (localf == null)
        return null;
      this.e = localf;
    }
    return this.e;
  }

  public f e()
  {
    if (p())
    {
      f localf = a(z(), this.f);
      if (localf == null)
        return null;
      this.f = localf;
    }
    return this.f;
  }

  public f f()
  {
    if (r())
    {
      f localf = a(A(), this.g);
      if (localf == null)
        return null;
      this.g = localf;
    }
    return this.g;
  }

  public f g()
  {
    if (s())
    {
      f localf = a(C(), this.h);
      if (localf == null)
        return null;
      this.h = localf;
    }
    return this.h;
  }

  public f h()
  {
    if (t())
    {
      f localf = a(B(), this.i);
      if (localf == null)
        return null;
      this.i = localf;
    }
    return this.i;
  }

  public f i()
  {
    hb localhb = y();
    f localf = a(localhb, null);
    return localf;
  }

  public f a(f paramf)
  {
    sb localsb = a();
    f localf = a(localsb, paramf);
    return localf;
  }

  public static boolean j()
  {
    return q();
  }

  private static boolean k()
  {
    return ((Boolean)b.a("svn.showUpdateDialog").c()).booleanValue();
  }

  private static boolean l()
  {
    return ((Boolean)b.a("svn.showCommitDialog").c()).booleanValue();
  }

  private static boolean m()
  {
    return ((Boolean)b.a("svn.showAddDialog").c()).booleanValue();
  }

  private static boolean n()
  {
    return ((Boolean)b.a("svn.showStatusDialog").c()).booleanValue();
  }

  private static boolean o()
  {
    return ((Boolean)b.a("svn.showDiffDialog").c()).booleanValue();
  }

  private static boolean p()
  {
    return ((Boolean)b.a("svn.showLogDialog").c()).booleanValue();
  }

  private static boolean q()
  {
    return ((Boolean)b.a("svn.showVisualDiff").c()).booleanValue();
  }

  private static boolean r()
  {
    return ((Boolean)b.a("svn.showDeleteDialog").c()).booleanValue();
  }

  private static boolean s()
  {
    return ((Boolean)b.a("svn.showRevertDialog").c()).booleanValue();
  }

  private static boolean t()
  {
    return ((Boolean)b.a("svn.showResolveDialog").c()).booleanValue();
  }

  private pb u()
  {
    if (this.j == null)
      this.j = new pb(com.zend.ide.bd.c.b().h());
    return this.j;
  }

  private ib v()
  {
    if (this.k == null)
      this.k = new ib(com.zend.ide.bd.c.b().h());
    return this.k;
  }

  private gb w()
  {
    if (this.l == null)
      this.l = new gb(com.zend.ide.bd.c.b().h());
    return this.l;
  }

  private ob x()
  {
    if (this.m == null)
      this.m = new ob(com.zend.ide.bd.c.b().h());
    return this.m;
  }

  private hb y()
  {
    if (this.n == null)
      this.n = new hb(com.zend.ide.bd.c.b().h());
    return this.n;
  }

  private kb b(boolean paramBoolean)
  {
    if (this.o == null)
      this.o = new kb(com.zend.ide.bd.c.b().h());
    return this.o;
  }

  private lb z()
  {
    if (this.p == null)
      this.p = new lb(com.zend.ide.bd.c.b().h());
    return this.p;
  }

  private jb A()
  {
    if (this.q == null)
      this.q = new jb(com.zend.ide.bd.c.b().h());
    return this.q;
  }

  private mb B()
  {
    if (this.s == null)
      this.s = new mb(com.zend.ide.bd.c.b().h());
    return this.s;
  }

  private nb C()
  {
    if (this.r == null)
      this.r = new nb(com.zend.ide.bd.c.b().h());
    return this.r;
  }

  private sb a()
  {
    if (this.t == null)
      this.t = new sb(com.zend.ide.bd.c.b().h());
    return this.t;
  }

  public Object D()
  {
    f[] arrayOff = new f[8];
    arrayOff[0] = this.a;
    arrayOff[1] = this.b;
    arrayOff[2] = this.c;
    arrayOff[3] = this.d;
    arrayOff[4] = this.e;
    arrayOff[5] = this.g;
    arrayOff[6] = this.h;
    arrayOff[7] = this.i;
    return arrayOff;
  }

  public void a(Object paramObject)
  {
    if (!(paramObject instanceof f[]))
      return;
    f[] arrayOff = (f[])(f[])paramObject;
    if ((arrayOff != null) && (arrayOff.length >= 8))
    {
      this.a = arrayOff[0];
      this.b = arrayOff[1];
      this.c = arrayOff[2];
      this.d = arrayOff[3];
      this.e = arrayOff[4];
      this.g = arrayOff[5];
      this.h = arrayOff[6];
      this.i = arrayOff[7];
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.g
 * JD-Core Version:    0.6.0
 */