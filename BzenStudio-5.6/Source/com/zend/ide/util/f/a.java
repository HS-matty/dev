package com.zend.ide.util.f;

import com.zend.ide.p.e.b;
import com.zend.ide.util.Registration;
import com.zend.ide.util.bi;
import com.zend.ide.util.cl;
import com.zend.ide.util.cr;
import com.zend.ide.util.cu;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.zip.CRC32;
import javax.swing.JFrame;

public class a
  implements cu
{
  public static a a = new a();
  private f b = new f();
  private g c;
  protected List e;
  private boolean g = false;
  private d d = new d(2006, 1, 1, 40);
  private k f = new k();

  public void b()
  {
    String str1 = bi.a("USER_NAME");
    String str2 = bi.a("LICENSE_KEY");
    if ((str1 == null) || (str2 == null) || (str1.equals("")) || (str2.equals("")))
    {
      String str3 = bi.a("FIRST_TIME_LOADING");
      if (str3 != null)
      {
        y localy = x.a(30);
        str1 = localy.b();
        str2 = localy.a();
        bi.b("USER_NAME", str1);
        bi.b("LICENSE_KEY", str2);
      }
    }
    a(str1, str2);
  }

  public void a(String paramString1, String paramString2)
  {
    this.b = b(paramString1, paramString2);
    if (this.b.a())
      f().a();
    if (this.b.b())
      if (this.b.d <= 0)
        for (int i = 1; i != 0; i = 0)
        {
          label49: this.f.a(this.b.d(), this.b.h());
          if ("".length() > 0)
          {
            this.b.a(0);
            break;
          }
          f().a();
          if ((!this.b.c()) && (!g()))
            break label49;
        }
      else if (this.b.d <= 14)
        this.f.a(this.b.d(), this.b.d, f().b());
    a(this.e);
  }

  public void a(JFrame paramJFrame)
  {
    f().a(paramJFrame);
  }

  public boolean a()
  {
    return this.g;
  }

  public f c()
  {
    return this.b;
  }

  public boolean b()
  {
    return this.b.e();
  }

  private boolean g()
  {
    return (!this.b.h()) && (this.b.b()) && (this.b.i() > 0);
  }

  public boolean c()
  {
    return (this.b.b()) && (!this.b.f()) && (!this.b.g());
  }

  public int d()
  {
    return this.b.i();
  }

  public int e()
  {
    return this.b.d();
  }

  public void a(j paramj)
  {
    if (this.e == null)
      this.e = new ArrayList(2);
    synchronized (this.e)
    {
      if (!this.e.contains(paramj))
        this.e.add(paramj);
    }
  }

  private static final void a(List paramList)
  {
    if (paramList != null)
      synchronized (paramList)
      {
        int i = paramList.size();
        for (int j = 0; j < i; j++)
        {
          j localj = (j)paramList.get(j);
          localj.b();
        }
      }
  }

  private g f()
  {
    if (this.c == null)
      this.c = new g(new e(this));
    return this.c;
  }

  private boolean a(String paramString1, String paramString2, Component paramComponent)
  {
    if (paramString1.toLowerCase().startsWith("sn"))
    {
      this.f.a(paramString1, paramComponent);
      return true;
    }
    if (paramString2.toLowerCase().startsWith("sn"))
    {
      this.f.a(paramString2, paramComponent);
      return true;
    }
    return false;
  }

  private f b(String paramString1, String paramString2)
  {
    f localf = new f(paramString1, paramString2);
    if ((paramString1 == null) || (paramString2 == null))
      return localf;
    try
    {
      if (paramString2.toLowerCase().startsWith("lk"))
      {
        paramString2 = paramString2.substring(2);
        localf.b = localf.b.substring(2);
      }
      int i = 1;
      int j = 0;
      String str1 = "";
      String str2 = "";
      boolean bool = false;
      if (paramString2.length() >= 18)
      {
        bool = true;
        str1 = paramString2.substring(16, 18);
        try
        {
          str2 = paramString2.substring(18);
          i = Integer.valueOf(str2).intValue();
        }
        catch (Exception localException2)
        {
          i = 0;
        }
        j = Integer.valueOf(str1).intValue();
        paramString2 = paramString2.substring(0, 16);
      }
      localf.h = bool;
      localf.e = i;
      String str3 = paramString2.substring(8, 16);
      if (a(localf, paramString1, str1, str2, str3, paramString2))
      {
        int k = Integer.parseInt(str3.substring(4));
        int m = Integer.parseInt(str3.substring(0, 2));
        int n = Integer.parseInt(str3.substring(2, 4));
        if ((b.e != null) && (b.e.before(new GregorianCalendar(k, n - 1, m))))
        {
          k = b.e.get(1);
          n = b.e.get(2) + 1;
          m = b.e.get(5);
        }
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.set(k, n - 1, m);
        localf.j = localCalendar;
        if (this.g)
        {
          if (a(j, k, localf))
          {
            this.f.c(f().b());
            return localf;
          }
          if (h())
          {
            this.f.d(f().b());
            return localf;
          }
        }
        else
        {
          localf.g = a(localf, j);
          if (!localf.g)
            return localf;
        }
        if (a(k))
        {
          if (localf.e > 0)
            localf.a(2);
          return localf;
        }
        if ((!localf.f()) && (!localf.g()) && (a(localf)))
        {
          localf.a(1);
          localf.d = -2;
          localf.a(true);
          return localf;
        }
        localf.d = a(k, n, m);
        localf.a(1);
      }
      return localf;
    }
    catch (Exception localException1)
    {
    }
    return new f(paramString1, paramString2);
  }

  private boolean a(f paramf, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    String str = paramString1 + paramString4 + paramString2 + paramString3;
    if (a("StudioStd" + str, paramString4, paramString5))
    {
      paramf.b(0);
      return true;
    }
    if (a("StudioPro" + str, paramString4, paramString5))
    {
      paramf.b(1);
      return true;
    }
    if (a("StudioEnterprise" + str, paramString4, paramString5))
    {
      paramf.b(2);
      return true;
    }
    if (a("StudioSBPro" + str, paramString4, paramString5))
    {
      paramf.b(3);
      return true;
    }
    return false;
  }

  private boolean a(String paramString1, String paramString2, String paramString3)
  {
    CRC32 localCRC32 = new CRC32();
    localCRC32.update(paramString1.getBytes());
    int i = (int)localCRC32.getValue();
    for (String str = Integer.toHexString(i) + paramString2; str.length() < 16; str = "0" + str);
    return str.compareToIgnoreCase(paramString3) == 0;
  }

  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    Calendar localCalendar1 = Calendar.getInstance();
    localCalendar1.set(paramInt1, paramInt2 - 1, paramInt3);
    Calendar localCalendar2 = Calendar.getInstance();
    int i = localCalendar1.get(6) - localCalendar2.get(6) + 1;
    i += (localCalendar1.get(1) - localCalendar2.get(1)) * 365;
    return i;
  }

  private static boolean a(f paramf)
  {
    if (cr.c() == 1)
    {
      CRC32 localCRC321 = new CRC32();
      CRC32 localCRC322 = new CRC32();
      CRC32 localCRC323 = new CRC32();
      String str = Integer.toString(500) + Integer.toString(50) + Integer.toString(1);
      localCRC321.update(str.getBytes());
      localCRC322.update(paramf.a.getBytes());
      localCRC323.update(paramf.b.getBytes());
      try
      {
        if (Registration.listenListener(Integer.toHexString((int)localCRC321.getValue()), Integer.toHexString((int)localCRC322.getValue()), Integer.toHexString((int)localCRC323.getValue())) == 0)
          return true;
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
    return false;
  }

  private static boolean a(f paramf, int paramInt)
  {
    if (paramInt == 0)
      return true;
    int i = 55;
    return (!paramf.h) || (paramInt >= i);
  }

  private boolean a(int paramInt1, int paramInt2, f paramf)
  {
    if (((!a(paramInt2)) && (!b(paramf))) || (paramf.d() == 0))
      return true;
    return (paramInt1 != 0) && (paramInt1 < this.d.b());
  }

  private boolean b(f paramf)
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    localGregorianCalendar.set(2006, 2, 2);
    return ((paramf.a().after(localGregorianCalendar)) && (paramf.g())) || (paramf.f());
  }

  private boolean h()
  {
    GregorianCalendar localGregorianCalendar1 = new GregorianCalendar();
    GregorianCalendar localGregorianCalendar2 = this.d.a();
    return localGregorianCalendar1.after(localGregorianCalendar2);
  }

  private static boolean a(int paramInt)
  {
    return paramInt >= 3500;
  }

  static g a(a parama)
  {
    return parama.f();
  }

  static f a(a parama, String paramString1, String paramString2)
  {
    return parama.b(paramString1, paramString2);
  }

  static boolean a(a parama, String paramString1, String paramString2, Component paramComponent)
  {
    return parama.a(paramString1, paramString2, paramComponent);
  }

  static k a(a parama)
  {
    return parama.f;
  }

  static f a(a parama, f paramf)
  {
    return parama.b = paramf;
  }

  static f b(a parama)
  {
    return parama.b;
  }

  static void b(List paramList)
  {
    a(paramList);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.a
 * JD-Core Version:    0.6.0
 */