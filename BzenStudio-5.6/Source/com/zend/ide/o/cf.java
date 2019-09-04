package com.zend.ide.o;

import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.io.File;

public class cf
{
  private di[] a = new di[0];
  private dg[] b = new dg[0];
  private boolean c = true;
  private int d = ((Integer)b.a("debugging.debugPort").c()).intValue();
  private String e = b.a("debugging.serverHost").c().toString();
  private String f = ((File)b.a("debugging.tempFilesLocation").c()).getPath();
  private boolean g = ((Boolean)b.a("debugging.localDebugging").c()).booleanValue();

  public void a(di[] paramArrayOfdi)
  {
    this.a = paramArrayOfdi;
  }

  public di[] i()
  {
    return this.a;
  }

  public void a(dg[] paramArrayOfdg)
  {
    this.b = paramArrayOfdg;
  }

  public dg[] b()
  {
    return this.b;
  }

  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public boolean c()
  {
    return this.c;
  }

  public void a(int paramInt)
  {
    this.d = paramInt;
  }

  public int d()
  {
    return this.d;
  }

  public void a(String paramString)
  {
    this.e = paramString;
  }

  public String e()
  {
    return this.e;
  }

  public void b(String paramString)
  {
    this.f = paramString;
  }

  public String f()
  {
    return this.f;
  }

  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public boolean g()
  {
    return this.g;
  }

  public void a(fu paramfu)
  {
    this.c = paramfu.f();
    this.d = paramfu.b();
    this.e = paramfu.c();
    this.f = paramfu.d();
    this.g = paramfu.e();
  }

  public fu h()
  {
    fu localfu = new fu();
    localfu.a(this.c);
    localfu.a(this.d);
    localfu.a(this.e);
    localfu.b(this.f);
    localfu.b(this.g);
    return localfu;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.cf
 * JD-Core Version:    0.6.0
 */