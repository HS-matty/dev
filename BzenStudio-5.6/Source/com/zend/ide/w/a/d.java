package com.zend.ide.w.a;

import com.zend.ide.desktop.cj;
import com.zend.ide.desktop.e.o.f;
import com.zend.ide.l.v;
import com.zend.ide.util.bh;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.dj;
import com.zend.ide.w.b.bi;
import com.zend.ide.w.bb;
import com.zend.ide.w.k;
import com.zend.ide.w.kb;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class d extends c
{
  private static final String k = ct.a(669);
  private ca j;
  private k l = new f(paramcj, this);
  private kb m;
  private static v n;

  public d(cj paramcj)
  {
    n = paramcj.l();
    e();
  }

  private static void b(Object paramObject)
  {
    if (!(paramObject instanceof l))
      throw new IllegalArgumentException("params must be instance of CVSCommandArguments");
  }

  public String a()
  {
    return k;
  }

  public void a(boolean paramBoolean)
  {
    this.l.a(paramBoolean);
  }

  public com.zend.ide.y.a b()
  {
    return this.l.a();
  }

  public int a(String paramString, Object paramObject)
  {
    return this.e.a(paramString);
  }

  public void b(File[] paramArrayOfFile)
  {
    l locall = h().t();
    if (locall == null)
      return;
    b().a();
    a(paramArrayOfFile, locall);
  }

  public void a(File[] paramArrayOfFile, Object paramObject)
  {
    b(paramObject);
    l locall = (l)paramObject;
    if (locall == null)
      locall = new l(0);
    a(paramArrayOfFile, locall, true);
  }

  public void c(File[] paramArrayOfFile)
  {
    l locall = h().b();
    if (locall == null)
      return;
    b().a();
    b(paramArrayOfFile, locall);
  }

  public void b(File[] paramArrayOfFile, Object paramObject)
  {
    b(paramObject);
    l locall = (l)paramObject;
    if (locall == null)
      locall = new l(1);
    a(paramArrayOfFile, locall, true);
  }

  public void d(File[] paramArrayOfFile)
  {
    l locall = h().a(paramArrayOfFile);
    if (locall == null)
      return;
    b().a();
    c(paramArrayOfFile, locall);
  }

  public void c(File[] paramArrayOfFile, Object paramObject)
  {
    b(paramObject);
    l locall = (l)paramObject;
    if (locall == null)
      locall = new l(2);
    a(paramArrayOfFile, locall, true);
  }

  public void g(File paramFile)
  {
    l locall = h().p();
    if (locall == null)
      return;
    b().a();
    c(paramFile, locall);
  }

  public void c(File paramFile, Object paramObject)
  {
    b(paramObject);
    l locall = (l)paramObject;
    if (locall == null)
      locall = new l(6);
    a(new File[] { paramFile }, locall, true);
  }

  public void e(File[] paramArrayOfFile)
  {
    l locall = h().c();
    if (locall == null)
      return;
    b().a();
    d(paramArrayOfFile, locall);
  }

  public void d(File[] paramArrayOfFile, Object paramObject)
  {
    b(paramObject);
    l locall = (l)paramObject;
    if (locall == null)
      locall = new l(3);
    a(paramArrayOfFile, locall, true);
  }

  public void d(File paramFile)
  {
    l locall = h().a(paramFile);
    if (locall == null)
      return;
    b().a();
    a(paramFile, locall);
  }

  public void a(File paramFile, Object paramObject)
  {
    b(paramObject);
    l locall = (l)paramObject;
    File localFile = locall.o();
    if ((!localFile.exists()) && (!f(localFile)))
      throw new dj(ct.a(886, localFile.getPath()));
    if (localFile.isFile())
      throw new dj(ct.a(886, localFile.getPath()));
    String str = d() + locall.toString();
    String[] arrayOfString1 = locall.p();
    String[] arrayOfString2 = a(arrayOfString1, new String[0]);
    cb localcb = null;
    try
    {
      localcb = new cb(locall.m());
    }
    catch (Exception localException)
    {
      return;
    }
    a(arrayOfString2, localFile, str, localcb, true);
  }

  private boolean f(File paramFile)
  {
    boolean bool = true;
    if ((paramFile != null) && (paramFile.getParentFile() != null) && (!paramFile.getParentFile().exists()))
      bool = f(paramFile.getParentFile());
    if ((paramFile == null) || (paramFile.getParentFile() == null) || (!bool))
      return false;
    bool = paramFile.mkdir();
    return bool;
  }

  public void e(File paramFile)
  {
    l locall = h().a(!p.d());
    if (locall == null)
      return;
    b().a();
    b(paramFile, locall);
  }

  public void b(File paramFile, Object paramObject)
  {
    b(paramObject);
    l locall = (l)paramObject;
    if (locall == null)
      locall = new l(5);
    if (p.d())
    {
      locall.d("");
      locall.i("-f");
    }
    else
    {
      locall.i(null);
    }
    boolean bool = a(new File[] { paramFile }, locall, !p.d());
    if (bool)
    {
      String str = this.j.c();
      String[] arrayOfString = str.split("\n*\r*\n+\r*", 4);
      Object localObject1;
      Object localObject2;
      if (arrayOfString.length > 3)
      {
        localObject1 = arrayOfString[1].toLowerCase();
        if (((String)localObject1).startsWith("cvs"))
          if (((String)localObject1).startsWith("cvs server: i know nothing"))
          {
            if (arrayOfString[2].toLowerCase().startsWith("cvs"))
              return;
          }
          else
            return;
      }
      else if (arrayOfString.length == 2)
      {
        localObject1 = arrayOfString[0].toLowerCase();
        if ((((String)localObject1).startsWith("cvs [server aborted]: no such tag")) || (((String)localObject1).indexOf("[diff aborted]") > -1))
        {
          if (p.d())
            synchronized (a())
            {
              localObject2 = a().a();
              int i = ((String)localObject2).indexOf('\n');
              if (i > -1)
                a().a(str, "server", i);
              else
                a().a('\n' + str, "server");
            }
          return;
        }
      }
      if (p.d())
        try
        {
          localObject1 = new FileInputStream(paramFile);
          __x = null;
          localObject2 = bh.a();
          if (!((bh)localObject2).equals(bh.a))
            try
            {
              __x = new InputStreamReader((InputStream)localObject1, ((bh)localObject2).c());
            }
            catch (UnsupportedEncodingException localUnsupportedEncodingException)
            {
            }
          if (__x == null)
            __x = new InputStreamReader((InputStream)localObject1);
          bi.a(new t(), (Reader)__x, str, paramFile.getName());
        }
        catch (Exception localException)
        {
          cl.a(localException);
        }
    }
  }

  private boolean a(cb paramcb)
  {
    cf localcf = h().u();
    localcf.a(paramcb.toString());
    while (true)
    {
      localcf.setVisible(true);
      if (localcf.a() == 0)
        return false;
      String str1 = localcf.j();
      str1 = cc.a(str1, 'A');
      Object localObject1 = null;
      OutputStreamWriter localOutputStreamWriter = null;
      try
      {
        Socket localSocket = new Socket(paramcb.d(), 2401);
        localOutputStreamWriter = new OutputStreamWriter(localSocket.getOutputStream());
        String str2 = "BEGIN AUTH REQUEST\n" + paramcb.c() + "\n" + paramcb.b() + "\n" + str1 + "\n" + "END AUTH REQUEST\n";
        localOutputStreamWriter.write(str2);
        localOutputStreamWriter.flush();
        BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localSocket.getInputStream()));
        String str3 = localBufferedReader.readLine();
        if (str3.equals("I LOVE YOU"))
        {
          a(paramcb.toString(), str1);
          int i1 = 1;
          return i1;
        }
      }
      catch (Exception localException)
      {
        cl.a(localException);
        int i = 0;
        return i;
      }
      finally
      {
        if (localOutputStreamWriter != null)
          try
          {
            localOutputStreamWriter.close();
          }
          catch (IOException localIOException7)
          {
            cl.a(localIOException7);
          }
        if (localObject1 != null)
          try
          {
            localObject1.close();
          }
          catch (IOException localIOException8)
          {
            cl.a(localIOException8);
          }
      }
    }
  }

  private void a(String paramString1, String paramString2)
    throws IOException
  {
    File localFile = new File(g);
    ArrayList localArrayList = new ArrayList(5);
    String str1 = System.getProperty("line.separator");
    if (localFile.exists())
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader(g));
      String str2 = null;
      while ((str2 = localBufferedReader.readLine()) != null)
        localArrayList.add(str2);
      localBufferedReader.close();
    }
    int i = 0;
    for (int i1 = 0; i1 < localArrayList.size(); i1++)
    {
      String str3 = (String)localArrayList.get(i1);
      int i3 = str3.lastIndexOf(' ');
      if (i3 > 0)
        str3 = str3.substring(0, i3);
      if (!str3.equals(paramString1))
        continue;
      localArrayList.set(i1, paramString1 + ' ' + paramString2);
      i = 1;
      break;
    }
    FileWriter localFileWriter = null;
    if (i != 0)
    {
      localFileWriter = new FileWriter(g);
      for (int i2 = 0; i2 < localArrayList.size(); i2++)
        localFileWriter.write((String)localArrayList.get(i2) + str1);
    }
    else
    {
      localFileWriter = new FileWriter(g, true);
      localFileWriter.write(paramString1 + ' ' + paramString2 + str1);
    }
    localFileWriter.flush();
    localFileWriter.close();
  }

  private static String a(String paramString, String[] paramArrayOfString, File[] paramArrayOfFile)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      localStringBuffer.append(" ");
      localStringBuffer.append(paramArrayOfString[i]);
    }
    localStringBuffer.append(" ");
    for (i = 0; i < paramArrayOfFile.length; i++)
    {
      localStringBuffer.append(" ");
      localStringBuffer.append(paramArrayOfFile[i].getPath());
    }
    return localStringBuffer.toString();
  }

  private String[] a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(d());
    for (int i = 0; i < paramArrayOfString1.length; i++)
      localArrayList.add(paramArrayOfString1[i]);
    for (i = 0; i < paramArrayOfString2.length; i++)
      localArrayList.add(paramArrayOfString2[i]);
    String[] arrayOfString = new String[localArrayList.size()];
    localArrayList.toArray(arrayOfString);
    return arrayOfString;
  }

  private static String[] g(File[] paramArrayOfFile)
  {
    String[] arrayOfString = new String[paramArrayOfFile.length];
    for (int i = 0; i < paramArrayOfFile.length; i++)
    {
      File localFile = paramArrayOfFile[i];
      String str1 = localFile.getPath();
      String str2 = z.a(localFile, n.f()).getPath();
      if (str1.equals(str2))
      {
        arrayOfString[i] = ".";
      }
      else
      {
        int i1 = str1.indexOf(str2);
        i1 = i1 != -1 ? i1 : 0;
        int i2 = str2.endsWith(File.separator) ? str2.length() + 1 : str2.length();
        String str3 = "." + str1.substring(i1 + i2, str1.length());
        arrayOfString[i] = str3;
      }
    }
    return arrayOfString;
  }

  private static String h(File paramFile)
  {
    File localFile1 = new File(paramFile, "CVS");
    String str = "";
    BufferedReader localBufferedReader = null;
    if (!localFile1.exists())
      return str;
    File localFile2 = new File(localFile1, "Root");
    if (!localFile2.exists())
      return str;
    try
    {
      localBufferedReader = new BufferedReader(new FileReader(localFile2));
      str = localBufferedReader.readLine();
    }
    catch (Exception localIOException2)
    {
      cl.a(localException);
    }
    finally
    {
      if (localBufferedReader != null)
        try
        {
          localBufferedReader.close();
        }
        catch (IOException localIOException3)
        {
          cl.a(localIOException3);
        }
    }
    return str;
  }

  private boolean a(File[] paramArrayOfFile, l paraml, boolean paramBoolean)
  {
    String[] arrayOfString1 = paraml.p();
    File localFile = z.a(paramArrayOfFile[0], n.f());
    String str = a(d(), arrayOfString1, paramArrayOfFile);
    String[] arrayOfString2 = a(arrayOfString1, g(paramArrayOfFile));
    cb localcb = null;
    try
    {
      localcb = new cb(h(localFile));
    }
    catch (Exception localException)
    {
      return false;
    }
    boolean bool = a(arrayOfString2, localFile, str, localcb, paramBoolean);
    if ((bool) && (this.m != null))
      this.m.a(paramArrayOfFile);
    return bool;
  }

  private boolean a(String[] paramArrayOfString, File paramFile, String paramString, cb paramcb, boolean paramBoolean)
  {
    int i = 0;
    a().a(paramString + "\n", "command");
    int i1 = -1;
    try
    {
      i1 = a(paramArrayOfString, paramFile, paramBoolean);
      i = 1;
    }
    catch (a locala1)
    {
      if (a(paramcb))
        try
        {
          i1 = a(paramArrayOfString, paramFile, paramBoolean);
          i = 1;
        }
        catch (a locala2)
        {
          cl.a(locala1);
        }
        catch (IOException localIOException2)
        {
          cl.a(localIOException2);
        }
    }
    catch (IOException localIOException1)
    {
      b();
    }
    a(i1);
    return i;
  }

  private int a(String[] paramArrayOfString, File paramFile, boolean paramBoolean)
    throws IOException, a
  {
    Process localProcess = Runtime.getRuntime().exec(paramArrayOfString, this.h, paramFile);
    return i().a(localProcess, paramBoolean);
  }

  private void a(int paramInt)
  {
    String str;
    if (paramInt >= 0)
      str = "cvs command finished with exit code " + paramInt;
    else
      str = "cvs command finished execution";
    a().a("\n" + str, "command");
  }

  public Object g()
  {
    bc localbc = new bc();
    localbc.a(h().q());
    return localbc;
  }

  public void a(Object paramObject)
  {
    bc localbc = (bc)paramObject;
    h().a(localbc.c());
  }

  private ca i()
  {
    if (this.j == null)
      this.j = new ca(a());
    return this.j;
  }

  public String toString()
  {
    return a();
  }

  public void a(kb paramkb)
  {
    this.m = paramkb;
  }

  public String e()
  {
    return "CVS";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.d
 * JD-Core Version:    0.6.0
 */