package com.zend.ide.p;

import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import javax.swing.SwingUtilities;

class jb
  implements HierarchyListener
{
  final pb a;

  jb(pb parampb)
  {
  }

  public void hierarchyChanged(HierarchyEvent paramHierarchyEvent)
  {
    SwingUtilities.invokeLater(new kb(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.jb
 * JD-Core Version:    0.6.0
 */