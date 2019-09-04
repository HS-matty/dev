package com.zend.ide.o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class bc
{
  private Collection a = new ArrayList(3);
  private List b = new ArrayList();

  public Collection b()
  {
    return this.b;
  }

  public int c()
  {
    return this.b.size();
  }

  public boolean a(String paramString)
  {
    int i = 0;
    if ((paramString != null) && (!paramString.equals("")) && (!this.b.contains(paramString)))
    {
      this.b.add(paramString);
      i = 1;
      c(paramString);
    }
    return i;
  }

  public boolean a(String paramString1, String paramString2)
  {
    int i = 0;
    int j = this.b.indexOf(paramString1);
    if ((j != -1) && (!this.b.contains(paramString2)))
    {
      this.b.set(j, paramString2);
      i = 1;
      b(paramString1, paramString2);
    }
    return i;
  }

  public void b(String paramString)
  {
    if (this.b.remove(paramString))
      d(paramString);
  }

  public void d()
  {
    this.b.clear();
    e();
  }

  public void a(bd parambd)
  {
    if (!this.a.contains(parambd))
      this.a.add(parambd);
  }

  private void c(String paramString)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      bd localbd = (bd)localIterator.next();
      localbd.a(paramString);
    }
  }

  private void b(String paramString1, String paramString2)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      bd localbd = (bd)localIterator.next();
      localbd.a(paramString1, paramString2);
    }
  }

  private void d(String paramString)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      bd localbd = (bd)localIterator.next();
      localbd.b(paramString);
    }
  }

  private void e()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      bd localbd = (bd)localIterator.next();
      localbd.h();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.bc
 * JD-Core Version:    0.6.0
 */