package com.zend.ide.o.n;

import com.zend.ide.util.cl;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class r
{
  private n a;
  private Socket b;
  private Socket c;
  private DataInputStream d;
  private DataInputStream e;
  private DataOutputStream f;
  private DataOutputStream g;
  private InetAddress h;
  private int i;
  private Thread j;
  private Thread k;
  private boolean l = true;
  private boolean m = true;
  private boolean n = o.d;
  private byte[] o = new byte[1024];
  private byte[] p;

  public r(n paramn)
  {
    this.a = paramn;
  }

  public void a(Socket paramSocket, InetAddress paramInetAddress, int paramInt)
  {
    this.b = paramSocket;
    this.h = paramInetAddress;
    this.i = paramInt;
    a();
  }

  private void a()
  {
    try
    {
      this.b.setSoTimeout(0);
      this.b.setTcpNoDelay(true);
      this.d = new DataInputStream(this.b.getInputStream());
      this.f = new DataOutputStream(this.b.getOutputStream());
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
    this.l = true;
    this.k = new Thread(new s(this));
    this.k.start();
  }

  private void b()
  {
    h();
    this.a.a();
  }

  private void c()
  {
    try
    {
      this.c = new Socket(this.h, this.i);
      this.c.setTcpNoDelay(true);
      this.e = new DataInputStream(this.c.getInputStream());
      this.g = new DataOutputStream(this.c.getOutputStream());
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
    this.m = true;
    this.j = new Thread(new t(this));
    this.j.start();
  }

  private byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[0] = (byte)(paramInt >>> 24 & 0xFF);
    arrayOfByte[1] = (byte)(paramInt >>> 16 & 0xFF);
    arrayOfByte[2] = (byte)(paramInt >>> 8 & 0xFF);
    arrayOfByte[3] = (byte)(paramInt >>> 0 & 0xFF);
    return arrayOfByte;
  }

  private boolean d()
  {
    if (this.e != null)
      try
      {
        this.e.available();
        return true;
      }
      catch (IOException localIOException)
      {
      }
    return false;
  }

  private void e()
  {
    this.m = false;
    if (this.n)
      System.out.println("*** close ZDE connection");
    f();
    if (this.c != null)
    {
      try
      {
        this.c.shutdownInput();
      }
      catch (Exception localException1)
      {
      }
      try
      {
        this.c.shutdownOutput();
      }
      catch (Exception localException2)
      {
      }
    }
    try
    {
      this.e.close();
    }
    catch (Exception localException3)
    {
    }
    try
    {
      this.g.close();
    }
    catch (Exception localException4)
    {
    }
    if (this.c != null)
      try
      {
        this.c.close();
      }
      catch (Exception localException5)
      {
      }
    this.c = null;
    this.e = null;
    this.g = null;
  }

  private void f()
  {
    try
    {
      if (this.f != null)
      {
        this.f.write(a(0));
        this.f.flush();
        if (this.n)
          System.out.println("--> sending 0 message to Tunnel");
      }
    }
    catch (IOException localIOException)
    {
    }
  }

  private void g()
  {
    if (this.n)
      System.out.println("*** close Tunnel connection");
    this.l = false;
    if (this.b != null)
    {
      try
      {
        this.b.shutdownInput();
      }
      catch (Exception localException1)
      {
      }
      try
      {
        this.b.shutdownOutput();
      }
      catch (Exception localException2)
      {
      }
    }
    try
    {
      this.d.close();
    }
    catch (Exception localException3)
    {
    }
    try
    {
      this.f.close();
    }
    catch (Exception localException4)
    {
    }
    if (this.b != null)
      try
      {
        this.b.close();
      }
      catch (Exception localException5)
      {
      }
    o.a().a().h();
    this.b = null;
    this.d = null;
    this.f = null;
  }

  public void h()
  {
    e();
    g();
  }

  public boolean i()
  {
    if ((this.b != null) && (this.d != null))
      try
      {
        this.d.available();
        return true;
      }
      catch (IOException localIOException)
      {
      }
    return false;
  }

  static boolean a(r paramr)
  {
    return paramr.l;
  }

  static DataInputStream b(r paramr)
  {
    return paramr.d;
  }

  static boolean c(r paramr)
  {
    return paramr.n;
  }

  static byte[] a(r paramr, byte[] paramArrayOfByte)
  {
    return paramr.p = paramArrayOfByte;
  }

  static byte[] d(r paramr)
  {
    return paramr.p;
  }

  static Socket e(r paramr)
  {
    return paramr.c;
  }

  static void f(r paramr)
  {
    paramr.c();
  }

  static DataOutputStream g(r paramr)
  {
    return paramr.g;
  }

  static void h(r paramr)
  {
    paramr.e();
  }

  static void i(r paramr)
  {
    paramr.b();
  }

  static boolean j(r paramr)
  {
    return paramr.m;
  }

  static boolean k(r paramr)
  {
    return paramr.d();
  }

  static boolean a(r paramr, boolean paramBoolean)
  {
    return paramr.m = paramBoolean;
  }

  static byte[] l(r paramr)
  {
    return paramr.o;
  }

  static DataInputStream m(r paramr)
  {
    return paramr.e;
  }

  static byte[] a(r paramr, int paramInt)
  {
    return paramr.a(paramInt);
  }

  static DataOutputStream n(r paramr)
  {
    return paramr.f;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.n.r
 * JD-Core Version:    0.6.0
 */