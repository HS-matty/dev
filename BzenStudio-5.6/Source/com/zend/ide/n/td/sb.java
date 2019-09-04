package com.zend.ide.n.td;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

class sb
{
  private LinkedHashSet a = new LinkedHashSet(50);
  private ArrayList b = new ArrayList();
  private ArrayList c = new ArrayList();
  final rb d;

  public sb(rb paramrb)
  {
  }

  public void a(List paramList)
  {
    this.c.clear();
    this.b.clear();
    Iterator localIterator1 = this.d.d();
    if (paramList.size() == 0)
    {
      while (localIterator1.hasNext())
        this.c.add(localIterator1.next());
      this.d.a();
      return;
    }
    while (localIterator1.hasNext())
      this.a.add(localIterator1.next());
    for (int i = 0; i < paramList.size(); i++)
    {
      gb localgb = (gb)paramList.get(i);
      if (this.a.remove(localgb))
        continue;
      this.b.add(localgb);
    }
    Iterator localIterator2 = this.a.iterator();
    while (localIterator2.hasNext())
      this.c.add(localIterator2.next());
    this.d.b(this.c);
    this.d.a(this.b);
    this.a.clear();
  }

  static ArrayList a(sb paramsb)
  {
    return paramsb.b;
  }

  static ArrayList b(sb paramsb)
  {
    return paramsb.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.sb
 * JD-Core Version:    0.6.0
 */