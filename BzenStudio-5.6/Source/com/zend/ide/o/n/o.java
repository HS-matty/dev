package com.zend.ide.o.n;

import com.zend.ide.p.ba;
import com.zend.ide.util.ac;
import com.zend.ide.util.c.f;
import com.zend.ide.util.c.h;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import sun.misc.BASE64Encoder;

public class o
  implements n, cu
{
  private int a = -1;
  private static o b = new o();
  private r c;
  public static final boolean d = System.getProperty("loggingDebug") != null;
  private ArrayList e = new ArrayList();

  public static o a()
  {
    return b;
  }

  public void b()
  {
    boolean bool = ((Boolean)com.zend.ide.y.b.a("debugging.autoConnectTunnel")).booleanValue();
    if (bool)
      c();
  }

  public boolean c()
  {
    try
    {
      Socket localSocket = null;
      String str = (String)com.zend.ide.y.b.a("debugging.tunnelHost");
      int i = ((Integer)com.zend.ide.y.b.a("debugging.tunnelPort")).intValue();
      if (i > 65535)
      {
        ba.a(com.zend.ide.bd.c.b().h(), ct.a(1061), ct.a(94), 0);
        return false;
      }
      localSocket = new Socket(str, i);
      localSocket.setSoTimeout(2000);
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localSocket.getInputStream()));
      PrintWriter localPrintWriter = new PrintWriter(new OutputStreamWriter(localSocket.getOutputStream()));
      localPrintWriter.print(a(str, i));
      localPrintWriter.flush();
      this.a = c.a(localBufferedReader);
      d();
      if (d)
        System.out.println("random port=" + this.a);
      if ((this.a == -1) || (this.a == 0))
        throw new IOException("Could not retrieve port number from the server (" + this.a + ").");
      int j = ((Integer)com.zend.ide.y.b.a("debugging.debugPort")).intValue();
      if (this.c == null)
        this.c = new r(this);
      this.c.a(localSocket, InetAddress.getByName("127.0.0.1"), j);
      if (this.c.i())
        i();
    }
    catch (UnknownHostException localUnknownHostException)
    {
      ba.a(com.zend.ide.bd.c.b().h(), ct.a(1435), ct.a(94), 0);
      return false;
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      ba.a(com.zend.ide.bd.c.b().h(), ct.a(1436), ct.a(94), 0);
      return false;
    }
    catch (IOException localIOException)
    {
      ba.a(com.zend.ide.bd.c.b().h(), ct.a(1436), ct.a(94), 0);
      return false;
    }
    catch (b localb)
    {
      ba.a(com.zend.ide.bd.c.b().h(), localb.a(), ct.a(94), 0);
      this.a = -1;
      d();
      return false;
    }
    catch (Exception localException)
    {
      ba.a(com.zend.ide.bd.c.b().h(), ct.a(1436), ct.a(94), 0);
      cl.a(localException);
      return false;
    }
    return true;
  }

  private void d()
  {
    p localp = new p(this);
    f localf = h.c().a(localp, false);
    localf.h();
  }

  public int e()
  {
    return this.a;
  }

  public void a(q paramq)
  {
    this.e.add(paramq);
  }

  public void f()
  {
    this.a = -1;
    d();
    if (this.c != null)
      this.c.h();
    h();
  }

  public boolean g()
  {
    return (this.c != null) && (this.c.i());
  }

  private String a(String paramString, int paramInt)
  {
    String str1 = (String)com.zend.ide.y.b.a("debugging.dummyFile").c();
    String str2 = "GET /" + str1 + "?debugger_connect=1 HTTP/1.1\r\n" + "Host: " + paramString + ":" + paramInt + "\r\n";
    boolean bool = ((Boolean)com.zend.ide.y.b.a("debugging.tunnelUseAuthentication")).booleanValue();
    if (bool)
    {
      String str3 = (String)com.zend.ide.y.b.a("debugging.tunnelAuthUsername");
      String str4 = (String)com.zend.ide.y.b.a("debugging.tunnelAuthPassword");
      try
      {
        str4 = ac.b(str4);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
      BASE64Encoder localBASE64Encoder = new BASE64Encoder();
      String str5 = localBASE64Encoder.encode(new String(str3 + ":" + str4).getBytes());
      str2 = str2 + "Authorization: Basic " + str5 + "\r\n";
    }
    return str2 + "\r\n";
  }

  public void a()
  {
    try
    {
      if (d)
        System.out.println("Reconnect Tunneling...");
      c();
    }
    catch (Exception localException)
    {
      cl.a(localException);
      h();
    }
  }

  public n a()
  {
    return this;
  }

  public void h()
  {
    for (int i = 0; i < this.e.size(); i++)
      ((q)this.e.get(i)).a();
  }

  public void i()
  {
    for (int i = 0; i < this.e.size(); i++)
      ((q)this.e.get(i)).c();
  }

  static int a(o paramo)
  {
    return paramo.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.n.o
 * JD-Core Version:    0.6.0
 */