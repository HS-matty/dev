package com.zend.ide.d;

import com.zend.ide.n.bd;
import com.zend.ide.util.ct;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;

class k extends MouseAdapter
{
  final mb a;

  private k(mb parammb)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    Component localComponent = (Component)paramMouseEvent.getSource();
    if (localComponent.isEnabled())
    {
      Color localColor = this.a.a(localComponent, ct.a(1163), localComponent.getBackground());
      bd localbd = this.a.i();
      if ((localbd != null) && (localColor != null))
      {
        mb.e(this.a).setBackground(localColor);
        mb.e(this.a).setText("");
        localbd.b(localColor);
        mb.d(this.a).repaint();
      }
    }
  }

  k(mb parammb, hb paramhb)
  {
    this(parammb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.k
 * JD-Core Version:    0.6.0
 */