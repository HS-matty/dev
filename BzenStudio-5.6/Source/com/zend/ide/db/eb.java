package com.zend.ide.db;

import com.zend.ide.p.d.bp;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;

class eb
  implements ActionListener
{
  final x c;

  eb(x paramx)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bp localbp = x.o(this.c);
    int i = localbp.showSaveDialog(this.c);
    if (i != 0)
      return;
    File localFile = localbp.getSelectedFile();
    Dimension localDimension = x.l(this.c).getPreferredSize();
    x.l(this.c).setText(localFile.getPath());
    x.l(this.c).setPreferredSize(localDimension);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.eb
 * JD-Core Version:    0.6.0
 */