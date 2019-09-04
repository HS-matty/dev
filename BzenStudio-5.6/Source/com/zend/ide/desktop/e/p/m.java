package com.zend.ide.desktop.e.p;

import com.zend.ide.j.h;
import com.zend.ide.n.bw;
import com.zend.ide.util.w;
import com.zend.ide.w.c.d;
import java.io.File;

class m extends w
{
  final a c;

  m(a parama)
  {
  }

  public boolean b()
  {
    String str = a.b(this.c).k();
    if (str == null)
      return false;
    File localFile = h.m.g(str);
    return a.c(this.c).g(localFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.p.m
 * JD-Core Version:    0.6.0
 */