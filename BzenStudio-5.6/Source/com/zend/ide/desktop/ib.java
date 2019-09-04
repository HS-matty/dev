package com.zend.ide.desktop;

import com.zend.ide.j.h;
import com.zend.ide.j.y;
import com.zend.ide.l.v;
import com.zend.ide.n.bw;
import com.zend.ide.util.w;
import java.io.File;

class ib extends w
{
  final bx c;

  private ib(bx parambx)
  {
  }

  public boolean b()
  {
    if (!this.c.f().e())
      return false;
    bw localbw = bx.b(this.c).X();
    String str = localbw.k();
    if (str == null)
      return false;
    File localFile = h.m.g(str);
    if (!localFile.exists())
      return false;
    return !this.c.f().g().m(localFile);
  }

  ib(bx parambx, by paramby)
  {
    this(parambx);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ib
 * JD-Core Version:    0.6.0
 */