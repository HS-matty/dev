package com.zend.ide.z;

import com.zend.ide.util.w;
import javax.swing.tree.DefaultMutableTreeNode;

class ab extends w
{
  final x c;

  private ab(x paramx)
  {
  }

  public boolean b()
  {
    DefaultMutableTreeNode localDefaultMutableTreeNode = this.c.g.b();
    if ((localDefaultMutableTreeNode == null) || (!(localDefaultMutableTreeNode.getUserObject() instanceof j)))
      return false;
    j localj = (j)localDefaultMutableTreeNode.getUserObject();
    int i = localj.b();
    return (i != 0) && ((localDefaultMutableTreeNode.getParent() instanceof by));
  }

  ab(x paramx, d paramd)
  {
    this(paramx);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.ab
 * JD-Core Version:    0.6.0
 */