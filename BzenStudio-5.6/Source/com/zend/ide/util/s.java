package com.zend.ide.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.Action;

public class s
  implements bb
{
  private bb a;
  private HashMap b;
  private List c;
  private Map d;
  private Map e;

  public void a(bb parambb)
  {
    this.a = parambb;
  }

  public void a(v paramv)
  {
    if (this.c == null)
      this.c = new ArrayList(5);
    if (!this.c.contains(paramv))
      this.c.add(paramv);
  }

  public void b(v paramv)
  {
    if (this.c != null)
      this.c.remove(paramv);
  }

  public Action a(String paramString)
  {
    Action localAction = null;
    if (this.b != null)
    {
      localAction = (Action)this.b.get(paramString);
      if ((localAction != null) && ((localAction instanceof dr)))
        ((dr)localAction).b();
    }
    return localAction;
  }

  private Map a(Collection paramCollection)
  {
    HashMap localHashMap = new HashMap(paramCollection.size() * 2);
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Action localAction = a(str);
      localHashMap.put(str, localAction);
    }
    return localHashMap;
  }

  private Map e(String paramString)
  {
    if (this.d != null)
    {
      Collection localCollection = (Collection)this.d.get(paramString);
      if (localCollection != null)
        return a(localCollection);
    }
    return null;
  }

  public Map b(String paramString)
  {
    HashMap localHashMap = new HashMap();
    a(localHashMap, paramString);
    return localHashMap;
  }

  public void e()
  {
    if (this.c == null)
      return;
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      v localv = (v)localIterator.next();
      localv.c();
    }
  }

  protected void a(Map paramMap, String paramString)
  {
    Map localMap1 = e("default");
    Map localMap2 = null;
    if ((paramString != null) && (!paramString.equals("default")))
      localMap2 = e(paramString);
    if (localMap1 != null)
      paramMap.putAll(localMap1);
    if (localMap2 != null)
      paramMap.putAll(localMap2);
    if (this.a != null)
      ((s)this.a).a(paramMap, paramString);
  }

  public void b(Map paramMap, String paramString)
  {
    Map localMap = f(paramString);
    if (localMap != null)
      paramMap.putAll(localMap);
  }

  public Map f(String paramString)
  {
    if (this.e != null)
    {
      Collection localCollection = (Collection)this.e.get(paramString);
      if (localCollection != null)
        return a(localCollection);
    }
    return null;
  }

  public Map c(String paramString)
  {
    HashMap localHashMap = new HashMap();
    c(localHashMap, paramString);
    return localHashMap;
  }

  public void c(Map paramMap, String paramString)
  {
    Map localMap1 = f("default");
    Map localMap2 = null;
    if ((paramString != null) && (!paramString.equals("default")))
      localMap2 = f(paramString);
    if (localMap1 != null)
      paramMap.putAll(localMap1);
    if (localMap2 != null)
      paramMap.putAll(localMap2);
    if (this.a != null)
      ((s)this.a).c(paramMap, paramString);
  }

  public void a(String paramString1, Action paramAction, String paramString2, boolean paramBoolean)
  {
    if (this.b == null)
      this.b = new HashMap(10);
    if (this.d == null)
      this.d = new HashMap(10);
    if (!this.b.containsKey(paramString1))
      this.b.put(paramString1, paramAction);
    Object localObject1 = (Collection)this.d.get(paramString2);
    if (localObject1 == null)
    {
      localObject1 = new ArrayList(5);
      this.d.put(paramString2, localObject1);
    }
    ((Collection)localObject1).add(paramString1);
    if (paramBoolean)
    {
      if (this.e == null)
        this.e = new HashMap(5);
      Object localObject2 = (Collection)this.e.get(paramString2);
      if (localObject2 == null)
      {
        localObject2 = new ArrayList(3);
        this.e.put(paramString2, localObject2);
      }
      ((Collection)localObject2).add(paramString1);
    }
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (this.b != null)
      this.b.remove(paramString1);
    Collection localCollection;
    if (this.d != null)
    {
      localCollection = (Collection)this.d.get(paramString2);
      if (localCollection != null)
        localCollection.remove(paramString1);
    }
    if ((paramBoolean) && (this.e != null))
    {
      localCollection = (Collection)this.e.get(paramString2);
      if (localCollection != null)
        localCollection.remove(paramString1);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.s
 * JD-Core Version:    0.6.0
 */