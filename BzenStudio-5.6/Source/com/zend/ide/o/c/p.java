package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.ab;
import com.zend.ide.p.f.e;
import com.zend.ide.util.ct;
import java.util.Arrays;
import javax.swing.tree.DefaultMutableTreeNode;

class p extends e
{
  final bp i;

  public p(bp parambp)
  {
    super(ct.a(91));
  }

  public Object d()
  {
    if (!this.i.j())
    {
      this.i.m.b(bp.a(this.i), 0);
      return new a[] { bp.a(this.i) };
    }
    a[] arrayOfa1 = this.i.m.a();
    Arrays.sort(arrayOfa1, m.l);
    this.i.m.b(bp.a(this.i), 0);
    a[] arrayOfa2 = new a[arrayOfa1.length + 1];
    arrayOfa2[0] = bp.a(this.i);
    System.arraycopy(arrayOfa1, 0, arrayOfa2, 1, arrayOfa1.length);
    return arrayOfa2;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    if (paramObject == bp.a(this.i))
      return new n(this.i, bp.a(this.i), this.i.m);
    return new m((a)paramObject, this.i.m);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.p
 * JD-Core Version:    0.6.0
 */