package com.zend.ide.z;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.DefaultMutableTreeNode;

public class bb extends AbstractAction
{
  final bn a;

  public bb(bn parambn)
  {
    super("profilerFunctionCallAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    DefaultMutableTreeNode localDefaultMutableTreeNode = this.a.b();
    if (localDefaultMutableTreeNode != null)
    {
      j localj1 = (j)localDefaultMutableTreeNode.getUserObject();
      int i = localj1.b();
      r localr;
      if ((i == 0) || (!(localDefaultMutableTreeNode.getParent() instanceof by)))
      {
        localr = bn.b(this.a).a(localj1.c());
      }
      else
      {
        j localj2 = (j)((DefaultMutableTreeNode)localDefaultMutableTreeNode.getParent()).getUserObject();
        localr = bn.b(this.a).a(localj2.c());
      }
      bn.a(this.a, localr.h(), i - 1);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bb
 * JD-Core Version:    0.6.0
 */