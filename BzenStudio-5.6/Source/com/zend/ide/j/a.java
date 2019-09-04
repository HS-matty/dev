package com.zend.ide.j;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public abstract class a extends File
{
  private String a;
  private int b;
  public char c;
  public String d = null;
  public char e;
  public String f = null;
  private static final Object g = new Object();
  private static int h = -1;

  int getPrefixLength()
  {
    return this.b;
  }

  private a(s params)
  {
    super("", "");
    a(params);
    this.c = c().d();
    this.d = ("" + this.c);
    this.e = c().a();
    this.f = ("" + this.e);
  }

  public a(s params, String paramString, int paramInt)
  {
    this(params);
    this.a = paramString;
    this.b = paramInt;
  }

  public a(s params, String paramString)
  {
    this(params);
    if (paramString == null)
      throw new NullPointerException();
    this.a = c().a(paramString);
    this.b = c().b(this.a);
  }

  public String getName()
  {
    int i = this.a.lastIndexOf(this.c);
    if (i < this.b)
      return this.a.substring(this.b);
    return this.a.substring(i + 1);
  }

  public String getParent()
  {
    int i = this.a.lastIndexOf(this.c);
    if (i < this.b)
    {
      if ((this.b > 0) && (this.a.length() > this.b))
        return this.a.substring(0, this.b);
      return null;
    }
    return this.a.substring(0, i);
  }

  public File getParentFile()
  {
    String str = getParent();
    if (str == null)
      return null;
    return c().a(str, this.b);
  }

  public String getPath()
  {
    return this.a;
  }

  public boolean isAbsolute()
  {
    return c().a(this);
  }

  public String getAbsolutePath()
  {
    return c().b(this);
  }

  public File getAbsoluteFile()
  {
    return c().g(getAbsolutePath());
  }

  public String getCanonicalPath()
    throws IOException
  {
    s locals = c();
    return locals.c(locals.b(this));
  }

  public File getCanonicalFile()
    throws IOException
  {
    return c().g(getCanonicalPath());
  }

  public URL toURL()
    throws MalformedURLException
  {
    String str = getAbsolutePath();
    char c1 = c().d();
    if (c1 != '/')
      str = str.replace(c1, '/');
    if (!str.startsWith("/"))
      str = "/" + str;
    if ((!str.endsWith("/")) && (isDirectory()))
      str = str + "/";
    return new URL("file", "", str);
  }

  public boolean canRead()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkRead(this.a);
    return c().a(this, false);
  }

  public boolean canWrite()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkWrite(this.a);
    return c().a(this, true);
  }

  public boolean exists()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkRead(this.a);
    return (c().c(this) & 0x1) != 0;
  }

  public boolean isDirectory()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkRead(this.a);
    return (c().c(this) & 0x4) != 0;
  }

  public boolean isFile()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkRead(this.a);
    return (c().c(this) & 0x2) != 0;
  }

  public boolean isHidden()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkRead(this.a);
    return (c().c(this) & 0x8) != 0;
  }

  public long lastModified()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkRead(this.a);
    return c().d(this);
  }

  public long length()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkRead(this.a);
    return c().e(this);
  }

  public boolean createNewFile()
    throws IOException
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkWrite(this.a);
    return c().e(this.a);
  }

  public boolean delete()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkDelete(this.a);
    return c().g(this);
  }

  public void deleteOnExit()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkDelete(this.a);
    c().h(this);
  }

  public String[] list()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkRead(this.a);
    return c().i(this);
  }

  public String[] list(FilenameFilter paramFilenameFilter)
  {
    String[] arrayOfString = list();
    if ((arrayOfString == null) || (paramFilenameFilter == null))
      return arrayOfString;
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < arrayOfString.length; i++)
    {
      if (!paramFilenameFilter.accept(this, arrayOfString[i]))
        continue;
      localArrayList.add(arrayOfString[i]);
    }
    return (String[])(String[])localArrayList.toArray(new String[0]);
  }

  public File[] listFiles()
  {
    String[] arrayOfString = list();
    if (arrayOfString == null)
      return null;
    int i = arrayOfString.length;
    File[] arrayOfFile = new File[i];
    for (int j = 0; j < i; j++)
      arrayOfFile[j] = c().a(getPath(), arrayOfString[j]);
    return arrayOfFile;
  }

  public File[] listFiles(FilenameFilter paramFilenameFilter)
  {
    String[] arrayOfString = list();
    if (arrayOfString == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < arrayOfString.length; i++)
    {
      if ((paramFilenameFilter != null) && (!paramFilenameFilter.accept(this, arrayOfString[i])))
        continue;
      localArrayList.add(c().a(this.a, arrayOfString[i]));
    }
    return (File[])(File[])localArrayList.toArray(new a[0]);
  }

  public File[] listFiles(FileFilter paramFileFilter)
  {
    String[] arrayOfString = list();
    if (arrayOfString == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < arrayOfString.length; i++)
    {
      File localFile = c().a(this.a, arrayOfString[i]);
      if ((paramFileFilter != null) && (!paramFileFilter.accept(localFile)))
        continue;
      localArrayList.add(localFile);
    }
    return (File[])(File[])localArrayList.toArray(new a[0]);
  }

  public boolean mkdir()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkWrite(this.a);
    return c().j(this);
  }

  public boolean mkdirs()
  {
    if (exists())
      return false;
    if (mkdir())
      return true;
    String str = getParent();
    return (str != null) && (c().g(str).mkdirs()) && (mkdir());
  }

  public boolean renameTo(File paramFile)
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
    {
      localSecurityManager.checkWrite(this.a);
      localSecurityManager.checkWrite(paramFile.getPath());
    }
    return c().a(this, paramFile, true);
  }

  public boolean setLastModified(long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Negative time");
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkWrite(this.a);
    return c().a(this, paramLong);
  }

  public boolean setReadOnly()
  {
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
      localSecurityManager.checkWrite(this.a);
    return c().k(this);
  }

  public abstract s c();

  public abstract void a(s params);

  public int compareTo(File paramFile)
  {
    return c().a(this, paramFile);
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof File)))
      return compareTo((File)paramObject) == 0;
    return false;
  }

  public int hashCode()
  {
    return c().l(this);
  }

  public String toString()
  {
    return getPath();
  }

  private synchronized void writeObject(ObjectOutputStream paramObjectOutputStream)
    throws IOException
  {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeChar(this.c);
  }

  private synchronized void readObject(ObjectInputStream paramObjectInputStream)
    throws IOException, ClassNotFoundException
  {
    paramObjectInputStream.defaultReadObject();
    char c1 = paramObjectInputStream.readChar();
    if (c1 != this.c)
      this.a = this.a.replace(c1, this.c);
  }

  public int compareTo(Object paramObject)
  {
    return compareTo((File)paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.a
 * JD-Core Version:    0.6.0
 */