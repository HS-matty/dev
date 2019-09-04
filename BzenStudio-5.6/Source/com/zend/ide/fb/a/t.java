package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.WebBrowser;
import com.jniwrapper.win32.ie.event.StatusCode;
import com.jniwrapper.win32.ie.event.WebBrowserEventsHandler;
import java.awt.Dimension;
import javax.swing.SwingUtilities;

class t
  implements WebBrowserEventsHandler
{
  private WebBrowserEventsHandler a;
  final g b;

  public t(g paramg, WebBrowserEventsHandler paramWebBrowserEventsHandler)
  {
    this.a = paramWebBrowserEventsHandler;
  }

  public boolean beforeNavigate(WebBrowser paramWebBrowser, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return this.a.beforeNavigate(paramWebBrowser, paramString1, paramString2, paramString3, paramString4);
  }

  public boolean beforeFileDownload()
  {
    return this.a.beforeFileDownload();
  }

  public boolean windowClosing(boolean paramBoolean)
  {
    SwingUtilities.invokeLater(new u(this));
    return false;
  }

  public Dimension clientAreaSizeRequested(Dimension paramDimension)
  {
    return this.a.clientAreaSizeRequested(paramDimension);
  }

  public boolean navigationErrorOccured(WebBrowser paramWebBrowser, String paramString1, String paramString2, StatusCode paramStatusCode)
  {
    return this.a.navigationErrorOccured(paramWebBrowser, paramString1, paramString2, paramStatusCode);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.t
 * JD-Core Version:    0.6.0
 */