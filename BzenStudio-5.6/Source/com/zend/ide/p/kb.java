package com.zend.ide.p;

import javax.swing.ButtonModel;
import javax.swing.JPopupMenu;

class kb
  implements Runnable
{
  final jb a;

  kb(jb paramjb)
  {
  }

  public void run()
  {
    if ((!pb.c(this.a.a).isShowing()) && (pb.b(this.a.a).isSelected()) && (!pb.b(this.a.a).getModel().isPressed()))
      pb.b(this.a.a).setSelected(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.kb
 * JD-Core Version:    0.6.0
 */