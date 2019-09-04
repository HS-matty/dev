package com.zend.ide.zendPlatformIntegration.b.b;

import com.zend.ide.util.cl;
import com.zend.ide.zendPlatformIntegration.a.f;
import com.zend.ide.zendPlatformIntegration.a.g;
import com.zend.ide.zendPlatformIntegration.a.r;
import com.zend.ide.zendPlatformIntegration.b.a.q;
import com.zend.ide.zendPlatformIntegration.wsClient.a;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.axis.AxisFault;

public class e extends c
{
  private int c;
  private int d;
  private com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[] e;
  private String[] f;

  public e(String paramString, int paramInt, boolean paramBoolean)
  {
    this.a = paramString;
    this.c = paramInt;
    this.b = paramBoolean;
  }

  public int a(com.zend.ide.zendPlatformIntegration.wsClient.b paramb)
    throws AxisFault, a, RemoteException
  {
    boolean bool1 = ((Boolean)com.zend.ide.y.b.a("platform.useLimits").c()).booleanValue();
    int i = 100;
    if (bool1)
      i = ((Integer)com.zend.ide.y.b.a("platform.limitSize").c()).intValue();
    HashMap localHashMap = b();
    this.d = paramb.a(localHashMap);
    if (!bool1)
    {
      i = this.d;
      if (i == 0)
        i = 1;
    }
    int j = ((Integer)com.zend.ide.y.b.a("platform.sortingFieldIndex").c()).intValue();
    String str = com.zend.ide.zendPlatformIntegration.b.a.p.a[j].b();
    boolean bool2 = ((Boolean)com.zend.ide.y.b.a("platform.sortingIsDesc").c()).booleanValue();
    this.e = paramb.a(localHashMap, BigInteger.valueOf(this.c), BigInteger.valueOf(i), str, bool2);
    com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c[] arrayOfc = (com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c[])(com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c[])paramb.a("servers");
    a(arrayOfc);
    if (this.e == null)
      this.e = new com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[0];
    return 0;
  }

  private void a(com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c[] paramArrayOfc)
  {
    this.f = new String[paramArrayOfc.length];
    for (int i = 0; i < paramArrayOfc.length; i++)
      this.f[i] = paramArrayOfc[i].getValue().toString();
  }

  public void a()
  {
  }

  public int a()
  {
    return this.d;
  }

  private HashMap b()
  {
    HashMap localHashMap = new HashMap();
    int i = ((Integer)com.zend.ide.y.b.a("platform.eventsFromFilterKey")).intValue();
    String str1 = new String(com.zend.ide.y.b.a("platform.eventTypesFilterKey").c().toString());
    String str2 = new String(com.zend.ide.y.b.a("platform.statusFilterKey").c().toString());
    String str3 = new String(com.zend.ide.y.b.a("platform.severityFilterKey").c().toString());
    r[] arrayOfr = (r[])(r[])com.zend.ide.y.b.a("platform.serversFilterArray").c();
    String str4 = com.zend.ide.y.b.a("platform.timeFilterKey").c().toString();
    ArrayList localArrayList1 = f.a().b;
    String[] arrayOfString1;
    if (!str1.equals("all"))
    {
      arrayOfString1 = new String[] { str1 };
      localHashMap.put("event_types", arrayOfString1);
    }
    else if (i != 0)
    {
      arrayOfString1 = ((g)localArrayList1.get(i)).b();
      localHashMap.put("event_types", arrayOfString1);
    }
    if (!str2.equals("all"))
      localHashMap.put("status", str2);
    int j;
    if (!str3.equals("all"))
    {
      j = -1;
      try
      {
        j = new Integer(str3).intValue();
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        cl.a(localNumberFormatException1);
      }
      if (j != -1)
        localHashMap.put("severity", str3);
    }
    int k;
    if (!str4.equals("0"))
    {
      j = 0;
      k = 0;
      try
      {
        j = new Integer(str4).intValue();
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        cl.a(localNumberFormatException2);
      }
      switch (j)
      {
      case 1:
        k = 3600;
        break;
      case 2:
        k = 86400;
        break;
      case 3:
        k = 604800;
        break;
      case 4:
        k = 18144000;
      }
      if (k != 0)
        localHashMap.put("timestamp", Integer.valueOf(k));
    }
    if (arrayOfr != null)
    {
      ArrayList localArrayList2 = new ArrayList();
      for (k = 0; k < arrayOfr.length; k++)
      {
        if (!arrayOfr[k].c())
          continue;
        localArrayList2.add(arrayOfr[k].b());
      }
      if (localArrayList2.size() > 0)
      {
        String[] arrayOfString2 = new String[localArrayList2.size()];
        localArrayList2.toArray(arrayOfString2);
        localHashMap.put("servers", arrayOfString2);
      }
      else if (arrayOfr.length != 0)
      {
        localHashMap.put("servers", new String[] { null });
      }
    }
    return localHashMap;
  }

  public Object b()
  {
    return this.e;
  }

  public int c()
  {
    return this.c;
  }

  public String[] d()
  {
    return this.f;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.b.e
 * JD-Core Version:    0.6.0
 */