package com.zend.ide.util.d;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class a
  implements h, Cloneable, Serializable
{
  static final long serialVersionUID = -3094290553755493591L;
  private transient e[] a;
  private transient int b;
  private int c;
  private float d;
  private transient int e = 0;
  private transient Set f = null;
  private transient Collection g = null;
  private static c h = new c();
  private static d i = new d();

  public a(int paramInt, float paramFloat)
  {
    if (paramInt < 0)
      throw new IllegalArgumentException("Illegal Capacity: " + paramInt);
    if ((paramFloat <= 0.0F) || (Float.isNaN(paramFloat)))
      throw new IllegalArgumentException("Illegal Load: " + paramFloat);
    if (paramInt == 0)
      paramInt = 1;
    this.d = paramFloat;
    this.a = new e[paramInt];
    this.c = (int)(paramInt * paramFloat);
  }

  public a(int paramInt)
  {
    this(paramInt, 0.75F);
  }

  public a()
  {
    this(11, 0.75F);
  }

  public int f()
  {
    return this.b;
  }

  public synchronized Enumeration g()
  {
    return e(1);
  }

  public synchronized boolean a(Object paramObject)
  {
    if (paramObject == null)
      throw new NullPointerException();
    e[] arrayOfe = this.a;
    int j = arrayOfe.length;
    while (j-- > 0)
      for (e locale = arrayOfe[j]; locale != null; locale = locale.d)
        if (locale.c.equals(paramObject))
          return true;
    return false;
  }

  public boolean b(Object paramObject)
  {
    return a(paramObject);
  }

  public synchronized boolean a(int paramInt)
  {
    e[] arrayOfe = this.a;
    int j = paramInt;
    int k = (j & 0x7FFFFFFF) % arrayOfe.length;
    for (e locale = arrayOfe[k]; locale != null; locale = locale.d)
      if ((locale.a == j) && (locale.b == paramInt))
        return true;
    return false;
  }

  public synchronized Object b(int paramInt)
  {
    e[] arrayOfe = this.a;
    int j = paramInt;
    int k = (j & 0x7FFFFFFF) % arrayOfe.length;
    for (e locale = arrayOfe[k]; locale != null; locale = locale.d)
      if ((locale.a == j) && (locale.b == paramInt))
        return locale.c;
    return null;
  }

  protected void b()
  {
    int j = this.a.length;
    e[] arrayOfe1 = this.a;
    int k = j * 2 + 1;
    e[] arrayOfe2 = new e[k];
    this.e += 1;
    this.c = (int)(k * this.d);
    this.a = arrayOfe2;
    int m = j;
    while (m-- > 0)
    {
      e locale1 = arrayOfe1[m];
      while (locale1 != null)
      {
        e locale2 = locale1;
        locale1 = locale1.d;
        int n = (locale2.a & 0x7FFFFFFF) % k;
        locale2.d = arrayOfe2[n];
        arrayOfe2[n] = locale2;
      }
    }
  }

  public synchronized Object a(int paramInt, Object paramObject)
  {
    if (paramObject == null)
      throw new NullPointerException();
    e[] arrayOfe = this.a;
    int j = paramInt;
    int k = (j & 0x7FFFFFFF) % arrayOfe.length;
    for (e locale = arrayOfe[k]; locale != null; locale = locale.d)
    {
      if ((locale.a != j) || (locale.b != paramInt))
        continue;
      Object localObject = locale.c;
      locale.c = paramObject;
      return localObject;
    }
    this.e += 1;
    if (this.b >= this.c)
    {
      b();
      arrayOfe = this.a;
      k = (j & 0x7FFFFFFF) % arrayOfe.length;
    }
    locale = new e(j, paramInt, paramObject, arrayOfe[k]);
    arrayOfe[k] = locale;
    this.b += 1;
    return null;
  }

  public synchronized Object c(int paramInt)
  {
    e[] arrayOfe = this.a;
    int j = paramInt;
    int k = (j & 0x7FFFFFFF) % arrayOfe.length;
    e locale1 = arrayOfe[k];
    e locale2 = null;
    while (locale1 != null)
    {
      if ((locale1.a == j) && (locale1.b == paramInt))
      {
        this.e += 1;
        if (locale2 != null)
          locale2.d = locale1.d;
        else
          arrayOfe[k] = locale1.d;
        this.b -= 1;
        Object localObject = locale1.c;
        locale1.c = null;
        return localObject;
      }
      locale2 = locale1;
      locale1 = locale1.d;
    }
    return null;
  }

  public synchronized void c()
  {
    e[] arrayOfe = this.a;
    this.e += 1;
    int j = arrayOfe.length;
    while (true)
    {
      j--;
      if (j < 0)
        break;
      arrayOfe[j] = null;
    }
    this.b = 0;
  }

  public synchronized Object clone()
  {
    try
    {
      a locala = (a)super.clone();
      locala.a = new e[this.a.length];
      int j = this.a.length;
      while (j-- > 0)
        locala.a[j] = (this.a[j] != null ? (e)this.a[j].clone() : null);
      locala.f = null;
      locala.g = null;
      locala.e = 0;
      return locala;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new InternalError();
  }

  public synchronized String toString()
  {
    int j = f() - 1;
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = d().iterator();
    localStringBuffer.append("{");
    for (int k = 0; k <= j; k++)
    {
      Map.Entry localEntry = (Map.Entry)(Map.Entry)localIterator.next();
      localStringBuffer.append(localEntry.getKey() + "=" + localEntry.getValue());
      if (k >= j)
        continue;
      localStringBuffer.append(", ");
    }
    localStringBuffer.append("}");
    return localStringBuffer.toString();
  }

  private Enumeration e(int paramInt)
  {
    if (this.b == 0)
      return h;
    return new f(this, paramInt, false);
  }

  private Iterator d(int paramInt)
  {
    if (this.b == 0)
      return i;
    return new f(this, paramInt, true);
  }

  public Set d()
  {
    if (this.f == null)
      this.f = Collections.synchronizedSet(new k(this, null));
    return this.f;
  }

  public Collection e()
  {
    if (this.g == null)
      this.g = Collections.synchronizedCollection(new j(this, null));
    return this.g;
  }

  public synchronized boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof Serializable))
      return false;
    h localh = (Serializable)paramObject;
    if (localh.f() != f())
      return false;
    Iterator localIterator = d().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      int j = locali.c();
      Object localObject = locali.b();
      if (localObject == null)
      {
        if ((localh.b(j) != null) || (!localh.a(j)))
          return false;
      }
      else if (!localObject.equals(localh.b(j)))
        return false;
    }
    return true;
  }

  public synchronized int hashCode()
  {
    int j = 0;
    Iterator localIterator = d().iterator();
    while (localIterator.hasNext())
      j += localIterator.next().hashCode();
    return j;
  }

  private synchronized void writeObject(ObjectOutputStream paramObjectOutputStream)
    throws IOException
  {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeInt(this.a.length);
    paramObjectOutputStream.writeInt(this.b);
    for (int j = this.a.length - 1; j >= 0; j--)
      for (e locale = this.a[j]; locale != null; locale = locale.d)
      {
        paramObjectOutputStream.write(locale.b);
        paramObjectOutputStream.writeObject(locale.c);
      }
  }

  private synchronized void readObject(ObjectInputStream paramObjectInputStream)
    throws IOException, ClassNotFoundException
  {
    paramObjectInputStream.defaultReadObject();
    int j = paramObjectInputStream.readInt();
    int k = paramObjectInputStream.readInt();
    int m = (int)(k * this.d) + k / 20 + 3;
    if ((m > k) && ((m & 0x1) == 0))
      m--;
    if ((j > 0) && (m > j))
      m = j;
    this.a = new e[m];
    this.b = 0;
    while (k > 0)
    {
      int n = paramObjectInputStream.readInt();
      Object localObject = paramObjectInputStream.readObject();
      a(n, localObject);
      k--;
    }
  }

  static Iterator a(a parama, int paramInt)
  {
    return parama.d(paramInt);
  }

  static e[] a(a parama)
  {
    return parama.a;
  }

  static int b(a parama)
  {
    return parama.e++;
  }

  static int c(a parama)
  {
    return parama.b--;
  }

  static int d(a parama)
  {
    return parama.b;
  }

  static int e(a parama)
  {
    return parama.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.d.a
 * JD-Core Version:    0.6.0
 */