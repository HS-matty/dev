package com.zend.ide.d;

import com.zend.ide.util.ct;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;

class db extends dr
{
  final de b;

  private db(de paramde)
  {
    super(paramde);
  }

  public void a(MouseEvent paramMouseEvent)
  {
    Component localComponent = (Component)paramMouseEvent.getSource();
    Color localColor = this.b.b.a(localComponent, ct.a(1170), localComponent.getBackground());
    cg localcg = de.b(this.b);
    if ((localcg != null) && (localColor != null))
    {
      localComponent.setBackground(localColor);
      String str = localcg.b();
      this.b.c().a(str, localColor);
      if (str.equals("editing.background"))
        this.b.b.a(localColor);
      if (str.equals("editing.currentLineColor"))
        this.b.b.b(localColor);
    }
  }

  db(de paramde, cm paramcm)
  {
    this(paramde);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.db
 * JD-Core Version:    0.6.0
 */