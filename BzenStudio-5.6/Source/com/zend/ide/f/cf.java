package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.j.h;
import com.zend.ide.m.bc;
import com.zend.ide.m.bd;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.bk;
import com.zend.ide.m.d;
import com.zend.ide.m.g;
import com.zend.ide.m.l;
import com.zend.ide.m.r;
import com.zend.ide.m.v;
import com.zend.ide.util.cz;
import java.io.File;

class cf extends br
  implements bf
{
  private v[] g;
  private v[] e;
  private v[] o;
  private bh[] h;
  private r[] i;
  private bk j;
  private bc[] k;
  private d[] l;
  private bd[] m;
  private long n;
  private String p;

  private cf(String paramString, m paramm, v[] paramArrayOfv1, v[] paramArrayOfv2, v[] paramArrayOfv3, bh[] paramArrayOfbh, bk parambk, r[] paramArrayOfr, bd[] paramArrayOfbd, bc[] paramArrayOfbc, d[] paramArrayOfd, g paramg, long paramLong)
  {
    super(paramString, paramg, paramm);
    this.g = paramArrayOfv1;
    this.e = paramArrayOfv2;
    this.o = paramArrayOfv3;
    this.h = paramArrayOfbh;
    this.j = parambk;
    this.i = paramArrayOfr;
    this.k = paramArrayOfbc;
    this.l = paramArrayOfd;
    this.m = paramArrayOfbd;
    this.n = paramLong;
    this.p = new File(this.a).getName();
  }

  public v[] c()
  {
    return this.g;
  }

  public v[] a()
  {
    return this.e;
  }

  public v[] b()
  {
    return this.o;
  }

  public bh[] d()
  {
    return this.h;
  }

  public bk g()
  {
    return this.j;
  }

  public r[] h()
  {
    return this.i;
  }

  public bc[] i()
  {
    return this.k;
  }

  public d[] a()
  {
    return this.l;
  }

  public bd[] k()
  {
    return this.m;
  }

  public void a(cz paramcz)
  {
    ((l)paramcz).a(this);
  }

  public boolean b()
  {
    File localFile = h.m.g(a());
    return b() - localFile.lastModified() >= 0L;
  }

  public long b()
  {
    return this.n;
  }

  public String c()
  {
    return this.p;
  }

  cf(String paramString, m paramm, v[] paramArrayOfv1, v[] paramArrayOfv2, v[] paramArrayOfv3, bh[] paramArrayOfbh, bk parambk, r[] paramArrayOfr, bd[] paramArrayOfbd, bc[] paramArrayOfbc, d[] paramArrayOfd, g paramg, long paramLong, dj paramdj)
  {
    this(paramString, paramm, paramArrayOfv1, paramArrayOfv2, paramArrayOfv3, paramArrayOfbh, parambk, paramArrayOfr, paramArrayOfbd, paramArrayOfbc, paramArrayOfd, paramg, paramLong);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cf
 * JD-Core Version:    0.6.0
 */