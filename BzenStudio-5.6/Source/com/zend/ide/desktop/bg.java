package com.zend.ide.desktop;

import com.zend.ide.bd.c;
import com.zend.ide.be.k;
import com.zend.ide.j.y;
import com.zend.ide.l.v;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.util.c.d;
import com.zend.ide.util.ct;
import java.io.File;

class bg
  implements d
{
  final be b;

  bg(be parambe)
  {
  }

  public Object k()
  {
    be.b(this.b);
    if (be.c(this.b))
    {
      c.b().d().a(ct.a(1781));
      localObject = be.d(this.b).g().b();
      for (i = 0; i < localObject.length; i++)
        be.a(this.b, localObject[i].getAbsolutePath(), null);
    }
    Object localObject = be.e(this.b).i();
    for (int i = 0; i < localObject.length; i++)
      be.a(this.b, localObject[i].k(), false);
    c.b().d().b(ct.a(1781));
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bg
 * JD-Core Version:    0.6.0
 */