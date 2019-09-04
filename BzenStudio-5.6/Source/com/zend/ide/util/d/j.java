package com.zend.ide.util.d;

import java.util.AbstractCollection;
import java.util.Iterator;

class j extends AbstractCollection
{
  final a a;

  private j(a parama)
  {
  }

  public Iterator iterator()
  {
    return a.a(this.a, 1);
  }

  public int size()
  {
    return a.d(this.a);
  }

  public boolean contains(Object paramObject)
  {
    return this.a.b(paramObject);
  }

  public void clear()
  {
    this.a.c();
  }

  j(a parama, b paramb)
  {
    this(parama);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.d.j
 * JD-Core Version:    0.6.0
 */