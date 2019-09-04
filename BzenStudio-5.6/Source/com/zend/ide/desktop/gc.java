package com.zend.ide.desktop;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.ToolTipManager;

class gc
  implements PropertyChangeListener
{
  final ez a;

  gc(ez paramez)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (!this.a.d.h().isVisible())
      return;
    ez.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
    ez.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue(), true);
    JPopupMenu.setDefaultLightWeightPopupEnabled(!ez.a(this.a));
    ToolTipManager.sharedInstance().setLightWeightPopupEnabled(!ez.a(this.a));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.gc
 * JD-Core Version:    0.6.0
 */