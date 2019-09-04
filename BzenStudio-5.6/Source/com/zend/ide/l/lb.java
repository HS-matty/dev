package com.zend.ide.l;

import com.zend.ide.bd.c;
import com.zend.ide.p.d.bp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;

class lb
  implements ActionListener
{
  final by a;

  lb(by paramby)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bp localbp = by.c(this.a);
    int i = localbp.showOpenDialog(c.b().h());
    if (i != 0)
      return;
    by.d(this.a).setText(localbp.getSelectedFile().getPath());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.lb
 * JD-Core Version:    0.6.0
 */