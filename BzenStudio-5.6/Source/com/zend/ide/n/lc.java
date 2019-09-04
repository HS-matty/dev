package com.zend.ide.n;

import java.awt.event.MouseEvent;
import javax.swing.text.JTextComponent;

class lc
  implements el
{
  final mb a;

  private lc(mb parammb)
  {
  }

  public String a(MouseEvent paramMouseEvent)
  {
    if (mb.a(this.a) != null)
    {
      JTextComponent localJTextComponent = (JTextComponent)paramMouseEvent.getComponent();
      int i = localJTextComponent.viewToModel(paramMouseEvent.getPoint());
      if ((i >= mb.a(this.a).a()) && (i <= mb.a(this.a).b()))
        return mb.a(this.a).c();
    }
    return null;
  }

  lc(mb parammb, cy paramcy)
  {
    this(parammb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.lc
 * JD-Core Version:    0.6.0
 */