package com.zend.ide.desktop;

import com.zend.ide.bd.c;
import com.zend.ide.be.l;
import com.zend.ide.l.u;
import com.zend.ide.l.v;
import com.zend.ide.l.x;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.p.b.a;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import java.io.File;

class ce extends x
{
  final bx a;

  private ce(bx parambx)
  {
  }

  public void a(File paramFile)
  {
    bx.b(this.a).g(paramFile.getPath());
    if (paramFile.exists())
    {
      if (paramFile.isFile())
      {
        bx.b(this.a).a(paramFile.getPath(), null, -1);
        bx.b(this.a).Y();
      }
    }
    else
      ba.a(c.b().h(), ct.a(862, paramFile.getPath()), ct.a(863), 2);
  }

  public void b(u paramu)
  {
    bx.b(this.a).p();
    bx.c(this.a).b(ct.a(208));
    bx.b(this.a).Y();
    bx.a(this.a).h();
    bx.b(this.a).c();
  }

  public void d(u paramu)
  {
    bx.b(this.a).h();
    bx.b(this.a).p();
    bx.b(this.a).Y();
    bx.b(this.a).c();
  }

  public void c(File paramFile, boolean paramBoolean)
  {
    this.a.f().c(paramFile);
  }

  public void c(File paramFile1, File paramFile2)
  {
    bw localbw = bx.b(this.a).X();
    dz localdz = localbw.a(paramFile1.getPath());
    if (localdz != null)
      localdz.b(paramFile2.getPath());
  }

  public void a(u paramu)
  {
    bx.a(this.a).g();
    bx.a(this.a).a("Loading project: " + paramu.b());
  }

  public void c(u paramu)
  {
    bx.b(this.a).g();
    bx.b(this.a).a("Saving project: " + paramu.b());
  }

  public void a(File[] paramArrayOfFile)
  {
    bx.b(this.a).c();
  }

  public void b(File[] paramArrayOfFile)
  {
    bx.b(this.a).c();
  }

  ce(bx parambx, by paramby)
  {
    this(parambx);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ce
 * JD-Core Version:    0.6.0
 */