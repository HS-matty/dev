package com.zend.ide.h;

import com.zend.ide.util.c.h;
import java.io.PrintStream;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

class bm extends DefaultTreeModel
{
  final be a;

  public bm(be parambe, TreeNode paramTreeNode)
  {
    super(paramTreeNode);
  }

  public void valueForPathChanged(TreePath paramTreePath, Object paramObject)
  {
    if (paramTreePath == null)
    {
      System.out.println("in valueForPathChanged the path is null");
      return;
    }
    bg localbg = (bg)paramTreePath.getLastPathComponent();
    be.c(this.a).a(new db(this, localbg, paramObject));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bm
 * JD-Core Version:    0.6.0
 */