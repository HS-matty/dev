package com.zend.ide.j;

import java.io.File;

public abstract class j extends e
  implements v
{
  protected u j;

  protected j()
  {
  }

  protected j(String paramString, u paramu)
  {
    super(paramString);
    a(paramu);
  }

  public void a(u paramu)
  {
    if (this.j != null)
      this.j.b(this);
    this.j = paramu;
    paramu.a(this);
  }

  public char d()
  {
    return this.j.d();
  }

  public String e()
  {
    return this.j.e();
  }

  public File g(String paramString)
  {
    return this.j.g(paramString);
  }

  public File a(String paramString1, String paramString2)
  {
    return this.j.a(paramString1, paramString2);
  }

  public File a(File paramFile, String paramString)
  {
    return this.j.a(paramFile, paramString);
  }

  public File[] b()
  {
    return this.j.b();
  }

  public File[] n(File paramFile)
  {
    return this.j.n(paramFile);
  }

  public String[] i(File paramFile)
  {
    return this.j.i(paramFile);
  }

  public boolean p(File paramFile)
  {
    return this.j.p(paramFile);
  }

  public void o(File paramFile)
  {
    this.j.o(paramFile);
  }

  public void r(File paramFile)
  {
    v(paramFile);
  }

  public void c(File paramFile, boolean paramBoolean)
  {
    e(paramFile, paramBoolean);
  }

  public void c(File paramFile1, File paramFile2)
  {
    d(paramFile1, paramFile2);
  }

  public void s(File paramFile)
  {
    x(paramFile);
  }

  public void a(File[] paramArrayOfFile)
  {
    e(paramArrayOfFile);
  }

  public void b(File[] paramArrayOfFile)
  {
    f(paramArrayOfFile);
  }

  public void t(File paramFile)
  {
    y(paramFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.j
 * JD-Core Version:    0.6.0
 */