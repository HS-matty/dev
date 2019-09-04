package com.zend.ide.hb;

import java.io.File;

class g
  implements d
{
  private int a;
  private int b;
  private String c;
  private int d;
  private String e;
  private int f;
  private int g;
  private int h;
  private File i;

  g(File paramFile, int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2, int paramInt4, int paramInt5, int paramInt6)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString1;
    this.i = paramFile;
    this.d = paramInt3;
    this.e = paramString2;
    this.f = paramInt4;
    this.g = paramInt5;
    this.h = paramInt6;
  }

  public int b()
  {
    return this.a;
  }

  public int f()
  {
    return this.b;
  }

  public String g()
  {
    return this.c;
  }

  public String toString()
  {
    return this.i.getAbsolutePath() + " (" + this.d + ") " + this.e;
  }

  public int a()
  {
    return this.d;
  }

  public String b()
  {
    return this.e;
  }

  public int c()
  {
    return this.f;
  }

  public int d()
  {
    return this.g;
  }

  public int e()
  {
    return this.h;
  }

  public File f()
  {
    return this.i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.g
 * JD-Core Version:    0.6.0
 */