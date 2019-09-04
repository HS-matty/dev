package com.zend.ide.n.td;

import com.zend.ide.n.bw;
import com.zend.ide.r.bo;
import com.zend.ide.r.o;
import java.io.File;

class bb
  implements Runnable
{
  final bo a;
  final bc b;

  bb(bc parambc, bo parambo)
  {
  }

  public void run()
  {
    String str = bc.a(this.b).k();
    if (str == null)
      return;
    bc.a(this.b, str, null);
    File localFile = new File(str);
    if (this.a.b().a(localFile))
      bc.a(this.b, bc.b(this.b).k(), false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.bb
 * JD-Core Version:    0.6.0
 */