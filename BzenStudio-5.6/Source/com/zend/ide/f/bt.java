package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.f.a.a;
import com.zend.ide.f.a.b;
import com.zend.ide.f.a.c;
import com.zend.ide.j.t;
import com.zend.ide.j.u;
import com.zend.ide.m.bd;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.bk;
import com.zend.ide.m.q;
import com.zend.ide.m.r;
import com.zend.ide.m.v;
import com.zend.ide.m.x;
import com.zend.ide.m.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class bt
{
  private com.zend.ide.f.a.d a = new com.zend.ide.f.a.d();
  private com.zend.ide.f.a.d h = new com.zend.ide.f.a.d();
  private a c = new b();
  private a g = new b();
  private a i = new b();
  private a d = new b();
  private a e = new b();
  private a f = new c();
  private List b = Collections.synchronizedList(new ArrayList(2));

  public synchronized void g()
  {
    this.a.c();
    this.h.c();
    this.c.c();
    this.g.c();
    this.i.c();
    this.d.c();
    this.e.c();
    this.f.c();
    e();
  }

  public com.zend.ide.b.d[] a(String paramString)
  {
    List localList = this.a.b();
    bf[] arrayOfbf = new bf[localList.size()];
    localList.toArray(arrayOfbf);
    return bl.b(arrayOfbf, paramString);
  }

  public com.zend.ide.b.d[] b(String paramString)
  {
    List localList = this.h.b();
    fd[] arrayOffd = new fd[localList.size()];
    localList.toArray(arrayOffd);
    return bl.b(arrayOffd, paramString);
  }

  public bf a(String paramString)
  {
    return (bf)this.a.a(paramString);
  }

  public synchronized void a(bf parambf)
  {
    String str = parambf.a();
    bf localbf = (bf)this.a.a(str);
    int j = localbf != null ? 1 : 0;
    if (j != 0)
      b(localbf);
    this.a.a(parambf);
    v[] arrayOfv1 = parambf.c();
    for (int k = 0; k < arrayOfv1.length; k++)
      this.c.a(arrayOfv1[k]);
    v[] arrayOfv2 = parambf.a();
    for (int m = 0; m < arrayOfv2.length; m++)
      this.g.a(arrayOfv2[m]);
    v[] arrayOfv3 = parambf.b();
    for (int n = 0; n < arrayOfv3.length; n++)
      this.i.a(arrayOfv3[n]);
    bh[] arrayOfbh = parambf.d();
    for (int i1 = 0; i1 < arrayOfbh.length; i1++)
      this.d.a(arrayOfbh[i1]);
    bd[] arrayOfbd = parambf.k();
    for (int i2 = 0; i2 < arrayOfbd.length; i2++)
      this.e.a(arrayOfbd[i2]);
    x[] arrayOfx = parambf.g().a(bl.c);
    if (arrayOfx != null)
      for (int i3 = 0; i3 < arrayOfx.length; i3++)
        this.f.a(arrayOfx[i3]);
    if (j != 0)
      c(parambf);
    else
      e(parambf);
  }

  public synchronized void a(File paramFile)
  {
    this.h.a(new fd(this, paramFile.getPath(), ""));
  }

  public synchronized void b(String paramString)
  {
    bf localbf = (bf)this.a.a(paramString);
    if (localbf != null)
    {
      b(localbf);
      d(localbf);
    }
    else
    {
      fd localfd = (fd)this.h.a(paramString);
      if (localfd != null)
        this.h.b(localfd);
    }
  }

  private synchronized void b(bf parambf)
  {
    v[] arrayOfv1 = parambf.c();
    for (int j = 0; j < arrayOfv1.length; j++)
      this.c.b(arrayOfv1[j]);
    v[] arrayOfv2 = parambf.a();
    for (int k = 0; k < arrayOfv2.length; k++)
      this.g.b(arrayOfv2[k]);
    v[] arrayOfv3 = parambf.b();
    for (int m = 0; m < arrayOfv3.length; m++)
      this.i.b(arrayOfv3[m]);
    bh[] arrayOfbh = parambf.d();
    for (int n = 0; n < arrayOfbh.length; n++)
      this.d.b(arrayOfbh[n]);
    bd[] arrayOfbd = parambf.k();
    for (int i1 = 0; i1 < arrayOfbd.length; i1++)
      this.e.b(arrayOfbd[i1]);
    x[] arrayOfx = parambf.g().a(bl.c);
    if (arrayOfx != null)
      for (int i2 = 0; i2 < arrayOfx.length; i2++)
        this.f.b(arrayOfx[i2]);
    this.a.b(parambf);
  }

  public com.zend.ide.b.d[] b()
  {
    List localList = this.d.b();
    bh[] arrayOfbh = new bh[localList.size()];
    localList.toArray(arrayOfbh);
    return arrayOfbh;
  }

  public com.zend.ide.b.d[] c(String paramString)
  {
    List localList = this.d.a(paramString);
    if ((localList == null) || (localList.size() == 0))
      return di.a;
    bh[] arrayOfbh = new bh[localList.size()];
    localList.toArray(arrayOfbh);
    return arrayOfbh;
  }

  public com.zend.ide.b.d[] d(String paramString)
  {
    return bl.a(b(), paramString);
  }

  public com.zend.ide.b.d[] c()
  {
    return a(this.c);
  }

  public v a(String paramString1, String paramString2)
  {
    return a(this.c, paramString1, paramString2);
  }

  public com.zend.ide.b.d[] e(String paramString)
  {
    return a(c(), paramString);
  }

  public v c(String paramString1, String paramString2)
  {
    return a(this.i, paramString1, paramString2);
  }

  public com.zend.ide.b.d[] a()
  {
    return a(this.g);
  }

  public v b(String paramString1, String paramString2)
  {
    return a(this.g, paramString1, paramString2);
  }

  private com.zend.ide.b.d[] a(a parama)
  {
    List localList = parama.b();
    return (com.zend.ide.b.d[])(com.zend.ide.b.d[])localList.toArray(new com.zend.ide.b.d[localList.size()]);
  }

  private v a(a parama, String paramString1, String paramString2)
  {
    List localList = parama.a(paramString2);
    if ((localList == null) || (localList.size() == 0))
      return null;
    for (int j = 0; j < localList.size(); j++)
    {
      v localv = (v)localList.get(j);
      if (localv.f().c().equals(paramString1))
        return localv;
    }
    return (v)localList.get(0);
  }

  private com.zend.ide.b.d[] a(com.zend.ide.b.d[] paramArrayOfd, String paramString)
  {
    return bl.a(paramArrayOfd, paramString);
  }

  public com.zend.ide.b.d[] a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      localObject1 = a(paramString1);
      localObject2 = null;
      if (localObject1 != null)
        localObject2 = ((bf)localObject1).g().a(bl.c);
      if (localObject2 == null)
        localObject2 = di.a;
      return bl.a(localObject2, paramString2);
    }
    Object localObject1 = this.f.b();
    Object localObject2 = new com.zend.ide.b.d[((List)localObject1).size()];
    ((List)localObject1).toArray(localObject2);
    return (com.zend.ide.b.d)(com.zend.ide.b.d)bl.a(localObject2, paramString2);
  }

  public com.zend.ide.b.d[] a(String paramString1, vb paramvb, String paramString2, boolean paramBoolean)
  {
    if (paramvb.equals(bl.c))
      return a(paramString1, paramString2, paramBoolean);
    bf localbf = a(paramString1);
    Object localObject = null;
    if (localbf != null)
      localObject = localbf.g().a(paramvb);
    if (localObject == null)
      localObject = di.a;
    return (com.zend.ide.b.d)bl.a(localObject, paramString2);
  }

  private String a(v paramv, String paramString, int paramInt)
  {
    if (paramv == null)
      return null;
    String str1 = paramv.f().c();
    bf localbf = (bf)this.a.a(str1);
    if (localbf == null)
      return null;
    bk localbk = localbf.g();
    vb localvb = bl.a(paramv.a(), "");
    q localq = localbk.a(localvb, paramString, paramInt);
    if (localq != null)
      return localq.c();
    String str2 = paramv.c() != null ? paramv.c().a() : null;
    if (str2 != null)
    {
      String str3 = a(a(str1, str2), paramString, paramInt);
      if (str3 == null)
        str3 = a(b(str1, str2), paramString, paramInt);
      return str3;
    }
    return null;
  }

  public String a(String paramString1, vb paramvb, String paramString2, int paramInt, boolean paramBoolean)
  {
    bf localbf = (bf)this.a.a(paramString1);
    if (localbf == null)
      return null;
    if ((paramString2.length() > 0) && (paramString2.charAt(0) == '$'))
      paramString2 = paramString2.substring(1);
    bk localbk = localbf.g();
    q localq = localbk.a(paramvb, paramString2, paramInt);
    if (localq != null)
      return localq.c();
    String str = paramvb.a();
    if ((str != null) && (!str.equals("")))
    {
      localObject = a(a(paramString1, str), paramString2, paramInt);
      if ((localObject == null) || (((String)localObject).length() == 0))
        localObject = a(b(paramString1, str), paramString2, paramInt);
      if ((localObject != null) && (((String)localObject).length() > 0))
        return localObject;
    }
    if (!paramvb.equals(bl.c))
    {
      localObject = localbk.a(paramvb, paramString2);
      if ((localObject == null) || (!((x)localObject).i()))
        return null;
      paramvb = bl.c;
      localq = localbk.a(paramvb, paramString2, localbf.f().b());
      if (localq != null)
        return localq.c();
    }
    if (!paramBoolean)
      return null;
    Object localObject = this.a.b().iterator();
    while (((Iterator)localObject).hasNext())
    {
      localbf = (bf)((Iterator)localObject).next();
      if (localbf.a().equals(paramString1))
        continue;
      localbk = localbf.g();
      localq = localbk.a(paramvb, paramString2, localbf.f().b());
      if (localq != null)
        return localq.c();
    }
    return (String)null;
  }

  public bd a(String paramString)
  {
    List localList = this.e.a(paramString);
    if ((localList != null) && (localList.size() > 0))
      return (bd)localList.get(0);
    return null;
  }

  public bd[] f()
  {
    List localList = this.e.b();
    bd[] arrayOfbd = new bd[localList.size()];
    localList.toArray(arrayOfbd);
    return arrayOfbd;
  }

  public com.zend.ide.b.d[] h(String paramString)
  {
    return bl.a(f(), paramString);
  }

  public r[] a(u paramu, File[] paramArrayOfFile)
  {
    if (paramArrayOfFile == null)
      return a(paramu);
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < paramArrayOfFile.length; j++)
    {
      bf[] arrayOfbf2 = g(paramArrayOfFile[j].getAbsolutePath());
      if ((arrayOfbf2 == null) || (arrayOfbf2.length <= 0))
        continue;
      for (int k = 0; k < arrayOfbf2.length; k++)
        localArrayList.add(arrayOfbf2[k]);
    }
    bf[] arrayOfbf1 = new bf[localArrayList.size()];
    localArrayList.toArray(arrayOfbf1);
    return a(arrayOfbf1, paramu);
  }

  private bf[] d()
  {
    List localList = this.a.b();
    bf[] arrayOfbf = new bf[localList.size()];
    localList.toArray(arrayOfbf);
    return arrayOfbf;
  }

  private bf[] g(String paramString)
  {
    bf[] arrayOfbf1 = d();
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < arrayOfbf1.length; j++)
    {
      if (!arrayOfbf1[j].a().startsWith(paramString))
        continue;
      localArrayList.add(arrayOfbf1[j]);
    }
    bf[] arrayOfbf2 = new bf[localArrayList.size()];
    localArrayList.toArray(arrayOfbf2);
    return arrayOfbf2;
  }

  public void a(pd parampd)
  {
    if (!this.b.contains(parampd))
      this.b.add(parampd);
  }

  public void b(pd parampd)
  {
    this.b.remove(parampd);
  }

  private void c(bf parambf)
  {
    int j = this.b.size();
    for (int k = 0; k < j; k++)
    {
      pd localpd = (pd)this.b.get(k);
      localpd.a(parambf);
    }
  }

  private void d(bf parambf)
  {
    int j = this.b.size();
    for (int k = 0; k < j; k++)
    {
      pd localpd = (pd)this.b.get(k);
      localpd.c(parambf);
    }
  }

  private void e(bf parambf)
  {
    int j = this.b.size();
    for (int k = 0; k < j; k++)
    {
      pd localpd = (pd)this.b.get(k);
      localpd.b(parambf);
    }
  }

  private void e()
  {
    int j = this.b.size();
    for (int k = 0; k < j; k++)
    {
      pd localpd = (pd)this.b.get(k);
      localpd.h();
    }
  }

  private static r[] a(bf parambf, u paramu)
  {
    r[] arrayOfr1 = parambf.h();
    if ((arrayOfr1 == null) || (arrayOfr1.length == 0))
      return null;
    File localFile = paramu.g(parambf.a()).getParentFile();
    if (localFile == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < arrayOfr1.length; j++)
    {
      String str = arrayOfr1[j].a();
      if (t.a(paramu, str, localFile))
        continue;
      localArrayList.add(arrayOfr1[j]);
    }
    r[] arrayOfr2 = new r[localArrayList.size()];
    localArrayList.toArray(arrayOfr2);
    return arrayOfr2;
  }

  private static r[] a(bf[] paramArrayOfbf, u paramu)
  {
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < paramArrayOfbf.length; j++)
    {
      r[] arrayOfr2 = a(paramArrayOfbf[j], paramu);
      for (int k = 0; (arrayOfr2 != null) && (k < arrayOfr2.length); k++)
        localArrayList.add(arrayOfr2[k]);
    }
    r[] arrayOfr1 = new r[localArrayList.size()];
    localArrayList.toArray(arrayOfr1);
    return arrayOfr1;
  }

  private r[] a(u paramu)
  {
    bf[] arrayOfbf = d();
    return a(arrayOfbf, paramu);
  }

  public bf[] a()
  {
    List localList = this.a.b();
    bf[] arrayOfbf = new bf[localList.size()];
    localList.toArray(arrayOfbf);
    return arrayOfbf;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bt
 * JD-Core Version:    0.6.0
 */