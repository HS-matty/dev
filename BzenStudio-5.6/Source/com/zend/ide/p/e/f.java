package com.zend.ide.p.e;

import com.zend.ide.p.e.c.a;
import com.zend.ide.util.cl;
import com.zend.ide.util.cr;
import com.zend.ide.y.c;
import javax.swing.UIManager;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class f
{
  private static f a;
  private static boolean b = false;
  private static boolean c = false;

  public static f h()
  {
    if (a == null)
      a = new f();
    return a;
  }

  public void e()
  {
    boolean bool1 = ((Boolean)com.zend.ide.y.b.a("desktop.antialiasing").c()).booleanValue();
    if (bool1)
      System.setProperty("swing.aatext", "true");
    if (!g())
    {
      a(false, bool1);
      return;
    }
    boolean bool2 = ((Boolean)com.zend.ide.y.b.a("desktop.laf").c()).booleanValue();
    a(bool2, bool1);
  }

  public static boolean f()
  {
    return b;
  }

  public static boolean a()
  {
    return c;
  }

  private static void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    b = paramBoolean1;
    c = paramBoolean2;
    if (paramBoolean1)
    {
      int i = cr.c();
      switch (i)
      {
      case 3:
        d();
        return;
      case 1:
        c();
        return;
      }
    }
    b();
  }

  private static void b()
  {
    try
    {
      MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
      UIManager.setLookAndFeel(new MetalLookAndFeel());
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    new com.zend.ide.p.e.a.b().c();
  }

  private static void c()
  {
    try
    {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    new com.zend.ide.p.e.b.b().c();
  }

  private static void d()
  {
    try
    {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    new a().c();
    System.setProperty("apple.laf.useScreenMenuBar", "true");
  }

  public static boolean g()
  {
    int i = cr.c();
    return (i == 3) || (i == 1);
  }

  public boolean i()
  {
    return (f()) && (cr.c() == 3);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.f
 * JD-Core Version:    0.6.0
 */