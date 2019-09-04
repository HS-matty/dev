package com.zend.ide.desktop;

import com.zend.ide.h.be;
import com.zend.ide.h.bg;
import com.zend.ide.h.e;
import com.zend.ide.j.h;
import com.zend.ide.j.s;
import com.zend.ide.j.y;
import com.zend.ide.l.f;
import com.zend.ide.l.w;
import com.zend.ide.u.bh;
import com.zend.ide.u.ch;
import com.zend.ide.util.eo;
import java.io.File;

public class cg
  implements w, ch
{
  private f a;

  public cg(f paramf)
  {
    this.a = paramf;
    paramf.a(this);
  }

  public void b(com.zend.ide.l.u paramu)
  {
    File[] arrayOfFile = this.a.g().b();
    for (int i = 0; (arrayOfFile != null) && (i < arrayOfFile.length); i++)
    {
      s locals = h.m.A(arrayOfFile[i]);
      if (!(locals instanceof bh))
        continue;
      ((bh)locals).a(this);
    }
  }

  public void a(File[] paramArrayOfFile)
  {
    for (int i = 0; (paramArrayOfFile != null) && (i < paramArrayOfFile.length); i++)
    {
      s locals = h.m.A(paramArrayOfFile[i]);
      if (!(locals instanceof bh))
        continue;
      ((bh)locals).a(this);
    }
  }

  public void b(File[] paramArrayOfFile)
  {
    for (int i = 0; (paramArrayOfFile != null) && (i < paramArrayOfFile.length); i++)
    {
      s locals = h.m.A(paramArrayOfFile[i]);
      if (!(locals instanceof bh))
        continue;
      ((bh)locals).b(this);
    }
  }

  public void a(bh parambh)
  {
    e locale = this.a.h();
    if (locale == null)
      return;
    File[] arrayOfFile = locale.k().b();
    for (int i = 0; i < arrayOfFile.length; i++)
    {
      File localFile = arrayOfFile[i];
      if ((!(h.m.A(localFile) instanceof bh)) || (!localFile.getPath().startsWith(parambh.c())))
        continue;
      bg localbg = ((be)this.a.h()).e(localFile);
      if (localbg == null)
        continue;
      ((be)this.a.h()).a(localbg, eo.b, true);
    }
  }

  public void a(bh parambh, boolean paramBoolean)
  {
  }

  public void a(com.zend.ide.l.u paramu)
  {
  }

  public void c(com.zend.ide.l.u paramu)
  {
  }

  public void d(com.zend.ide.l.u paramu)
  {
  }

  public void r(File paramFile)
  {
  }

  public void c(File paramFile, boolean paramBoolean)
  {
  }

  public void c(File paramFile1, File paramFile2)
  {
  }

  public void s(File paramFile)
  {
  }

  public void t(File paramFile)
  {
  }

  public void a(File paramFile)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.cg
 * JD-Core Version:    0.6.0
 */