package com.zend.ide.d;

import com.zend.ide.util.ct;
import com.zend.ide.w.b.bs;
import com.zend.ide.w.b.h;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;

class dl extends dr
{
  final dn b;

  private dl(dn paramdn)
  {
    super(paramdn);
  }

  public void a(MouseEvent paramMouseEvent)
  {
    Component localComponent = (Component)paramMouseEvent.getSource();
    Color localColor = this.b.b.a(localComponent, ct.a(1170), localComponent.getBackground());
    cg localcg = dn.a(this.b);
    if ((localcg != null) && (localColor != null))
    {
      localComponent.setBackground(localColor);
      String str = localcg.b();
      this.b.c().a(str, localColor);
      if (str.equals("cvsDiff.diffAppend"))
        dn.b(this.b).e().a(localColor);
      else if (str.equals("cvsDiff.diffChange"))
        dn.b(this.b).e().c(localColor);
      else if (str.equals("cvsDiff.diffDelete"))
        dn.b(this.b).e().b(localColor);
      this.b.h();
    }
  }

  dl(dn paramdn, dj paramdj)
  {
    this(paramdn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.dl
 * JD-Core Version:    0.6.0
 */