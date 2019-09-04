package com.zend.ide.desktop;

import com.zend.ide.h.e;
import com.zend.ide.h.f;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import com.zend.ide.util.eo;
import com.zend.ide.util.es;
import java.io.File;
import javax.swing.tree.TreePath;

class w
  implements f
{
  final cj a;

  private w(cj paramcj)
  {
  }

  public void a(File paramFile)
  {
    this.a.g(paramFile.getPath());
    if (paramFile.exists())
    {
      if (paramFile.isFile())
      {
        this.a.a(paramFile.getPath(), null, -1);
        this.a.Y();
      }
    }
    else
    {
      es locales = (es)cj.h(this.a).n().getSelectionPath().getLastPathComponent();
      cj.h(this.a).n().a(locales, eo.d, false);
      ba.a(cj.a(this.a).h(), ct.a(862, paramFile.getPath()), ct.a(863), 2);
    }
  }

  w(cj paramcj, n paramn)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.w
 * JD-Core Version:    0.6.0
 */