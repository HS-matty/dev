package com.a.a;

import com.a.e;
import java.io.File;

public class c extends a
{
  public c()
  {
    super("file", File.class);
  }

  public Object a(e parame)
  {
    return new File(parame.a("name"));
  }

  public e e()
  {
    e locale = new e();
    locale.a("name", ((File)c()).getPath());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.a.c
 * JD-Core Version:    0.6.0
 */