package com.zend.ide.w.b;

import java.util.EventObject;

class bl extends EventObject
{
  private int a;

  public bl(Object paramObject, int paramInt)
  {
    super(paramObject);
    if ((paramInt < 0) || (paramInt > 1))
      throw new IllegalArgumentException("Unfamiliar diff integrater event type - " + paramInt);
    this.a = paramInt;
  }

  public int b()
  {
    return this.a;
  }

  public String toString()
  {
    return super.toString() + ", Event type: " + c();
  }

  private String c()
  {
    switch (this.a)
    {
    case 0:
      return "INTEGRATION_STARTED";
    case 1:
      return "INTEGRATION_ENDED";
    }
    return "UNKNOWN";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bl
 * JD-Core Version:    0.6.0
 */