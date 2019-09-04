package com.zend.ide.d;

import com.zend.ide.n.bd;
import com.zend.ide.util.ct;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;

class m extends MouseAdapter
{
  final mb a;

  private m(mb parammb)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    Component localComponent = (Component)paramMouseEvent.getSource();
    if (localComponent.isEnabled())
    {
      Color localColor = this.a.a(localComponent, ct.a(1164), localComponent.getBackground());
      bd localbd = this.a.i();
      if ((localbd != null) && (localColor != null))
      {
        localComponent.setBackground(localColor);
        localbd.a(localColor);
        mb.d(this.a).repaint();
      }
    }
  }

  m(mb parammb, hb paramhb)
  {
    this(parammb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.m
 * JD-Core Version:    0.6.0
 */