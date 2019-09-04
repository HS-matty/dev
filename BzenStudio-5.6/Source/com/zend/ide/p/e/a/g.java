package com.zend.ide.p.e.a;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.plaf.metal.MetalButtonUI;

public class g extends MetalButtonUI
{
  private static final g a = new g();

  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return a;
  }

  protected BasicButtonListener createButtonListener(AbstractButton paramAbstractButton)
  {
    return new m(paramAbstractButton);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.a.g
 * JD-Core Version:    0.6.0
 */