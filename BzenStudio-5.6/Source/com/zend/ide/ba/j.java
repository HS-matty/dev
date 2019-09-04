package com.zend.ide.ba;

import com.zend.ide.util.w;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;

class j extends w
{
  final i c;

  private j(i parami)
  {
  }

  public boolean b()
  {
    return (f.a(this.c.g).getModel() != null) && (f.a(this.c.g).getModel().getRoot() != null) && (((DefaultMutableTreeNode)f.a(this.c.g).getModel().getRoot()).getChildCount() > 0);
  }

  j(i parami, d paramd)
  {
    this(parami);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ba.j
 * JD-Core Version:    0.6.0
 */