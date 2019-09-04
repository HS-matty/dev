package com.zend.ide.q;

import com.zend.ide.j.h;
import com.zend.ide.j.t;
import com.zend.ide.util.bi;
import com.zend.ide.util.cl;
import com.zend.ide.util.cu;
import com.zend.ide.y.c;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class d
  implements cu
{
  private static String b;
  private static String a;
  private static String c;
  private static String d;
  private static String e = "4.0.0";

  private static String a()
  {
    if (c == null)
    {
      String str = System.getProperty("os.name");
      if (str.startsWith("Windows"))
        c = "ZendSafeGuard.exe";
      else if (str.startsWith("Mac"))
        c = "ZendSafeGuard.app/Contents/MacOS/ZendSafeGuard";
      else
        c = "ZendSafeGuard";
    }
    return c;
  }

  private static String c()
  {
    if (d == null)
    {
      String str = System.getProperty("os.name");
      if (str.startsWith("Windows"))
        d = "ZendGuard.exe";
      else if (str.startsWith("Mac"))
        d = "ZendGuard.app/Contents/MacOS/ZendGuard";
      else
        d = "ZendGuard";
    }
    return d;
  }

  private static String d()
  {
    if (a == null)
    {
      String str = System.getProperty("os.name");
      StringBuffer localStringBuffer = new StringBuffer();
      if (str.startsWith("Windows"))
        localStringBuffer.append("C:\\Program Files\\Zend\\ZendGuard-");
      else if (str.startsWith("Mac"))
        localStringBuffer.append("/Applications/Zend/ZendGuard-");
      else
        localStringBuffer.append("/usr/local/Zend/ZendGuard-");
      localStringBuffer.append(e);
      localStringBuffer.append(File.separatorChar);
      localStringBuffer.append("bin");
      localStringBuffer.append(File.separatorChar);
      localStringBuffer.append(c());
      a = localStringBuffer.toString();
    }
    return a;
  }

  public static void a(String paramString1, File[] paramArrayOfFile, String paramString2)
    throws IOException
  {
    File localFile = (File)com.zend.ide.y.b.a("encoder.encoderCommandLine").c();
    if ((!localFile.exists()) || (localFile.isDirectory()))
      throw new IOException("Zend Guard not installed !!!");
    b(paramString1, paramArrayOfFile, paramString2);
    try
    {
      Runtime.getRuntime().exec(localFile.getPath() + " /zdeproj EncoderProject.dat");
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private static void b(String paramString1, File[] paramArrayOfFile, String paramString2)
  {
    try
    {
      File localFile = h.m.g("EncoderProject.dat");
      BufferedWriter localBufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(localFile)));
      localBufferedWriter.write("prj_name=" + paramString1);
      localBufferedWriter.newLine();
      localBufferedWriter.write("current_file=" + paramString2);
      localBufferedWriter.newLine();
      for (int i = 0; i < paramArrayOfFile.length; i++)
      {
        String str = paramArrayOfFile[i].getPath();
        if (paramArrayOfFile[i].isFile())
          localBufferedWriter.write("prj_file=" + str);
        else
          localBufferedWriter.write("prj_dir=" + str);
        localBufferedWriter.newLine();
      }
      localBufferedWriter.flush();
      localBufferedWriter.close();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public static String b()
  {
    if (b == null)
      try
      {
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        String[] arrayOfString = { bi.a("IDE_BIN_DIRECTORY") + File.separator + "..", bi.a("IDE_BIN_DIRECTORY") + File.separator + ".." + File.separator + "..", "/Applications/Zend" };
        a locala = new a();
        b localb = new b();
        File localFile;
        for (int i = 0; i < arrayOfString.length; i++)
        {
          localFile = new File(arrayOfString[i]);
          File[] arrayOfFile1 = localFile.listFiles(locala);
          if ((arrayOfFile1 != null) && (arrayOfFile1.length > 0))
            for (int j = arrayOfFile1.length - 1; j >= 0; j--)
            {
              String str1 = arrayOfFile1[j] + File.separator + "bin";
              localArrayList1.add(str1);
            }
          localArrayList1.add(arrayOfString[i] + File.separator + "bin");
          File[] arrayOfFile2 = localFile.listFiles(localb);
          if ((arrayOfFile2 != null) && (arrayOfFile2.length > 0))
            for (int k = arrayOfFile2.length - 1; k >= 0; k--)
            {
              String str2 = arrayOfFile2[k] + File.separator + "bin";
              localArrayList2.add(str2);
            }
          localArrayList2.add(arrayOfString[i] + File.separator + "bin");
        }
        for (i = 0; i < localArrayList1.size(); i++)
        {
          localFile = new File((String)localArrayList1.get(i), c());
          if (!localFile.exists())
            continue;
          b = t.a(localFile.getAbsolutePath());
          break;
        }
        if (b == null)
          for (i = 0; i < localArrayList2.size(); i++)
          {
            localFile = new File((String)localArrayList2.get(i), a());
            if (!localFile.exists())
              continue;
            b = t.a(localFile.getAbsolutePath());
            break;
          }
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
      finally
      {
        if (b == null)
          b = d();
      }
    return b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.q.d
 * JD-Core Version:    0.6.0
 */