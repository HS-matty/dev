package com.zend.ide.desktop;

import com.zend.ide.n.bu;
import com.zend.ide.n.bw;
import com.zend.ide.r.bo;
import com.zend.ide.r.o;
import java.io.File;

class eh
  implements Runnable
{
  final bo a;
  final ek b;

  eh(ek paramek, bo parambo)
  {
  }

  public void run()
  {
    String str = ek.a(this.b).k();
    if (str == null)
      return;
    ek.b(this.b).b(str);
    ek.a(this.b, str, null);
    File localFile = new File(str);
    if (this.a.b().a(localFile))
      ek.a(this.b, ek.c(this.b).k());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.eh
 * JD-Core Version:    0.6.0
 */