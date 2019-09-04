package com.zend.ide.o.b;

import com.zend.ide.util.bi;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.dj;
import com.zend.ide.util.dm;
import com.zend.ide.util.ex;
import com.zend.ide.y.c;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class a
  implements cu
{
  private static final boolean c = System.getProperty("os.name").startsWith("Linux");
  protected String a = "";
  protected String[] b;

  public a()
  {
    try
    {
      File localFile = File.createTempFile("Zend", "php_output");
      localFile.deleteOnExit();
      this.a = (" > " + localFile.getAbsolutePath());
      b();
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
  }

  private void b()
  {
    Vector localVector = new Vector();
    Enumeration localEnumeration = dm.d().keys();
    while (localEnumeration.hasMoreElements())
    {
      String str = (String)localEnumeration.nextElement();
      localVector.add(str + "=" + dm.d().getProperty(str));
    }
    this.b = new String[localVector.size()];
    localVector.toArray(this.b);
  }

  public void a(String paramString, int paramInt)
  {
    a(paramString, paramInt, "");
  }

  public void a(String paramString1, int paramInt, String paramString2)
  {
    try
    {
      boolean bool = com.zend.ide.y.b.a("desktop.phpVersion").c().toString().equalsIgnoreCase("PHP5");
      if (bool)
        str = bi.a("PHP5_BIN_DIRECTORY", "./php5/");
      else
        str = bi.a("PHP4_BIN_DIRECTORY", "./php4/");
      File localFile = new File(str).getAbsoluteFile();
      String str = localFile.getAbsolutePath();
      String[] arrayOfString1 = new String[this.b.length + (c ? 9 : 8)];
      String[] arrayOfString2 = { "REQUEST_METHOD=GET", "SCRIPT_FILENAME=" + paramString1, "SCRIPT_NAME=" + paramString1, "PATH_TRANSLATED=" + paramString1, "PATH_INFO=" + paramString1, "QUERY_STRING=" + ex.a(paramInt) + paramString2 + "&debug_host=127.0.0.1", "REDIRECT_STATUS=1", "PHPRC=" + str };
      System.arraycopy(this.b, 0, arrayOfString1, 0, this.b.length);
      System.arraycopy(arrayOfString2, 0, arrayOfString1, arrayOfString1.length - (c ? 9 : 8), arrayOfString2.length);
      if (c)
        arrayOfString1[(arrayOfString1.length - 1)] = ("LD_LIBRARY_PATH=" + str);
      String[] arrayOfString3 = { str + File.separatorChar + "php", "-c", str, this.a };
      Process localProcess = Runtime.getRuntime().exec(arrayOfString3, arrayOfString1, localFile);
      b localb = new b(localProcess);
      new Thread(localb).start();
    }
    catch (Exception localException)
    {
      cl.a("Local debugger error: " + localException.getMessage());
      throw new dj(ct.a(1146), ct.a(94), 0);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.b.a
 * JD-Core Version:    0.6.0
 */