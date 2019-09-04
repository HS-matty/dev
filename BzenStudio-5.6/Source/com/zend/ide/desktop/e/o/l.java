package com.zend.ide.desktop.e.o;

import com.zend.ide.h.e;
import com.zend.ide.util.w;
import com.zend.ide.w.a.d;
import java.io.File;

class l extends w
{
  final c c;

  l(c paramc)
  {
  }

  public boolean b()
  {
    File localFile = c.b(this.c).x();
    if ((localFile == null) || (!localFile.isFile()))
      return false;
    return c.c(this.c).b(localFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.l
 * JD-Core Version:    0.6.0
 */