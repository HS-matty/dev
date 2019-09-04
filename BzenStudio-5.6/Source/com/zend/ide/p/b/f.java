package com.zend.ide.p.b;

import javax.swing.SwingUtilities;

public class f
{
  private static k a = new k();
  private static h b = new h();

  public static void a(c paramc)
  {
    b.b();
    a.a(paramc);
    paramc.a(b);
    SwingUtilities.invokeLater(new g());
  }

  static h b()
  {
    return b;
  }

  static k c()
  {
    return a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.b.f
 * JD-Core Version:    0.6.0
 */