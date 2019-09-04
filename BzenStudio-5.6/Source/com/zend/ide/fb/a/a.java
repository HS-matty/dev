package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.WebBrowser;
import com.jniwrapper.win32.ie.event.DefaultWebBrowserEventsHandler;

class a extends DefaultWebBrowserEventsHandler
{
  protected WebBrowser b;
  private boolean a;
  private boolean d;
  private String e;
  final d g;

  a(d paramd)
  {
  }

  public WebBrowser a()
  {
    return this.b;
  }

  public boolean beforeNavigate(WebBrowser paramWebBrowser, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.b = paramWebBrowser;
    if (this.g.f() == 1)
    {
      this.g.b(0);
      this.g.a(paramWebBrowser, paramString1, false, false);
    }
    else if ((this.g.f() == 2) && (this.a))
    {
      this.a = false;
      this.g.a(paramWebBrowser, paramString1, true, false);
    }
    else if ((this.g.f() == 3) && (paramString3 != null) && (paramString3.length() > 0))
    {
      this.g.a(paramWebBrowser, paramString1, false, false);
    }
    else if (this.a)
    {
      if (this.d)
      {
        if (!paramString1.equals(this.e));
      }
      else
      {
        this.g.a(paramWebBrowser, paramString1, false, false);
        this.a = false;
      }
    }
    else if (this.g.f() == 0)
    {
      this.g.a(this.b, paramString1);
    }
    return super.beforeNavigate(paramWebBrowser, paramString1, paramString2, paramString3, paramString4);
  }

  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.a
 * JD-Core Version:    0.6.0
 */