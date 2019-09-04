package com.zend.ide.p.e.b;

import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuItemUI;

public class j extends BasicMenuItemUI
{
  protected void installDefaults()
  {
    super.installDefaults();
    this.checkIcon = null;
  }

  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new j();
  }

  protected MouseInputListener createMouseInputListener(JComponent paramJComponent)
  {
    return new k(this, null);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.b.j
 * JD-Core Version:    0.6.0
 */