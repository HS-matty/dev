package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.Browser;
import com.jniwrapper.win32.ie.event.NavigationEventListener;
import com.jniwrapper.win32.ie.event.WebBrowserEventsHandler;
import com.zend.ide.fb.j;
import com.zend.ide.util.cu;
import com.zend.ide.util.en;
import com.zend.ide.util.s;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.ActionMap;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class g
  implements com.zend.ide.fb.o, cu
{
  private m a;
  private WebBrowserEventsHandler b;
  private JPanel c;
  private en d;
  private Browser e;
  private ArrayList f;
  private boolean g;
  private boolean h;
  private NavigationEventListener i;

  public g()
  {
    e();
  }

  private void e()
  {
    this.d = new h(this);
    g();
    this.d.addChangeListener(new k(this));
    this.d.setUI(new w(this));
    this.c = new JPanel(new BorderLayout());
    this.c.add(this.d, "Center");
    this.c.validate();
    this.a = new m(this);
    this.f = new ArrayList(5);
    this.i = new n(this);
    h();
  }

  private void g()
  {
    ((s)this.d.q()).a("keys.closeDocument", this.d.getActionMap().get("closeAction"), "default", true);
    ((s)this.d.q()).a("keys.closeAll", this.d.getActionMap().get("closeAllAction"), "default", true);
    ((s)this.d.q()).a("keys.closeOthers", this.d.getActionMap().get("closeOthersAction"), "default", true);
  }

  public Browser h()
  {
    return a(null);
  }

  private Browser a(String paramString)
  {
    Browser localBrowser = i();
    this.d.addTab(paramString == null ? "Untitled" : paramString, localBrowser);
    this.d.setSelectedComponent(localBrowser);
    if (paramString != null)
      SwingUtilities.invokeLater(new c(this, localBrowser, paramString));
    a(k());
    return localBrowser;
  }

  private Browser i()
  {
    Browser localBrowser = new Browser();
    localBrowser.setFocusable(false);
    localBrowser.putClientProperty("browserState", new j());
    localBrowser.setEventHandler(this.b);
    localBrowser.addStatusListener(new o(this, localBrowser));
    localBrowser.addNavigationListener(this.i);
    localBrowser.setNewWindowHandler(new p(this, localBrowser));
    return localBrowser;
  }

  private void b(String paramString)
  {
    this.a = new m(this);
    this.a.a(paramString);
    this.a.start();
  }

  public String j()
  {
    return k().getLocationURL();
  }

  protected Browser k()
  {
    return this.e;
  }

  public void a(WebBrowserEventsHandler paramWebBrowserEventsHandler)
  {
    this.b = new t(this, paramWebBrowserEventsHandler);
    Component[] arrayOfComponent = this.d.getComponents();
    for (int j = 0; j < arrayOfComponent.length; j++)
    {
      Component localComponent = arrayOfComponent[j];
      if (!(localComponent instanceof Browser))
        continue;
      ((Browser)localComponent).setEventHandler(paramWebBrowserEventsHandler);
    }
  }

  public void a(NavigationEventListener paramNavigationEventListener)
  {
    Component[] arrayOfComponent = this.d.getComponents();
    for (int j = 0; j < arrayOfComponent.length; j++)
    {
      Component localComponent = arrayOfComponent[j];
      if (!(localComponent instanceof Browser))
        continue;
      ((Browser)localComponent).addNavigationListener(paramNavigationEventListener);
    }
  }

  public void l()
  {
    b(k().getLocationURL());
  }

  public void a()
  {
    k().goBack();
  }

  public void b()
  {
    k().goForward();
  }

  public void c()
  {
    k().refresh();
  }

  public void d()
  {
    k().stop();
  }

  public boolean m()
  {
    return this.g;
  }

  public boolean n()
  {
    return this.h;
  }

  public String e()
  {
    return j();
  }

  public void a(String paramString)
  {
    k().setContent(paramString);
  }

  public void f()
  {
    h();
  }

  public Component g()
  {
    return this.c;
  }

  public j o()
  {
    return (j)k().getClientProperty("browserState");
  }

  public void a(String paramString, boolean paramBoolean)
  {
    b(paramString);
  }

  public void a(com.zend.ide.fb.p paramp)
  {
    if (!this.f.contains(paramp))
      this.f.add(paramp);
  }

  public void a(boolean paramBoolean)
  {
    if (this.f == null)
      return;
    for (int j = 0; j < this.f.size(); j++)
    {
      com.zend.ide.fb.p localp = (com.zend.ide.fb.p)this.f.get(j);
      localp.a(paramBoolean);
    }
  }

  public void b(boolean paramBoolean)
  {
    if (this.f == null)
      return;
    for (int j = 0; j < this.f.size(); j++)
    {
      com.zend.ide.fb.p localp = (com.zend.ide.fb.p)this.f.get(j);
      localp.b(paramBoolean);
    }
  }

  public void c(String paramString)
  {
    if (this.f == null)
      return;
    for (int j = 0; j < this.f.size(); j++)
    {
      com.zend.ide.fb.p localp = (com.zend.ide.fb.p)this.f.get(j);
      localp.a(paramString);
    }
  }

  public void d(String paramString)
  {
    if (this.f == null)
      return;
    for (int j = 0; j < this.f.size(); j++)
    {
      com.zend.ide.fb.p localp = (com.zend.ide.fb.p)this.f.get(j);
      localp.b(paramString);
    }
  }

  public void e(String paramString)
  {
    if (this.f == null)
      return;
    for (int j = 0; j < this.f.size(); j++)
    {
      com.zend.ide.fb.p localp = (com.zend.ide.fb.p)this.f.get(j);
      localp.c(paramString);
    }
  }

  public void a(j paramj)
  {
    if (this.f == null)
      return;
    for (int j = 0; j < this.f.size(); j++)
    {
      com.zend.ide.fb.p localp = (com.zend.ide.fb.p)this.f.get(j);
      localp.a(paramj);
    }
  }

  private void a(Browser paramBrowser)
  {
    if ((k() == null) && (paramBrowser != null))
    {
      this.e = paramBrowser;
      b(o());
    }
    else if (paramBrowser != null)
    {
      p();
      this.e = paramBrowser;
      b(o());
    }
    else
    {
      this.e = null;
      b(null);
    }
  }

  private void b(j paramj)
  {
    a(paramj);
    if (paramj == null)
    {
      this.g = false;
      this.h = false;
      return;
    }
    this.g = paramj.b();
    this.h = paramj.c();
  }

  private void p()
  {
    o().a(m(), n());
  }

  static Browser a(g paramg, Browser paramBrowser)
  {
    return paramg.e = paramBrowser;
  }

  static void a(g paramg, String paramString)
  {
    paramg.b(paramString);
  }

  static en a(g paramg)
  {
    return paramg.d;
  }

  static void b(g paramg, Browser paramBrowser)
  {
    paramg.a(paramBrowser);
  }

  static boolean a(g paramg, boolean paramBoolean)
  {
    return paramg.g = paramBoolean;
  }

  static boolean b(g paramg, boolean paramBoolean)
  {
    return paramg.h = paramBoolean;
  }

  static WebBrowserEventsHandler b(g paramg)
  {
    return paramg.b;
  }

  static NavigationEventListener c(g paramg)
  {
    return paramg.i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.g
 * JD-Core Version:    0.6.0
 */