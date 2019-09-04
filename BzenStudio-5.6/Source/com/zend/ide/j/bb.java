package com.zend.ide.j;

import com.zend.ide.util.cl;
import java.io.File;
import java.util.List;
import java.util.TimerTask;

class bb extends TimerTask
{
  final o b;

  bb(o paramo)
  {
  }

  public void run()
  {
    synchronized (this)
    {
      for (int i = 0; i < o.a(this.b).size(); i++)
        try
        {
          p localp = (p)o.a(this.b).get(i);
          if (localp.a.exists())
          {
            localp.c = true;
            a(localp);
          }
          else if (localp.c)
          {
            localp.c = false;
            this.b.f.e(localp.a, true);
          }
        }
        catch (Exception localException)
        {
          cl.a(localException);
        }
    }
  }

  private void a(p paramp)
  {
    long l = paramp.a.lastModified();
    if (l > paramp.b + 5000L)
    {
      if (paramp.b != 0L)
        this.b.f.x(paramp.a);
      paramp.b = l;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.bb
 * JD-Core Version:    0.6.0
 */