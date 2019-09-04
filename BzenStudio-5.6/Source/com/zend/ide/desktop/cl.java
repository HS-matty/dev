package com.zend.ide.desktop;

import com.zend.ide.h.e;
import com.zend.ide.l.v;
import com.zend.ide.util.w;
import java.io.File;

class cl extends w
{
  final bx c;

  cl(bx parambx)
  {
  }

  public boolean b()
  {
    if (bx.d(this.c) == null)
      return false;
    File localFile = bx.b(this.c).v().x();
    return (localFile != null) && (bx.d(this.c).e());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.cl
 * JD-Core Version:    0.6.0
 */