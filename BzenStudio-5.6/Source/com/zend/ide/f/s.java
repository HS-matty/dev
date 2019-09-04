package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.b.m;
import com.zend.ide.f.zc.b.f;
import com.zend.ide.j.u;
import com.zend.ide.m.ab;
import com.zend.ide.m.bd;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.c;
import com.zend.ide.m.r;
import com.zend.ide.m.t;
import com.zend.ide.m.v;
import com.zend.ide.m.y;
import com.zend.ide.m.z;
import com.zend.ide.util.b.a;
import java.io.File;
import java.util.Arrays;

public class s
{
  private bt a = new bt();

  public bt g()
  {
    return this.a;
  }

  public void b()
  {
    this.a.g();
  }

  public bf a(String paramString)
  {
    return this.a.a(paramString);
  }

  public void a(bf parambf)
  {
    this.a.a(parambf);
  }

  public void b(String paramString)
  {
    this.a.b(paramString);
  }

  public d[] c()
  {
    d[] arrayOfd1 = bm.f();
    d[] arrayOfd2 = this.a.b();
    return bl.a(arrayOfd1, arrayOfd2);
  }

  public d[] c(String paramString)
  {
    d[] arrayOfd1 = bm.b(paramString);
    d[] arrayOfd2 = this.a.d(paramString);
    return bl.a(arrayOfd1, arrayOfd2);
  }

  public d[] d(String paramString)
  {
    d[] arrayOfd1 = bm.a(paramString);
    d[] arrayOfd2 = this.a.c(paramString);
    return bl.a(arrayOfd1, arrayOfd2);
  }

  public v a(String paramString1, String paramString2, boolean paramBoolean)
  {
    v localv = this.a.a(paramString1, paramString2);
    if (localv != null)
      return localv;
    if (paramBoolean)
    {
      localv = e(paramString1, paramString2);
      if (localv != null)
        return localv;
    }
    return bm.a(paramString2);
  }

  public d[] f()
  {
    d[] arrayOfd1 = bm.j();
    d[] arrayOfd2 = this.a.c();
    return bl.a(arrayOfd1, arrayOfd2);
  }

  public d[] e(String paramString)
  {
    d[] arrayOfd1 = bm.d(paramString);
    d[] arrayOfd2 = this.a.e(paramString);
    return bl.a(arrayOfd1, arrayOfd2);
  }

  public v b(String paramString1, String paramString2)
  {
    return this.a.b(paramString1, paramString2);
  }

  private v c(String paramString1, String paramString2)
  {
    v localv = a(paramString1, paramString2, false);
    if (localv == null)
      localv = b(paramString1, paramString2);
    if (localv == null)
      localv = d(paramString1, paramString2);
    return localv;
  }

  private v a(String paramString1, String paramString2)
  {
    d[] arrayOfd = this.a.a();
    for (int i = 0; i < arrayOfd.length; i++)
    {
      if (!arrayOfd[i].f().c().equals(paramString1))
        continue;
      ab[] arrayOfab = ((t)arrayOfd[i]).d();
      for (int j = 0; j < arrayOfab.length; j++)
        if (arrayOfab[j].a().equals(paramString2))
          return arrayOfab[j];
    }
    return null;
  }

  private v d(String paramString1, String paramString2)
  {
    v localv = this.a.c(paramString1, paramString2);
    if (localv == null)
    {
      f localf = f.a();
      try
      {
        if (paramString2.endsWith("[]"))
          paramString2 = paramString2.substring(0, paramString2.length() - 2);
        localv = localf.a(paramString2, paramString1, 0);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        return null;
      }
    }
    return localv;
  }

  private v e(String paramString1, String paramString2)
  {
    v localv = c(paramString1, paramString2);
    if (localv == null)
      localv = a(paramString1, paramString2);
    if (localv == null)
      localv = d(paramString1, paramString2);
    return localv;
  }

  public d b(String paramString1, String paramString2)
  {
    v localv = c(paramString2, paramString1);
    if (localv == null)
      localv = b(paramString2, paramString1);
    Object localObject = null;
    if (localv != null)
    {
      localObject = a(localv);
      if (localObject == null)
        localObject = localv.j();
    }
    return (d)localObject;
  }

  private d a(v paramv)
  {
    if (paramv == null)
      return null;
    if (paramv.i())
      return paramv.j();
    String str1 = paramv.c().a();
    if (str1 != null)
    {
      String str2 = paramv.e() ? paramv.f().c() : "";
      return a(c(str2, str1));
    }
    return null;
  }

  public d a(String paramString1, String paramString2, String paramString3)
  {
    v localv = c(paramString1, paramString2);
    if (localv == null)
      return null;
    bh[] arrayOfbh = localv.h();
    int i = bl.a(arrayOfbh, paramString3, true);
    if (i >= 0)
      return arrayOfbh[i];
    String str = localv.c().a();
    if (str != null)
    {
      paramString1 = localv.e() ? localv.f().c() : "";
      return a(paramString1, str, paramString3);
    }
    return null;
  }

  public d[] b(String paramString1, String paramString2, String paramString3)
  {
    v localv = c(paramString1, paramString2);
    if (localv == null)
      return null;
    d[] arrayOfd1 = bl.a(localv.h(), paramString3);
    d[] arrayOfd2 = null;
    String str = localv.c().a();
    if (str != null)
    {
      paramString1 = localv.e() ? localv.f().c() : "";
      arrayOfd2 = bl.a(b(paramString1, str, paramString3), bl.f);
    }
    return bl.b(arrayOfd1, arrayOfd2);
  }

