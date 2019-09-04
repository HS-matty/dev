package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.Browser;
import com.jniwrapper.win32.ie.event.NavigationEventListener;
import com.jniwrapper.win32.ie.event.StatusEventListener;
import com.zend.ide.util.en;
import java.awt.Component;
import java.util.Iterator;
import java.util.List;

class h extends en
{
  final g c;

  h(g paramg)
  {
  }

  public boolean a(int paramInt, boolean paramBoolean)
  {
    Component localComponent = getComponentAt(paramInt);
    if ((localComponent != null) && ((localComponent instanceof Browser)))
    {
      Browser localBrowser = (Browser)localComponent;
      List localList = localBrowser.getNavigationListeners();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
        localBrowser.removeNavigationListener((NavigationEventListener)localIterator.next());
      localList = localBrowser.getStatusListeners();
      localIterator = localList.iterator();
      while (localIterator.hasNext())
        localBrowser.removeStatusListener((StatusEventListener)localIterator.next());
      localBrowser.setScriptErrorListener(null);
      localBrowser.setNewWindowHandler(null);
      localBrowser.setEventHandler(null);
    }
    boolean bool = super.a(paramInt, paramBoolean);
    g.a(this.c, (Browser)getSelectedComponent());
    System.gc();
    return bool;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.h
 * JD-Core Version:    0.6.0
 */