package com.zend.ide.s;

import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class kb extends AbstractAction
{
  final bj a;

  public kb(bj parambj)
  {
    super("", cv.b("help16.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bj.h(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.kb
 * JD-Core Version:    0.6.0
 */