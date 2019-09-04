package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.hb;

public class w
  implements hb
{
  public static final hb a = new w(0, null, "null", null);
  private int b;
  private a[] c;
  private Object d;
  private String e;

  public w(int paramInt, Object paramObject, String paramString, a[] paramArrayOfa)
  {
    this.b = paramInt;
    this.d = paramObject;
    this.e = paramString;
    this.c = paramArrayOfa;
  }

  public int a()
  {
    return this.b;
  }

  public Object b()
  {
    return this.d;
  }

  public String c()
  {
    return this.e;
  }

  public a[] d()
  {
    return this.c;
  }

  public boolean e()
  {
    return this.b == 0;
  }

  public boolean f()
  {
    return (this.b == 0) || ((this.b != 5) && (this.b != 6));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.w
 * JD-Core Version:    0.6.0
 */