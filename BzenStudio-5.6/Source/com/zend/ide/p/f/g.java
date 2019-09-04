package com.zend.ide.p.f;

import java.util.ArrayList;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class g extends f
{
  final d d;

  public g(d paramd, TreeNode paramTreeNode)
  {
    super(paramTreeNode);
  }

  protected boolean c(e parame)
  {
    if (!super.c(parame))
      return false;
    boolean bool = this.d.isExpanded(new TreePath(parame.getPath()));
    if (!bool)
      parame.e = false;
    return bool;
  }

  protected void a(e parame, ArrayList paramArrayList1, ArrayList paramArrayList2, com.zend.ide.util.d.g paramg)
  {
    synchronized (this.d.getTreeLock())
    {
      super.a(parame, paramArrayList1, paramArrayList2, paramg);
    }
    if (d.a(this.d) != null)
    {
      _a = (e)d.a(this.d).getLastPathComponent();
      if ((parame == _a) && (parame.getChildCount() > 0))
      {
        int i = this.d.getRowForPath(d.a(this.d));
        this.d.b(i, i + parame.getChildCount());
      }
    }
    d.a(this.d, null);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.f.g
 * JD-Core Version:    0.6.0
 */