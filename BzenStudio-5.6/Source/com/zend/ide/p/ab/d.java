package com.zend.ide.p.ab;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.TableModel;

class d
  implements Comparable
{
  private int a;
  final o b;

  public d(o paramo, int paramInt)
  {
    this.a = paramInt;
  }

  public int compareTo(Object paramObject)
  {
    int i = this.a;
    int j = ((d)paramObject).a;
    Iterator localIterator = o.a(this.b).iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      int k = c.a(localc);
      Object localObject1 = o.b(this.b).getValueAt(i, k);
      Object localObject2 = o.b(this.b).getValueAt(j, k);
      int m;
      if ((localObject1 == null) && (localObject2 == null))
        m = 0;
      else if (localObject1 == null)
        m = -1;
      else if (localObject2 == null)
        m = 1;
      else
        m = o.a(this.b, k).compare(localObject1, localObject2);
      if (m != 0)
        return c.b(localc) == -1 ? -m : m;
    }
    return 0;
  }

  static int a(d paramd)
  {
    return paramd.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.d
 * JD-Core Version:    0.6.0
 */