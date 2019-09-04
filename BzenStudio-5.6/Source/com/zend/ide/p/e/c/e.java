package com.zend.ide.p.e.c;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolBarUI;

public class e extends BasicToolBarUI
{
  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new e();
  }

  protected Border createRolloverBorder()
  {
    return BorderFactory.createCompoundBorder(new c(this, null), new d());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.c.e
 * JD-Core Version:    0.6.0
 */