package com.zend.ide.desktop;

import com.zend.ide.f.bg;
import com.zend.ide.f.bp;
import com.zend.ide.f.da;
import com.zend.ide.l.u;
import com.zend.ide.l.v;
import com.zend.ide.util.c.d;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.io.File;

class bn
  implements d
{
  private u a;
  private File[] b;
  private boolean c;
  final cd d;

  public bn(cd paramcd, u paramu, File[] paramArrayOfFile)
  {
    this.c = (!paramcd.d);
    this.a = paramu;
    this.b = paramArrayOfFile;
  }

  public Object k()
  {
    this.d.d = true;
    for (int i = 0; i < this.b.length; i++)
    {
      if (!cd.a(this.d, this.a))
        return null;
      be.a(this.d.c, this.b[i].getAbsolutePath(), null);
    }
    if ((this.c) && (((Boolean)b.a("application.showListDialog").c()).booleanValue()))
    {
      da localda = be.d(this.d.c).c().d();
      if (!cd.a(this.d, this.a))
        return null;
      localda.a(be.d(this.d.c).g());
    }
    this.d.d = false;
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bn
 * JD-Core Version:    0.6.0
 */