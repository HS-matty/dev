package com.a.a;

import com.a.e;
import com.zend.ide.j.b;
import com.zend.ide.j.h;
import java.io.File;

public class l extends a
{
  public l()
  {
    super("vfile", b.class);
  }

  public Object a(e parame)
  {
    return h.m.g(parame.a("name"));
  }

  public e e()
  {
    e locale = new e();
    locale.a("name", ((File)c()).getPath());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.a.l
 * JD-Core Version:    0.6.0
 */