package com.zend.ide.desktop;

import com.zend.ide.j.y;
import com.zend.ide.l.v;
import com.zend.ide.util.c.d;
import java.io.File;
import java.io.IOException;

class pc
  implements d
{
  final File a;
  final File b;
  final cd c;

  pc(cd paramcd, File paramFile1, File paramFile2)
  {
  }

  public Object k()
  {
    try
    {
      be.a(this.c.c, this.a);
      File[] arrayOfFile = be.d(this.c.c).g().b();
      for (int i = 0; i < arrayOfFile.length; i++)
      {
        File localFile = arrayOfFile[i];
        if (!localFile.getAbsolutePath().equals(this.b.getAbsolutePath()))
          continue;
        be.d(this.c.c).c(this.b);
      }
      String[] arrayOfString = be.h(this.c.c).c(this.b.getCanonicalPath());
      for (int j = 0; j < arrayOfString.length; j++)
        be.a(this.c.c, arrayOfString[j], this.b);
      arrayOfString = be.a(this.c.c).c(this.b.getCanonicalPath());
      for (j = 0; j < arrayOfString.length; j++)
        be.a(this.c.c, arrayOfString[j], this.b);
    }
    catch (IOException localIOException)
    {
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.pc
 * JD-Core Version:    0.6.0
 */