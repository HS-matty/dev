package com.zend.ide.u;

import com.zend.ide.j.h;
import com.zend.ide.util.ct;
import com.zend.ide.util.n;
import com.zend.ide.util.o;
import com.zend.ide.util.w;
import java.io.File;

class br extends w
{
  final bq c;

  br(bq parambq)
  {
  }

  public boolean b()
  {
    File localFile = this.c.g.x();
    if (localFile == null)
      return false;
    bh localbh = (bh)h.m.A(localFile);
    String str = localbh.i() ? ct.a(186) : ct.a(187);
    o localo = n.c().a("keys.FTPRootConnection");
    localo.a(str);
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.br
 * JD-Core Version:    0.6.0
 */