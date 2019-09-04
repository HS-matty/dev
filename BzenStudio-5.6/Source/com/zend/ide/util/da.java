package com.zend.ide.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class da
  implements Collection
{
  private Collection a;

  public da(int paramInt)
  {
    this.a = new ArrayList(paramInt);
  }

  public da()
  {
    this.a = new ArrayList();
  }

  public int size()
  {
    b();
    return this.a.size();
  }

  public boolean isEmpty()
  {
    b();
    return this.a.isEmpty();
  }

  public boolean contains(Object paramObject)
  {
    return this.a.contains(new dh(paramObject));
  }

  public Iterator iterator()
  {
    return new db(this);
  }

  public Object[] toArray()
  {
    return toArray(null);
  }

  public Object[] toArray(Object[] paramArrayOfObject)
  {
    b();
    Object[] arrayOfObject = this.a.toArray();
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length < arrayOfObject.length))
      paramArrayOfObject = (Object[])new Object[arrayOfObject.length];
    for (int i = 0; i < arrayOfObject.length; i++)
      paramArrayOfObject[i] = ((dh)arrayOfObject[i]).get();
    return paramArrayOfObject;
  }

  public boolean add(Object paramObject)
  {
    dh localdh = new dh(paramObject);
    return this.a.add(localdh);
  }

  public boolean remove(Object paramObject)
  {
    dh localdh = new dh(paramObject);
    return this.a.remove(localdh);
  }

  public boolean containsAll(Collection paramCollection)
  {
    boolean bool = true;
    if ((paramCollection instanceof da))
    {
      bool = this.a.containsAll(((da)paramCollection).a);
    }
    else
    {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        if (contains(localIterator.next()))
          continue;
        bool = false;
      }
    }
    return bool;
  }

  public boolean addAll(Collection paramCollection)
  {
    boolean bool = false;
    if ((paramCollection instanceof da))
    {
      bool = this.a.addAll(((da)paramCollection).a);
    }
    else
    {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        if (!add(localIterator.next()))
          continue;
        bool = true;
      }
    }
    return bool;
  }

  public boolean removeAll(Collection paramCollection)
  {
    boolean bool = false;
    if ((paramCollection instanceof da))
    {
      bool = this.a.removeAll(((da)paramCollection).a);
    }
    else
    {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        if (!remove(localIterator.next()))
          continue;
        bool = true;
      }
    }
    return bool;
  }

  public boolean retainAll(Collection paramCollection)
  {
    boolean bool = false;
    if ((paramCollection instanceof da))
    {
      bool = this.a.retainAll(((da)paramCollection).a);
    }
    else
    {
      Iterator localIterator = iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        if (!paramCollection.contains(localObject))
          bool = remove(localObject);
      }
    }
    return bool;
  }

  public void clear()
  {
    this.a.clear();
  }

  public boolean equals(Object paramObject)
  {
    int i = 0;
    if (((paramObject instanceof da)) && (this.a.equals(((da)paramObject).a)))
      i = 1;
    return i;
  }

  public int hashCode()
  {
    return this.a.hashCode();
  }

  protected void b()
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
      localIterator.next();
  }

  static Collection a(da paramda)
  {
    return paramda.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.da
 * JD-Core Version:    0.6.0
 */