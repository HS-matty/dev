package com.zend.ide.p.e.b;

import com.sun.java.swing.plaf.windows.WindowsCheckBoxUI;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonListener;

public class e extends WindowsCheckBoxUI
{
  private static final e a = new e();

  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return a;
  }

  protected BasicButtonListener createButtonListener(AbstractButton paramAbstractButton)
  {
    return new c(paramAbstractButton);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.b.e
 * JD-Core Version:    0.6.0
 */