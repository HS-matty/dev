package com.zend.ide.r;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class db
  implements ActionListener
{
  final bq a;

  db(bq parambq)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bq.a(this.a, null);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.db
 * JD-Core Version:    0.6.0
 */