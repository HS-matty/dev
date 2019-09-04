package com.zend.ide.p.d;

import java.io.File;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;

class db
  implements Runnable
{
  final ListDataEvent a;
  final l b;

  db(l paraml, ListDataEvent paramListDataEvent)
  {
  }

  public void run()
  {
    Object localObject = bw.a(this.b.a).getModel().getElementAt(this.a.getIndex0());
    if (((localObject instanceof File)) && (((File)localObject).isDirectory()))
    {
      bw.a(this.b.a).setSelectedIndex(this.a.getIndex0());
      if (this.b.a.bz)
      {
        bw.a(this.b.a, bw.a(this.b.a).getSelectedIndex());
        this.b.a.bz = false;
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.db
 * JD-Core Version:    0.6.0
 */