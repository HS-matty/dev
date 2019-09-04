package com.zend.ide.w.a;

import com.zend.ide.w.cb;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

class ba
{
  private File a;
  private String b;
  private long c;
  private DateFormat d;

  public ba(File paramFile)
  {
    this.a = paramFile;
    this.d = DateFormat.getTimeInstance(0);
    c();
  }

  public boolean a(File paramFile)
  {
    if (!d())
      return false;
    String str = '/' + paramFile.getName() + '/';
    return this.b.indexOf(str) != -1;
  }

  public long a(File paramFile)
  {
    if (!d())
      return -1L;
    int i = this.b.indexOf(paramFile.getName());
    int j = this.b.indexOf("\n", i);
    String str1 = this.b.substring(i, j);
    String[] arrayOfString = str1.split("/");
    String str2 = arrayOfString[2];
    try
    {
      return cb.a(str2).getTime();
    }
    catch (ParseException localParseException)
    {
    }
    return -1L;
  }

  public boolean b(File paramFile)
  {
    if (!d())
      return false;
    String str = '/' + paramFile.getName() + "/0/";
    return this.b.indexOf(str) == -1;
  }

  public boolean c(File paramFile)
  {
    if (!d())
      return false;
    int i = this.b.indexOf(paramFile.getName());
    int j = this.b.indexOf("\n", i);
    String str = this.b.substring(i, j);
    return str.indexOf("Result of merge+") != -1;
  }

  private boolean d()
  {
    c();
    return this.c > 0L;
  }

  private void b()
  {
    this.b = "";
    this.c = -1L;
  }

  private void c()
  {
    long l;
    try
    {
      l = this.a.lastModified();
      if (l == this.c)
        return;
    }
    catch (Exception localException1)
    {
      b();
      return;
    }
    FileInputStream localFileInputStream = null;
    try
    {
      localFileInputStream = new FileInputStream(this.a);
      byte[] arrayOfByte = new byte[localFileInputStream.available()];
      localFileInputStream.read(arrayOfByte, 0, arrayOfByte.length);
      this.b = new String(arrayOfByte);
      this.c = l;
    }
    catch (Exception localIOException2)
    {
      b();
    }
    finally
    {
      if (localFileInputStream != null)
        try
        {
          localFileInputStream.close();
        }
        catch (IOException localIOException3)
        {
        }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.ba
 * JD-Core Version:    0.6.0
 */