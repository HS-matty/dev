package com.zend.ide.l;

import com.zend.ide.h.br;
import com.zend.ide.util.bn;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import javax.swing.filechooser.FileFilter;

class j extends br
{
  final g h;

  j(g paramg, bn parambn)
  {
    super(parambn);
  }

  protected void a(Object paramObject)
  {
    b.a("project.projectFileFilter").a(paramObject);
  }

  protected void h()
  {
    a((FileFilter)b.a("project.projectFileFilter").c());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.j
 * JD-Core Version:    0.6.0
 */