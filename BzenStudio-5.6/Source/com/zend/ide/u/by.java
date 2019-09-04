package com.zend.ide.u;

import com.zend.ide.bd.c;
import com.zend.ide.j.h;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class by extends AbstractAction
{
  final bs b;

  public by(bs parambs)
  {
    super("EditFTPServerPropertiesAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File localFile = this.b.x();
    JFrame localJFrame = c.b().h();
    bh localbh = (bh)h.m.A(localFile);
    boolean bool = bd.a(localJFrame, localbh);
    if (!bool)
      return;
    bd.a(localJFrame, localbh, false, true, new t(this, localFile));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.by
 * JD-Core Version:    0.6.0
 */