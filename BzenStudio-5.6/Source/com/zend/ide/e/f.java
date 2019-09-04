package com.zend.ide.e;

import java.io.Serializable;

public class f
  implements Serializable
{
  private boolean a = true;
  private boolean b = true;
  private int c = 0;

  public f(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.c = paramInt;
    this.a = paramBoolean1;
    this.b = paramBoolean2;
  }

  public void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.c = paramInt;
    this.a = paramBoolean1;
    this.b = paramBoolean2;
  }

  public int d()
  {
    return this.c;
  }

  public boolean b()
  {
    return this.a;
  }

  public boolean c()
  {
    return this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.e.f
 * JD-Core Version:    0.6.0
 */