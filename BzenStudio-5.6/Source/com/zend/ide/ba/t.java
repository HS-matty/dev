package com.zend.ide.ba;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

class t extends DefaultTreeModel
{
  final o a;

  public t(o paramo, DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    super(paramDefaultMutableTreeNode);
  }

  public void insertNodeInto(MutableTreeNode paramMutableTreeNode1, MutableTreeNode paramMutableTreeNode2, int paramInt)
  {
    super.insertNodeInto(paramMutableTreeNode1, paramMutableTreeNode2, paramInt);
    this.a.expandRow(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ba.t
 * JD-Core Version:    0.6.0
 */