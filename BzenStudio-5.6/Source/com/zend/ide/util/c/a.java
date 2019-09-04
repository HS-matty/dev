package com.zend.ide.util.c;

import com.zend.ide.p.bx;
import com.zend.ide.util.cl;

public abstract class a
  implements d, Runnable, Cloneable
{
  public abstract void a(Object paramObject);

  public Object k()
  {
    bx.a(this);
    return null;
  }

  public Object clone()
    throws CloneNotSupportedException
  {
    Object localObject = null;
    try
    {
      localObject = super.clone();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      cl.a(localCloneNotSupportedException);
    }
    return localObject;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.c.a
 * JD-Core Version:    0.6.0
 */