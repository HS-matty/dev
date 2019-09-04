package com.zend.ide.eb;

import com.zend.ide.p.f.e;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreePath;

class m
  implements TreeModelListener
{
  final k x;

  m(k paramk)
  {
  }

  public void treeNodesChanged(TreeModelEvent paramTreeModelEvent)
  {
  }

  public void treeNodesInserted(TreeModelEvent paramTreeModelEvent)
  {
    if ((paramTreeModelEvent.getChildren()[0] instanceof q))
    {
      if (!((a)((q)paramTreeModelEvent.getChildren()[0]).getUserObject()).h())
        return;
      k.d(this.x).setSelectionRow(0);
      TreePath localTreePath1 = k.d(this.x).getSelectionPath();
      if ((localTreePath1 != null) && (!k.d(this.x).isExpanded(localTreePath1)))
        k.d(this.x).expandPath(localTreePath1);
      TreePath localTreePath2 = new TreePath(((e)paramTreeModelEvent.getChildren()[0]).getPath());
      SwingUtilities.invokeLater(new ab(this, localTreePath2));
    }
  }

  public void treeNodesRemoved(TreeModelEvent paramTreeModelEvent)
  {
  }

  public void treeStructureChanged(TreeModelEvent paramTreeModelEvent)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.m
 * JD-Core Version:    0.6.0
 */