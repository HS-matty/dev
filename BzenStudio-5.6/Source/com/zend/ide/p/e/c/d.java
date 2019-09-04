package com.zend.ide.p.e.c;

import java.awt.Component;
import java.awt.Insets;
import javax.swing.AbstractButton;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.UIResource;

class d extends EmptyBorder
{
  public d()
  {
    super(3, 3, 3, 3);
  }

  public Insets getBorderInsets(Component paramComponent)
  {
    return getBorderInsets(paramComponent, new Insets(0, 0, 0, 0));
  }

  public Insets getBorderInsets(Component paramComponent, Insets paramInsets)
  {
    Insets localInsets = null;
    if ((paramComponent instanceof AbstractButton))
      localInsets = ((AbstractButton)paramComponent).getMargin();
    if ((localInsets == null) || ((localInsets instanceof UIResource)))
    {
      paramInsets.left = this.left;
      paramInsets.top = this.top;
      paramInsets.right = this.right;
      paramInsets.bottom = this.bottom;
    }
    else
    {
      paramInsets.left = localInsets.left;
      paramInsets.top = localInsets.top;
      paramInsets.right = localInsets.right;
      paramInsets.bottom = localInsets.bottom;
    }
    return paramInsets;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.c.d
 * JD-Core Version:    0.6.0
 */