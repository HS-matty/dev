package com.zend.ide.h;

import com.zend.ide.util.e.a;
import com.zend.ide.util.e.e;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DropTargetDragEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class s extends a
{
  private TreePath g;
  final t h;

  s(t paramt)
  {
    super(paramt.k);
    e locale1 = new e(new b(this, 1));
    e locale2 = new e(new b(this, 2));
    super.a(locale2, 2, DataFlavor.javaFileListFlavor, "file");
    super.a(locale1, 1, DataFlavor.javaFileListFlavor, "file");
    super.a(locale2, 2, DataFlavor.javaFileListFlavor, "directory");
    super.a(locale1, 1, DataFlavor.javaFileListFlavor, "directory");
    super.a(locale2, 2, DataFlavor.javaFileListFlavor, "root");
  }

  public String a(Point paramPoint)
  {
    return this.h.k.a(paramPoint.x, paramPoint.y);
  }

  protected Transferable c(Point paramPoint)
  {
    Transferable localTransferable = null;
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)this.h.k.b(paramPoint.x, paramPoint.y);
    if (localDefaultMutableTreeNode != null)
    {
      localTransferable = this.h.k.c(localDefaultMutableTreeNode);
      this.g = (localTransferable == null ? null : this.h.k.getSelectionPath());
    }
    return localTransferable;
  }

  public void dragDropEnd(DragSourceDropEvent paramDragSourceDropEvent)
  {
    super.dragDropEnd(paramDragSourceDropEvent);
    boolean bool = paramDragSourceDropEvent.getDropSuccess();
    if ((!bool) && (this.g != null))
      this.h.k.setSelectionPath(this.g);
  }

  public void dragOver(DropTargetDragEvent paramDropTargetDragEvent)
  {
    TreePath localTreePath = this.h.k.getClosestPathForLocation(paramDropTargetDragEvent.getLocation().x, paramDropTargetDragEvent.getLocation().y);
    bh localbh = (bh)localTreePath.getLastPathComponent();
    if (!localbh.m())
    {
      paramDropTargetDragEvent.rejectDrag();
      this.h.k.setSelectionPath(localTreePath);
      return;
    }
    super.dragOver(paramDropTargetDragEvent);
    this.h.k.setSelectionPath(localTreePath);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.s
 * JD-Core Version:    0.6.0
 */