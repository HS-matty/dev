package com.zend.ide.z;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.DefaultMutableTreeNode;

public class bc extends AbstractAction
{
  final bn a;

  public bc(bn parambn)
  {
    super("profilerFunctionDeclarationAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    DefaultMutableTreeNode localDefaultMutableTreeNode = this.a.b();
    if (localDefaultMutableTreeNode != null)
    {
      j localj = (j)localDefaultMutableTreeNode.getUserObject();
      r localr = bn.b(this.a).a(localj.c());
      bn.a(this.a, localr.h(), localr.c() - 1);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bc
 * JD-Core Version:    0.6.0
 */