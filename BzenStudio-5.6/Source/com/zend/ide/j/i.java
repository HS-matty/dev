package com.zend.ide.j;

import com.zend.ide.util.ct;
import com.zend.ide.util.dj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class i extends f
{
  private File[] k;
  private long l = -1L;

  public i()
  {
    super("LocalFileSystem");
  }

  public char d()
  {
    return File.separatorChar;
  }

  public char a()
  {
    return File.pathSeparatorChar;
  }

  public String a(String paramString)
  {
    return new File(paramString).getPath();
  }

  public int b(String paramString)
  {
    return d() == '\\' ? 3 : 0;
  }

  public String e()
  {
    return System.getProperty("user.dir");
  }

  public boolean a(File paramFile)
  {
    return o(paramFile.getPath());
  }

  public String b(File paramFile)
  {
    return d(paramFile.getPath());
  }

  public String c(String paramString)
    throws IOException
  {
    return d(paramString);
  }

  public boolean o(String paramString)
  {
    return new File(paramString).isAbsolute();
  }

  public String d(String paramString)
  {
    return new File(paramString).getAbsolutePath();
  }

  public int c(File paramFile)
  {
    File localFile = new File(paramFile.getPath());
    int i = 0;
    if (localFile.exists())
      i |= 1;
    if (localFile.isFile())
      i |= 2;
    if (localFile.isDirectory())
      i |= 4;
    if (localFile.isHidden())
      i |= 8;
    return i;
  }

  public boolean a(File paramFile, boolean paramBoolean)
  {
    File localFile = new File(paramFile.getPath());
    if (paramBoolean)
      return localFile.canWrite();
    return localFile.canRead();
  }

  public long d(File paramFile)
  {
    File localFile = new File(paramFile.getPath());
    return localFile.lastModified();
  }

  public long e(File paramFile)
  {
    File localFile = new File(paramFile.getPath());
    return localFile.length();
  }

  public boolean e(String paramString)
    throws IOException
  {
    File localFile = new File(paramString);
    if (localFile.createNewFile())
    {
      v(new b(this, paramString));
      return true;
    }
    return false;
  }

  public File g(String paramString)
  {
    return new b(this, paramString);
  }

  public File a(String paramString1, String paramString2)
  {
    return new b(this, paramString1, paramString2);
  }

  public File a(File paramFile, String paramString)
  {
    return a(paramFile.getPath(), paramString);
  }

  public File a(String paramString, int paramInt)
  {
    return g(paramString);
  }

  public InputStream f(String paramString)
    throws IOException
  {
    return new FileInputStream(paramString);
  }

  public OutputStream a(String paramString, boolean paramBoolean)
    throws IOException
  {
    return new FileOutputStream(paramString);
  }

  public InputStream f(File paramFile)
    throws IOException
  {
    return f(paramFile.getAbsolutePath());
  }

  public OutputStream b(File paramFile, boolean paramBoolean)
    throws IOException
  {
    return a(paramFile.getAbsolutePath(), true);
  }

  public boolean g(File paramFile)
  {
    return c(paramFile, true);
  }

  public boolean c(File paramFile, boolean paramBoolean)
  {
    File localFile = new File(paramFile.getPath());
    boolean bool1 = false;
    boolean bool2 = false;
    try
    {
      if (this.a != null)
        bool2 = this.a.c(paramFile);
      bool1 = localFile.delete();
      if ((bool1) && (paramBoolean))
        w(paramFile);
      if (!bool1)
      {
        if (paramFile.isDirectory())
          throw new dj(ct.a(1024, paramFile.getPath()));
        throw new dj(ct.a(747, paramFile.getPath()));
      }
      boolean bool3 = bool1;
      return bool3;
    }
    finally
    {
      if ((!bool1) && (bool2))
        this.a.b(paramFile);
    }
    throw localObject;
  }

  public boolean h(File paramFile)
  {
    File localFile = new File(paramFile.getPath());
    localFile.deleteOnExit();
    return true;
  }

  public String[] i(File paramFile)
  {
    File localFile = new File(paramFile.getPath());
    return localFile.list();
  }

  public boolean j(File paramFile)
  {
    File localFile = new File(paramFile.getPath());
    if (localFile.mkdir())
    {
      v(new b(this, paramFile.getPath()));
      return true;
    }
    return false;
  }

  public boolean a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    File localFile1 = new File(paramFile1.getPath());
    File localFile2 = new File(paramFile2.getPath());
    if (localFile1.getPath().equals(localFile2.getPath()))
      return true;
    if (localFile1.renameTo(localFile2))
    {
      if (paramBoolean)
        d(paramFile1, paramFile2);
      return true;
    }
    return false;
  }

  public boolean a(File paramFile, long paramLong)
  {
    File localFile = new File(paramFile.getPath());
    return localFile.setLastModified(paramLong);
  }

  public boolean k(File paramFile)
  {
    File localFile = new File(paramFile.getPath());
    return localFile.setReadOnly();
  }

  public File[] b()
  {
    long l1 = System.currentTimeMillis();
    if ((this.k == null) || (l1 - this.l > 2000L))
    {
      this.k = f();
      this.l = l1;
    }
    return this.k;
  }

  private File[] f()
  {
    File[] arrayOfFile1 = File.listRoots();
    if (arrayOfFile1 == null)
      return null;
    ArrayList localArrayList = new ArrayList(arrayOfFile1.length);
    for (int i = 0; i < arrayOfFile1.length; i++)
    {
      c localc = new c(this, arrayOfFile1[i].getPath());
      localArrayList.add(localc);
    }
    File[] arrayOfFile2 = new File[localArrayList.size()];
    localArrayList.toArray(arrayOfFile2);
    return arrayOfFile2;
  }

  public int a(File paramFile1, File paramFile2)
  {
    File localFile1 = new File(paramFile1.getPath());
    File localFile2 = new File(paramFile2.getPath());
    return localFile1.compareTo(localFile2);
  }

  public int l(File paramFile)
  {
    File localFile = new File(paramFile.getPath());
    return localFile.hashCode();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.i
 * JD-Core Version:    0.6.0
 */