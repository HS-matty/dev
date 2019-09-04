package com.zend.ide.desktop.b;

import com.zend.ide.t.g;
import com.zend.ide.t.i;
import com.zend.ide.util.cl;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;

class h
  implements Runnable
{
  private DataInputStream a;
  private boolean b = false;
  private boolean c = true;
  private Thread d;
  final b e;

  h(b paramb, DataInputStream paramDataInputStream)
  {
    this.a = paramDataInputStream;
    this.b = true;
    this.c = true;
    this.d = new Thread(this);
    this.d.start();
  }

  public synchronized void b()
  {
    this.b = false;
    this.c = false;
    this.d.interrupt();
  }

  public void run()
  {
    while (this.c)
      try
      {
        if ((!this.b) && (this.c))
          try
          {
            synchronized (this)
            {
              wait();
            }
          }
          catch (java.lang.InterruptedException )
          {
          }
        if (!this.c)
          break;
        this.a.readInt();
        synchronized (this)
        {
          int i = this.a.readShort();
          g localg = this.e.d().a(i);
          localg = this.e.c().a(this.a, localg);
          b.d(this.e).a(localg);
        }
      }
      catch (EOFException localEOFException)
      {
        this.b = false;
        b.e(this.e);
      }
      catch (SocketException localSocketException)
      {
        this.b = false;
        b.e(this.e);
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
        this.b = false;
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.b.h
 * JD-Core Version:    0.6.0
 */