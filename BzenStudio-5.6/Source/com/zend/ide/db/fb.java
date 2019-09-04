package com.zend.ide.db;

import com.zend.ide.p.d.bp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class fb
  implements ActionListener
{
  final int c;
  final JList a;
  final x b;

  fb(x paramx, int paramInt, JList paramJList)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bp localbp = x.b(this.b, this.c);
    int i = localbp.showOpenDialog(this.b);
    if (i != 0)
      return;
    File[] arrayOfFile = localbp.getSelectedFiles();
    for (int j = 0; j < arrayOfFile.length; j++)
    {
      File localFile = arrayOfFile[j];
      ((DefaultListModel)this.a.getModel()).addElement(localFile.getPath());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.fb
 * JD-Core Version:    0.6.0
 */