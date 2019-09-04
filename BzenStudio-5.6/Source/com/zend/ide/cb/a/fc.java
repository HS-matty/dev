package com.zend.ide.cb.a;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;

class fc extends AbstractAction
{
  final s a;

  public fc(s params)
  {
    super(ct.a(309));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    s.a(this.a).removeAllElements();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.fc
 * JD-Core Version:    0.6.0
 */