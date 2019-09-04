package com.zend.ide.f.zc.b;

import com.zend.ide.f.zc.a.b;
import com.zend.ide.util.cr;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class j
  implements d
{
  private final String a;
  private final File b;
  private d c;
  static final boolean d = !j.class.desiredAssertionStatus();

  public j(String paramString, File paramFile)
    throws IOException
  {
    if ((!d) && ((paramFile == null) || (!paramFile.isDirectory())))
      throw new AssertionError();
    if (c(paramFile) == null)
      throw new IOException("Cannot load the given JRE");
    this.b = paramFile;
    this.a = paramString;
  }

  public void a()
  {
    this.c = null;
  }

  private void b()
  {
    try
    {
      this.c = h.a(this.a, a(this.b));
    }
    catch (IOException localIOException)
    {
    }
  }

  public File c()
  {
    return this.b;
  }

  public static final File[] a(File paramFile)
  {
    paramFile = c(paramFile);
    if ((!d) && (paramFile == null))
      throw new AssertionError();
    File localFile = a(paramFile, "lib");
    File[] arrayOfFile1 = b(localFile);
    if (cr.c() == 3)
    {
      localObject1 = System.getProperty("sun.boot.class.path");
      if (localObject1 != null)
      {
        localObject2 = ((String)localObject1).split(":");
        ArrayList localArrayList = new ArrayList(localObject2.length);
        for (int i = 0; i < localObject2.length; i++)
        {
          if ((localObject2[i] == null) || ((!localObject2[i].endsWith(".jar")) && (!localObject2[i].endsWith(".zip"))))
            continue;
          localArrayList.add(new File(localObject2[i]));
        }
        File[] arrayOfFile2 = new File[localArrayList.size()];
        localArrayList.toArray(arrayOfFile2);
        arrayOfFile1 = a(arrayOfFile2, arrayOfFile1);
      }
    }
    Object localObject1 = a(localFile, "ext");
    Object localObject2 = b((File)localObject1);
    return (File)(File)a(arrayOfFile1, localObject2);
  }

  private static File[] a(File[] paramArrayOfFile1, File[] paramArrayOfFile2)
  {
    File[] arrayOfFile = new File[paramArrayOfFile1.length + paramArrayOfFile2.length];
    System.arraycopy(paramArrayOfFile1, 0, arrayOfFile, 0, paramArrayOfFile1.length);
    System.arraycopy(paramArrayOfFile2, 0, arrayOfFile, paramArrayOfFile1.length, paramArrayOfFile2.length);
    return arrayOfFile;
  }

  public static File[] b(File paramFile)
  {
    if ((!d) && ((paramFile == null) || (!paramFile.isDirectory())))
      throw new AssertionError();
    return paramFile.listFiles(new k());
  }

  public static File c(File paramFile)
  {
    if ((!d) && ((paramFile == null) || (!paramFile.isDirectory())))
      throw new AssertionError();
    boolean bool = d(paramFile);
    if (!bool)
      paramFile = new File(paramFile, "/jre");
    return d(paramFile) ? paramFile : null;
  }

  private static boolean d(File paramFile)
  {
    File localFile1 = a(paramFile, "bin");
    File localFile2 = a(paramFile, "lib");
    return (localFile1 != null) && (localFile2 != null) && (a(localFile2, "ext") != null);
  }

  private static File a(File paramFile, String paramString)
  {
    if ((paramFile == null) || (!paramFile.isDirectory()))
      return null;
    File[] arrayOfFile = paramFile.listFiles();
    for (int i = 0; i < arrayOfFile.length; i++)
    {
      File localFile = arrayOfFile[i];
      if ((localFile.isDirectory()) && (localFile.getName().equals(paramString)))
        return localFile;
    }
    return null;
  }

  public final Class[] a(String[] paramArrayOfString)
    throws ClassNotFoundException
  {
    if (this.c == null)
      b();
    return this.c.a(paramArrayOfString);
  }

  public final b a()
  {
    if (this.c == null)
      b();
    return this.c.a();
  }

  public String d()
  {
    return this.a;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if ((paramObject instanceof j))
    {
      j localj = (j)paramObject;
      return localj.d().equals(d());
    }
    return false;
  }

  public int hashCode()
  {
    return d().hashCode() + c().hashCode();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.b.j
 * JD-Core Version:    0.6.0
 */