package com.zend.ide.desktop;

import com.zend.ide.h.e;
import com.zend.ide.util.w;
import java.io.File;

class ei extends w
{
  final cj c;

  private ei(cj paramcj)
  {
  }

  public boolean b()
  {
    File localFile = this.c.v().x();
    return !cj.a(this.c, localFile);
  }

  ei(cj paramcj, n paramn)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ei
 * JD-Core Version:    0.6.0
 */