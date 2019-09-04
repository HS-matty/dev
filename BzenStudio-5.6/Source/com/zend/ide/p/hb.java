package com.zend.ide.p;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class hb
  implements ChangeListener
{
  final pb a;

  hb(pb parampb)
  {
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    if (!pb.b(this.a).isSelected())
      pb.a(this.a).getModel().setRollover(pb.b(this.a).getModel().isRollover());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.hb
 * JD-Core Version:    0.6.0
 */