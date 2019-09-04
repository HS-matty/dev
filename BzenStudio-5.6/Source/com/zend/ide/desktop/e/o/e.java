package com.zend.ide.desktop.e.o;

import com.zend.ide.h.be;
import com.zend.ide.l.u;
import com.zend.ide.l.v;
import com.zend.ide.l.x;
import com.zend.ide.w.fb;
import com.zend.ide.w.h;
import com.zend.ide.w.i;
import com.zend.ide.w.kb;
import java.io.File;

class e extends x
{
  final f a;

  private e(f paramf)
  {
  }

  public void b(u paramu)
  {
    be localbe = (be)f.a(this.a).h();
    f.a(this.a, new c(f.b(this.a), localbe));
    localbe.repaint();
    if (f.c(this.a))
    {
      f.d(this.a).a(true);
      f.e(this.a).a(true);
      f.a(this.a, new fb(f.b(this.a), paramu, localbe));
      f.a(this.a).c();
      f.b(this.a).a(f.a(this.a));
    }
  }

  public void d(u paramu)
  {
    f.d(this.a).a(false);
    f.e(this.a).a(false);
    if (f.a(this.a) != null)
      f.a(this.a).b();
    f.b(this.a).a(null);
    f.a(this.a, null);
  }

  public void c(File paramFile, boolean paramBoolean)
  {
    if (f.c(this.a))
      f.a(this.a).a(paramFile, null);
  }

  public void a(File[] paramArrayOfFile)
  {
    if (f.c(this.a))
      f.a(this.a).a(paramArrayOfFile);
  }

  public void b(File[] paramArrayOfFile)
  {
    if (f.c(this.a))
      f.a(this.a).b(paramArrayOfFile);
  }

  public void s(File paramFile)
  {
    if (f.c(this.a))
      f.a(this.a).a(paramFile);
  }

  public void c(File paramFile1, File paramFile2)
  {
    if (f.c(this.a))
      f.a(this.a).a(paramFile1, paramFile2);
  }

  public void r(File paramFile)
  {
    if (f.c(this.a))
      f.a(this.a).b(paramFile);
  }

  e(f paramf, b paramb)
  {
    this(paramf);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.e
 * JD-Core Version:    0.6.0
 */