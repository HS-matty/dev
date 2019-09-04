package com.zend.ide.p;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class ib
  implements ChangeListener
{
  final pb a;

  ib(pb parampb)
  {
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    pb.b(this.a).getModel().setRollover(pb.a(this.a).getModel().isRollover());
    if (pb.a(this.a).getModel().isPressed())
      pb.b(this.a).a(false);
    pb.b(this.a).getModel().setPressed(pb.a(this.a).getModel().isPressed());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ib
 * JD-Core Version:    0.6.0
 */