package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.Browser;
import com.zend.ide.fb.o;
import com.zend.ide.fb.p;
import java.awt.Component;

public class e
  implements o
{
  private Browser a = new Browser();

  public e()
  {
    this.a.setContextMenuProvider(new f(this));
    this.a.setSilent(true);
  }

  public void a()
  {
  }

  public void b()
  {
  }

  public void c()
  {
  }

  public void d()
  {
  }

  public String e()
  {
    return null;
  }

  public void a(String paramString)
  {
    this.a.setContent(paramString);
  }

  public void f()
  {
  }

  public Component g()
  {
    return this.a;
  }

  public void a(p paramp)
  {
  }

  public void a(String paramString, boolean paramBoolean)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.e
 * JD-Core Version:    0.6.0
 */