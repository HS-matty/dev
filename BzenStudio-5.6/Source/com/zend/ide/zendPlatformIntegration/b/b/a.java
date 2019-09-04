package com.zend.ide.zendPlatformIntegration.b.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class a
{
  HashMap a = new HashMap();

  public void a(String paramString, b paramb)
  {
    ArrayList localArrayList = (ArrayList)this.a.get(paramString);
    if (localArrayList == null)
    {
      localArrayList = new ArrayList();
      this.a.put(paramString, localArrayList);
    }
    int i = 0;
    int j = paramb.c();
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      int k = localb.c();
      if (j < k)
        break;
      if (j == k)
      {
        if (!localb.a())
          a(paramString);
        localArrayList.remove(i);
        break;
      }
      i++;
    }
    localArrayList.add(i, paramb);
  }

  private void a(String paramString)
  {
    ArrayList localArrayList = (ArrayList)this.a.get(paramString);
    int i = 0;
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      localb.a(true);
      i++;
    }
  }

  public b a(String paramString, int paramInt)
  {
    ArrayList localArrayList = (ArrayList)this.a.get(paramString);
    if (localArrayList == null)
      return null;
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      int i = localb.c();
      if (paramInt == i)
        return localb;
      if (paramInt < i)
        return null;
    }
    return null;
  }

  public ArrayList b(String paramString)
  {
    return (ArrayList)this.a.get(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.b.a
 * JD-Core Version:    0.6.0
 */