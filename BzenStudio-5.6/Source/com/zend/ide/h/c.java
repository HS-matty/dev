package com.zend.ide.h;

import java.io.File;

class c
  implements Runnable
{
  final File[] a;
  final be b;

  c(be parambe, File[] paramArrayOfFile)
  {
  }

  public void run()
  {
    for (int i = 0; i < this.a.length; i++)
      try
      {
        this.b.a(true);
        File localFile = this.a[i];
        be.a(this.b).b(localFile);
      }
      finally
      {
        this.b.a(false);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.c
 * JD-Core Version:    0.6.0
 */