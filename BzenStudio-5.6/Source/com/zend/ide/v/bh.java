package com.zend.ide.v;

import com.zend.ide.be.b;
import com.zend.ide.be.g;

class bh
  implements g
{
  final d a;

  private bh(d paramd)
  {
  }

  public void a(String paramString)
    throws b
  {
    w localw = d.a(this.a, paramString);
    if (localw == null)
      return;
    if (!localw.d(false))
      throw new b("Cant close the window without saving");
  }

  bh(d paramd, l paraml)
  {
    this(paramd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.bh
 * JD-Core Version:    0.6.0
 */