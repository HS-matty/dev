package com.zend.ide.w.b;

import java.util.EventObject;

class bk extends EventObject
{
  private boolean a;
  private boolean b;

  public bk(Object paramObject, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramObject);
    this.a = paramBoolean1;
    this.b = paramBoolean2;
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
 * Qualified Name:     com.zend.ide.w.b.bk
 * JD-Core Version:    0.6.0
 */