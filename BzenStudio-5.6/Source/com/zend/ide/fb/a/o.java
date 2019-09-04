package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.Browser;
import com.jniwrapper.win32.ie.event.StatusEventAdapter;
import com.zend.ide.bd.c;
import com.zend.ide.be.k;
import com.zend.ide.util.en;

class o extends StatusEventAdapter
{
  private Browser a;
  final g b;

  public o(g paramg, Browser paramBrowser)
  {
    this.a = paramBrowser;
  }

  public void backButtonEnabled(boolean paramBoolean)
  {
    g.a(this.b, paramBoolean);
    this.b.a(paramBoolean);
  }

  public void forwardButtonEnabled(boolean paramBoolean)
  {
    g.b(this.b, paramBoolean);
    this.b.b(paramBoolean);
  }

  public void statusTextChanged(String paramString)
  {
    c.b().d().c(paramString);
    this.b.c(paramString);
  }

  public void titleChanged(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      paramString = "Untitled";
    int i = g.a(this.b).indexOfComponent(this.a);
    g.a(this.b).setTitleAt(i, paramString);
    g.a(this.b).setToolTipTextAt(i, paramString);
    this.b.d(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.o
 * JD-Core Version:    0.6.0
 */