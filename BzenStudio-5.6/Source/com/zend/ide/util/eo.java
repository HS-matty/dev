package com.zend.ide.util;

import com.zend.ide.p.fb.c;
import com.zend.ide.util.a.b;
import com.zend.ide.util.c.h;
import java.awt.Insets;
import java.awt.Point;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.Autoscroll;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class eo extends c
  implements bn, TreeExpansionListener, Autoscroll
{
  protected transient h a;
  public static int b = 0;
  public static int c = 1;
  public static int d = 2;
  protected bb e;
  protected String f = "projectTree";
  protected bs g;
  protected lc i = new lc(this, this, new Insets(10, 10, 10, 10));
  protected int h = c;

  public eo()
  {
    this("Test");
  }

  public eo(Object paramObject)
  {
    a(paramObject);
  }

  protected void a(Object paramObject)
  {
    setRowHeight(18);
    this.a = new h(1);
    setModel(a(b(paramObject)));
    setEditable(true);
    setInvokesStopCellEditing(true);
    putClientProperty("JTree.lineStyle", "Angled");
    setDoubleBuffered(true);
    this.e = d();
    ((t)this.e).b();
    this.g = e();
    this.g.i();
    addTreeExpansionListener(this);
    DefaultTreeCellRenderer localDefaultTreeCellRenderer = f();
    if (localDefaultTreeCellRenderer != null)
    {
      setCellRenderer(localDefaultTreeCellRenderer);
      localDefaultTreeCellRenderer.setBackgroundNonSelectionColor(getBackground());
    }
    DefaultTreeCellEditor localDefaultTreeCellEditor = g();
    if (localDefaultTreeCellEditor != null)
      setCellEditor(localDefaultTreeCellEditor);
    KeyListener localKeyListener = h();
    if (localKeyListener != null)
      addKeyListener(localKeyListener);
    addFocusListener(new i(this));
  }

  protected bb d()
  {
    return new t(this);
  }

  protected bs e()
  {
    return new bu(this, this);
  }

  protected DefaultMutableTreeNode b(Object paramObject)
  {
    return d(paramObject);
  }

  public bs t()
  {
    return this.g;
  }

  protected DefaultTreeModel a(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    return new ev(this, paramDefaultMutableTreeNode);
  }

  protected es d(Object paramObject)
  {
    return new es(this, paramObject);
  }

  protected DefaultTreeCellRenderer f()
  {
    return null;
  }

  protected DefaultTreeCellEditor g()
  {
    return null;
  }

  protected KeyListener h()
  {
    return null;
  }

  public void processMouseEvent(MouseEvent paramMouseEvent)
  {
    try
    {
      a(this, paramMouseEvent);
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }

  public void processKeyEvent(KeyEvent paramKeyEvent)
  {
    try
    {
      a(this, paramKeyEvent);
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }

  public void a(TreeNode paramTreeNode)
  {
    if (paramTreeNode == null)
      return;
    TreePath localTreePath = new TreePath(((DefaultMutableTreeNode)paramTreeNode).getPath());
    scrollPathToVisible(localTreePath);
  }

  public void b(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    if (paramDefaultMutableTreeNode == null)
    {
      clearSelection();
      return;
    }
    TreePath localTreePath = new TreePath(paramDefaultMutableTreeNode.getPath());
    setSelectionPath(localTreePath);
    a(paramDefaultMutableTreeNode);
  }

  public void setSelectionPath(TreePath paramTreePath)
  {
    super.setSelectionPath(paramTreePath);
    if (paramTreePath != null)
      a((TreeNode)paramTreePath.getLastPathComponent());
  }

  protected Transferable c(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    return null;
  }

  public void treeExpanded(TreeExpansionEvent paramTreeExpansionEvent)
  {
  }

  public void treeCollapsed(TreeExpansionEvent paramTreeExpansionEvent)
  {
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
    return this.g.d(paramBoolean);
  }

  public bb q()
  {
    return this.e;
  }

  public JComponent c()
  {
    return this;
  }

  public void d(String paramString)
  {
    this.f = paramString;
  }

  public String r()
  {
    return this.f;
  }

  protected String d(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    if ((getSelectionPaths() != null) && (getSelectionPaths().length > 1))
      return "multipleSelection";
    String str = this.f;
    if (paramDefaultMutableTreeNode != null)
    {
      Object localObject = paramDefaultMutableTreeNode.getUserObject();
      if ((localObject instanceof String))
        str = (String)localObject;
      else
        str = localObject.getClass().getName();
    }
    return str;
  }

  public String a(int paramInt1, int paramInt2)
  {
    if ((getSelectionPaths() != null) && (getSelectionPaths().length > 1))
      return "multipleSelection";
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)b(paramInt1, paramInt2);
    return d(localDefaultMutableTreeNode);
  }

  public void a(bn parambn)
  {
    this.e.a(parambn.q());
  }

  public TreeNode b(int paramInt1, int paramInt2)
  {
    TreePath localTreePath = getPathForLocation(paramInt1, paramInt2);
    if (localTreePath != null)
      return (TreeNode)localTreePath.getLastPathComponent();
    return null;
  }

  protected void b(TreeNode paramTreeNode)
  {
  }

  public void autoscroll(Point paramPoint)
  {
    this.i.autoscroll(paramPoint);
  }

  public Insets getAutoscrollInsets()
  {
    return this.i.getAutoscrollInsets();
  }

  public void i()
  {
    es locales = (es)getModel().getRoot();
    a(locales, this.h, true);
  }

  public void a(es parames, int paramInt, boolean paramBoolean)
  {
    parames.a(paramInt, paramBoolean);
  }

  static void a(eo parameo, MouseEvent paramMouseEvent)
  {
    parameo.processMouseEvent(paramMouseEvent);
  }

  static void a(eo parameo, KeyEvent paramKeyEvent)
  {
    parameo.processKeyEvent(paramKeyEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.eo
 * JD-Core Version:    0.6.0
 */