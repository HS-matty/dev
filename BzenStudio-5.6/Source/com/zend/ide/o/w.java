package com.zend.ide.o;

import com.zend.ide.j.bd;
import com.zend.ide.j.h;
import com.zend.ide.o.b.a;
import com.zend.ide.util.c.f;
import java.io.File;

class w
  implements cg
{
  private a a = new a();
  final fk b;

  public w(fk paramfk)
  {
  }

  public boolean b()
  {
    this.b.S();
    String str1 = this.b.bg();
    File localFile = h.m.g(str1);
    String str2 = de.b(str1);
    if ((localFile.exists()) && (!(localFile instanceof bd)))
    {
      this.b.d = localFile.getParentFile();
      String str3 = de.b(this.b.d.getAbsolutePath());
      this.b.e(str2, str3);
    }
    else
    {
      this.b.d = null;
      this.b.c(str2);
    }
    try
    {
      this.a.a(x.b, this.b.w());
      fk.d(this.b).a(10000L, 10000L);
    }
    catch (RuntimeException localRuntimeException)
    {
      fk.b(this.b).d();
      throw localRuntimeException;
    }
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.w
 * JD-Core Version:    0.6.0
 */