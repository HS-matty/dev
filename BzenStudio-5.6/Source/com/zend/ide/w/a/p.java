package com.zend.ide.w.a;

import com.zend.ide.w.ab;
import com.zend.ide.y.b;
import java.io.File;

class p
{
  private l a = new l(0);
  private l b = new l(1);
  private l c = new l(2);
  private l d = new l(3);
  private l e = new l(5);
  private l l = new l(6);
  private bw f;
  private bs g;
  private bq h;
  private bv i;
  private br j;
  private bt k;
  private cf n;
  private bz m;

  private static l a(ab paramab, l paraml)
  {
    if (paraml != null)
      paramab.a(paraml);
    paramab.a(false);
    paramab.pack();
    paramab.B();
    paramab.setVisible(true);
    if (paramab.a() == 1)
      return (l)paramab.b();
    return null;
  }

  public l t()
  {
    if (e())
    {
      l locall = a(j(), this.a);
      if (locall == null)
        return null;
      this.a = locall;
    }
    return this.a;
  }

  public l b()
  {
    if (f())
    {
      l locall = a(k(), this.b);
      if (locall == null)
        return null;
      this.b = locall;
    }
    return this.b;
  }

  public l a(File[] paramArrayOfFile)
  {
    if (g())
    {
      bq localbq = l();
      String str = b(paramArrayOfFile);
      localbq.a(str, paramArrayOfFile.length);
      l locall = a(localbq, this.c);
      if (locall == null)
        return null;
      this.c = locall;
    }
    return this.c;
  }

  private static String b(File[] paramArrayOfFile)
  {
    String str = "";
    for (int i1 = 0; i1 < paramArrayOfFile.length; i1++)
      str = str + "\n" + paramArrayOfFile[i1].getName();
    return str.trim();
  }

  public l c()
  {
    if (h())
    {
      l locall = a(m(), this.d);
      if (locall == null)
        return null;
      this.d = locall;
    }
    return this.d;
  }

  public l a(boolean paramBoolean)
  {
    if (i())
    {
      l locall = a(b(paramBoolean), this.e);
      if (locall == null)
        return null;
      this.e = locall;
    }
    return this.e;
  }

  public l p()
  {
    if (r())
    {
      l locall = a(s(), this.l);
      if (locall == null)
        return null;
      this.l = locall;
    }
    return this.l;
  }

  public l a(File paramFile)
  {
    br localbr = n();
    if (paramFile != null)
      localbr.a(paramFile);
    l locall = a(localbr, null);
    return locall;
  }

  public static boolean d()
  {
    return o();
  }

  private static boolean e()
  {
    return ((Boolean)b.a("cvs.showUpdateDialog").c()).booleanValue();
  }

  private static boolean f()
  {
    return ((Boolean)b.a("cvs.showCommitDialog").c()).booleanValue();
  }

  private static boolean g()
  {
    return ((Boolean)b.a("cvs.showAddDialog").c()).booleanValue();
  }

  private static boolean h()
  {
    return ((Boolean)b.a("cvs.showStatusDialog").c()).booleanValue();
  }

  private static boolean i()
  {
    return ((Boolean)b.a("cvs.showDiffDialog").c()).booleanValue();
  }

  private static boolean r()
  {
    return ((Boolean)b.a("cvs.showLogDialog").c()).booleanValue();
  }

  private static boolean o()
  {
    return ((Boolean)b.a("cvs.showVisualDiff").c()).booleanValue();
  }

  private bw j()
  {
    if (this.f == null)
      this.f = new bw(com.zend.ide.bd.c.b().h());
    return this.f;
  }

  private bs k()
  {
    if (this.g == null)
      this.g = new bs(com.zend.ide.bd.c.b().h());
    return this.g;
  }

  private bq l()
  {
    if (this.h == null)
      this.h = new bq(com.zend.ide.bd.c.b().h());
    return this.h;
  }

  private bv m()
  {
    if (this.i == null)
      this.i = new bv(com.zend.ide.bd.c.b().h());
    return this.i;
  }

  private br n()
  {
    if (this.j == null)
      this.j = new br(com.zend.ide.bd.c.b().h());
    return this.j;
  }

  private bt b(boolean paramBoolean)
  {
    if (this.k == null)
      this.k = new bt(com.zend.ide.bd.c.b().h());
    this.k.b(paramBoolean);
    return this.k;
  }

  private bz s()
  {
    if (this.m == null)
      this.m = new bz(com.zend.ide.bd.c.b().h());
    return this.m;
  }

  cf u()
  {
    if (this.n == null)
      this.n = new cf(com.zend.ide.bd.c.b().h());
    return this.n;
  }

  public Object q()
  {
    l[] arrayOfl = new l[5];
    arrayOfl[0] = this.a;
    arrayOfl[1] = this.b;
    arrayOfl[2] = this.c;
    arrayOfl[3] = this.d;
    arrayOfl[4] = this.e;
    return arrayOfl;
  }

  public void a(Object paramObject)
  {
    if (!(paramObject instanceof l[]))
      return;
    l[] arrayOfl = (l[])(l[])paramObject;
    this.a = arrayOfl[0];
    this.b = arrayOfl[1];
    this.c = arrayOfl[2];
    this.d = arrayOfl[3];
    this.e = arrayOfl[4];
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.p
 * JD-Core Version:    0.6.0
 */