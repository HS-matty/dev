package com.zend.ide.h;

import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.ExpandVetoException;

class ab
  implements TreeWillExpandListener
{
  final bf a;

  ab(bf parambf)
  {
  }

  public void treeWillExpand(TreeExpansionEvent paramTreeExpansionEvent)
    throws ExpandVetoException
  {
    bf.a(this.a, paramTreeExpansionEvent.getPath());
  }

  public void treeWillCollapse(TreeExpansionEvent paramTreeExpansionEvent)
    throws ExpandVetoException
  {
    bf.a(this.a, paramTreeExpansionEvent.getPath());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.ab
 * JD-Core Version:    0.6.0
 */