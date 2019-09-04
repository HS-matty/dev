package com.zend.ide.desktop.e.p;

import com.zend.ide.h.e;
import com.zend.ide.util.w;
import com.zend.ide.w.c.d;
import java.io.File;

class r extends w
{
  final c c;

  r(c paramc)
  {
  }

  public boolean b()
  {
    File localFile = c.b(this.c).x();
    if ((localFile == null) || (!localFile.isFile()))
      return false;
    return c.c(this.c).e(localFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.p.r
 * JD-Core Version:    0.6.0
 */