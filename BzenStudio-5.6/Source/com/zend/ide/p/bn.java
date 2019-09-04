package com.zend.ide.p;

import com.zend.ide.util.bt;
import java.awt.event.MouseEvent;
import javax.swing.JTree;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class bn extends bt
{
  public bn(com.zend.ide.util.bn parambn)
  {
    super(parambn);
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.isPopupTrigger())
    {
      JTree localJTree = (JTree)c();
      TreeSelectionModel localTreeSelectionModel = localJTree.getSelectionModel();
      TreePath localTreePath = localJTree.getPathForLocation(paramMouseEvent.getX(), paramMouseEvent.getY());
      if (!localTreeSelectionModel.isPathSelected(localTreePath))
      {
        localTreeSelectionModel.clearSelection();
        localTreeSelectionModel.setSelectionPath(localTreePath);
      }
    }
    super.mousePressed(paramMouseEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bn
 * JD-Core Version:    0.6.0
 */