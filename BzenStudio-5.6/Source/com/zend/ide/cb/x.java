package com.zend.ide.cb;

import java.util.EventObject;

public class x extends EventObject
{
  private int a;
  private q b;

  public x(Object paramObject, q paramq, int paramInt)
  {
    super(paramObject);
    this.b = paramq;
    this.a = paramInt;
  }

  public int a()
  {
    return this.a;
  }

  public q b()
  {
    return this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.x
 * JD-Core Version:    0.6.0
 */