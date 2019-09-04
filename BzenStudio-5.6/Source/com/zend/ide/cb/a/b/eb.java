package com.zend.ide.cb.a.b;

import com.zend.ide.bd.c;
import com.zend.ide.cb.c.w;
import com.zend.ide.cb.d;
import com.zend.ide.cb.e;
import com.zend.ide.cb.q;

class eb
  implements Runnable
{
  final q a;
  final db b;

  eb(db paramdb, q paramq)
  {
  }

  public void run()
  {
    try
    {
      if (this.a.l().h())
        this.a.a();
    }
    catch (d locald)
    {
      w.a(this.a, locald.getMessage(), c.b().h());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.eb
 * JD-Core Version:    0.6.0
 */