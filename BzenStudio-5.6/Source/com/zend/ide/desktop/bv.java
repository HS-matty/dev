package com.zend.ide.desktop;

import java.awt.Component;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

class bv
  implements ContainerListener, PropertyChangeListener
{
  private JMenu a;

  private bv(JMenu paramJMenu)
  {
    this.a = paramJMenu;
    paramJMenu.getPopupMenu().addContainerListener(this);
    b();
  }

  public void componentAdded(ContainerEvent paramContainerEvent)
  {
    paramContainerEvent.getChild().addPropertyChangeListener("enabled", this);
    b();
  }

  public void componentRemoved(ContainerEvent paramContainerEvent)
  {
    paramContainerEvent.getChild().removePropertyChangeListener("enabled", this);
    b();
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    b();
  }

  private void b()
  {
    int i = 1;
    Component[] arrayOfComponent = this.a.getPopupMenu().getComponents();
    for (int j = 0; (i != 0) && (j < arrayOfComponent.length); j++)
      i = !arrayOfComponent[j].isEnabled() ? 1 : 0;
    this.a.setEnabled(i == 0);
  }

  bv(JMenu paramJMenu, bp parambp)
  {
    this(paramJMenu);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bv
 * JD-Core Version:    0.6.0
 */