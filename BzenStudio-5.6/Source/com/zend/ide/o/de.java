package com.zend.ide.o;

import com.zend.ide.o.d.a;
import com.zend.ide.o.d.ab;
import com.zend.ide.o.d.b;
import com.zend.ide.o.d.ba;
import com.zend.ide.o.d.bb;
import com.zend.ide.o.d.bc;
import com.zend.ide.o.d.be;
import com.zend.ide.o.d.bj;
import com.zend.ide.o.d.bm;
import com.zend.ide.o.d.bn;
import com.zend.ide.o.d.bo;
import com.zend.ide.o.d.bp;
import com.zend.ide.o.d.bt;
import com.zend.ide.o.d.c;
import com.zend.ide.o.d.d;
import com.zend.ide.o.d.db;
import com.zend.ide.o.d.g;
import com.zend.ide.o.d.j;
import com.zend.ide.o.d.o;
import com.zend.ide.o.d.p;
import com.zend.ide.o.d.r;
import com.zend.ide.o.d.s;
import com.zend.ide.o.d.t;
import com.zend.ide.o.d.w;
import com.zend.ide.o.d.z;
import com.zend.ide.util.cl;
import com.zend.ide.util.cu;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.zip.Adler32;

public class de
  implements fy, bi, com.zend.ide.t.l, com.zend.ide.t.k, cu
{
  public static int a = 2004102501;
  public static int l = 2004102502;
  public static int m = a;
  private PropertyChangeListener g = new bz(this, null);
  private PropertyChangeListener i = new bq(this, null);
  private com.zend.ide.y.e h;
  private bj j;
  private a k;
  private com.zend.ide.t.m b;
  private Collection c = new ArrayList();
  private String d;
  private int e;
  private ga f;

  public de(ga paramga)
  {
    this.f = paramga;
    this.k = new a();
    this.j = new bj();
    this.b = new com.zend.ide.t.n();
    this.b.a(new com.zend.ide.o.d.bk());
    this.b.a(this.k);
    this.b.a(this.j);
    this.b.a(this);
    this.b.a(this);
    p();
  }

  private void p()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.h = new com.zend.ide.y.e(localf);
    localf.a("debugging.encryptedData", this.g);
    localf.a("editing.encoding", this.i);
    localf.a("debugging.outputEncoding", this.i);
    localf.a("debugging.useOutputEncoding", this.i);
    this.h.a("debugging.encryptedData");
    this.h.a("editing.encoding");
    this.h.a("debugging.outputEncoding");
    this.h.a("debugging.useOutputEncoding");
  }

  public void a(int paramInt)
  {
    this.b.b(paramInt);
  }

  public void a(String paramString, int paramInt)
  {
    this.b.a(paramString, paramInt);
  }

  public void r()
  {
    this.b.i();
  }

  public void b(int paramInt)
  {
    this.b.i();
    this.b.b(paramInt);
  }

  public int j()
  {
    return this.b.e();
  }

  public void c(int paramInt)
  {
    this.b.a(paramInt);
  }

  public String c()
  {
    return c(this.d);
  }

  public void q()
  {
    this.f.a();
  }

  public void b()
  {
    this.f.b();
  }

  public byte[] a(String paramString)
  {
    try
    {
      com.zend.ide.o.d.l locall = new com.zend.ide.o.d.l();
      locall.a(b(paramString));
      z localz = (z)this.b.a(locall);
      byte[] arrayOfByte = null;
      if (localz != null)
        arrayOfByte = localz.d();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return null;
  }

  public void a(ch paramch)
  {
    if (!this.c.contains(paramch))
      this.c.add(paramch);
  }

  public void a(Object paramObject)
  {
    Object localObject1;
    if ((paramObject instanceof com.zend.ide.o.d.e))
    {
      localObject1 = ((com.zend.ide.o.d.e)paramObject).b();
      this.f.a((String)localObject1);
    }
    else if ((paramObject instanceof g))
    {
      localObject1 = (g)paramObject;
      this.d = ((g)localObject1).b();
      this.e = ((g)localObject1).c();
      this.f.a(c(), this.e);
    }
    else
    {
      Object localObject2;
      Object localObject3;
      if ((paramObject instanceof c))
      {
        localObject1 = (c)paramObject;
        int n = ((c)localObject1).d();
        m = n;
        if ((n != a) && (n != l))
        {
          this.f.bk();
          f();
          return;
        }
        localObject2 = ((c)localObject1).b();
        String str2 = ((c)localObject1).c();
        String str4 = ((c)localObject1).e();
        localObject3 = ((c)localObject1).f();
        this.f.a((String)localObject2, str2, str4, (String)localObject3);
      }
      else if ((paramObject instanceof d))
      {
        this.f.b(((d)paramObject).b());
      }
      else if ((paramObject instanceof com.zend.ide.o.d.f))
      {
        localObject1 = (com.zend.ide.o.d.f)paramObject;
        String str1 = ((com.zend.ide.o.d.f)localObject1).c();
        localObject2 = c(((com.zend.ide.o.d.f)localObject1).d());
        int i2 = ((com.zend.ide.o.d.f)localObject1).e();
        int i3 = ((com.zend.ide.o.d.f)localObject1).b();
        localObject3 = new bh(i3, (String)localObject2, i2, str1);
        this.f.b((bh)localObject3);
      }
      else if ((paramObject instanceof b))
      {
        localObject1 = (b)paramObject;
        int i1 = ((b)localObject1).b();
        localObject2 = new bh();
        String str3 = ((b)localObject1).c();
        if ((str3 != null) && (!str3.equals("")))
          ((bh)localObject2).a(str3);
        ((bh)localObject2).d(i1);
        this.f.a((bh)localObject2);
      }
      else if ((paramObject instanceof bm))
      {
        this.f.j();
      }
      else if ((paramObject instanceof com.zend.ide.t.q))
      {
        this.f.f();
      }
    }
  }

  public void k()
  {
    if (this.b.h())
      this.b.b(new bn());
  }

  public Object b(Object paramObject)
  {
    z localz = null;
    if (((paramObject instanceof com.zend.ide.o.d.l)) || ((paramObject instanceof db)))
    {
      byte[] arrayOfByte = null;
      String str;
      if ((paramObject instanceof com.zend.ide.o.d.l))
        str = c(((com.zend.ide.o.d.l)paramObject).c());
      else
        str = c(((db)paramObject).d());
      InputStream localInputStream = this.f.c(str);
      if (localInputStream != null)
        try
        {
          arrayOfByte = new byte[localInputStream.available()];
          localInputStream.read(arrayOfByte);
        }
        catch (Exception localIOException2)
        {
          cl.a(localException);
        }
        finally
        {
          try
          {
            localInputStream.close();
          }
          catch (IOException localIOException3)
          {
          }
        }
      localz = new z();
      if ((arrayOfByte != null) && ((paramObject instanceof db)))
      {
        db localdb = (db)paramObject;
        if (a(localdb.a(), localdb.c(), arrayOfByte))
        {
          ((z)localz).b(302);
          return localz;
        }
      }
      ((z)localz).a(arrayOfByte);
    }
    return localz;
  }

  private boolean a(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    int n;
    if (paramInt1 == paramArrayOfByte.length)
    {
      n = a(paramArrayOfByte);
      return paramInt2 == n;
    }
    try
    {
      int i1 = 0;
      int i2 = 13;
      int i3 = 10;
      for (int i4 = 0; i4 < paramArrayOfByte.length; i4++)
      {
        if (paramArrayOfByte[i4] != i3)
          continue;
        i1++;
      }
      if (paramInt1 == paramArrayOfByte.length + i1)
      {
        byte[] arrayOfByte = new byte[paramArrayOfByte.length + i1];
        int i5 = 0;
        for (int i6 = 0; i6 < paramArrayOfByte.length; i6++)
        {
          if (paramArrayOfByte[i6] == i3)
          {
            arrayOfByte[i5] = i2;
            i5++;
          }
          arrayOfByte[i5] = paramArrayOfByte[i6];
          i5++;
        }
        n = a(arrayOfByte);
        if (paramInt2 == n)
          return true;
        for (i6 = 0; i6 < paramArrayOfByte.length; i6++)
          if (paramArrayOfByte[i6] == i3)
          {
            arrayOfByte[i6] = i2;
          }
          else
          {
            if (paramArrayOfByte[i6] != i2)
              continue;
            arrayOfByte[i6] = i3;
          }
        n = a(arrayOfByte);
        return paramInt2 == n;
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  private int a(byte[] paramArrayOfByte)
  {
    Adler32 localAdler32 = new Adler32();
    localAdler32.update(paramArrayOfByte);
    return (int)localAdler32.getValue();
  }

  public void i()
  {
    this.f.h();
  }

  public void h()
  {
    this.f.g();
  }

  public static String b(String paramString)
  {
    if (paramString == null)
      return null;
    paramString = paramString.replace('\\', '/');
    return paramString;
  }

  private static final String c(String paramString)
  {
    if (paramString == null)
      return null;
    paramString = paramString.replace('/', com.zend.ide.j.h.m.d());
    paramString = paramString.replace('\\', com.zend.ide.j.h.m.d());
    return paramString;
  }

  public boolean a(di paramdi, bk parambk)
  {
    if (!d())
      return false;
    try
    {
      com.zend.ide.o.d.h localh = new com.zend.ide.o.d.h();
      di localdi = (di)paramdi.clone();
      String str = b(localdi.j());
      localdi.a(str);
      localh.a(localdi);
      this.b.a(localh, new df(parambk));
      return true;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  public boolean a(String paramString, int paramInt, bk parambk)
  {
    di localdi = new di();
    localdi.a(paramString);
    localdi.a(paramInt);
    return a(localdi, parambk);
  }

  public boolean a(int paramInt, bl parambl)
  {
    if (!d())
      return false;
    j localj = new j();
    localj.b(paramInt);
    this.b.a(localj, new df(parambl));
    return true;
  }

  public boolean e()
  {
    if (!d())
      return false;
    try
    {
      com.zend.ide.o.d.i locali = new com.zend.ide.o.d.i();
      w localw = (w)this.b.a(locali);
      return (localw != null) && (localw.c() == 0);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  public boolean a(bu parambu)
  {
    if (!d())
      return false;
    r localr = new r();
    this.b.a(localr, new df(parambu));
    return true;
  }

  public boolean a(bw parambw)
  {
    if (!d())
      return false;
    try
    {
      t localt = new t();
      this.b.a(localt, new df(parambw));
      return true;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  public boolean a(bv parambv)
  {
    if (!d())
      return false;
    try
    {
      s locals = new s();
      this.b.a(locals, new df(parambv));
      return true;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  public boolean a(br parambr)
  {
    if (!d())
      return false;
    try
    {
      p localp = new p();
      this.b.a(localp, new df(parambr));
      return true;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  public boolean a(gc paramgc)
  {
    if (!d())
      return false;
    com.zend.ide.o.d.q localq = new com.zend.ide.o.d.q();
    try
    {
      this.b.a(localq, new df(paramgc));
      return true;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  public boolean l()
  {
    if (!d())
      return false;
    com.zend.ide.o.d.q localq = new com.zend.ide.o.d.q();
    try
    {
      be localbe = (be)this.b.a(localq);
      return (localbe != null) && (localbe.c() == 0);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  public boolean a(bs parambs)
  {
    if (!d())
      return false;
    com.zend.ide.o.d.u localu = new com.zend.ide.o.d.u();
    try
    {
      this.b.a(localu, new df(parambs));
      return true;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  public boolean a(String paramString1, String paramString2, int paramInt, String[] paramArrayOfString)
  {
    if (!d())
      return false;
    ab localab = new ab();
    localab.a(paramString1);
    localab.b(paramString2);
    localab.b(paramInt);
    localab.a(paramArrayOfString);
    try
    {
      this.b.a(localab);
      return true;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  public void f()
  {
    this.b.i();
    this.d = null;
    this.e = 0;
  }

  public boolean d()
  {
    return (this.b != null) && (this.b.h());
  }

  public String a(String paramString, int paramInt, String[] paramArrayOfString)
    throws IllegalArgumentException
  {
    if (!d())
      return null;
    o localo = new o();
    localo.a(paramString);
    localo.b(paramInt);
    localo.a(paramArrayOfString);
    bc localbc = null;
    try
    {
      localbc = (bc)this.b.a(localo);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    if ((localbc == null) || (localbc.c() != 0))
      return null;
    String str = localbc.d();
    return str;
  }

  public com.zend.ide.z.u m()
  {
    if (!d())
      return null;
    com.zend.ide.z.u localu;
    try
    {
      com.zend.ide.o.d.bq localbq = new com.zend.ide.o.d.bq();
      bt localbt = (bt)this.b.a(localbq);
      if (localbt == null)
        return null;
      localu = localbt.d();
    }
    catch (Exception localException)
    {
      cl.a(localException);
      return null;
    }
    return localu;
  }

  public com.zend.ide.z.n d(int paramInt)
  {
    if (!d())
      return null;
    com.zend.ide.z.n localn;
    try
    {
      bp localbp = new bp();
      localbp.b(paramInt);
      com.zend.ide.o.d.bs localbs = (com.zend.ide.o.d.bs)this.b.a(localbp);
      if (localbs == null)
        return null;
      localn = localbs.d();
    }
    catch (Exception localException)
    {
      cl.a(localException);
      return null;
    }
    return localn;
  }

  public com.zend.ide.z.i n()
  {
    if (!d())
      return null;
    com.zend.ide.z.i locali;
    try
    {
      bo localbo = new bo();
      com.zend.ide.o.d.br localbr = (com.zend.ide.o.d.br)this.b.a(localbo);
      if (localbr == null)
        return null;
      locali = localbr.d();
    }
    catch (Exception localException)
    {
      cl.a(localException);
      return null;
    }
    return locali;
  }

  public com.zend.ide.z.k o()
  {
    com.zend.ide.z.k localk = new com.zend.ide.z.k();
    com.zend.ide.z.u localu = m();
    if (localu == null)
      return null;
    localk.a(localu);
    int n = localu.d();
    for (int i1 = 0; i1 < n; i1++)
    {
      com.zend.ide.z.n localn = d(i1);
      if (localn == null)
        continue;
      localk.a(localn);
    }
    com.zend.ide.z.i locali = n();
    if (locali != null)
      localk.a(locali);
    return localk;
  }

  public ib a()
  {
    if (!d())
      return null;
    com.zend.ide.o.d.m localm = new com.zend.ide.o.d.m();
    ib localib = null;
    try
    {
      ba localba = (ba)this.b.a(localm);
      if (localba != null)
        localib = localba.a();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    if (localib != null)
      for (int n = 0; n < localib.a(); n++)
      {
        jb localjb = localib.b(n);
        localjb.a(localjb.c() - 1);
        localjb.b(localjb.f() - 1);
        localjb.a(c(localjb.b()));
        localjb.c(c(localjb.e()));
      }
    return localib;
  }

  public String a(int paramInt1, String paramString, int paramInt2, String[] paramArrayOfString)
  {
    if (!d())
      return null;
    com.zend.ide.o.d.n localn = new com.zend.ide.o.d.n();
    localn.a(paramString);
    localn.b(paramInt2);
    localn.c(paramInt1);
    localn.a(paramArrayOfString);
    bb localbb = null;
    try
    {
      localbb = (bb)this.b.a(localn);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    if ((localbb == null) || (localbb.c() != 0))
      return null;
    String str = localbb.d();
    return str;
  }

  static String e(String paramString)
  {
    return c(paramString);
  }

  static com.zend.ide.t.m a(de paramde)
  {
    return paramde.b;
  }

  static a a(de paramde)
  {
    return paramde.k;
  }

  static bj b(de paramde)
  {
    return paramde.j;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.de
 * JD-Core Version:    0.6.0
 */