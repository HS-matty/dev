package com.zend.ide.util;

import java.util.Collection;
import java.util.Iterator;

class db
  implements Iterator
{
  private Iterator a;
  private Object b = null;
  final da c;

  public db(da paramda)
  {
    this.a = da.a(paramda).iterator();
  }

  public boolean hasNext()
  {
    this.b = b();
    return this.b != null;
  }

  public Object next()
  {
    if (this.b == null)
      this.b = b();
    Object localObject = this.b;
    this.b = null;
    return localObject;
  }

  public void remove()
  {
    this.a.remove();
  }

  private Object b()
  {
    while (this.a.hasNext())
    {
      Object localObject = ((dh)this.a.next()).get();
      if (localObject != null)
        return localObject;
      this.a.remove();
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.db
 * JD-Core Version:    0.6.0
 */