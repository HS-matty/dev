package com.zend.ide.desktop.d;

import com.zend.ide.h.e;
import com.zend.ide.l.v;
import com.zend.ide.util.w;
import java.io.File;

class j extends w
{
  final a c;

  public j(a parama)
  {
  }

  public boolean b()
  {
    if (!a.b(this.c).e())
      return false;
    File localFile = a.b(this.c).h().x();
    if (localFile == null)
      return false;
    return (!localFile.isFile()) || (a.g(localFile.getPath()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.d.j
 * JD-Core Version:    0.6.0
 */