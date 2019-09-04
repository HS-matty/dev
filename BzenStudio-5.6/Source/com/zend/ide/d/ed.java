package com.zend.ide.d;

import com.zend.ide.n.bd;
import com.zend.ide.p.x;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JList;

public class ed extends AbstractAction
{
  final mb a;

  protected ed(mb parammb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool = mb.h(this.a).isSelected();
    bd localbd = this.a.i();
    if (localbd != null)
    {
      localbd.a(bool);
      mb.a(this.a, bool, Color.WHITE);
      localbd.b(Color.WHITE);
      mb.d(this.a).repaint();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.ed
 * JD-Core Version:    0.6.0
 */