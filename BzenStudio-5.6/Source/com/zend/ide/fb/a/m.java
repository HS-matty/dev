package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.Browser;
import com.zend.ide.util.en;

class m extends Thread
{
  private String a;
  final g b;

  m(g paramg)
  {
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public void run()
  {
    if (g.a(this.b).getTabCount() == 0)
      this.b.h();
    ((Browser)g.a(this.b).getSelectedComponent()).navigate(this.a);
    ((Browser)g.a(this.b).getSelectedComponent()).waitReady();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.m
 * JD-Core Version:    0.6.0
 */