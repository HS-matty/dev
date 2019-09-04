package com.zend.ide.util.d;

import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

class f
  implements Enumeration, Iterator
{
  e[] a = a.a(this.h);
  int b = this.a.length;
  e c = null;
  e d = null;
  int e;
  boolean f;
  protected int g = a.e(this.h);
  final a h;

  f(a parama, int paramInt, boolean paramBoolean)
  {
    this.e = paramInt;
    this.f = paramBoolean;
  }

  public boolean hasMoreElements()
  {
    e locale = this.c;
    int i = this.b;
    e[] arrayOfe = this.a;
    while ((locale == null) && (i > 0))
    {
      i--;
      locale = arrayOfe[i];
    }
    this.c = locale;
    this.b = i;
    return locale != null;
  }

  public Object nextElement()
  {
    e locale1 = this.c;
    int i = this.b;
    e[] arrayOfe = this.a;
    while ((locale1 == null) && (i > 0))
    {
      i--;
      locale1 = arrayOfe[i];
    }
    this.c = locale1;
    this.b = i;
    if (locale1 != null)
    {
      e locale2 = this.d = this.c;
      this.c = locale2.d;
      return this.e == 1 ? locale2.c : locale2;
    }
    throw new NoSuchElementException("Hashtable Enumerator");
  }

  public boolean hasNext()
  {
    return hasMoreElements();
  }

  public Object next()
  {
    if (a.e(this.h) != this.g)
      throw new ConcurrentModificationException();
    return nextElement();
  }

  public void remove()
  {
    if (!this.f)
      throw new UnsupportedOperationException();
    if (this.d == null)
      throw new IllegalStateException("Hashtable Enumerator");
    if (a.e(this.h) != this.g)
      throw new ConcurrentModificationException();
    synchronized (this.h)
    {
      e[] arrayOfe = a.a(this.h);
      int i = (this.d.a & 0x7FFFFFFF) % arrayOfe.length;
      e locale1 = arrayOfe[i];
      e locale2 = null;
      while (locale1 != null)
      {
        if (locale1 == this.d)
        {
          a.b(this.h);
          this.g += 1;
          if (locale2 == null)
            arrayOfe[i] = locale1.d;
          else
            locale2.d = locale1.d;
          a.c(this.h);
          this.d = null;
          return;
        }
        locale2 = locale1;
        locale1 = locale1.d;
      }
      throw new ConcurrentModificationException();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.d.f
 * JD-Core Version:    0.6.0
 */