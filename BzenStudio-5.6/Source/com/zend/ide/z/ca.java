package com.zend.ide.z;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;

public class ca extends AbstractAction
{
  final bn a;

  public ca(bn parambn)
  {
    super("profilerSortByOrderTreeAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a.b() != null)
      bn.d(this.a).b(this.a.b());
    else
      bn.d(this.a).b((DefaultMutableTreeNode)bn.d(this.a).getModel().getRoot());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.ca
 * JD-Core Version:    0.6.0
 */