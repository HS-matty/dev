package com.zend.ide.l;

import com.zend.ide.j.h;
import com.zend.ide.util.bh;
import java.io.File;
import java.io.Serializable;
import java.util.Hashtable;

public class i
  implements u, Serializable
{
  private Hashtable a = new Hashtable(5);
  private Hashtable b = new Hashtable(5);
  private String c;
  private File d;
  private String e;
  private bh f;
  private boolean g;

  public void a(l paraml)
  {
    this.a.put(paraml.c(), paraml);
  }

  public Hashtable d()
  {
    return this.a;
  }

  public String b()
  {
    if (this.d != null)
      this.c = this.d.getName();
    if (this.c.indexOf(".") != -1)
      this.c = this.c.substring(0, this.c.lastIndexOf("."));
    return this.c;
  }

  public void a(String paramString)
  {
    this.c = paramString;
    if (this.d != null)
      this.d = h.m.a(this.d.getParent(), paramString + ".zpj");
  }

  public String c()
  {
    return this.d.getAbsolutePath();
  }

  public void b(String paramString)
  {
    this.d = h.m.g(paramString);
  }

  public String a()
  {
    return this.e;
  }

  public void c(String paramString)
  {
    this.e = paramString;
  }

  public void a(bh parambh)
  {
    this.f = parambh;
  }

  public bh b()
  {
    return this.f;
  }

  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public boolean c()
  {
    return this.g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.i
 * JD-Core Version:    0.6.0
 */