package com.zend.ide.util;

import com.zend.ide.util.e.c;
import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.Map;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class bu extends bt
  implements TreeSelectionListener
{
  boolean h = false;
  private MouseEvent i = null;
  final eo j;

  public bu(eo parameo, bn parambn)
  {
    super(parambn);
    parameo.getSelectionModel().addTreeSelectionListener(this);
    parameo.addKeyListener(new j(this, parameo));
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    this.i = paramMouseEvent;
    TreeSelectionModel localTreeSelectionModel = this.j.getSelectionModel();
    TreePath localTreePath = this.j.getPathForLocation(paramMouseEvent.getX(), paramMouseEvent.getY());
    if (((SwingUtilities.isRightMouseButton(paramMouseEvent)) || (paramMouseEvent.isPopupTrigger())) && (!localTreeSelectionModel.isPathSelected(localTreePath)))
    {
      localTreeSelectionModel.clearSelection();
      localTreeSelectionModel.setSelectionPath(localTreePath);
    }
    a(localTreePath, paramMouseEvent);
    super.mousePressed(paramMouseEvent);
  }

  protected void a(TreePath paramTreePath, MouseEvent paramMouseEvent)
  {
    if ((paramTreePath != null) && (paramMouseEvent.getClickCount() == 2))
    {
      TreeNode localTreeNode = (TreeNode)paramTreePath.getLastPathComponent();
      if (localTreeNode.isLeaf())
        this.j.b(localTreeNode);
    }
  }

  public void valueChanged(TreeSelectionEvent paramTreeSelectionEvent)
  {
    TreePath localTreePath1 = paramTreeSelectionEvent.getNewLeadSelectionPath();
    String str;
    if (localTreePath1 == null)
      str = this.j.r();
    else
      str = this.j.d((DefaultMutableTreeNode)localTreePath1.getLastPathComponent());
    ((s)this.j.q()).e();
    a(str);
    if ((g()) && (this.h))
    {
      this.h = false;
      TreePath localTreePath2 = paramTreeSelectionEvent.getNewLeadSelectionPath();
      if (localTreePath2 == null)
        return;
      Rectangle localRectangle = this.j.getPathBounds(localTreePath2);
      Point localPoint = new Point((int)localRectangle.getX() + 30, (int)localRectangle.getY() + 10);
      a(new MouseEvent(this.j, this.i.getID(), this.i.getWhen(), this.i.getModifiers(), (int)localPoint.getX(), (int)localPoint.getY(), this.i.getClickCount(), true));
    }
  }

  protected void a(JPopupMenu paramJPopupMenu, Map paramMap)
  {
    if (paramJPopupMenu.isShowing())
    {
      paramJPopupMenu.setVisible(false);
      paramJPopupMenu = cn.e().a(paramMap);
    }
  }

  protected c b(Component paramComponent)
  {
    return new bf(this, paramComponent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bu
 * JD-Core Version:    0.6.0
 */