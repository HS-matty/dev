package com.zend.ide.util;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

class h extends ContainerAdapter
{
  final en a;

  h(en paramen)
  {
  }

  public void componentAdded(ContainerEvent paramContainerEvent)
  {
    if (this.a.getComponentCount() == 1)
      this.a.setFocusable(false);
  }

  public void componentRemoved(ContainerEvent paramContainerEvent)
  {
    if (this.a.getComponentCount() == 0)
      this.a.setFocusable(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.h
 * JD-Core Version:    0.6.0
 */