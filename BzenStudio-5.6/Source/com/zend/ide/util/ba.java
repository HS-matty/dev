package com.zend.ide.util;

import java.util.ArrayList;

public class ba
{
  static Object a = new Object();
  private ArrayList b;
  private boolean c = false;

  public ba()
  {
    this(100);
  }

  public ba(int paramInt)
  {
    this.b = new ArrayList(paramInt);
  }

  public synchronized void a(Object paramObject)
  {
    this.b.add(paramObject);
    notify();
  }

  public synchronized Object d()
    throws InterruptedException
  {
    return a(0L);
  }

  public synchronized Object a(long paramLong)
    throws InterruptedException
  {
    this.c = false;
    Object localObject = a;
    do
    {
      if (this.b.isEmpty())
      {
        wait(paramLong);
        if (this.c)
          throw new InterruptedException();
      }
      if (this.b.isEmpty())
        continue;
      localObject = this.b.remove(0);
    }
    while (localObject == a);
    if (localObject == null);
    return localObject;
  }

  public synchronized void b()
  {
    this.c = true;
    notifyAll();
  }

  public synchronized void c()
  {
    this.b.clear();
  }

  public synchronized boolean b(Object paramObject)
  {
    int i = this.b.indexOf(paramObject);
    if (i > -1)
    {
      this.b.set(i, a);
      return true;
    }
    return false;
  }

  public synchronized boolean c(Object paramObject)
  {
    return this.b.contains(paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.ba
 * JD-Core Version:    0.6.0
 */