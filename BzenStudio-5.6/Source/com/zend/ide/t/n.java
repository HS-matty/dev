package com.zend.ide.t;

import com.zend.ide.util.cl;
import com.zend.ide.util.d.a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class n extends m
{
  private ServerSocket i;
  private Socket j;
  private DataInputStream k;
  private DataOutputStream l;
  private a m = new a();
  private a n = new a();
  private Hashtable o = new Hashtable();
  private u p;
  private v q;
  private t r;
  private ByteArrayOutputStream s = new ByteArrayOutputStream();
  private DataOutputStream t = new DataOutputStream(this.s);
  private int u = 1000;
  private int v = -1;
  private Object w = new Object();
  private boolean x = false;
  private static boolean h = System.getProperty("loggingDebug") != null;
  private static boolean g = System.getProperty("debugMode") != null;
  private boolean y = false;

  public void b(Object paramObject)
  {
    try
    {
      synchronized (this.s)
      {
        this.s.reset();
        this.t.writeShort(((o)paramObject).g());
        b().a(paramObject, this.t);
        synchronized (this.l)
        {
          this.l.writeInt(this.s.size());
          if (h)
            System.out.println("sending notification request size=" + this.s.size());
          this.s.writeTo(this.l);
          this.l.flush();
        }
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public Object a(Object paramObject)
    throws Exception
  {
    try
    {
      r localr = (r)paramObject;
      synchronized (this.s)
      {
        this.s.reset();
        this.t.writeShort(localr.g());
        localr.a(this.u++);
        this.t.writeInt(localr.b());
        b().a(localr, this.t);
        int i1 = this.s.size();
        if (h)
          System.out.println("sending message request size=" + i1);
        synchronized (this.l)
        {
          this.m.a(localr.b(), localr);
          this.l.writeInt(i1);
          this.s.writeTo(this.l);
          this.l.flush();
        }
      }
      __a = null;
      while ((__a == null) && (h()))
      {
        synchronized (paramObject)
        {
          __a = (s)this.n.c(localr.b());
          if (__a == null)
            paramObject.wait(this.f);
        }
        if (__a == null)
          __a = (s)this.n.c(localr.b());
        if ((__a != null) || (!h()))
          continue;
        m();
        if (h())
          continue;
      }
      return __a;
    }
    catch (IOException localIOException)
    {
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    return null;
  }

  public void a(Object paramObject, w paramw)
  {
    int i1 = this.u++;
    r localr = (r)paramObject;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
      localDataOutputStream.writeShort(localr.g());
      localr.a(i1);
      localDataOutputStream.writeInt(localr.b());
      b().a(localr, localDataOutputStream);
      int i2 = localByteArrayOutputStream.size();
      if (h)
        System.out.println("sending message request size=" + i2);
      synchronized (this.l)
      {
        this.m.a(i1, paramObject);
        this.o.put(Integer.valueOf(i1), paramw);
        this.l.writeInt(i2);
        localByteArrayOutputStream.writeTo(this.l);
        this.l.flush();
      }
    }
    catch (Exception localException)
    {
      cl.a("Exception for request no." + localr.g() + localException.toString());
      paramw.a(paramObject, null);
      this.o.remove(new Integer(i1));
    }
  }

  private void j()
  {
    f().i();
  }

  private void m()
  {
    f().h();
  }

  public void k()
  {
    a(this.v, this.f);
  }

  public void b(int paramInt)
  {
    a(paramInt, this.f);
  }

  public void a(int paramInt1, int paramInt2)
  {
    if ((this.v == paramInt1) && (this.f == paramInt2) && (!this.x) && (this.r != null) && (this.r.b()))
      return;
    this.f = paramInt2;
    l();
    if ((this.r != null) && (this.r.b()))
      this.r.c();
    this.r = new t(this, paramInt1);
  }

  public int e()
  {
    try
    {
      int i1 = this.i.getLocalPort();
      return i1;
    }
    catch (Exception localException)
    {
    }
    return -1;
  }

  public synchronized void i()
  {
    l();
  }

  public void a(String paramString, int paramInt)
  {
    try
    {
      l();
      Socket localSocket = a(paramString, paramInt, r());
      DataInputStream localDataInputStream = new DataInputStream(localSocket.getInputStream());
      DataOutputStream localDataOutputStream = new DataOutputStream(localSocket.getOutputStream());
      a(localDataOutputStream);
      a(localDataInputStream);
      this.k = localDataInputStream;
      this.l = localDataOutputStream;
      this.j = localSocket;
      this.y = true;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private void a(DataOutputStream paramDataOutputStream)
  {
    if (this.q == null)
      this.q = new v(this, paramDataOutputStream);
    else
      this.q.b(paramDataOutputStream, true);
  }

  private void a(DataInputStream paramDataInputStream)
  {
    try
    {
      if (this.p == null)
        this.p = new u(this, paramDataInputStream);
      else
        this.p.b(paramDataInputStream);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public boolean h()
  {
    if (this.k != null)
      try
      {
        this.k.available();
        return true;
      }
      catch (IOException localIOException)
      {
      }
    return false;
  }

  private void l()
  {
    if (!this.y)
      return;
    if (this.j != null)
    {
      try
      {
        this.j.shutdownInput();
      }
      catch (Exception localException1)
      {
      }
      try
      {
        this.j.shutdownOutput();
      }
      catch (Exception localException2)
      {
      }
    }
    if (this.l != null)
      try
      {
        synchronized (this.l)
        {
          this.l.close();
        }
      }
      catch (Exception localException3)
      {
      }
    if (this.j != null)
      try
      {
        this.j.close();
      }
      catch (Exception localException4)
      {
      }
    if (this.k != null)
      try
      {
        this.k.close();
      }
      catch (Exception localException5)
      {
      }
    this.j = null;
    this.k = null;
    this.l = null;
  }

  private static Socket a(String paramString, int paramInt, boolean paramBoolean)
    throws IOException
  {
    if (!paramBoolean)
      return new Socket(paramString, paramInt);
    SSLSocket localSSLSocket = (SSLSocket)SSLSocketFactory.getDefault().createSocket(paramString, paramInt);
    localSSLSocket.setEnabledCipherSuites(localSSLSocket.getSupportedCipherSuites());
    return localSSLSocket;
  }

  private static ServerSocket a(int paramInt, boolean paramBoolean)
    throws IOException
  {
    int i1 = 0;
    ServerSocket localServerSocket = null;
    while (localServerSocket == null)
      try
      {
        if (!paramBoolean)
        {
          localServerSocket = new ServerSocket(paramInt);
        }
        else
        {
          localServerSocket = SSLServerSocketFactory.getDefault().createServerSocket(paramInt);
          SSLServerSocket localSSLServerSocket = (SSLServerSocket)localServerSocket;
          localSSLServerSocket.setEnabledCipherSuites(localSSLServerSocket.getSupportedCipherSuites());
        }
        if ((i1 > 0) && (g))
          System.out.println("Server socket (" + localServerSocket + ") successfuly created on port " + paramInt + (paramBoolean ? " (SSL Encrypted)" : " (Not Encrypted)"));
      }
      catch (IOException localIOException)
      {
        i1++;
        if (i1 == 3)
          throw localIOException;
        try
        {
          Thread.sleep(200L);
          if (g)
            System.out.println("Failed to create a server socket on port " + paramInt + (paramBoolean ? " (SSL Encrypted)" : " (Not Encrypted)") + ". Retrying...");
        }
        catch (InterruptedException localInterruptedException)
        {
        }
      }
    return localServerSocket;
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean == r())
      return;
    this.x = true;
    super.a(paramBoolean);
  }

  private ServerSocket c(int paramInt)
  {
    if ((this.i != null) && ((paramInt != this.v) || (this.x)))
    {
      try
      {
        this.i.close();
      }
      catch (Exception localException1)
      {
      }
      this.i = null;
    }
    if ((this.i == null) && (paramInt >= 0))
      try
      {
        this.i = a(paramInt, r());
        this.x = false;
        this.v = paramInt;
      }
      catch (BindException localBindException)
      {
        j();
      }
      catch (Exception localException2)
      {
        cl.a(localException2);
      }
    return this.i;
  }

  static boolean a()
  {
    return h;
  }

  static v b(n paramn)
  {
    return paramn.q;
  }

  static Hashtable c(n paramn)
  {
    return paramn.o;
  }

  static a d(n paramn)
  {
    return paramn.n;
  }

  static a e(n paramn)
  {
    return paramn.m;
  }

  static ServerSocket a(n paramn, int paramInt)
  {
    return paramn.c(paramInt);
  }

  static void a(n paramn, DataOutputStream paramDataOutputStream)
  {
    paramn.a(paramDataOutputStream);
  }

  static void a(n paramn, DataInputStream paramDataInputStream)
  {
    paramn.a(paramDataInputStream);
  }

  static DataInputStream b(n paramn, DataInputStream paramDataInputStream)
  {
    return paramn.k = paramDataInputStream;
  }

  static DataOutputStream b(n paramn, DataOutputStream paramDataOutputStream)
  {
    return paramn.l = paramDataOutputStream;
  }

  static Socket a(n paramn, Socket paramSocket)
  {
    return paramn.j = paramSocket;
  }

  static boolean a(n paramn, boolean paramBoolean)
  {
    return paramn.y = paramBoolean;
  }

  static Object a(n paramn)
  {
    return paramn.w;
  }

  static u b(n paramn)
  {
    return paramn.p;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.t.n
 * JD-Core Version:    0.6.0
 */