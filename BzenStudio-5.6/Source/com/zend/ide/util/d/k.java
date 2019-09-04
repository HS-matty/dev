package com.zend.ide.util.d;

import java.util.AbstractSet;
import java.util.Iterator;

class k extends AbstractSet
{
  final a a;

  private k(a parama)
  {
  }

  public Iterator iterator()
  {
    return a.a(this.a, 2);
  }

  public boolean contains(Object paramObject)
  {
    if (!(paramObject instanceof i))
      return false;
    i locali = (i)paramObject;
    int i = locali.c();
    e[] arrayOfe = a.a(this.a);
    int j = i;
    int k = (j & 0x7FFFFFFF) % arrayOfe.length;
    for (e locale = arrayOfe[k]; locale != null; locale = locale.d)
      if ((locale.a == j) && (locale.equals(locali)))
        return true;
    return false;
  }

  public boolean remove(Object paramObject)
  {
    if (!(paramObject instanceof i))
      return false;
    i locali = (i)paramObject;
    int i = locali.c();
    e[] arrayOfe = a.a(this.a);
    int j = i;
    int k = (j & 0x7FFFFFFF) % arrayOfe.length;
    e locale1 = arrayOfe[k];
    e locale2 = null;
    while (locale1 != null)
    {
      if ((locale1.a == j) && (locale1.equals(locali)))
      {
        a.b(this.a);
        if (locale2 != null)
          locale2.d = locale1.d;
        else
          arrayOfe[k] = locale1.d;
        a.c(this.a);
        locale1.c = null;
        return true;
      }
      locale2 = locale1;
      locale1 = locale1.d;
    }
    return false;
  }

  public int size()
  {
    return a.d(this.a);
  }

  public void clear()
  {
    this.a.c();
  }

  k(a parama, b paramb)
  {
    this(parama);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.d.k
 * JD-Core Version:    0.6.0
 */