package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.WebBrowser;

class i extends a
{
  final d c;

  i(d paramd)
  {
    super(paramd);
  }

  public boolean beforeNavigate(WebBrowser paramWebBrowser, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.b = paramWebBrowser;
    this.c.a(paramWebBrowser, paramString1, false, true);
    paramWebBrowser.refresh();
    d.a(this.c);
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.i
 * JD-Core Version:    0.6.0
 */