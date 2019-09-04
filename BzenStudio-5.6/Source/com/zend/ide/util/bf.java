package com.zend.ide.util;

import com.zend.ide.util.e.a;
import java.awt.Component;
import java.awt.Point;
import java.awt.datatransfer.Transferable;
import javax.swing.tree.DefaultMutableTreeNode;

public class bf extends a
{
  final bu g;

  public bf(bu parambu, Component paramComponent)
  {
    super(paramComponent);
  }

  public String a(Point paramPoint)
  {
    return this.g.j.a(paramPoint.x, paramPoint.y);
  }

  protected Transferable c(Point paramPoint)
  {
    Transferable localTransferable = null;
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)this.g.j.b(paramPoint.x, paramPoint.y);
    if (localDefaultMutableTreeNode != null)
      localTransferable = this.g.j.c(localDefaultMutableTreeNode);
    return localTransferable;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bf
 * JD-Core Version:    0.6.0
 */