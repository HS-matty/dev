package com.zend.ide.c;

import com.zend.ide.util.cl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

public class c extends Thread
{
  private static c a;
  private boolean b = true;
  private int c = 500;
  private ArrayList d = new ArrayList();
  private Hashtable e = new Hashtable();

  public c()
  {
    setPriority(1);
    start();
  }

  public static c b()
  {
    if (a == null)
      a = new c();
    return a;
  }

  public synchronized void a(String paramString, b paramb)
  {
    ArrayList localArrayList = (ArrayList)this.e.get(paramString);
    if (localArrayList == null)
    {
      localArrayList = new ArrayList();
      this.e.put(paramString, localArrayList);
    }
    if (!localArrayList.contains(paramb))
      localArrayList.add(paramb);
  }

  public void run()
  {
    while (Thread.currentThread() == this)
    {
      if ((this.b) || (this.d.isEmpty()))
        try
        {
          synchronized (this)
          {
            wait();
          }
        }
        catch (Exception localException)
        {
          cl.a(localException);
        }
      ArrayList localArrayList = new ArrayList();
      Object localObject3;
      synchronized (this)
      {
        Iterator localIterator = this.d.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (String)localIterator.next();
          localObject3 = (ArrayList)this.e.get(localObject2);
          if (localObject3 != null)
            localArrayList.addAll((Collection)localObject3);
        }
      }
      long l = System.currentTimeMillis();
      Object localObject2 = localArrayList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (b)((Iterator)localObject2).next();
        ((b)localObject3).d();
      }
      try
      {
        l += this.c;
        Thread.sleep(Math.max(0L, l - System.currentTimeMillis()));
      }
      catch (InterruptedException localInterruptedException)
      {
        break;
      }
      localObject2 = localArrayList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        b localb = (b)((Iterator)localObject2).next();
        localb.b();
      }
    }
  }

  public synchronized void a(String paramString)
  {
    if (this.d.isEmpty())
    {
      this.b = false;
      synchronized (this)
      {
        notifyAll();
      }
      __x = (ArrayList)this.e.get(paramString);
      if (__x == null)
        return;
      Iterator localIterator = ((ArrayList)__x).iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        localb.d();
      }
    }
    if (!this.d.contains(paramString))
      this.d.add(paramString);
  }

  public synchronized void b(String paramString)
  {
    this.d.remove(paramString);
    if (this.d.isEmpty())
      this.b = true;
    ArrayList localArrayList = (ArrayList)this.e.get(paramString);
    if (localArrayList == null)
      return;
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      localb.c();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.c.c
 * JD-Core Version:    0.6.0
 */