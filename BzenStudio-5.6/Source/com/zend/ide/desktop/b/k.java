package com.zend.ide.desktop.b;

import com.zend.ide.desktop.l;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;

public class k
{
  private Socket a;
  private DataOutputStream b;
  private int c = -1;
  private l d;

  public k(l paraml)
  {
    this.d = paraml;
  }

  private static int g()
  {
    FileReader localFileReader = null;
    try
    {
      localFileReader = new FileReader(b.j);
      BufferedReader localBufferedReader = new BufferedReader(localFileReader);
      String str = localBufferedReader.readLine();
      return Integer.parseInt(str);
    }
    catch (Exception localException)
    {
      if (localFileReader != null)
        try
        {
          localFileReader.close();
        }
        catch (IOException localIOException)
        {
        }
    }
    return -1;
  }

  private int c()
  {
    int i = n.d;
    if (this.d.e() != null)
      i = e.e;
    if (this.d.f())
      i = d.e;
    return i;
  }

  public boolean d()
  {
    try
    {
      if (this.c == -1)
        this.c = g();
      if (this.c == -1)
        return false;
      if (this.a == null)
      {
        localObject = InetAddress.getLocalHost();
        this.a = new Socket((InetAddress)localObject, this.c);
      }
      Object localObject = this.a.getOutputStream();
      this.b = new DataOutputStream((OutputStream)localObject);
      InputStream localInputStream = this.a.getInputStream();
      new DataInputStream(localInputStream);
    }
    catch (Exception localException)
    {
      this.a = null;
      return false;
    }
    return true;
  }

  public void e()
  {
    try
    {
      if (this.a != null)
        this.a.close();
    }
    catch (Exception localException)
    {
    }
  }

  public void f()
  {
    try
    {
      int i = c();
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
      c localc = (c)new j().a(i);
      a locala = new a();
      if (i == n.d)
      {
        localc.a("");
        localDataOutputStream.writeShort(localc.g());
        locala.a(localc, localDataOutputStream);
        localDataOutputStream.flush();
        synchronized (this.b)
        {
          this.b.writeInt(localByteArrayOutputStream.size());
          localByteArrayOutputStream.writeTo(this.b);
          this.b.flush();
        }
        localByteArrayOutputStream.reset();
      }
      else
      {
        __x = this.d.e();
        for (int j = 0; j < __x.length; j++)
        {
          localc.a(__x[j]);
          localDataOutputStream.writeShort(localc.g());
          locala.a(localc, localDataOutputStream);
          localDataOutputStream.flush();
          synchronized (this.b)
          {
            this.b.writeInt(localByteArrayOutputStream.size());
            localByteArrayOutputStream.writeTo(this.b);
            this.b.flush();
          }
          localByteArrayOutputStream.reset();
        }
      }
    }
    catch (ConnectException localConnectException)
    {
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.b.k
 * JD-Core Version:    0.6.0
 */