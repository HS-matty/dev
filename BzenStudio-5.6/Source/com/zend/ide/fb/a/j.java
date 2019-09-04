package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.Browser;
import com.jniwrapper.win32.ie.WebBrowser;
import com.jniwrapper.win32.ie.event.NavigationEventAdapter;
import javax.swing.SwingUtilities;

class j extends NavigationEventAdapter
{
  final Browser a;
  final p b;

  j(p paramp, Browser paramBrowser)
  {
  }

  public void navigationCompleted(WebBrowser paramWebBrowser, String paramString)
  {
    SwingUtilities.invokeLater(new q(this, paramWebBrowser, paramString));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.j
 * JD-Core Version:    0.6.0
 */