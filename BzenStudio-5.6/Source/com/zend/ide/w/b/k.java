package com.zend.ide.w.b;

import com.zend.ide.bd.c;
import com.zend.ide.p.ba;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import java.io.IOException;
import java.io.Reader;

class k
  implements Runnable
{
  final w d;
  final Reader a;
  final String b;
  final String e;
  final bp c;

  k(bp parambp, w paramw, Reader paramReader, String paramString1, String paramString2)
  {
  }

  public void run()
  {
    try
    {
      bp.a(this.c).a(this.d, this.a, this.b, this.e, true);
    }
    catch (Exception localIOException2)
    {
      cl.a(localException);
      if (bp.a(this.c) != null)
        bp.a(this.c).j();
      this.c.dispose();
      ba.a(c.b().h(), ct.a(1239), ct.a(1240), 0);
    }
    finally
    {
      try
      {
        this.a.close();
      }
      catch (IOException localIOException3)
      {
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.k
 * JD-Core Version:    0.6.0
 */