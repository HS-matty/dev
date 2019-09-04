package com.zend.ide.desktop.e;

import com.zend.ide.desktop.cj;
import com.zend.ide.f.bg;
import com.zend.ide.f.da;
import com.zend.ide.f.g;
import com.zend.ide.l.v;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import java.io.File;

class c
  implements g
{
  final a a;

  private c(a parama)
  {
  }

  public void a(String paramString)
  {
    try
    {
      a.c(this.a).a(paramString, null, -1);
      a.c(this.a).Y();
    }
    catch (Exception localException)
    {
      com.zend.ide.util.a.b.a(localException);
    }
  }

  public void a(String paramString, int paramInt)
  {
    try
    {
      a.c(this.a).a(paramString, paramInt);
    }
    catch (Exception localException)
    {
      com.zend.ide.util.a.b.a(localException);
    }
  }

  public void b(String paramString, int paramInt)
  {
    try
    {
      a.c(this.a).a(paramString, null, paramInt);
      a.c(this.a).Y();
    }
    catch (Exception localException)
    {
      com.zend.ide.util.a.b.a(localException);
    }
  }

  public void a(File paramFile)
  {
    da localda = a.e(this.a).d();
    if (!a.c(this.a).l().e())
      return;
    boolean bool = localda.a(a.c(this.a).l().g(), new File[] { paramFile });
    if (!bool)
      ba.a(com.zend.ide.bd.c.b().h(), ct.a(982), ct.a(7), 1);
  }

  public String c(String paramString1, String paramString2)
  {
    if (!a.c(this.a).l().e())
      return null;
    return a.c(a.c(this.a).l().g(), paramString2, paramString1);
  }

  c(a parama, b paramb)
  {
    this(parama);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.c
 * JD-Core Version:    0.6.0
 */