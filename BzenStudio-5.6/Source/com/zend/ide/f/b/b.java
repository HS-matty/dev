package com.zend.ide.f.b;

import com.zend.ide.b.d;
import com.zend.ide.f.s;
import com.zend.ide.p.f.e;
import com.zend.ide.util.cu;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.tree.DefaultMutableTreeNode;

public class b extends e
  implements cu
{
  s k;

  public b(s params, d paramd, boolean paramBoolean)
  {
    super(paramd, paramBoolean);
    this.k = params;
  }

  public Object a(HashSet paramHashSet)
  {
    return a(this, paramHashSet);
  }

  public String toString()
  {
    return ((d)getUserObject()).a();
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return a.a((d)paramObject, this.k);
  }

  static Object a(e parame, HashSet paramHashSet)
  {
    Object localObject1 = parame.getUserObject();
    if (!(localObject1 instanceof d))
      return null;
    d locald1 = (d)localObject1;
    Iterator localIterator = paramHashSet.iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = localIterator.next();
      if (locald1.getClass().equals(localObject2.getClass()))
      {
        d locald2 = (d)localObject2;
        if (locald1.a().equals(locald2.a()))
          return locald2;
      }
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.b
 * JD-Core Version:    0.6.0
 */