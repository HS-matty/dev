package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.Browser;
import com.jniwrapper.win32.ie.WebBrowser;
import com.jniwrapper.win32.ie.event.NewWindowEventHandler;
import com.jniwrapper.win32.ie.event.NewWindowEventHandler.NewWindowAction;
import com.zend.ide.util.ct;
import com.zend.ide.util.en;
import javax.swing.SwingUtilities;

class p
  implements NewWindowEventHandler
{
  protected WebBrowser a;
  final g b;

  public p(g paramg, WebBrowser paramWebBrowser)
  {
    this.a = paramWebBrowser;
  }

  public NewWindowEventHandler.NewWindowAction newWindow()
  {
    Browser localBrowser = new Browser(this.a.getOleMessageLoop());
    localBrowser.setFocusable(false);
    localBrowser.putClientProperty("browserState", new com.zend.ide.fb.j());
    localBrowser.setEventHandler(g.b(this.b));
    localBrowser.addStatusListener(new o(this.b, localBrowser));
    localBrowser.addNavigationListener(g.c(this.b));
    localBrowser.setNewWindowHandler(new p(this.b, localBrowser));
    g.a(this.b).addTab(ct.a(273), localBrowser);
    g.a(this.b).setSelectedComponent(localBrowser);
    localBrowser.addNavigationListener(new j(this, localBrowser));
    NewWindowEventHandler.NewWindowAction localNewWindowAction = new NewWindowEventHandler.NewWindowAction(NewWindowEventHandler.NewWindowAction.ACTION_REPLACE_BROWSER);
    localNewWindowAction.setBrowser(localBrowser);
    SwingUtilities.invokeLater(new r(this));
    return localNewWindowAction;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.p
 * JD-Core Version:    0.6.0
 */