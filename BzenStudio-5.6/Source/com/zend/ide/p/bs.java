package com.zend.ide.p;

import com.zend.ide.p.fb.c;
import com.zend.ide.util.bb;
import javax.swing.JComponent;
import javax.swing.ToolTipManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public abstract class bs extends c
  implements com.zend.ide.util.bn
{
  private com.zend.ide.util.bs b;
  private bb c;
  private String d = "projectTree";

  public bs(Object paramObject)
  {
    a(paramObject);
  }

  protected void a(Object paramObject)
  {
    setRowHeight(18);
    setInvokesStopCellEditing(true);
    putClientProperty("JTree.lineStyle", "Angled");
    setDoubleBuffered(true);
    DefaultTreeCellRenderer localDefaultTreeCellRenderer = e();
    if (localDefaultTreeCellRenderer != null)
    {
      setCellRenderer(localDefaultTreeCellRenderer);
      localDefaultTreeCellRenderer.setBackgroundNonSelectionColor(getBackground());
    }
    DefaultTreeCellEditor localDefaultTreeCellEditor = f();
    if (localDefaultTreeCellEditor != null)
      setCellEditor(localDefaultTreeCellEditor);
    this.c = d();
    this.b = g();
    ToolTipManager.sharedInstance().registerComponent(this);
  }

  protected DefaultTreeCellRenderer e()
  {
    return new by();
  }

  protected DefaultTreeCellEditor f()
  {
    return null;
  }

  protected bb d()
  {
    return new bf(this);
  }

  protected com.zend.ide.util.bs g()
  {
    return new bn(this);
  }

  public com.zend.ide.util.bs t()
  {
    return this.b;
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public boolean d(boolean paramBoolean)
  {
    return this.b.d(paramBoolean);
  }

  public bb q()
  {
    return this.c;
  }

  public JComponent c()
  {
    return this;
  }

  public void a(com.zend.ide.util.bn parambn)
  {
    this.c.a(parambn.q());
  }

  public void d(String paramString)
  {
    this.d = paramString;
  }

  public String r()
  {
    return this.d;
  }

  public String a(int paramInt1, int paramInt2)
  {
    TreePath[] arrayOfTreePath = getSelectionPaths();
    if ((arrayOfTreePath != null) && (arrayOfTreePath.length > 1))
      return "multipleSelection";
    TreeNode localTreeNode = c(paramInt1, paramInt2);
    if (localTreeNode == null)
      return r();
    return c(localTreeNode);
  }

  protected String c(TreeNode paramTreeNode)
  {
    if (paramTreeNode == null)
      return r();
    if ((paramTreeNode instanceof bt))
      return ((bt)paramTreeNode).f();
    return null;
  }

  public TreeNode c(int paramInt1, int paramInt2)
  {
    TreePath localTreePath = getPathForLocation(paramInt1, paramInt2);
    if (localTreePath != null)
      return (TreeNode)localTreePath.getLastPathComponent();
    return null;
  }

  public void setSelectionPath(TreePath paramTreePath)
  {
    super.setSelectionPath(paramTreePath);
    if (paramTreePath != null)
      b((TreeNode)paramTreePath.getLastPathComponent());
  }

  public void b(TreeNode paramTreeNode)
  {
    if ((paramTreeNode == null) || (!(paramTreeNode instanceof DefaultMutableTreeNode)))
      return;
    scrollPathToVisible(new TreePath(((DefaultMutableTreeNode)paramTreeNode).getPath()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bs
 * JD-Core Version:    0.6.0
 */