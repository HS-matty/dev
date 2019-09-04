package com.zend.ide.bb;

import com.zend.ide.b.a;
import com.zend.ide.b.b;
import com.zend.ide.b.d;

public class c extends a
{
  private static c e;

  public static c c()
  {
    if (e == null)
      e = new c();
    return e;
  }

  protected b e()
  {
    return new e(this);
  }

  static void a(c paramc, d paramd)
  {
    paramc.b(paramd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bb.c
 * JD-Core Version:    0.6.0
 */