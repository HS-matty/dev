package com.zend.ide.desktop.e.o;

import com.zend.ide.h.e;
import com.zend.ide.util.w;
import com.zend.ide.w.a.d;
import java.io.File;

class m extends w
{
  final c c;

  m(c paramc)
  {
  }

  public boolean b()
  {
    File[] arrayOfFile = c.b(this.c).b();
    if (arrayOfFile == null)
      return false;
    if (!c.c(this.c).a(arrayOfFile))
      return false;
    for (int i = 0; i < arrayOfFile.length; i++)
      if (!c.c(this.c).c(arrayOfFile[i]))
        return false;
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.m
 * JD-Core Version:    0.6.0
 */