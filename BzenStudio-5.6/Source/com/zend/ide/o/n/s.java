package com.zend.ide.o.n;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintStream;

class s
  implements Runnable
{
  final r a;

  s(r paramr)
  {
  }

  public void run()
  {
    while (r.a(this.a))
    {
      int i = 0;
      try
      {
        int j = 0;
        j = r.b(this.a).readInt();
        if (r.c(this.a))
          System.out.println("<-- recieved tunnel message size: " + j);
        if (j > 0)
        {
          r.a(this.a, new byte[j]);
          r.b(this.a).readFully(r.d(this.a));
          if (r.e(this.a) == null)
            r.f(this.a);
          i = 1;
          r.g(this.a).write(r.d(this.a));
          r.g(this.a).flush();
          if (r.c(this.a))
            System.out.println("--> sending message to ZDE size " + j);
        }
        if (j <= 0)
          r.h(this.a);
      }
      catch (Exception localException)
      {
        if (i != 0)
        {
          Thread.yield();
          continue;
        }
        if (r.a(this.a))
          r.i(this.a);
      }
      finally
      {
        Thread.yield();
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.n.s
 * JD-Core Version:    0.6.0
 */