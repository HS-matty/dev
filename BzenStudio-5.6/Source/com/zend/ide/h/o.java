package com.zend.ide.h;

import com.zend.ide.util.w;
import javax.swing.tree.DefaultMutableTreeNode;

public class o extends w
{
  final i c;

  protected o(i parami)
  {
  }

  public boolean b()
  {
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)this.c.i.getLastSelectedPathComponent();
    if ((localDefaultMutableTreeNode instanceof bg))
      return ((bg)localDefaultMutableTreeNode).m();
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.o
 * JD-Core Version:    0.6.0
 */