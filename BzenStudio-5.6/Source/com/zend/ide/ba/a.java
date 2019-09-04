package com.zend.ide.ba;

import com.zend.ide.j.t;
import com.zend.ide.util.bi;
import com.zend.ide.util.cl;
import com.zend.ide.util.cu;
import com.zend.ide.util.dj;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class a
  implements cu
{
  private static File a;

  public static h a(String paramString)
  {
    File localFile = c();
    if (!localFile.exists())
      throw new dj("Zend Code Analyzer is not installed properly!");
    h localh = new h(paramString);
    try
    {
      Process localProcess = Runtime.getRuntime().exec(new String[] { localFile.getPath(), "--ide", paramString }, null);
      return a(localProcess, localh);
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
    return null;
  }

  private static h a(Process paramProcess, h paramh)
  {
    InputStreamReader localInputStreamReader = new InputStreamReader(paramProcess.getErrorStream());
    BufferedReader localBufferedReader = new BufferedReader(localInputStreamReader);
    try
    {
      String str;
      while ((str = localBufferedReader.readLine()) != null)
      {
        if ((str.indexOf("Error parsing") != -1) || (str.indexOf("[Zend Code Analyzer] Aborted.") != -1))
          continue;
        b localb = b.a(str);
        paramh.a(localb);
      }
    }
    catch (IOException localIOException3)
    {
      cl.a(localIOException2);
    }
    finally
    {
      try
      {
        localBufferedReader.close();
      }
      catch (IOException localIOException4)
      {
        cl.a(localIOException4);
      }
    }
    return paramh;
  }

  public static File c()
  {
    if (a == null)
    {
      String str1 = "";
      String str2 = "." + File.separator + b();
      str1 = bi.a("ANALYZER_LOCATION", str2);
      str1 = new File(str1).getAbsolutePath();
      str1 = t.a(str1);
      a = new File(str1);
    }
    return a;
  }

  public static void a()
  {
    File localFile = c();
    if (!localFile.exists())
      throw new dj("Zend Code Analyzer is not installed properly!");
  }

  private static String b()
  {
    String str = System.getProperty("os.name");
    int i = -1;
    if (str.startsWith("Windows"))
      i = 0;
    if (str.startsWith("Linux"))
      i = 1;
    if (str.startsWith("Mac"))
      i = 2;
    return i == 0 ? "ZendCodeAnalyzer.exe" : "ZendCodeAnalyzer";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ba.a
 * JD-Core Version:    0.6.0
 */