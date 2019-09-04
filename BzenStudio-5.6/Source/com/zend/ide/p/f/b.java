package com.zend.ide.p.f;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

class b extends MouseAdapter
{
  final d a;

  b(d paramd)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    TreeSelectionModel localTreeSelectionModel = this.a.getSelectionModel();
    TreePath localTreePath = this.a.getPathForLocation(paramMouseEvent.getX(), paramMouseEvent.getY());
    if ((SwingUtilities.isRightMouseButton(paramMouseEvent)) && (!localTreeSelectionModel.isPathSelected(localTreePath)))
    {
      localTreeSelectionModel.clearSelection();
      localTreeSelectionModel.setSelectionPath(localTreePath);
      return;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.f.b
 * JD-Core Version:    0.6.0
 */