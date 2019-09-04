package com.zend.ide.n;

import com.zend.ide.util.dn;
import java.awt.event.ActionEvent;
import javax.swing.Action;

class jg extends dn
{
  final gz b;

  public jg(gz paramgz, Action paramAction)
  {
    super(paramAction);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.b.grabFocus();
    super.actionPerformed(paramActionEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.jg
 * JD-Core Version:    0.6.0
 */