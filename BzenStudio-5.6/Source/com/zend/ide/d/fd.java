package com.zend.ide.d;

import com.zend.ide.n.bd;
import com.zend.ide.p.x;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JList;

public class fd extends AbstractAction
{
  final mb a;

  protected fd(mb parammb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bd localbd = this.a.i();
    if (localbd != null)
    {
      int i = 0;
      i += (mb.f(this.a).isSelected() ? 1 : 0);
      i += (mb.g(this.a).isSelected() ? 2 : 0);
      localbd.a(i);
      mb.d(this.a).repaint();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.fd
 * JD-Core Version:    0.6.0
 */