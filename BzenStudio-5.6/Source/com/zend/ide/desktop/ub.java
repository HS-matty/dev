package com.zend.ide.desktop;

import com.zend.ide.p.ba;
import com.zend.ide.util.c.d;
import com.zend.ide.util.ct;
import java.io.File;

class ub
  implements d
{
  final ob a;

  ub(ob paramob)
  {
  }

  public Object k()
  {
    StringBuffer localStringBuffer = new StringBuffer(ct.a(131));
    if (this.a.b != null)
      localStringBuffer.append(": " + this.a.b.getPath());
    ba.a(this.a.e.o, localStringBuffer.toString(), ct.a(132), -1, 0);
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ub
 * JD-Core Version:    0.6.0
 */