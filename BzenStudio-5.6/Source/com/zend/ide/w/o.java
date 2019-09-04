package com.zend.ide.w;

import com.zend.ide.desktop.cj;

public class o
{
  private cj a;
  private bb b;

  public o(cj paramcj, bb parambb)
  {
    this.a = paramcj;
    this.b = parambb;
  }

  public void a()
  {
    com.zend.ide.k.c localc = com.zend.ide.bd.c.b().f();
    if (localc.a("sourceControlOutput") == null)
      localc.a(this.b, "CVS_OUTPUT");
    localc.c(this.b);
    this.a.e(true);
    this.b.a("");
    this.b.repaint();
    this.b.revalidate();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.o
 * JD-Core Version:    0.6.0
 */