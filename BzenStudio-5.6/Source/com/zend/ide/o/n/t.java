package com.zend.ide.o.n;

import com.zend.ide.util.cl;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.PrintStream;
import java.net.SocketException;

class t
  implements Runnable
{
  final r a;

  t(r paramr)
  {
  }

  public void run()
  {
    while (r.j(this.a))
    {
      int i = 0;
      try
      {
        if (!r.k(this.a))
          r.a(this.a, false);
        int j = r.m(this.a).read(r.l(this.a));
        if (j > 0)
        {
          if (r.c(this.a))
            System.out.println("<-- recieved ZDE message size: " + j);
          r.n(this.a).write(r.a(this.a, j));
          r.n(this.a).write(r.l(this.a), 0, j);
          r.n(this.a).flush();
          if (r.c(this.a))
            System.out.println("--> sending message to Tunnel size " + (j + 4));
        }
        else
        {
          i = 1;
        }
      }
      catch (EOFException localEOFException)
      {
        i = 1;
      }
      catch (SocketException localSocketException)
      {
        i = 1;
      }
      catch (Exception localException)
      {
        if (r.j(this.a))
          cl.a(localException);
        i = 1;
      }
      finally
      {
        Thread.yield();
        if (i != 0)
          r.h(this.a);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.n.t
 * JD-Core Version:    0.6.0
 */