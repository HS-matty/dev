package com.zend.ide.p.e.b;

import com.sun.java.swing.plaf.windows.WindowsMenuUI;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class l extends WindowsMenuUI
{
  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new l();
  }

  protected void installDefaults()
  {
    super.installDefaults();
    this.checkIcon = null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.b.l
 * JD-Core Version:    0.6.0
 */