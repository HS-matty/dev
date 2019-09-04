package com.zend.ide.f.yb;

import com.zend.ide.m.v;
import java.util.HashMap;

class f
{
  private HashMap a = new HashMap();
  private static f b;

  public static f a()
  {
    if (b == null)
      b = new f();
    return b;
  }

  public v a(String paramString)
  {
    return (v)this.a.get(paramString);
  }

  public void a(String paramString, v paramv)
  {
    this.a.put(paramString, paramv);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.yb.f
 * JD-Core Version:    0.6.0
 */