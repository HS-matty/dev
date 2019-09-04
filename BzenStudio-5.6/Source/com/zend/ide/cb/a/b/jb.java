package com.zend.ide.cb.a.b;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

class jb
  implements TreeSelectionListener
{
  private boolean a = true;
  final db b;

  public jb(db paramdb)
  {
  }

  public void valueChanged(TreeSelectionEvent paramTreeSelectionEvent)
  {
    if (this.a)
      db.a(this.b, false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.jb
 * JD-Core Version:    0.6.0
 */