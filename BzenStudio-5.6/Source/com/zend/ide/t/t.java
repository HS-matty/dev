package com.zend.ide.t;

import com.zend.ide.util.cl;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

class t
  implements Runnable
{
  private boolean a = true;
  private Thread b = new Thread(this);
  int c;
  final n d;

  public t(n paramn, int paramInt)
  {
    this.c = paramInt;
    this.b.start();
  }

  public synchronized void c()
  {
    this.a = false;
    this.b.interrupt();
  }

  public boolean b()
  {
    boolean bool = this.b.isAlive();
    bool = (bool) && (this.a);
    return bool;
  }

  public void run()
  {
    while (this.a)
      try
      {
        ServerSocket localServerSocket;
        synchronized (this)
        {
          localServerSocket = n.a(this.d, this.c);
          if (localServerSocket == null)
            this.a = false;
        }
        if (!this.a)
          break;
        __x = localServerSocket.accept();
        ((Socket)__x).setTcpNoDelay(true);
        synchronized (this)
        {
          try
          {
            DataInputStream localDataInputStream = new DataInputStream(((Socket)__x).getInputStream());
            DataOutputStream localDataOutputStream = new DataOutputStream(((Socket)__x).getOutputStream());
            synchronized (localDataInputStream)
            {
              n.a(this.d, localDataOutputStream);
              n.a(this.d, localDataInputStream);
              n.b(this.d, localDataInputStream);
              n.b(this.d, localDataOutputStream);
              n.a(this.d, (Socket)__x);
              n.a(this.d, true);
            }
            this.d.g().q();
          }
          catch (Exception localException2)
          {
            cl.a(localException2);
          }
        }
      }
      catch (SocketException localSocketException)
      {
      }
      catch (Exception localException1)
      {
        if (this.a)
          cl.a(localException1);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.t.t
 * JD-Core Version:    0.6.0
 */