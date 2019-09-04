package com.zend.ide.util;

import java.util.Arrays;
import java.util.HashSet;

public class cx
{
  private final HashSet a;
  private HashSet b;
  private int c = 0;
  private Object d;
  private boolean e = false;

  public cx(Object[] paramArrayOfObject)
  {
    this(new Object(), paramArrayOfObject);
  }

  public cx(Object paramObject, Object[] paramArrayOfObject)
  {
    this.a = new HashSet(Arrays.asList(paramArrayOfObject));
    this.b = new HashSet(paramArrayOfObject.length);
    this.d = paramObject;
  }

  public void b()
  {
    synchronized (this.d)
    {
      try
      {
        this.c += 1;
        while ((!this.e) && (this.a.size() != this.b.size()))
          this.d.wait();
        if (this.e)
          throw new RuntimeException("reset");
      }
      catch (InterruptedException localInterruptedException)
      {
        throw ((RuntimeException)localInterruptedException.fillInStackTrace());
      }
      finally
      {
        this.c -= 1;
        if (this.c == 0)
          this.d.notifyAll();
      }
    }
  }

  public void a(Object paramObject, boolean paramBoolean)
  {
    synchronized (this.d)
    {
      boolean bool = this.b.add(paramObject);
      if (bool)
        this.d.notifyAll();
      if (paramBoolean)
        b();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.cx
 * JD-Core Version:    0.6.0
 */