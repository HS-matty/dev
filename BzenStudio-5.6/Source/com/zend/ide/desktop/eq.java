package com.zend.ide.desktop;

import com.zend.ide.h.e;
import com.zend.ide.l.v;
import com.zend.ide.util.w;
import java.io.File;

class eq extends w
{
  final cj c;

  private eq(cj paramcj)
  {
  }

  public boolean b()
  {
    if ((this.c.l() == null) || (this.c.l().h() == null))
      return false;
    File localFile = this.c.l().h().x();
    return !cj.a(this.c, localFile);
  }

  eq(cj paramcj, n paramn)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.eq
 * JD-Core Version:    0.6.0
 */