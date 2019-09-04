package com.zend.ide.f;

import com.zend.ide.m.bk;
import com.zend.ide.m.q;
import com.zend.ide.m.x;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

class bx
  implements bk, Serializable
{
  private Map a;
  private Map b;

  private bx(Map paramMap1, Map paramMap2)
  {
    this.a = paramMap1;
    this.b = paramMap2;
  }

  public x[] a(vb paramvb)
  {
    return (x[])(x[])this.a.get(paramvb);
  }

  public x a(vb paramvb, String paramString)
  {
    paramString = bv.b(paramString);
    x[] arrayOfx = (x[])(x[])this.a.get(paramvb);
    if (arrayOfx == null)
      return null;
    for (int i = 0; i < arrayOfx.length; i++)
      if (arrayOfx[i].a().equalsIgnoreCase(paramString))
        return arrayOfx[i];
    return null;
  }

  public Map a()
  {
    return this.a;
  }

  public Map b()
  {
    return this.b;
  }

  public q a(vb paramvb, String paramString, int paramInt)
  {
    paramString = bv.b(paramString);
    String str = bv.b(paramString, paramvb);
    List localList = (List)this.b.get(str);
    if (localList == null)
      return null;
    Object localObject = null;
    for (int i = localList.size() - 1; i >= 0; i--)
    {
      q localq = (q)localList.get(i);
      if (localq.d() > paramInt)
        continue;
      if (localObject == null)
      {
        if (localq.c() != null)
          return localq;
        localObject = localq;
      }
      else
      {
        if (localq.c() == null)
          continue;
        if (localq.b())
          return localq;
        return localObject;
      }
    }
    return localObject;
  }

  bx(Map paramMap1, Map paramMap2, bw parambw)
  {
    this(paramMap1, paramMap2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bx
 * JD-Core Version:    0.6.0
 */