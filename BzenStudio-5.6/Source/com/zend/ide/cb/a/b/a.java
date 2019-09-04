package com.zend.ide.cb.a.b;

import com.zend.ide.cb.g;
import com.zend.ide.cb.q;
import com.zend.ide.p.f.e;
import java.util.HashSet;
import java.util.Iterator;

public class a extends e
{
  public a(g paramg)
  {
    super(paramg);
    a(e.b);
  }

  public a(Object paramObject, boolean paramBoolean)
  {
    super(paramObject, paramBoolean);
    a(e.b);
  }

  public String f()
  {
    return "sqlTree";
  }

  public Object d()
  {
    g localg = (g)getUserObject();
    if (!localg.c().a(false))
      return null;
    String[] arrayOfString = localg.b();
    return arrayOfString;
  }

  public Object a(HashSet paramHashSet)
  {
    Iterator localIterator = paramHashSet.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (localObject.equals(getUserObject()))
        return localObject;
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.a
 * JD-Core Version:    0.6.0
 */