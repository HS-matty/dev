package com.zend.ide.d;

import com.zend.ide.bd.c;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.cm;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class rb
  implements ActionListener
{
  private bp a;
  final pd b;

  public rb(pd parampd)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a == null)
    {
      this.a = new bp(false);
      this.a.setDialogTitle(ct.a(225));
      this.a.setFileSelectionMode(1);
    }
    int i = this.a.showOpenDialog(c.b().h());
    if (i == 0)
    {
      File localFile = this.a.getSelectedFile();
      pd.a(this.b).a("file:///" + localFile.getAbsolutePath() + File.separator);
      pd.a(this.b).a(true);
      this.b.a(pd.a(this.b));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.rb
 * JD-Core Version:    0.6.0
 */