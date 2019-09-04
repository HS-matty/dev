package com.zend.ide.w.c.a;

import com.zend.ide.p.d.bp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;

class d
  implements ActionListener
{
  final hb a;

  d(hb paramhb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (hb.a(this.a) == null)
      hb.a(this.a, new bp(false));
    hb.a(this.a).setFileSelectionMode(1);
    int i = hb.a(this.a).showOpenDialog(this.a);
    if (i == 0)
      hb.b(this.a).setText(hb.a(this.a).getSelectedFile().getPath());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.d
 * JD-Core Version:    0.6.0
 */