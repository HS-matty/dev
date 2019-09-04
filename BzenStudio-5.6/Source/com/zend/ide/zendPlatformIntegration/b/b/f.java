package com.zend.ide.zendPlatformIntegration.b.b;

import com.zend.ide.be.k;
import com.zend.ide.p.ba;
import com.zend.ide.util.ac;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.qb;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import org.apache.axis.AxisFault;

public class f
  implements cu
{
  private int a;
  private int b;
  private String c;
  String[] d = new String[0];
  private b e;
  private a f = new a();
  private static boolean g = false;
  private JDialog h;
  private static f i = null;

  public static synchronized f a()
  {
    if (i == null)
      i = new f();
    return i;
  }

  public b a(String paramString, int paramInt)
  {
    b localb = this.f.a(paramString, paramInt);
    if ((localb == null) || (localb.a()))
    {
      e locale = new e(paramString, paramInt, false);
      a(locale);
      return e();
    }
    this.e = localb;
    this.b = paramInt;
    return localb;
  }

  public synchronized Object a(c paramc)
  {
    int j = 0;
    boolean bool = paramc.d();
    if (!bool)
      g = false;
    com.zend.ide.bd.c.b().d().a(ct.a(1904));
    com.zend.ide.bd.c.b().d().a(10000);
    this.c = paramc.c();
    if ((this.c == null) || (this.c.equals("")))
      return null;
    String str1 = this.c;
    String str2 = com.zend.ide.y.b.a("platform.username").c().toString();
    String str3 = com.zend.ide.y.b.a("platform.password").c().toString();
    try
    {
      str3 = ac.b(str3);
    }
    catch (qb localqb)
    {
      str3 = "";
    }
    if ((str2 == null) || (str2.equals("")) || (str3 == null) || (str3.equals("")))
    {
      if (bool)
      {
        if (!g)
          a(ct.a(1905));
      }
      else
        ba.a(com.zend.ide.bd.c.b().h(), ct.a(1905), ct.a(1906), 0);
      return null;
    }
    com.zend.ide.zendPlatformIntegration.wsClient.b localb = null;
    try
    {
      localb = new com.zend.ide.zendPlatformIntegration.wsClient.b(str1 + "/server/WebServices.php", str2, str3);
    }
    catch (Exception localException)
    {
      if (bool)
      {
        if (!g)
          a(ct.a(1907) + ": " + this.c);
      }
      else
        ba.a(com.zend.ide.bd.c.b().h(), ct.a(1907) + ": " + this.c, ct.a(1906), 0);
      cl.a(localException);
      return null;
    }
    com.zend.ide.bd.c.b().d().b(10000);
    Object localObject2;
    try
    {
      paramc.a();
      paramc.a(localb);
    }
    catch (AxisFault localAxisFault)
    {
      localObject2 = ct.a(463) + ":'" + this.c + "'\n" + ct.a(1908);
      if (bool)
      {
        if (!g)
          a((String)localObject2);
      }
      else
        ba.a(com.zend.ide.bd.c.b().h(), localObject2, ct.a(1906), 0);
      j = 1;
    }
    catch (com.zend.ide.zendPlatformIntegration.wsClient.a locala)
    {
      localObject2 = locala.getMessage();
      if (((String)localObject2).indexOf("You must be logged") >= 0)
      {
        localObject2 = ct.a(1926);
      }
      else
      {
        localObject2 = ct.a(463) + ":'" + this.c + "'\n" + ct.a(1908);
        cl.a(locala);
      }
      if (bool)
      {
        if (!g)
          a(ct.a(1909) + (String)localObject2);
      }
      else
        ba.a(com.zend.ide.bd.c.b().h(), ct.a(1909) + (String)localObject2, ct.a(1906), 0);
      j = 1;
    }
    catch (RemoteException localRemoteException)
    {
      if (bool)
      {
        if (!g)
          a(ct.a(463) + ":'" + this.c + "'\n" + ct.a(1908));
      }
      else
        ba.a(com.zend.ide.bd.c.b().h(), ct.a(1910), ct.a(1906), 0);
      cl.a(localRemoteException);
      j = 1;
    }
    finally
    {
      com.zend.ide.bd.c.b().d().b(-1);
      com.zend.ide.bd.c.b().d().b(ct.a(1904));
    }
    Object localObject1;
    if ((paramc instanceof e))
    {
      localObject1 = (e)paramc;
      localObject2 = (com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[])(com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[])paramc.b();
      if (j != 0)
      {
        this.e = null;
        localObject2 = new com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[0];
      }
      this.d = ((e)localObject1).d();
      b localb1 = new b(localObject2, ((e)localObject1).c(), System.currentTimeMillis());
      this.e = localb1;
      this.b = ((e)localObject1).c();
      this.a = ((e)localObject1).a();
      this.f.a(this.c, localb1);
    }
    else if ((paramc instanceof d))
    {
      localObject1 = (com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c[])(com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c[])paramc.b();
      if (localObject1 != null)
      {
        this.d = new String[localObject1.length];
        for (int k = 0; k < localObject1.length; k++)
          this.d[k] = localObject1[k].getValue().toString();
      }
    }
    return paramc.b();
  }

  private void a(String paramString)
  {
    h localh = new h(this, paramString);
    this.h = localh.createDialog(com.zend.ide.bd.c.b().h(), ct.a(1911));
    this.h.setVisible(true);
    Object[] arrayOfObject = localh.getOptions();
    boolean bool = ((JCheckBox)arrayOfObject[0]).isSelected();
    g = bool;
  }

  public b a(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    b localb = null;
    ArrayList localArrayList = this.f.b(paramString);
    if (localArrayList == null)
      return null;
    e locale = new e(paramString, 0, false);
    if ((!paramBoolean2) && (paramBoolean1 != paramBoolean2))
    {
      localArrayList.removeAll(localArrayList);
      a(locale);
      localb = e();
    }
    if ((paramBoolean2) && (paramBoolean1 != paramBoolean2))
    {
      localArrayList.removeAll(localArrayList);
      a(locale);
      localb = e();
    }
    if ((paramBoolean2) && (paramBoolean1 == paramBoolean2) && (paramInt1 != paramInt2))
      localb = b(paramString, paramInt2);
    if (localb != null)
    {
      this.e = localb;
      com.zend.ide.zendPlatformIntegration.b.e.a().a(localb.b());
      return localb;
    }
    return null;
  }

  public b b(String paramString)
  {
    b localb = null;
    ArrayList localArrayList = this.f.b(paramString);
    if (localArrayList == null)
      return null;
    localArrayList.removeAll(localArrayList);
    e locale = new e(paramString, 0, false);
    a(locale);
    localb = e();
    if (localb != null)
    {
      this.e = localb;
      com.zend.ide.zendPlatformIntegration.b.e.a().a(localb.b());
      return localb;
    }
    return null;
  }

  public b b(String paramString, int paramInt)
  {
    ArrayList localArrayList1 = this.f.b(paramString);
    if (localArrayList1 == null)
      return null;
    ArrayList localArrayList2 = new ArrayList();
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    boolean bool = false;
    com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[] arrayOfb1 = new com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[paramInt];
    Object localObject1 = localArrayList1.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (b)((Iterator)localObject1).next();
      com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[] arrayOfb2 = ((b)localObject2).b();
      if (((b)localObject2).a())
        bool = true;
      while (k < arrayOfb2.length)
      {
        if (m == arrayOfb1.length)
        {
          m = 0;
          b localb = new b(arrayOfb1, n, System.currentTimeMillis());
          localb.a(bool);
          localArrayList2.add(localb);
          arrayOfb1 = new com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.b[paramInt];
          n += paramInt;
          bool = ((b)localObject2).a();
        }
        arrayOfb1[m] = arrayOfb2[k];
        m++;
        k++;
      }
      k = 0;
      j++;
    }
    if ((arrayOfb1[0] != null) && (arrayOfb1[(arrayOfb1.length - 1)] != null))
    {
      localObject1 = new b(arrayOfb1, n, System.currentTimeMillis());
      ((b)localObject1).a(bool);
      localArrayList2.add(localObject1);
    }
    if ((arrayOfb1[0] != null) && (arrayOfb1[(arrayOfb1.length - 1)] == null))
    {
      localObject1 = new e(paramString, n, false);
      a((c)localObject1);
      localObject2 = e();
      ((b)localObject2).a(bool);
      localArrayList2.add(localObject2);
    }
    localArrayList1.removeAll(localArrayList1);
    localArrayList1.addAll(localArrayList2);
    localObject1 = (b)localArrayList1.get(0);
    if (((b)localObject1).a())
    {
      localObject2 = new e(paramString, 0, false);
      a((c)localObject2);
      localObject1 = e();
    }
    return (b)(b)localObject1;
  }

  public int b()
  {
    return this.a;
  }

  public int c()
  {
    return this.b;
  }

  public String d()
  {
    return this.c;
  }

  public b e()
  {
    return this.e;
  }

  public String[] f()
  {
    return this.d;
  }

  static JDialog a(f paramf)
  {
    return paramf.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.b.f
 * JD-Core Version:    0.6.0
 */