package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.bc;
import com.zend.ide.o.fk;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.TreePath;

public class bk extends AbstractAction
{
  final bo a;

  public bk(bo parambo)
  {
    super("WatchFromHereAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    TreePath[] arrayOfTreePath = this.a.getSelectionPaths();
    if (arrayOfTreePath == null)
      return;
    bc localbc = this.a.j.u();
    synchronized (this.a.getTreeLock())
    {
      for (int i = 0; i < arrayOfTreePath.length; i++)
      {
        m localm = (m)arrayOfTreePath[i].getLastPathComponent();
        a locala = (a)localm.getUserObject();
        String str = locala.c();
        localbc.a(str);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.bk
 * JD-Core Version:    0.6.0
 */