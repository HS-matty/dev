package com.zend.ide.ba;

import java.util.ArrayList;
import java.util.Iterator;

public class h
{
  private String a;
  private ArrayList b;

  public h(String paramString)
  {
    this.a = paramString;
    this.b = new ArrayList(1);
  }

  public void a(b paramb)
  {
    if (paramb != null)
      this.b.add(paramb);
  }

  public b[] d()
  {
    b[] arrayOfb = new b[this.b.size()];
    return (b[])(b[])this.b.toArray(arrayOfb);
  }

  public String b()
  {
    return this.a;
  }

  public void a(String paramString)
  {
    this.a = paramString;
    if (!this.b.isEmpty())
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        localb.b(paramString);
      }
    }
  }

  public boolean c()
  {
    return this.b.size() <= 0;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ba.h
 * JD-Core Version:    0.6.0
 */