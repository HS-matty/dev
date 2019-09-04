package com.zend.ide.util;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.tree.DefaultMutableTreeNode;

class i extends FocusAdapter
{
  final eo a;

  i(eo parameo)
  {
  }

  public void focusGained(FocusEvent paramFocusEvent)
  {
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)this.a.getLastSelectedPathComponent();
    if (localDefaultMutableTreeNode == null)
      return;
    String str = this.a.d(localDefaultMutableTreeNode);
    ((s)this.a.q()).e();
    this.a.g.a(str);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.i
 * JD-Core Version:    0.6.0
 */