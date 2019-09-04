package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.zend.ide.f.zc.b.h;
import com.zend.ide.f.zc.b.j;
import java.io.File;
import java.io.IOException;

public class v extends a
{
  public v()
  {
    super("jreModel", j.class);
  }

  public e e()
  {
    e locale = new e();
    j localj = (j)c();
    locale.a("JRE_Name", localj.d());
    locale.a("JRE_Path", localj.c().getAbsolutePath());
    return locale;
  }

  public Object a(e parame)
  {
    String str1 = parame.a("JRE_Name");
    String str2 = parame.a("JRE_Path");
    File localFile = null;
    if ((str2 != null) && (!str2.equals("")))
      localFile = new File(str2);
    if ((str1 != null) && (localFile != null))
      try
      {
        return new j(str1, localFile);
      }
      catch (IOException localIOException)
      {
      }
    return h.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.v
 * JD-Core Version:    0.6.0
 */