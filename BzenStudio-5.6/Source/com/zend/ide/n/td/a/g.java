package com.zend.ide.n.td.a;

import java.util.ArrayList;
import java.util.List;

public class g
{
  private static g a = new g();
  private List b = new ArrayList(30);

  public static g a()
  {
    return a;
  }

  public static e b()
  {
    return a().c();
  }

  public static void a(e parame)
  {
    a().b(parame);
  }

  public e c()
  {
    synchronized (this)
    {
      int i = this.b.size();
      if (i > 0)
        return (e)this.b.remove(i - 1);
    }
    return new f(null);
  }

  public void b(e parame)
  {
    if ((parame instanceof f))
      synchronized (this)
      {
        parame.b(null);
        parame.a(null);
        parame.a(-1);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.g
 * JD-Core Version:    0.6.0
 */