package com.zend.ide.desktop;

import com.zend.ide.util.c.h;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class dd extends AbstractAction
{
  final cj a;

  public dd(cj paramcj)
  {
    super("OpenTipOfTheDayPageAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    h.c().a(new q(this), true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.dd
 * JD-Core Version:    0.6.0
 */