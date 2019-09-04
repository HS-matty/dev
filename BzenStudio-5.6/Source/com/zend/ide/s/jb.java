package com.zend.ide.s;

import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class jb extends AbstractAction
{
  final bj a;

  public jb(bj parambj)
  {
    super("", cv.b("openfile16.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bj.g(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.jb
 * JD-Core Version:    0.6.0
 */