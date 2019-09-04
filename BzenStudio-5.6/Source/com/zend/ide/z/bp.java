package com.zend.ide.z;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Locale;
import javax.swing.JTree;
import javax.swing.ToolTipManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

class bp extends JTree
  implements cu
{
  private m a;
  private static int b = 1;
  private static int c = 2;
  private static int d = b;
  private static DecimalFormat e;
  private boolean f = true;
  private boolean g = true;
  private double h;

  public bp(m paramm, bb parambb)
  {
    setEditable(false);
    setRowHeight(18);
    e = new DecimalFormat("#0.0#", new DecimalFormatSymbols(new Locale("en")));
    ((DefaultTreeModel)getModel()).setRoot(new DefaultMutableTreeNode(ct.a(933)));
    ToolTipManager.sharedInstance().registerComponent(this);
    setCellRenderer(new bz(this, null));
    this.a = paramm;
    addMouseListener(new a(this, parambb));
  }

  public void h()
  {
    DefaultMutableTreeNode localDefaultMutableTreeNode = b();
    if (localDefaultMutableTreeNode == null)
      localDefaultMutableTreeNode = (DefaultMutableTreeNode)getModel().getRoot();
    if (localDefaultMutableTreeNode != null)
    {
      Enumeration localEnumeration = localDefaultMutableTreeNode.depthFirstEnumeration();
      while (localEnumeration.hasMoreElements())
      {
        TreePath localTreePath = new TreePath(((DefaultMutableTreeNode)localEnumeration.nextElement()).getPath());
        setExpandedState(localTreePath, true);
      }
    }
  }

  public void i()
  {
    DefaultMutableTreeNode localDefaultMutableTreeNode = b();
    if (localDefaultMutableTreeNode == null)
      localDefaultMutableTreeNode = (DefaultMutableTreeNode)getModel().getRoot();
    if (localDefaultMutableTreeNode != null)
    {
      e(localDefaultMutableTreeNode);
      collapsePath(getSelectionPath());
    }
  }

  private boolean g()
  {
    return (b() != null) && (b().isLeaf());
  }

  public void a(i parami)
  {
    this.h = 0.0D;
    j[] arrayOfj = parami.b();
    DefaultTreeModel localDefaultTreeModel = (DefaultTreeModel)getModel();
    Object localObject1 = (DefaultMutableTreeNode)localDefaultTreeModel.getRoot();
    synchronized (getTreeLock())
    {
      for (int i = 0; i < arrayOfj.length; i++)
      {
        int j = arrayOfj[i].h();
        Object localObject2;
        if (j == 1)
        {
          localObject2 = new by(arrayOfj[i], null);
          by.a((by)localObject2, this.a.a(arrayOfj[i].c()));
          by.a((by)localObject2, i);
          ((DefaultMutableTreeNode)localObject1).add((MutableTreeNode)localObject2);
          localObject1 = localObject2;
        }
        else
        {
          if (((DefaultMutableTreeNode)localObject1).getParent() == null)
            continue;
          localObject2 = (j)((DefaultMutableTreeNode)localObject1).getUserObject();
          ((j)localObject2).a(arrayOfj[i].d(), arrayOfj[i].e());
          by.a((by)localObject1, ((j)localObject2).g());
          if (((DefaultMutableTreeNode)localObject1).getParent() == localDefaultTreeModel.getRoot())
            this.h += ((j)localObject2).f();
          localObject1 = (DefaultMutableTreeNode)((DefaultMutableTreeNode)localObject1).getParent();
        }
      }
      localDefaultTreeModel.reload();
    }
    repaint();
    revalidate();
    doLayout();
    d((DefaultMutableTreeNode)localDefaultTreeModel.getRoot());
  }

  private void d(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    Object localObject;
    if ((paramDefaultMutableTreeNode.getUserObject() instanceof j))
    {
      localObject = (j)paramDefaultMutableTreeNode.getUserObject();
      double d1 = ((j)localObject).f();
      double d2 = d1 / this.h * 100.0D;
      by.b((by)paramDefaultMutableTreeNode, d2);
    }
    if (paramDefaultMutableTreeNode.getChildCount() != 0)
    {
      localObject = paramDefaultMutableTreeNode.children();
      while (((Enumeration)localObject).hasMoreElements())
        d((DefaultMutableTreeNode)((Enumeration)localObject).nextElement());
    }
  }

  public DefaultMutableTreeNode b()
  {
    Object localObject = getLastSelectedPathComponent();
    if ((localObject != null) && ((localObject instanceof DefaultMutableTreeNode)))
      return (DefaultMutableTreeNode)localObject;
    return null;
  }

  public j c()
  {
    DefaultMutableTreeNode localDefaultMutableTreeNode = b();
    if ((localDefaultMutableTreeNode != null) && ((localDefaultMutableTreeNode.getUserObject() instanceof j)))
      return (j)localDefaultMutableTreeNode.getUserObject();
    return null;
  }

  public void a(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    d = b;
    c(paramDefaultMutableTreeNode);
  }

  public void b(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    d = c;
    c(paramDefaultMutableTreeNode);
  }

  private void c(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    if (paramDefaultMutableTreeNode.getChildCount() != 0)
    {
      Enumeration localEnumeration = paramDefaultMutableTreeNode.children();
      by[] arrayOfby = new by[paramDefaultMutableTreeNode.getChildCount()];
      for (int i = 0; localEnumeration.hasMoreElements(); i++)
      {
        DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)localEnumeration.nextElement();
        c(localDefaultMutableTreeNode);
        arrayOfby[i] = ((by)localDefaultMutableTreeNode);
      }
      paramDefaultMutableTreeNode.removeAllChildren();
      Arrays.sort(arrayOfby);
      for (int j = 0; j < arrayOfby.length; j++)
      {
        by localby = arrayOfby[j];
        paramDefaultMutableTreeNode.add(localby);
      }
      ((DefaultTreeModel)getModel()).reload(paramDefaultMutableTreeNode);
    }
  }

  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
    repaint();
  }

  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
    repaint();
  }

  public void e(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    ((DefaultTreeModel)getModel()).reload(paramDefaultMutableTreeNode);
  }

  static boolean b(bp parambp)
  {
    return parambp.g();
  }

  static DecimalFormat d()
  {
    return e;
  }

  static int e()
  {
    return d;
  }

  static int f()
  {
    return b;
  }

  static boolean a(bp parambp)
  {
    return parambp.f;
  }

  static boolean c(bp parambp)
  {
    return parambp.g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bp
 * JD-Core Version:    0.6.0
 */