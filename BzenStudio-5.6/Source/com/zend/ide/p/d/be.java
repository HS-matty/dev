package com.zend.ide.p.d;

import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicFileChooserUI.NewFolderAction;

public class be extends BasicFileChooserUI.NewFolderAction
{
  final bw a;

  protected be(bw parambw)
  {
    super(parambw);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    super.actionPerformed(paramActionEvent);
    SwingUtilities.invokeLater(new eb(this));
    this.a.bz = true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.be
 * JD-Core Version:    0.6.0
 */