package com.zend.ide.util;

public abstract class bk
{
  private Object d = new Object();
  private long a;
  private Object b;
  private long c = -1L;

  public bk(long paramLong)
  {
    this.a = paramLong;
  }

  public Object a(Object paramObject)
  {
    synchronized (this.d)
    {
      long l = System.currentTimeMillis();
      if ((this.b == null) || (l - this.c > this.a))
      {
        this.c = l;
        this.b = b(paramObject);
      }
      return this.b;
    }
  }

  protected abstract Object b(Object paramObject);
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bk
 * JD-Core Version:    0.6.0
 */