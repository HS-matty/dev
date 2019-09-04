package com.zend.ide.w.c.b;

import com.zend.ide.util.cl;
import com.zend.ide.w.bb;
import com.zend.ide.w.c.d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

class b
{
  private long a = 180000L;
  private String b;
  private String c;
  private int d;
  private byte[] e = new byte[0];
  private bb f;
  private d g;
  private File[] h;

  public b(d paramd, File[] paramArrayOfFile)
  {
    this.g = paramd;
    this.h = paramArrayOfFile;
    this.f = paramd.a();
  }

  public String a()
  {
    return this.b;
  }

  public String b()
  {
    return this.c;
  }

  public synchronized void a(String paramString1, String paramString2, String paramString3, String[] paramArrayOfString)
    throws y
  {
    Runtime localRuntime = Runtime.getRuntime();
    Process localProcess = null;
    this.g.a(this.h);
    try
    {
      File localFile;
      if (paramString1 != null)
      {
        localFile = new File(paramString1);
        if (!localFile.exists())
          localFile = new File(System.getProperty("user.home"));
      }
      else
      {
        localFile = new File(System.getProperty("user.home"));
      }
      String[] arrayOfString = null;
      if (paramArrayOfString == null)
      {
        arrayOfString = new String[] { paramString2, paramString3 };
      }
      else
      {
        arrayOfString = new String[2 + paramArrayOfString.length];
        arrayOfString[0] = paramString2;
        arrayOfString[1] = paramString3;
        System.arraycopy(paramArrayOfString, 0, arrayOfString, 2, paramArrayOfString.length);
      }
      localProcess = localRuntime.exec(arrayOfString, null, localFile);
      InputStream localInputStream1 = localProcess.getInputStream();
      InputStream localInputStream2 = localProcess.getErrorStream();
      StringBuffer localStringBuffer1 = new StringBuffer(1024);
      StringBuffer localStringBuffer2 = new StringBuffer(1024);
      this.d = 2;
      Thread localThread1 = new Thread(new c(localInputStream1, localStringBuffer1, this.f, this, "out"));
      Thread localThread2 = new Thread(new c(localInputStream2, localStringBuffer2, this.f, this, "err"));
      localThread1.start();
      localThread2.start();
      while (true)
        try
        {
          synchronized (this.e)
          {
            if (this.d == 0)
              break;
            this.e.wait(this.a);
          }
          continue;
        }
        catch (InterruptedException localInterruptedException)
        {
          cl.a(localInterruptedException);
        }
      this.b = localStringBuffer1.toString();
      this.c = localStringBuffer2.toString();
    }
    catch (IOException localFile)
    {
      synchronized (this.f)
      {
        this.f.a(((IOException)__x).getMessage() + '\n', "server");
      }
    }
    finally
    {
      if (localProcess != null)
        localProcess.destroy();
      synchronized (this.f)
      {
        this.f.a("svn command finished execution\n", "command");
      }
      this.g.b(this.h);
    }
  }

  public void c()
  {
    synchronized (this.e)
    {
      this.d -= 1;
      this.e.notify();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.b
 * JD-Core Version:    0.6.0
 */