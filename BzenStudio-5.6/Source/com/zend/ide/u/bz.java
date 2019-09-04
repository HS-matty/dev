package com.zend.ide.u;

import com.zend.ide.bd.c;
import com.zend.ide.j.h;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class bz extends AbstractAction
{
  final bs b;

  public bz(bs parambs)
  {
    super("FTPRootConnectionAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File localFile = this.b.x();
    bh localbh = (bh)h.m.A(localFile);
    JFrame localJFrame = c.b().h();
    if (paramActionEvent.getActionCommand().equals(ct.a(187)))
    {
      boolean bool = bd.a(localbh);
      if (!bool)
        bool = bd.a(localJFrame, localbh, false);
      if (bool)
        bd.a(localJFrame, localbh, false, true, new w(this));
    }
    else
    {
      bd.b(localbh, true, new eb(this));
    }
    this.b.c().repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.bz
 * JD-Core Version:    0.6.0
 */