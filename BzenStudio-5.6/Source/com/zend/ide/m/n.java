package com.zend.ide.m;

import com.zend.ide.b.m;
import com.zend.ide.bd.c;
import com.zend.ide.n.bw;
import com.zend.ide.n.ob;
import com.zend.ide.util.ct;
import com.zend.ide.util.g;
import com.zend.ide.y.b;
import java.net.MalformedURLException;
import java.net.URL;

final class n
  implements ob
{
  private int a;
  private int b;
  private m c;
  private bw d;
  private String e = ct.a(1587);

  n(int paramInt1, int paramInt2, m paramm, bw parambw)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramm;
    this.d = parambw;
  }

  public int a()
  {
    return this.a;
  }

  public int b()
  {
    return this.b;
  }

  public String c()
  {
    return this.e;
  }

  public void d()
  {
    String str = this.c.c();
    if (a(str))
    {
      c.b().e().a(str, ((Boolean)b.a("desktop.internalBrowser")).booleanValue());
      return;
    }
    this.d.a(this.c.c(), null, this.c.f());
  }

  private boolean a(String paramString)
  {
    if ((!paramString.startsWith("http://")) && (!paramString.startsWith("https://")))
      return false;
    try
    {
      URL localURL = new URL(paramString);
    }
    catch (MalformedURLException localMalformedURLException)
    {
      return false;
    }
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.m.n
 * JD-Core Version:    0.6.0
 */