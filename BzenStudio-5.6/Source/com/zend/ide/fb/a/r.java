package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.WebBrowser;
import com.jniwrapper.win32.ie.dom.HTMLDocument;

class r
  implements Runnable
{
  final p a;

  r(p paramp)
  {
  }

  public void run()
  {
    g.b(this.a.b, this.a.b.k());
    this.a.b.d(this.a.a.getDocument().getTitle());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.r
 * JD-Core Version:    0.6.0
 */