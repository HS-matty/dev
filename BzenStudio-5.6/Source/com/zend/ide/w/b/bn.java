package com.zend.ide.w.b;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;

class bn extends AbstractAction
{
  final bs a;

  public bn(bs parambs, String paramString, Icon paramIcon)
  {
    super(paramString, paramIcon);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bs.j(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bn
 * JD-Core Version:    0.6.0
 */