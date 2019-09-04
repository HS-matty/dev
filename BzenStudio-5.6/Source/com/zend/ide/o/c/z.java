package com.zend.ide.o.c;

import com.zend.ide.o.ib;
import com.zend.ide.o.jb;
import com.zend.ide.p.f.e;
import com.zend.ide.util.ct;
import javax.swing.tree.DefaultMutableTreeNode;

class z extends e
{
  final y i;

  public z(y paramy)
  {
    super(ct.a(95));
  }

  public Object d()
  {
    if (this.i.j == null)
      return null;
    y.b(this.i);
    ib localib = y.b(this.i);
    return localib.b();
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return new ab(this.i, (jb)paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.z
 * JD-Core Version:    0.6.0
 */