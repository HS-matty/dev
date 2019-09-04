package com.zend.ide.be.a;

import com.zend.ide.be.d;
import com.zend.ide.be.h;
import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;

class w
{
  private br a;
  private JComponent b;
  private h c;
  private String d;

  public w(d paramd, String paramString, h paramh)
  {
    this.c = paramh;
    this.d = paramString;
    this.a = new br(paramd, paramString, paramh);
    this.b = paramh.b();
  }

  public JComponent b()
  {
    return this.b;
  }

  public br c()
  {
    return this.a;
  }

  public h d()
  {
    return this.c;
  }

  public void a(MouseInputListener paramMouseInputListener)
  {
    this.c.a(paramMouseInputListener);
  }

  public void b(MouseInputListener paramMouseInputListener)
  {
    this.c.b(paramMouseInputListener);
  }

  public String e()
  {
    return this.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.w
 * JD-Core Version:    0.6.0
 */