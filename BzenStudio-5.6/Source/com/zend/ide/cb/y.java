package com.zend.ide.cb;

import java.util.EventObject;

public class y extends EventObject
{
  private int a;
  private Object b;
  private boolean c;

  public y(Object paramObject, int paramInt)
  {
    super(paramObject);
    if ((paramInt < 0) || (paramInt > 2))
      throw new IllegalArgumentException("Invalid event type - " + paramInt);
    this.a = paramInt;
  }

  public y(Object paramObject1, Object paramObject2, int paramInt)
  {
    this(paramObject1, paramInt);
    this.b = paramObject2;
  }

  public y(Object paramObject, int paramInt, boolean paramBoolean)
  {
    this(paramObject, paramInt);
    this.c = paramBoolean;
  }

  public int a()
  {
    return this.a;
  }

  public String toString()
  {
    return "[SQLServerEvent] type: " + this.a + "  source: " + this.source;
  }

  public boolean a()
  {
    return this.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.y
 * JD-Core Version:    0.6.0
 */