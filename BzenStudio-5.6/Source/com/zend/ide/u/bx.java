package com.zend.ide.u;

import com.zend.ide.bd.c;
import com.zend.ide.j.h;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class bx extends AbstractAction
{
  public bx()
  {
    super("AddFTPServerAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    k localk = new k();
    JFrame localJFrame = c.b().h();
    bd.a(localJFrame, localk, true, true, null);
    if (localk.l() == null)
    {
      h.m.b(((k)localk).a());
      h.m.b(localk);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.bx
 * JD-Core Version:    0.6.0
 */