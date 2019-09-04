package com.zend.ide.cb.a.b;

import com.zend.ide.bc.a;
import com.zend.ide.cb.k;
import com.zend.ide.cb.q;
import com.zend.ide.cb.s;
import com.zend.ide.cb.u;
import com.zend.ide.cb.x;
import com.zend.ide.p.f.d;
import com.zend.ide.p.f.e;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;

public class wb extends d
  implements s, k, DragGestureListener
{
  public wb(u paramu)
  {
    super(paramu);
    this.showsRootHandles = true;
    q[] arrayOfq = paramu.a();
    for (int i = 0; i < arrayOfq.length; i++)
      arrayOfq[i].a(this);
    paramu.a(this);
    d("sqlTree");
    setRootVisible(false);
    a(new y(this, null));
    a(new z(this, null));
    DragSource localDragSource = DragSource.getDefaultDragSource();
    localDragSource.createDefaultDragGestureRecognizer(this, 1, this);
    a.a(this, "SQL_TREE");
  }

  protected DefaultMutableTreeNode b(Object paramObject)
  {
    v localv = new v("Servers", (u)paramObject);
    return localv;
  }

  public void a(e parame, int paramInt)
  {
    if (parame == null)
      return;
    super.a(parame, paramInt);
  }

  public void a(com.zend.ide.cb.y paramy)
  {
    a(a(paramy), e.c);
  }

  public void b(com.zend.ide.cb.y paramy)
  {
    a(a(paramy), e.c);
  }

  public void c(com.zend.ide.cb.y paramy)
  {
    a(a(paramy), e.c);
  }

  private i a(com.zend.ide.cb.y paramy)
  {
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)getModel().getRoot();
    int i = localDefaultMutableTreeNode.getChildCount();
    for (int j = 0; j < i; j++)
    {
      TreeNode localTreeNode = localDefaultMutableTreeNode.getChildAt(j);
      if (((DefaultMutableTreeNode)localTreeNode).getUserObject() == paramy.getSource())
        return (i)localTreeNode;
    }
    return null;
  }

  public void a(x paramx)
  {
    if (paramx.a() == 0)
      paramx.b().a(this);
    else if (paramx.a() == 1)
      paramx.b().b(this);
    b();
  }

  public void dragGestureRecognized(DragGestureEvent paramDragGestureEvent)
  {
    Object localObject = getLastSelectedPathComponent();
    if ((localObject instanceof Transferable))
      paramDragGestureEvent.startDrag(DragSource.DefaultCopyDrop, (Transferable)localObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.wb
 * JD-Core Version:    0.6.0
 */