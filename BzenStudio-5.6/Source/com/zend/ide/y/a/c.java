package com.zend.ide.y.a;

import com.a.a.a;
import com.a.e;
import com.zend.ide.p.d.bc;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import javax.swing.filechooser.FileFilter;

public class c extends a
{
  public c()
  {
    super("fileFilter", FileFilter.class);
  }

  public Object a(e parame)
  {
    String str = parame.a("name");
    if (p.e().a(str) != null)
      return p.e().a(str).j();
    return new bc(str);
  }

  public e e()
  {
    e locale = new e();
    FileFilter localFileFilter = (FileFilter)c();
    String str = localFileFilter.getDescription();
    locale.a("name", str);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.a.c
 * JD-Core Version:    0.6.0
 */