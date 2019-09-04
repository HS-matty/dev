package com.zend.ide.r;

import com.zend.ide.j.h;
import java.io.File;

abstract class b
  implements o
{
  private String a;
  private String b;
  private String c;
  private boolean d;
  private s e;

  public String b()
  {
    return this.a;
  }

  void b(String paramString)
  {
    this.a = paramString;
  }

  public String getDescription()
  {
    return this.b;
  }

  void c(String paramString)
  {
    this.b = paramString;
  }

  public String c()
  {
    return this.c;
  }

  public void d(String paramString)
  {
    this.c = paramString;
  }

  public boolean d()
  {
    return this.d;
  }

  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public String toString()
  {
    if ((this.a == null) || (this.a.equals("")))
      return this.b;
    return this.a;
  }

  public boolean a(File paramFile)
  {
    return b(paramFile.getPath());
  }

  public boolean b(String paramString)
  {
    int i = paramString.lastIndexOf(".");
    int j = h.m.h(paramString).d();
    int k = paramString.lastIndexOf(j);
    String str = "";
    if ((i >= 0) && (i > k))
      str = paramString.substring(i);
    return a(str);
  }

  public abstract boolean a(String paramString);

  public s j()
  {
    if (this.e == null)
      this.e = new bu(this);
    return this.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.b
 * JD-Core Version:    0.6.0
 */