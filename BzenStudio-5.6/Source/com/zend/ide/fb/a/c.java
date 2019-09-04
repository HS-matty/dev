package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.Browser;

class c
  implements Runnable
{
  final Browser b;
  final String c;
  final g a;

  c(g paramg, Browser paramBrowser, String paramString)
  {
  }

  public void run()
  {
    this.b.waitReady();
    g.a(this.a, this.c);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.c
 * JD-Core Version:    0.6.0
 */