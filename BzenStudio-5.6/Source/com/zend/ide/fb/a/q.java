package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.WebBrowser;
import com.jniwrapper.win32.ie.dom.HTMLDocument;
import com.zend.ide.util.en;

class q
  implements Runnable
{
  final WebBrowser a;
  final String b;
  final j c;

  q(j paramj, WebBrowser paramWebBrowser, String paramString)
  {
  }

  public void run()
  {
    int i = g.a(this.c.b.b).indexOfComponent(this.c.a);
    if (i != -1)
    {
      String str = this.a.getDocument().getTitle();
      if ((str == null) || (str.equals("")))
        str = this.b;
      g.a(this.c.b.b).setTitleAt(i, str);
      g.a(this.c.b.b).setToolTipTextAt(i, str);
    }
    this.c.b.b.e(this.b);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.q
 * JD-Core Version:    0.6.0
 */