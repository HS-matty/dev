package com.zend.ide.r;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;

class cb
  implements ActionListener
{
  final bq a;

  cb(bq parambq)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bq.a(this.a, bq.a(this.a).getSelectedValues());
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.cb
 * JD-Core Version:    0.6.0
 */