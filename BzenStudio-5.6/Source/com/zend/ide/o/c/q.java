package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.ab;
import com.zend.ide.o.fk;
import com.zend.ide.p.f.e;
import com.zend.ide.util.ct;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.tree.DefaultMutableTreeNode;

class q extends e
{
  final bq i;

  public q(bq parambq)
  {
    super(ct.a(90));
  }

  public Object d()
  {
    Collection localCollection = this.i.j.l();
    a[] arrayOfa = new a[localCollection.size()];
    Iterator localIterator = localCollection.iterator();
    for (int j = 0; localIterator.hasNext(); j++)
    {
      arrayOfa[j] = this.i.m.a((String)localIterator.next());
      this.i.m.b(arrayOfa[j], 0);
    }
    return arrayOfa;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return new o(this.i, (a)paramObject, this.i.m);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.q
 * JD-Core Version:    0.6.0
 */