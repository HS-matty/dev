package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.util.cl;
import com.zend.ide.y.b;
import com.zend.ide.y.c;

public class s
{
  public boolean a;
  public int b;
  public int c;
  public boolean d;
  public boolean e;
  public int f;
  public int g;
  public String h;
  public String i;
  public String j;
  public String k;
  public r[] l;
  private static s m;

  private s()
  {
    b();
  }

  public static synchronized s a()
  {
    if (m == null)
      m = new s();
    return m;
  }

  public void b()
  {
    try
    {
      this.f = ((Integer)b.a("platform.limitSize").c()).intValue();
      this.e = ((Boolean)b.a("platform.useLimits").c()).booleanValue();
      this.c = ((Integer)b.a("platform.sortingFieldIndex").c()).intValue();
      this.a = ((Boolean)b.a("platform.isAutoRefresh").c()).booleanValue();
      this.d = ((Boolean)b.a("platform.sortingIsDesc").c()).booleanValue();
      this.b = ((Integer)b.a("platform.refreshRate").c()).intValue();
      this.g = ((Integer)b.a("platform.eventsFromFilterKey")).intValue();
      this.h = b.a("platform.eventTypesFilterKey").c().toString();
      this.i = b.a("platform.statusFilterKey").c().toString();
      this.j = b.a("platform.severityFilterKey").c().toString();
      this.k = b.a("platform.timeFilterKey").c().toString();
      r[] arrayOfr = (r[])(r[])b.a("platform.serversFilterArray").c();
      this.l = new r[arrayOfr.length];
      a(arrayOfr, this.l);
    }
    catch (Exception localException)
    {
      cl.a(localException);
      c();
    }
  }

  public void c()
  {
    this.a = false;
    this.b = 5;
    this.e = false;
    this.c = 4;
    this.d = true;
    this.f = 100;
    this.g = 0;
    this.h = "all";
    this.i = "all";
    this.j = "all";
    this.k = "0";
  }

  public void d()
  {
    try
    {
      b.a("platform.isAutoRefresh").a(Boolean.valueOf(this.a));
      b.a("platform.refreshRate").a(Integer.valueOf(this.b));
      b.a("platform.useLimits").a(Boolean.valueOf(this.e));
      b.a("platform.limitSize").a(Integer.valueOf(this.f));
      b.a("platform.sortingFieldIndex").a(Integer.valueOf(this.c));
      b.a("platform.sortingIsDesc").a(Boolean.valueOf(this.d));
      b.a("platform.eventsFromFilterKey").a(Integer.valueOf(this.g));
      b.a("platform.eventTypesFilterKey").a(this.h);
      b.a("platform.statusFilterKey").a(this.i);
      b.a("platform.severityFilterKey").a(this.j);
      b.a("platform.timeFilterKey").a(this.k);
      r[] arrayOfr = new r[this.l.length];
      a(this.l, arrayOfr);
      b.a("platform.serversFilterArray").a(arrayOfr);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private void a(r[] paramArrayOfr1, r[] paramArrayOfr2)
  {
    if (paramArrayOfr1.length == 0)
      return;
    for (int n = 0; n < paramArrayOfr1.length; n++)
      paramArrayOfr2[n] = new r(paramArrayOfr1[n].a(), paramArrayOfr1[n].b(), paramArrayOfr1[n].c());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.s
 * JD-Core Version:    0.6.0
 */