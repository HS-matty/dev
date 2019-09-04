package com.zend.ide.n.a;

import java.util.ArrayList;
import java.util.Iterator;

public class k extends ArrayList
  implements Comparable
{
  private String a;

  public k(String paramString)
  {
    a(paramString);
    this.a = paramString;
  }

  public String b()
  {
    return this.a;
  }

  public void a(String paramString)
  {
    this.a = paramString;
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      locale.a(paramString);
    }
  }

  public int compareTo(Object paramObject)
  {
    k localk = (k)paramObject;
    return this.a.compareTo(localk.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.a.k
 * JD-Core Version:    0.6.0
 */