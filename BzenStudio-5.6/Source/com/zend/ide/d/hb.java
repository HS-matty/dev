package com.zend.ide.d;

import com.zend.ide.p.x;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class hb
  implements ActionListener
{
  final mb a;

  hb(mb parammb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool = mb.a(this.a).isSelected();
    mb.a(this.a, mb.b(this.a), bool);
    mb.a(this.a, mb.c(this.a), bool);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.hb
 * JD-Core Version:    0.6.0
 */