  public d a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    v localv = null;
    if (paramBoolean)
      localv = e(paramString1, paramString2);
    else
      localv = c(paramString1, paramString2);
    if (localv == null)
      return null;
    if (paramString3.startsWith("$"))
      paramString3 = paramString3.substring(1);
    z[] arrayOfz = localv.g();
    for (int i = 0; i < arrayOfz.length; i++)
      if (arrayOfz[i].a().equals(paramString3))
        return arrayOfz[i];
    String str = localv.c().a();
    if (str != null)
    {
      paramString1 = localv.e() ? localv.f().c() : "";
      return a(paramString1, str, paramString3, paramBoolean);
    }
    return null;
  }

  public d[] c(String paramString1, String paramString2, String paramString3)
  {
    v localv = e(paramString1, paramString2);
    if (localv == null)
      return null;
    if (paramString3.startsWith("$"))
      paramString3 = paramString3.substring(1);
    d[] arrayOfd1 = bl.a(localv.g(), paramString3);
    boolean bool = localv instanceof ab;
    d[] arrayOfd2 = null;
    String str = localv.c().a();
    if (str != null)
    {
      if (!bool)
        paramString1 = localv.e() ? localv.f().c() : "";
      arrayOfd2 = bl.a(c(paramString1, str, paramString3), bl.f);
    }
    d[] arrayOfd3 = bl.a(arrayOfd1, arrayOfd2);
    if ((bool) && (arrayOfd3 != null))
      Arrays.sort(arrayOfd3);
    return arrayOfd3;
  }

  public d c(String paramString1, String paramString2, String paramString3)
  {
    v localv = c(paramString1, paramString2);
    if (localv == null)
      return null;
    c[] arrayOfc = localv.a();
    for (int i = 0; i < arrayOfc.length; i++)
      if (arrayOfc[i].a().equals(paramString3))
        return arrayOfc[i];
    String str = localv.c().a();
    if (str != null)
    {
      paramString1 = localv.e() ? localv.f().c() : "";
      return c(paramString1, str, paramString3);
    }
    return null;
  }

  public d[] d(String paramString1, String paramString2, String paramString3)
  {
    v localv = c(paramString1, paramString2);
    if (localv == null)
      return null;
    d[] arrayOfd1 = bl.a(localv.a(), paramString3);
    d[] arrayOfd2 = null;
    String str = localv.c().a();
    if (str != null)
    {
      paramString1 = localv.e() ? localv.f().c() : "";
      arrayOfd2 = d(paramString1, str, paramString3);
    }
    return bl.a(arrayOfd1, arrayOfd2);
  }

  public String c(String paramString1, String paramString2)
  {
    v localv = c(paramString1, paramString2);
    if (localv != null)
      return localv.c().a();
    return null;
  }

  public static d[] d()
  {
    return bm.b();
  }

  public d[] a(String paramString1, vb paramvb, String paramString2, boolean paramBoolean)
  {
    d[] arrayOfd1 = bl.a(bm.c(), paramString2);
    d[] arrayOfd2 = this.a.a(paramString1, paramvb, paramString2, paramBoolean);
    return bl.a(bl.a(arrayOfd2, arrayOfd1));
  }

  public String a(String paramString1, vb paramvb, String paramString2, int paramInt, boolean paramBoolean)
  {
    return this.a.a(paramString1, paramvb, paramString2, paramInt, paramBoolean);
  }

  public d[] b(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    if ((paramString2.equals("_SERVER")) || (paramString2.equals("HTTP_SERVER_VARS")))
      return bl.a(bm.d(), paramString3);
    if ((paramString2.equals("_SESSION")) || (paramString2.equals("HTTP_SESSION_VARS")))
      return bl.a(bm.e(), paramString3);
    if (paramString2.equals("GLOBALS"))
    {
      d[] arrayOfd1 = bl.a(bm.c(), paramString3);
      d[] arrayOfd2 = this.a.a(paramString1, paramString3, paramBoolean);
      return bl.a(bl.a(arrayOfd1, arrayOfd2));
    }
    return di.a;
  }

  public bd a(String paramString)
  {
    bd localbd = this.a.a(paramString);
    if (localbd == null)
    {
      d[] arrayOfd = bm.e(paramString);
      if ((arrayOfd != null) && (arrayOfd.length > 0))
        localbd = (bd)arrayOfd[0];
    }
    return localbd;
  }

  public d[] e()
  {
    bd[] arrayOfbd1 = bm.g();
    bd[] arrayOfbd2 = this.a.f();
    return bl.a(arrayOfbd1, arrayOfbd2);
  }

  public d[] g(String paramString)
  {
    d[] arrayOfd1 = bm.e(paramString);
    d[] arrayOfd2 = this.a.h(paramString);
    return bl.a(arrayOfd1, arrayOfd2);
  }

  public r[] a(u paramu, File[] paramArrayOfFile)
  {
    return this.a.a(paramu, paramArrayOfFile);
  }

  public a[] a()
  {
    return this.a.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.s
 * JD-Core Version:    0.6.0
 */