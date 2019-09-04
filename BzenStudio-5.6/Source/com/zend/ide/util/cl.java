package com.zend.ide.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Date;

public final class cl
{
  public static final String d = new File(cv.f(), "log").getPath() + File.separator + "zde.log";
  private static cl a;
  private final ByteArrayOutputStream b = new cb(this, null);
  private PrintStream c = new PrintStream(this.b, true);
  private boolean e;

  private static cl b()
  {
    if (a == null)
      a = new cl();
    return a;
  }

  public static void a(String paramString)
  {
    b().b(paramString);
  }

  public static void a(Throwable paramThrowable)
  {
    b().b(paramThrowable);
  }

  public static void a(boolean paramBoolean)
  {
    b().b(paramBoolean);
  }

  public cl()
  {
    System.setErr(this.c);
  }

  private void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  private void b(String paramString)
  {
    synchronized (this.b)
    {
      a();
      this.c.println(paramString);
      b();
    }
  }

  private void b(Throwable paramThrowable)
  {
    synchronized (this.b)
    {
      a();
      paramThrowable.printStackTrace(this.c);
      b();
    }
  }

  private void a()
  {
    this.c.print("------------------");
    this.c.print(" NEW MESSAGE ---- ");
    this.c.print(new Date().toString());
    this.c.print("------------------");
    this.c.println();
  }

  private void b()
  {
    synchronized (this.b)
    {
      OutputStream localOutputStream = null;
      try
      {
        localOutputStream = c();
        this.c.flush();
        this.b.writeTo(localOutputStream);
        if (this.e)
          this.b.writeTo(System.out);
        this.b.reset();
        localOutputStream.flush();
      }
      catch (IOException localIOException3)
      {
      }
      finally
      {
        if (localOutputStream != null)
          try
          {
            localOutputStream.close();
          }
          catch (IOException localIOException4)
          {
          }
      }
    }
  }

  private static OutputStream c()
    throws IOException
  {
    File localFile = new File(d);
    if (!localFile.getParentFile().exists())
      localFile.getParentFile().mkdir();
    int i = localFile.length() > 495616L ? 1 : 0;
    return new PrintStream(new FileOutputStream(localFile, i == 0));
  }

  static void a(cl paramcl)
  {
    paramcl.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.cl
 * JD-Core Version:    0.6.0
 */