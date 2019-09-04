package com.zend.ide.util.c;

import com.zend.ide.util.ba;
import java.util.Timer;

public class h
{
  private static Timer a = new Timer();
  private static h b = null;
  private ba c = new ba();
  private int d;

  public h()
  {
    this(0);
  }

  public h(int paramInt)
  {
    a(paramInt);
  }

  public f a(d paramd)
  {
    return a(paramd, true);
  }

  public f a(d paramd, boolean paramBoolean)
  {
    f localf = b(paramd);
    if (paramBoolean)
      this.c.a(localf);
    return localf;
  }

  public f b(d paramd)
  {
    return new j(this, paramd);
  }

  public void a(int paramInt)
  {
    while (this.d < paramInt)
    {
      d();
      this.d += 1;
    }
    while (this.d > paramInt)
    {
      b();
      this.d -= 1;
    }
  }

  private void d()
  {
    new k(this, null).start();
  }

  private void b()
  {
    i locali = new i(this);
    a(locali);
  }

  public static h c()
  {
    if (b == null)
      b = new h();
    return b;
  }

  static ba a(h paramh)
  {
    return paramh.c;
  }

  static Timer a()
  {
    return a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.c.h
 * JD-Core Version:    0.6.0
 */