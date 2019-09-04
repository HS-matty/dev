package com.zend.ide.zendPlatformIntegration.a;

import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;

class eb
  implements TreeExpansionListener
{
  final mb a;

  eb(mb parammb)
  {
  }

  public void treeExpanded(TreeExpansionEvent paramTreeExpansionEvent)
  {
    this.a.fireTableDataChanged();
  }

  public void treeCollapsed(TreeExpansionEvent paramTreeExpansionEvent)
  {
    this.a.fireTableDataChanged();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.eb
 * JD-Core Version:    0.6.0
 */