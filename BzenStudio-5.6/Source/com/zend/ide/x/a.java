package com.zend.ide.x;

import com.zend.ide.b.d;

public class a extends com.zend.ide.b.a
{
  private static a e;

  public static a c()
  {
    if (e == null)
      e = new a();
    return e;
  }

  protected com.zend.ide.b.b e()
  {
    return new b(this);
  }

  protected void b(d paramd)
  {
    if ((paramd instanceof o))
    {
      this.c.append(paramd.a() + " - " + paramd.b());
      return;
    }
    super.b(paramd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.x.a
 * JD-Core Version:    0.6.0
 */