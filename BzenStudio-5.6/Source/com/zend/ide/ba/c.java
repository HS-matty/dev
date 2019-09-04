package com.zend.ide.ba;

import com.zend.ide.k.d;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import javax.swing.JComponent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class c extends d
  implements cu
{
  final f g;

  public c(f paramf)
  {
    super(paramf.c(), "codeAnalyzerOutput", ct.a(967), cv.b("analyze16.gif"), ct.a(966));
  }

  public boolean c()
  {
    return true;
  }

  public void h()
  {
    if (f.a(this.g).getSelectionPath() == null)
      return;
    Object localObject = f.a(this.g).getSelectionPath().getLastPathComponent();
    if ((localObject instanceof p))
    {
      localObject = ((DefaultMutableTreeNode)localObject).getUserObject();
      f.a(this.g, (b)localObject);
    }
  }

  public void i()
  {
    if (f.a(this.g).getRowCount() <= 0)
      return;
    int i = 0;
    if (f.a(this.g).getSelectionCount() > 0)
      i = f.a(this.g).getSelectionRows()[0];
    i = i == f.a(this.g).getRowCount() - 1 ? 0 : i + 1;
    if ((f.a(this.g).getPathForRow(i).getLastPathComponent() instanceof q))
      i = i == f.a(this.g).getRowCount() - 1 ? 0 : i + 1;
    f.a(this.g).setSelectionRow(i);
    TreePath localTreePath = f.a(this.g).getSelectionPath();
    if (localTreePath == null)
      return;
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)localTreePath.getLastPathComponent();
    if (localDefaultMutableTreeNode == null)
      return;
    if ((localDefaultMutableTreeNode instanceof p))
    {
      Object localObject = localDefaultMutableTreeNode.getUserObject();
      f.a(this.g, (b)localObject);
    }
    f.a(this.g).a((DefaultMutableTreeNode)f.a(this.g).getPathForRow(i).getLastPathComponent());
  }

  public JComponent g()
  {
    return this.g.c();
  }

  public int o()
  {
    return f.d(this.g);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ba.c
 * JD-Core Version:    0.6.0
 */