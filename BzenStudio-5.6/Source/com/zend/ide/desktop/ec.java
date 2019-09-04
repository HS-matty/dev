package com.zend.ide.desktop;

import com.zend.ide.j.bc;
import com.zend.ide.j.h;
import com.zend.ide.j.s;
import com.zend.ide.u.bh;
import java.io.File;

class ec extends bc
{
  ed a = new ed(this);
  final cj b;

  ec(cj paramcj)
  {
  }

  public void a(File[] paramArrayOfFile)
  {
    for (int i = 0; (paramArrayOfFile != null) && (i < paramArrayOfFile.length); i++)
    {
      s locals = h.m.A(paramArrayOfFile[i]);
      if (!(locals instanceof bh))
        continue;
      ((bh)locals).a(this.a);
    }
  }

  public void b(File[] paramArrayOfFile)
  {
    File localFile1 = new File(cj.b(this.b), "ftp");
    for (int i = 0; (paramArrayOfFile != null) && (i < paramArrayOfFile.length); i++)
    {
      s locals = h.m.A(paramArrayOfFile[i]);
      if (!(locals instanceof bh))
        continue;
      ((bh)locals).b(this.a);
      File localFile2 = new File(localFile1, cj.a(this.b, ((bh)locals).D()));
      if (!localFile2.exists())
        continue;
      localFile2.delete();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ec
 * JD-Core Version:    0.6.0
 */