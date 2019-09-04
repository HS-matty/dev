package com.zend.ide.h;

import javax.swing.tree.DefaultMutableTreeNode;

public class m extends l
{
  final i e;

  protected m(i parami)
  {
    super(parami);
  }

  public boolean b()
  {
    if (!super.b())
      return false;
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)this.e.i.getLastSelectedPathComponent();
    if ((localDefaultMutableTreeNode instanceof bg))
      return ((bg)localDefaultMutableTreeNode).l();
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.m
 * JD-Core Version:    0.6.0
 */