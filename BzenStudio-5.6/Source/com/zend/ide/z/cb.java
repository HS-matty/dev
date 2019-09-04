package com.zend.ide.z;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;

public class cb extends AbstractAction
{
  final bn a;

  public cb(bn parambn)
  {
    super("profilerSortByTimeTreeAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a.b() != null)
      bn.d(this.a).a(this.a.b());
    else
      bn.d(this.a).a((DefaultMutableTreeNode)bn.d(this.a).getModel().getRoot());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.cb
 * JD-Core Version:    0.6.0
 */