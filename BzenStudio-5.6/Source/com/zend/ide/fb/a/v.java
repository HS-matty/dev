package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.WebBrowser;
import com.jniwrapper.win32.ie.event.NavigationEventListener;

class v
  implements NavigationEventListener
{
  boolean a;
  a b;
  final d c;

  v(d paramd)
  {
  }

  public void a(boolean paramBoolean, a parama)
  {
    this.a = paramBoolean;
    this.b = parama;
  }

  public void downloadBegin()
  {
  }

  public void downloadCompleted()
  {
    if (this.a)
    {
      this.a = false;
      this.c.a(this.b.a(), this.b.a().getLocationURL());
      this.c.b(0);
    }
  }

  public void documentCompleted(WebBrowser paramWebBrowser, String paramString)
  {
  }

  public void navigationCompleted(WebBrowser paramWebBrowser, String paramString)
  {
  }

  public void progressChanged(int paramInt1, int paramInt2)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.v
 * JD-Core Version:    0.6.0
 */