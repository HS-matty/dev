package com.zend.ide.fb;

import com.zend.ide.bd.c;
import com.zend.ide.j.h;
import com.zend.ide.p.ba;
import com.zend.ide.util.bi;
import com.zend.ide.util.cl;
import com.zend.ide.util.cr;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class l
  implements cu
{
  private static l a;
  private PropertyChangeListener b = new n(this, null);
  private e c;
  private String d;

  private l()
  {
    f localf = new f();
    this.c = new e(localf);
    localf.a("browser.commandLine", this.b);
    this.c.a("browser.commandLine");
  }

  private static l a()
  {
    if (a == null)
      a = new l();
    return a;
  }

  private void a(String paramString)
  {
    paramString.trim();
    this.d = paramString;
  }

  public static void b(String paramString)
  {
    a().c(paramString);
  }

  private void c(String paramString)
  {
    try
    {
      URL localURL = new URL(paramString);
      File localFile = h.m.g(localURL.getFile());
      if ((paramString.startsWith("file:")) && (!localFile.exists()))
      {
        ba.a(c.b().h(), ct.a(1301, "'" + paramString + "'"), ct.a(1302), 0);
        return;
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    try
    {
      Runtime localRuntime = Runtime.getRuntime();
      if (cr.c() == 1)
        localRuntime.exec(this.d + " \"" + paramString + '"');
      else
        localRuntime.exec(this.d + " " + paramString);
    }
    catch (IOException localIOException)
    {
      if (bi.e)
        ba.a(c.b().h(), ct.a(537), ct.a(538), 0);
      else
        ba.a(c.b().h(), ct.a(1336), ct.a(538), 0);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  static void a(l paraml, String paramString)
  {
    paraml.a(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.l
 * JD-Core Version:    0.6.0
 */