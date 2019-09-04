package com.zend.ide.bd;

import com.zend.ide.be.d;
import com.zend.ide.be.k;
import com.zend.ide.util.g;
import javax.swing.JDialog;
import javax.swing.JFrame;

public abstract class c
{
  private static c b;
  private static c a;

  public static synchronized c b()
  {
    if (b != null)
      return b;
    if (a == null)
      a = new a();
    return a;
  }

  public static void a(c paramc)
  {
    b = paramc;
  }

  public abstract d c();

  public JFrame h()
  {
    return c().b();
  }

  public abstract JDialog i();

  public abstract k d();

  public abstract g e();

  public abstract com.zend.ide.k.c f();
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bd.c
 * JD-Core Version:    0.6.0
 */