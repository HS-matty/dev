package com.zend.ide.h;

import com.zend.ide.util.w;
import javax.swing.tree.DefaultMutableTreeNode;

public class k extends w
{
  final i c;

  protected k(i parami)
  {
  }

  public boolean b()
  {
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)this.c.i.getLastSelectedPathComponent();
    if ((localDefaultMutableTreeNode instanceof bg))
      return ((bg)localDefaultMutableTreeNode).k();
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.k
 * JD-Core Version:    0.6.0
 */