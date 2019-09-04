package com.zend.ide.u;

import com.zend.ide.util.a.b;
import com.zend.ide.util.c.f;
import com.zend.ide.util.dj;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class bd
{
  private static ce a;
  private static cd b;
  private static boolean c;

  public static boolean a(JFrame paramJFrame, bh parambh, boolean paramBoolean)
  {
    int i = 0;
    String str1 = "";
    String str2 = "";
    String str3 = "";
    int j = 0;
    int k = 3;
    String str4 = parambh.l();
    if ((a != null) && ((str4 == null) || (str4.length() == 0)))
    {
      i = 1;
      str1 = a.c();
      str2 = a.e();
      str3 = a.g();
      j = a.a();
      k = a.b();
    }
    a = new ce(paramJFrame, parambh, paramBoolean);
    if (i != 0)
    {
      a.a(str1, true);
      a.a(str2);
      a.c(str3);
      a.c(j);
      a.d(k);
    }
    a.setVisible(true);
    int m = 0;
    if (a.n())
      m = 1;
    return m;
  }

  public static boolean a(JFrame paramJFrame, bh parambh)
  {
    String str1 = parambh.m() == null ? "" : parambh.m();
    String str2 = parambh.n() == null ? "" : parambh.n();
    boolean bool1 = parambh.p();
    int i = parambh.a();
    boolean bool2 = a(paramJFrame, parambh, false);
    if ((bool2) && (str1.equals(a.e())) && (str2.equals(a.f())) && (bool1 == a.j()) && (i == a.a()))
      bool2 = false;
    return bool2;
  }

  public static boolean a(bh parambh)
  {
    String str1 = parambh.l();
    String str2 = parambh.m();
    String str3 = parambh.n();
    return (str1 != null) && (!str1.equals("")) && (str2 != null) && (!str2.equals("")) && (str3 != null) && (!str3.equals(""));
  }

  public static void a(JFrame paramJFrame, bh parambh, boolean paramBoolean1, boolean paramBoolean2, Runnable paramRunnable)
  {
    boolean bool = a(parambh);
    if (!bool)
      bool = a(paramJFrame, parambh, true);
    if (!bool)
      return;
    if (b == null)
      b = new cd(paramJFrame);
    b.a(parambh);
    b.a();
    if (!paramBoolean2)
    {
      a(parambh, paramBoolean1, paramRunnable);
      return;
    }
    be localbe = new be(parambh, paramBoolean1, paramRunnable);
    f localf = com.zend.ide.util.c.h.c().a(localbe, false);
    localf.h();
  }

  private static synchronized void a(bh parambh, boolean paramBoolean, Runnable paramRunnable)
  {
    c = false;
    try
    {
      parambh.f();
      b.setVisible(false);
      if (paramBoolean)
        com.zend.ide.j.h.m.a(parambh);
    }
    catch (bt localbt)
    {
    }
    catch (dj localdj)
    {
      b.setVisible(false);
      if (!c)
      {
        String str1 = localdj.d();
        int i = (str1 != null) && (!str1.equals("")) && (!str1.equals(parambh.l())) ? 1 : 0;
        String str2 = localdj.getMessage() + (i != 0 ? ", " + str1 : "");
        throw new dj(str2);
      }
    }
    catch (Exception localException)
    {
      b.setVisible(false);
      if (!c)
        b.a(localException);
    }
    if (paramRunnable != null)
      SwingUtilities.invokeLater(paramRunnable);
  }

  public static void b(bh parambh, boolean paramBoolean, Runnable paramRunnable)
  {
    if (!paramBoolean)
    {
      a(parambh, paramRunnable);
      return;
    }
    bf localbf = new bf(parambh, paramRunnable);
    f localf = com.zend.ide.util.c.h.c().a(localbf, false);
    localf.h();
  }

  private static synchronized void a(bh parambh, Runnable paramRunnable)
  {
    try
    {
      parambh.g();
    }
    catch (bt localbt)
    {
    }
    if (paramRunnable != null)
      SwingUtilities.invokeLater(paramRunnable);
  }

  static void c(bh parambh, boolean paramBoolean, Runnable paramRunnable)
  {
    a(parambh, paramBoolean, paramRunnable);
  }

  static void b(bh parambh, Runnable paramRunnable)
  {
    a(parambh, paramRunnable);
  }

  static boolean a(boolean paramBoolean)
  {
    return bd.c = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.bd
 * JD-Core Version:    0.6.0
 */