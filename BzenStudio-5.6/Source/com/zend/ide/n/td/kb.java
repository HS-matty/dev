package com.zend.ide.n.td;

import com.zend.ide.m.bf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class kb
  implements jb
{
  private Object a = new Object();
  private ArrayList b = new ArrayList(5);
  private ArrayList c = new ArrayList(5);
  private rb d = new rb();
  private qb e = new qb();

  public void a()
  {
    this.d.a();
    b();
  }

  public void a(gb paramgb)
  {
    paramgb.a();
    f(paramgb);
  }

  public void b(gb paramgb)
  {
    paramgb.b();
    e(paramgb);
  }

  public void a(mb parammb)
  {
    this.c.add(parammb);
  }

  public void b(mb parammb)
  {
    this.c.remove(parammb);
  }

  public mb[] e()
  {
    mb[] arrayOfmb;
    synchronized (this.c)
    {
      arrayOfmb = new mb[this.c.size()];
      this.c.toArray(arrayOfmb);
    }
    return arrayOfmb;
  }

  public void a(bf parambf)
  {
    int i = this.e.a() > 0 ? 1 : 0;
    this.e.c();
    mb[] arrayOfmb = e();
    synchronized (this.a)
    {
      for (int j = 0; j < arrayOfmb.length; j++)
      {
        arrayOfmb[j].a(parambf);
        this.e.a(arrayOfmb[j].a());
      }
      this.d.c(this.e.b());
      List localList1 = this.d.c();
      if ((i != 0) && (this.e.a() == 0))
      {
        a(localList1, true);
        return;
      }
      List localList2 = this.d.b();
      if (localList2.size() > 0)
        if (localList2.size() > 1)
          b(localList2);
        else
          c((gb)localList2.get(0));
      if (localList1.size() > 0)
        if (localList1.size() > 1)
          a(localList1, false);
        else
          d((gb)localList1.get(0));
    }
  }

  public gb f()
  {
    return this.d.f();
  }

  public gb g()
  {
    return this.d.g();
  }

  public gb c(int paramInt)
  {
    return this.d.c(paramInt);
  }

  public List b(int paramInt)
  {
    return this.d.b(paramInt);
  }

  public void d()
  {
    ArrayList localArrayList = new ArrayList(50);
    synchronized (this.a)
    {
      Iterator localIterator = this.d.d();
      while (localIterator.hasNext())
      {
        gb localgb = (gb)localIterator.next();
        localgb.a();
        localArrayList.add(localgb);
      }
    }
    c(localArrayList);
  }

  public void a(List paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    for (int i = 0; i < paramList.size(); i++)
    {
      int j = ((gb)paramList.get(i)).d();
      gb localgb = this.d.c(j);
      if ((localgb == null) || (localgb.c()))
        continue;
      localgb.a();
      localArrayList.add(localgb);
    }
    Collections.sort(localArrayList);
    c(localArrayList);
  }

  public void c()
  {
    synchronized (this.a)
    {
      Iterator localIterator = this.d.d();
      while (localIterator.hasNext())
        ((gb)localIterator.next()).b();
    }
    e();
  }

  public Iterator b()
  {
    return this.d.e();
  }

  public void a(lb paramlb)
  {
    if (paramlb == null)
      return;
    synchronized (this.b)
    {
      this.b.add(paramlb);
    }
  }

  public void b(lb paramlb)
  {
    if (paramlb == null)
      return;
    synchronized (this.b)
    {
      this.b.remove(paramlb);
    }
  }

  public gb a(int paramInt)
  {
    return this.d.a(paramInt);
  }

  public lb[] a()
  {
    lb[] arrayOflb = null;
    synchronized (this.b)
    {
      arrayOflb = new lb[this.b.size()];
      this.b.toArray(arrayOflb);
    }
    return arrayOflb;
  }

  public Iterator a(int paramInt1, int paramInt2)
  {
    return this.d.a(paramInt1, paramInt2);
  }

  public Iterator b(int paramInt1, int paramInt2)
  {
    return this.d.b(paramInt1, paramInt2);
  }

  public String toString()
  {
    Iterator localIterator = this.d.d();
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("Folds: \n");
    while (localIterator.hasNext())
    {
      localStringBuffer.append(localIterator.next());
      localStringBuffer.append('\n');
    }
    localStringBuffer.append("-------------------\n");
    return localStringBuffer.toString();
  }

  private void c(gb paramgb)
  {
    ec localec = new ec(this, paramgb, c.ADD);
    lb[] arrayOflb = a();
    for (int i = 0; i < arrayOflb.length; i++)
      arrayOflb[i].a(localec);
  }

  private void b(List paramList)
  {
    ec localec = new ec(this, paramList, c.ADD_ALL);
    lb[] arrayOflb = a();
    for (int i = 0; i < arrayOflb.length; i++)
      arrayOflb[i].b(localec);
  }

  private void d(gb paramgb)
  {
    ec localec = new ec(this, paramgb, c.REMOVE);
    lb[] arrayOflb = a();
    for (int i = 0; i < arrayOflb.length; i++)
      arrayOflb[i].c(localec);
  }

  private void b()
  {
    ec localec = new ec(this, c.REMOVE_ALL);
    lb[] arrayOflb = a();
    for (int i = 0; i < arrayOflb.length; i++)
      arrayOflb[i].h(localec);
  }

  private void a(List paramList, boolean paramBoolean)
  {
    ec localec = new ec(this, paramList, c.REMOVE_ALL);
    lb[] arrayOflb = a();
    for (int i = 0; i < arrayOflb.length; i++)
      arrayOflb[i].a(localec, paramBoolean);
  }

  private void e(gb paramgb)
  {
    ec localec = new ec(this, paramgb, c.EXPAND);
    lb[] arrayOflb = a();
    for (int i = 0; i < arrayOflb.length; i++)
      arrayOflb[i].d(localec);
  }

  private void f(gb paramgb)
  {
    ec localec = new ec(this, paramgb, c.COLLAPSE);
    lb[] arrayOflb = a();
    for (int i = 0; i < arrayOflb.length; i++)
      arrayOflb[i].e(localec);
  }

  private void e()
  {
    ec localec = new ec(this, c.EXPAND_ALL);
    lb[] arrayOflb = a();
    for (int i = 0; i < arrayOflb.length; i++)
      arrayOflb[i].g(localec);
  }

  private void c(List paramList)
  {
    ec localec = new ec(this, paramList, c.COLLAPSE_ALL);
    lb[] arrayOflb = a();
    for (int i = 0; i < arrayOflb.length; i++)
      arrayOflb[i].f(localec);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.kb
 * JD-Core Version:    0.6.0
 */