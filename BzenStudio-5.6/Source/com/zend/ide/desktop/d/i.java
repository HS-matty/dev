package com.zend.ide.desktop.d;

import com.zend.ide.n.bw;
import com.zend.ide.util.w;

class i extends w
{
  final a c;

  public i(a parama, bw parambw)
  {
    parambw.a(new k(this));
  }

  public boolean b()
  {
    String str = a.c(this.c).k();
    if (str == null)
      return false;
    return (!a.e(str)) || (a.g(str));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.d.i
 * JD-Core Version:    0.6.0
 */