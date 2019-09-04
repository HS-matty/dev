package com.zend.ide.t;

import com.zend.ide.util.cl;
import com.zend.ide.util.d.a;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.SocketException;
import java.util.Hashtable;
import javax.net.ssl.SSLException;

class u
  implements Runnable
{
  private DataInputStream a;
  private boolean c = false;
  private boolean d = true;
  private Thread e;
  private Object f = new Object();
  final n g;

  u(n paramn, DataInputStream paramDataInputStream)
  {
    this.a = paramDataInputStream;
    this.c = true;
    this.d = true;
    this.e = new Thread(this);
    this.e.start();
  }

  public synchronized void a(DataInputStream paramDataInputStream)
  {
    b();
    this.a = paramDataInputStream;
    this.c = true;
    notifyAll();
  }

  public void b(DataInputStream paramDataInputStream)
  {
    if (this.c)
      synchronized (this.f)
      {
        try
        {
          this.f.wait();
        }
        catch (InterruptedException localInterruptedException)
        {
        }
      }
    a(paramDataInputStream);
  }

  public synchronized void b()
  {
    if (!this.c)
      return;
    this.c = false;
    this.d = true;
    this.e.interrupt();
  }

  public void run()
  {
    while (this.d)
    {
      while ((!this.c) && (this.d))
        try
        {
          synchronized (this)
          {
            synchronized (this.f)
            {
              this.f.notify();
            }
            wait();
            synchronized (this.a)
            {
            }
          }
        }
        catch (InterruptedException localInterruptedException)
        {
        }
      try
      {
        if (!this.d)
          break;
        int i = this.a.readInt();
        if (n.a())
          System.out.println("recieved message size = " + i);
        if (i < 0)
        {
          c();
          cl.a("Socket error (length is negative): possibly Server is SSL, Client is not.");
        }
        synchronized (this)
        {
          int j = this.a.readShort();
          if (n.a())
            System.out.println("message type=" + j);
          g localg = this.g.d().a(j);
          if ((localg instanceof p))
          {
            localg = this.g.c().a(this.a, localg);
            n.b(this.g).a(localg);
          }
          else
          {
            int k;
            if ((localg instanceof s))
            {
              k = this.a.readInt();
              localg = this.g.c().a(this.a, localg);
              ((s)localg).a(k);
              w localw = (w)n.c(this.g).get(Integer.valueOf(k));
              if (localw == null)
              {
                n.d(this.g).a(k, localg);
                r localr = (r)n.e(this.g).c(k);
                synchronized (localr)
                {
                  localr.notifyAll();
                }
              }
              else
              {
                n.b(this.g).a(localg);
              }
            }
            else
            {
              k = this.a.readInt();
              localg = this.g.c().a(this.a, localg);
              ((r)localg).a(k);
              n.b(this.g).a(localg);
            }
          }
        }
      }
      catch (EOFException localEOFException)
      {
        c();
      }
      catch (SocketException localSocketException)
      {
        c();
      }
      catch (SSLException localSSLException)
      {
        cl.a("SSLException: possibly Client is SSL, Server is not.");
        c();
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
        c();
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  private void c()
  {
    this.c = false;
    this.g.i();
    n.b(this.g).b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.t.u
 * JD-Core Version:    0.6.0
 */