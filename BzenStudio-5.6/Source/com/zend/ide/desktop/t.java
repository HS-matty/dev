package com.zend.ide.desktop;

import com.zend.ide.h.br;
import com.zend.ide.util.bn;
import com.zend.ide.util.cl;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import javax.swing.filechooser.FileFilter;

class t extends br
{
  final cj b;

  t(cj paramcj, bn parambn)
  {
    super(parambn);
  }

  protected void a(Object paramObject)
  {
    b.a("explorer.fileFilter").a(paramObject);
  }

  protected void h()
  {
    try
    {
      a((FileFilter)b.a("explorer.fileFilter").c());
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.t
 * JD-Core Version:    0.6.0
 */