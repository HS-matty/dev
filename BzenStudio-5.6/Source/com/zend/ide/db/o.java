package com.zend.ide.db;

import com.zend.ide.util.bi;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.io.File;
import javax.swing.JOptionPane;

public class o
  implements cu
{
  private static o a;
  private static String b = new File(bi.a("PHPDOC_PATH") + File.separator + "phpdoc").getAbsolutePath();
  private z d;
  private p e;
  private StringBuffer f;

  public static o a()
  {
    if (a == null)
      a = new o();
    return a;
  }

  public void a(b paramb)
  {
    if (paramb == null)
      return;
    this.e.a();
    String[] arrayOfString = b(paramb);
    File localFile = new File(bi.a("PHPDOC_PATH"), "docbuilder");
    a(arrayOfString, localFile);
  }

  private void a(String[] paramArrayOfString, File paramFile)
  {
    try
    {
      for (int i = 0; i < paramArrayOfString.length; i++)
      {
        localObject = paramArrayOfString[i];
        c().a((String)localObject + " ");
      }
      Process localProcess = Runtime.getRuntime().exec(paramArrayOfString, null, paramFile);
      this.f = new StringBuffer();
      Object localObject = new s(this, localProcess.getInputStream(), this.f);
      s locals = new s(this, localProcess.getErrorStream(), this.f);
      ((s)localObject).start();
      locals.start();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      JOptionPane.showMessageDialog(com.zend.ide.bd.c.b().h(), ct.a(1335));
    }
  }

  private String[] b(b paramb)
  {
    String[] arrayOfString1 = paramb.a();
    String[] arrayOfString2 = a();
    String[] arrayOfString3 = new String[arrayOfString1.length + arrayOfString2.length + 1];
    System.arraycopy(arrayOfString2, 0, arrayOfString3, 0, arrayOfString2.length);
    arrayOfString3[arrayOfString2.length] = b();
    System.arraycopy(arrayOfString1, 0, arrayOfString3, arrayOfString2.length + 1, arrayOfString1.length);
    return arrayOfString3;
  }

  private static String b()
  {
    return b;
  }

  private static String[] a()
  {
    String[] arrayOfString = new String[3];
    String str1 = a() ? bi.a("PHP5_BIN_DIRECTORY", "./php5/") : bi.a("PHP4_BIN_DIRECTORY", "./php54");
    str1 = new File(str1).getAbsolutePath();
    String str2 = str1 + File.separatorChar + "php";
    arrayOfString[0] = str2;
    arrayOfString[1] = "-c";
    arrayOfString[2] = "./php.ini";
    return arrayOfString;
  }

  public z c()
  {
    if (this.d == null)
      this.d = new z();
    return this.d;
  }

  public void a(p paramp)
  {
    this.e = paramp;
  }

  private static boolean a()
  {
    return com.zend.ide.y.b.a("desktop.phpVersion").c().toString().equals("PHP5");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.o
 * JD-Core Version:    0.6.0
 */