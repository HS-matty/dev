package com.zend.ide.u;

import com.zend.ide.j.bc;
import com.zend.ide.j.h;
import java.io.File;
import java.util.Hashtable;

class p extends bc
{
  final i a;

  private p(i parami)
  {
    h.m.a(this);
  }

  public void b(File[] paramArrayOfFile)
  {
    for (int i = 0; i < paramArrayOfFile.length; i++)
    {
      File localFile = paramArrayOfFile[i];
      if (!(localFile instanceof c))
        continue;
      String str = ((c)localFile).i;
      bh localbh = (bh)i.B().remove(str);
      try
      {
        localbh.g();
      }
      catch (Exception localException)
      {
      }
    }
  }

  public void c(File paramFile1, File paramFile2)
  {
    i.a(this.a).remove(this.a.a(paramFile1.getAbsolutePath()));
  }

  p(i parami, cg paramcg)
  {
    this(parami);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.p
 * JD-Core Version:    0.6.0
 */