package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.WebBrowser;
import com.jniwrapper.win32.ie.dom.Cookie;
import com.jniwrapper.win32.ie.event.WebBrowserEventsHandler;
import com.zend.ide.fb.j;
import com.zend.ide.util.ew;
import com.zend.ide.y.c;
import java.util.Date;
import java.util.GregorianCalendar;

public class d extends com.zend.ide.fb.d
{
  private a n;
  private a o;
  private a p;
  private WebBrowserEventsHandler q;
  private v r;

  public void a(com.zend.ide.fb.o paramo)
  {
    super.a(paramo);
    this.r = new v(this);
    ((g)paramo).a(this.r);
    paramo.a(new l(this));
  }

  protected void a(int paramInt)
  {
    ((g)this.k).o().a(paramInt);
    if ((paramInt == 1) || (paramInt == 3))
    {
      ((g)this.k).a(d());
    }
    else if (paramInt == 2)
    {
      ((g)this.k).a(d());
      d().a(true);
    }
    else if (paramInt == 0)
    {
      d().a(false);
      a(d().a(), this.k.e());
      ((g)this.k).a(this.q);
    }
  }

  protected void d()
  {
    ((g)this.k).a(e());
    ((g)this.k).l();
    this.r.a(true, e());
  }

  private void c()
  {
    ((g)this.k).a(this.q);
  }

  protected void e()
  {
    ((g)this.k).a(f());
    ((g)this.k).l();
    this.r.a(true, f());
  }

  private a d()
  {
    if (this.o == null)
      this.o = new a(this);
    return this.o;
  }

  private a e()
  {
    if (this.n == null)
      this.n = new b(this);
    return this.n;
  }

  private a f()
  {
    if (this.p == null)
      this.p = new i(this);
    return this.p;
  }

  public void a(WebBrowser paramWebBrowser, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str;
    int i;
    if (com.zend.ide.o.n.o.a().g())
    {
      str = ew.c();
      i = com.zend.ide.o.n.o.a().e();
    }
    else
    {
      str = ew.a();
      i = ((Integer)com.zend.ide.y.b.a("debugging.debugPort").c()).intValue();
    }
    Date localDate = new GregorianCalendar(2035, 2, 12).getTime();
    Cookie localCookie = new Cookie("_bm", "");
    localCookie.setExpireDate(localDate);
    localCookie.setPath("/");
    paramWebBrowser.setCookie(paramString, localCookie);
    localCookie = new Cookie("debug_port", "" + i);
    localCookie.setExpireDate(localDate);
    localCookie.setPath("/");
    paramWebBrowser.setCookie(paramString, localCookie);
    localCookie = new Cookie("debug_host", str);
    localCookie.setExpireDate(localDate);
    localCookie.setPath("/");
    paramWebBrowser.setCookie(paramString, localCookie);
    localCookie = new Cookie("start_debug", "1");
    localCookie.setExpireDate(localDate);
    localCookie.setPath("/");
    paramWebBrowser.setCookie(paramString, localCookie);
    localCookie = new Cookie("send_sess_end", "1");
    localCookie.setExpireDate(localDate);
    localCookie.setPath("/");
    paramWebBrowser.setCookie(paramString, localCookie);
    localCookie = new Cookie("debug_jit", "1");
    localCookie.setExpireDate(localDate);
    localCookie.setPath("/");
    paramWebBrowser.setCookie(paramString, localCookie);
    localCookie = new Cookie("original_url", this.k.e());
    localCookie.setExpireDate(localDate);
    localCookie.setPath("/");
    paramWebBrowser.setCookie(paramString, localCookie);
    localCookie = new Cookie("debug_stop", "1");
    localCookie.setExpireDate(localDate);
    localCookie.setPath("/");
    paramWebBrowser.setCookie(paramString, localCookie);
    if (paramBoolean1)
    {
      localCookie = new Cookie("debug_start_session", "1");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
      localCookie = new Cookie("ZendDebuggerCookie", "");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
    }
    if (paramBoolean2)
    {
      localCookie = new Cookie("start_profile", "1");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
    }
  }

  public void a(WebBrowser paramWebBrowser, String paramString)
  {
    if (paramWebBrowser != null)
    {
      Date localDate = new GregorianCalendar(2000, 2, 12).getTime();
      Cookie localCookie = new Cookie("_bm", "");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
      localCookie = new Cookie("debug_port", "");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
      localCookie = new Cookie("debug_host", "");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
      localCookie = new Cookie("start_debug", "");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
      localCookie = new Cookie("send_sess_end", "");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
      localCookie = new Cookie("debug_jit", "");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
      localCookie = new Cookie("original_url", "");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
      localCookie = new Cookie("debug_stop", "");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
      localCookie = new Cookie("debug_start_session", "");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
      localCookie = new Cookie("ZendDebuggerCookie", "");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
      localCookie = new Cookie("start_profile", "");
      localCookie.setExpireDate(localDate);
      localCookie.setPath("/");
      paramWebBrowser.setCookie(paramString, localCookie);
    }
  }

  static void a(d paramd)
  {
    paramd.c();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.d
 * JD-Core Version:    0.6.0
 */