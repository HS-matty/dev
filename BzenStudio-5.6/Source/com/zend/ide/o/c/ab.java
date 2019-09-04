package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.jb;
import com.zend.ide.p.f.e;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.tree.DefaultMutableTreeNode;

class ab extends e
{
  final y i;

  public ab(y paramy, jb paramjb)
  {
    super(paramjb);
  }

  public boolean isLeaf()
  {
    jb localjb = (jb)getUserObject();
    return localjb.h() == 0;
  }

  public Object d()
  {
    jb localjb = (jb)getUserObject();
    return localjb.i();
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return new m((a)paramObject, this.i.m);
  }

  public Object a(HashSet paramHashSet)
  {
    jb localjb1 = (jb)getUserObject();
    Iterator localIterator = paramHashSet.iterator();
    while (localIterator.hasNext())
    {
      jb localjb2 = (jb)localIterator.next();
      if ((localjb1.a() == localjb2.a()) && (localjb1.e().equals(localjb2.e())))
        return localjb2;
    }
    return null;
  }

  public Icon e()
  {
    return y.c();
  }

  public String f()
  {
    return "stackRootContext";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.ab
 * JD-Core Version:    0.6.0
 */