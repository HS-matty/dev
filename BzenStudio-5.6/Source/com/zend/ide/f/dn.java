package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.f.b.a;
import com.zend.ide.f.b.j;
import com.zend.ide.f.b.o;
import com.zend.ide.p.f.e;
import javax.swing.tree.DefaultMutableTreeNode;

class dn extends e
{
  final dc d;

  public dn(dc paramdc, Object paramObject)
  {
    super(paramObject);
  }

  public Object d()
  {
    if ((this.d.p == null) || (this.d.p.g() == null))
      return null;
    bt localbt = this.d.p.g();
    int i = localbt.f().length > 0 ? 1 : 0;
    int j = i != 0 ? 1 : 0;
    int k = localbt.a().length > 0 ? 1 : 0;
    int m = k != 0 ? 1 : 0;
    d[] arrayOfd1 = localbt.c();
    d[] arrayOfd2 = localbt.b();
    int n = j + m + arrayOfd1.length + arrayOfd2.length;
    Object[] arrayOfObject = new Object[n];
    int i1 = 0;
    if (i != 0)
    {
      arrayOfObject[i1] = j.k;
      i1++;
    }
    if (k != 0)
    {
      arrayOfObject[i1] = o.j;
      i1++;
    }
    System.arraycopy(arrayOfd1, 0, arrayOfObject, i1, arrayOfd1.length);
    i1 += arrayOfd1.length;
    System.arraycopy(arrayOfd2, 0, arrayOfObject, i1, arrayOfd2.length);
    return arrayOfObject;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    if (paramObject.equals(j.k))
      return new j(1, this.d.p);
    if (paramObject.equals(o.j))
      return new o(1, this.d.p);
    return a.a((d)paramObject, this.d.p);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.dn
 * JD-Core Version:    0.6.0
 */