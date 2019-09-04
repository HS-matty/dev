package com.zend.ide.util;

import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.io.IOException;
import java.net.Authenticator;
import java.util.Properties;
import javax.swing.JButton;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class mc
  implements cu
{
  private static mc a;
  private static wc b;
  private static boolean c;
  private static String d;
  private static String e;
  private static boolean f;
  private static String g;
  private static String h;
  private static BASE64Encoder i = new BASE64Encoder();
  private static BASE64Decoder j = new BASE64Decoder();

  public static mc a()
  {
    if (a == null)
      a = new mc();
    return a;
  }

  public static JButton b()
  {
    JButton localJButton = new JButton(ct.a(1758));
    localJButton.addActionListener(new nc());
    return localJButton;
  }

  public mc()
  {
    c();
  }

  private void c()
  {
    c = ((Boolean)b.a("useHTTPProxy").c()).booleanValue();
    d = (String)b.a("HTTPProxyHost").c();
    e = String.valueOf(b.a("HTTPProxyPort").c());
    g = (String)b.a("HTTPProxyUser").c();
    try
    {
      h = new String(j.decodeBuffer((String)b.a("HTTPProxyPassword").c()));
    }
    catch (IOException localIOException)
    {
      h = "";
    }
    f = ((Boolean)b.a("useHTTPProxyAuthentication").c()).booleanValue();
    d();
  }

  private void d()
  {
    Properties localProperties = System.getProperties();
    localProperties.put("http.proxyHost", d);
    localProperties.put("http.proxyPort", e);
    if (f)
    {
      localProperties.put("http.proxyUser", g);
      localProperties.put("http.proxyPassword", h);
      Authenticator.setDefault(new vc(g, h));
    }
  }

  public void e()
  {
    if (b == null)
      b = new wc(this);
    b.setVisible(true);
  }

  private void a(boolean paramBoolean1, String paramString1, String paramString2, boolean paramBoolean2, String paramString3, String paramString4)
  {
    c = paramBoolean1;
    if (paramBoolean1)
    {
      d = paramString1;
      e = paramString2;
      f = paramBoolean2;
      g = paramString3;
      h = paramString4;
      b.a("useHTTPProxy").a(new Boolean(paramBoolean1));
      b.a("HTTPProxyHost").a(d);
      b.a("HTTPProxyPort").a(Integer.valueOf(e));
      b.a("useHTTPProxyAuthentication").a(new Boolean(paramBoolean2));
      b.a("HTTPProxyUser").a(g);
      b.a("HTTPProxyPassword").a(i.encode(h.getBytes()));
    }
    else
    {
      b.a("useHTTPProxy").a();
      b.a("HTTPProxyHost").a();
      b.a("HTTPProxyPort").a();
      b.a("useHTTPProxyAuthentication").a();
      b.a("HTTPProxyUser").a();
      b.a("HTTPProxyPassword").a();
    }
    d();
  }

  static void a(mc parammc, boolean paramBoolean1, String paramString1, String paramString2, boolean paramBoolean2, String paramString3, String paramString4)
  {
    parammc.a(paramBoolean1, paramString1, paramString2, paramBoolean2, paramString3, paramString4);
  }

  static boolean f()
  {
    return c;
  }

  static String g()
  {
    return d;
  }

  static boolean h()
  {
    return f;
  }

  static String i()
  {
    return e;
  }

  static String j()
  {
    return g;
  }

  static String k()
  {
    return h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.mc
 * JD-Core Version:    0.6.0
 */