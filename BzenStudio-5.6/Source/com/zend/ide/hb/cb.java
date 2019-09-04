package com.zend.ide.hb;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public abstract class cb
  implements h
{
  private ab a;

  public cb(ab paramab)
  {
    this.a = paramab;
  }

  public abstract void g();

  public abstract void h();

  public abstract void i();

  public abstract void a(File paramFile);

  public abstract void b(File paramFile);

  public abstract void a(d[] paramArrayOfd);

  public boolean a(File paramFile)
  {
    return this.a.d().accept(paramFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.cb
 * JD-Core Version:    0.6.0
 */