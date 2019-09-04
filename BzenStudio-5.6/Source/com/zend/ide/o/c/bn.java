package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.bc;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class bn extends AbstractAction
{
  final bq a;

  public bn(bq parambq)
  {
    super("removeWatchkey");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    TreePath[] arrayOfTreePath = this.a.getSelectionPaths();
    if (arrayOfTreePath == null)
      return;
    int i = this.a.getSelectionModel().getLeadSelectionRow();
    synchronized (this.a.getTreeLock())
    {
      for (int j = 0; j < arrayOfTreePath.length; j++)
      {
        o localo = (o)arrayOfTreePath[j].getLastPathComponent();
        a locala = (a)localo.getUserObject();
        bq.a(this.a).b(locala.b());
      }
    }
    this.a.setSelectionRow(i == 0 ? i : i - 1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.bn
 * JD-Core Version:    0.6.0
 */