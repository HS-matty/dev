package com.zend.ide.desktop.e.o;

import com.zend.ide.n.bw;
import com.zend.ide.util.w;
import com.zend.ide.w.a.d;
import java.io.File;

class h extends w
{
  final a c;

  h(a parama)
  {
  }

  public boolean b()
  {
    String str = a.b(this.c).k();
    if (str == null)
      return false;
    File localFile = com.zend.ide.j.h.m.g(str);
    return a.c(this.c).a(localFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.h
 * JD-Core Version:    0.6.0
 */