package com.zend.ide.desktop.b;

import com.zend.ide.t.j;
import com.zend.ide.t.m;
import com.zend.ide.t.o;
import com.zend.ide.t.w;
import com.zend.ide.util.cl;
import com.zend.ide.util.cv;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class b extends m
{
  public static final String i = cv.f();
  public static final String j = i + File.separator + "port";
  private ServerSocket k;
  private Socket l;
  private int m = 0;
  private int n = 10000;
  private DataInputStream o;
  private DataOutputStream p;
  private h q;
  private ByteArrayOutputStream r = new ByteArrayOutputStream();
  private DataOutputStream s = new DataOutputStream(this.r);
  private l t;

  public void a(l paraml)
  {
    this.t = paraml;
  }

  public l j()
  {
    return this.t;
  }

  public void k()
  {
    a(this.m, this.n);
  }

  public void b(int paramInt)
  {
    a(paramInt, this.n);
  }

  public void a()
  {
    n();
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.m = paramInt1;
    q();
    n();
  }

  public void a(String paramString, int paramInt)
  {
  }

  public void b(Object paramObject)
  {
    try
    {
      synchronized (this.r)
      {
        this.r.reset();
        this.s.writeShort(((o)paramObject).g());
        b().a(paramObject, this.s);
        synchronized (this.p)
        {
          this.p.writeInt(this.r.size());
          this.r.writeTo(this.p);
          this.p.flush();
        }
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public Object a(Object paramObject)
  {
    return paramObject;
  }

  public void a(Object paramObject, w paramw)
  {
  }

  public void i()
  {
    q();
  }

  private void c(int paramInt)
  {
    try
    {
      File localFile = new File(j);
      if ((!localFile.getParentFile().exists()) && (!localFile.getParentFile().mkdirs()))
        return;
      localFile.deleteOnExit();
      BufferedWriter localBufferedWriter = new BufferedWriter(new FileWriter(localFile));
      localBufferedWriter.write(String.valueOf(paramInt));
      localBufferedWriter.flush();
      localBufferedWriter.close();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private void l()
  {
  }

  private void m()
  {
    o();
  }

  private void n()
  {
    try
    {
      p();
      o();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private void o()
  {
    g localg = new g(this);
    new Thread(localg).start();
  }

  private void p()
    throws IOException
  {
    if ((this.k != null) && (this.m != this.k.getLocalPort()))
    {
      try
      {
        this.k.close();
      }
      catch (Exception localException)
      {
      }
      this.k = null;
    }
    if (this.k == null)
      try
      {
        this.k = new ServerSocket(this.m);
        c(this.k.getLocalPort());
      }
      catch (BindException localBindException)
      {
        l();
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
      }
      catch (SocketException localSocketException)
      {
      }
  }

  private void q()
  {
    try
    {
      this.l.shutdownInput();
      this.l.shutdownOutput();
      this.o.close();
      this.p.close();
      this.l.close();
    }
    catch (Exception localException)
    {
    }
    this.l = null;
    this.o = null;
  }

  private void a(DataInputStream paramDataInputStream)
  {
    try
    {
      if (this.q != null)
        this.q.b();
      this.q = new h(this, paramDataInputStream);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  static Socket a(b paramb, Socket paramSocket)
  {
    return paramb.l = paramSocket;
  }

  static ServerSocket a(b paramb)
  {
    return paramb.k;
  }

  static DataInputStream a(b paramb, DataInputStream paramDataInputStream)
  {
    return paramb.o = paramDataInputStream;
  }

  static Socket b(b paramb)
  {
    return paramb.l;
  }

  static DataOutputStream a(b paramb, DataOutputStream paramDataOutputStream)
  {
    return paramb.p = paramDataOutputStream;
  }

  static DataInputStream c(b paramb)
  {
    return paramb.o;
  }

  static void b(b paramb, DataInputStream paramDataInputStream)
  {
    paramb.a(paramDataInputStream);
  }

  static l d(b paramb)
  {
    return paramb.t;
  }

  static void e(b paramb)
  {
    paramb.m();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.b.b
 * JD-Core Version:    0.6.0
 */