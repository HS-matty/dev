package com.zend.ide.f.zc.b;

import com.zend.ide.bd.c;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class l
  implements cu
{
  private static l a;
  private Map b = new HashMap();
  private static String c;

  private static l a()
  {
    if (a == null)
    {
      a = new l();
      j[] arrayOfj = (j[])(j[])b.a("javaBridge.JREs");
      for (int i = 0; i < arrayOfj.length; i++)
        a.b.put(arrayOfj[i].d(), arrayOfj[i]);
      j localj = h.b();
      a.b.put(localj.d(), localj);
    }
    return a;
  }

  public static j b()
  {
    return (j)b.a("javaBridge.defaultJRE");
  }

  public static void a(j paramj)
  {
    if (paramj == null)
      throw new IllegalArgumentException("Default JRE model cannot be null");
    b.a("javaBridge.defaultJRE", paramj);
  }

  public static j a(String paramString, boolean paramBoolean)
  {
    Map localMap = a().b;
    j localj1 = (j)localMap.get(paramString);
    if ((!paramBoolean) || (paramString.equals(c)))
      return localj1;
    c = paramString;
    Iterator localIterator = localMap.values().iterator();
    while (localIterator.hasNext())
    {
      j localj2 = (j)localIterator.next();
      if (!paramString.equals(localj2.d()))
        localj2.a();
    }
    return (j)localMap.get(paramString);
  }

  public static j a(String paramString)
  {
    return a(paramString, true);
  }

  public static void a(String paramString, j paramj)
  {
    a().b.put(paramString, paramj);
    e();
  }

  public static String c()
  {
    return System.getProperty("java.version");
  }

  public static void a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    Map localMap = a().b;
    localMap.clear();
    for (int i = 0; i < paramArrayList1.size(); i++)
      localMap.put(paramArrayList1.get(i), paramArrayList2.get(i));
    e();
  }

  public static String[] d()
  {
    Set localSet = a().b.keySet();
    String[] arrayOfString = new String[localSet.size()];
    localSet.toArray(arrayOfString);
    return arrayOfString;
  }

  private static void e()
  {
    Collection localCollection = a().b.values();
    j[] arrayOfj = new j[localCollection.size()];
    localCollection.toArray(arrayOfj);
    b.a("javaBridge.JREs", arrayOfj);
  }

  public static void f()
  {
    String[] arrayOfString = { ct.a(1861), ct.a(1862, b().d()) };
    String str = ct.a(1842);
    ba.a(c.b().h(), arrayOfString, str, 1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.b.l
 * JD-Core Version:    0.6.0
 */