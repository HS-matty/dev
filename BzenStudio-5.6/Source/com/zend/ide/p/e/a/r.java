package com.zend.ide.p.e.a;

import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuItemUI;

public class r extends BasicMenuItemUI
{
  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new r();
  }

  protected void installDefaults()
  {
    super.installDefaults();
    this.checkIcon = null;
  }

  protected MouseInputListener createMouseInputListener(JComponent paramJComponent)
  {
    return new s(this, null);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.a.r
 * JD-Core Version:    0.6.0
 */