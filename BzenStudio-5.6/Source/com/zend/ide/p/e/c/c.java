package com.zend.ide.p.e.c;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.metal.MetalLookAndFeel;

class c extends AbstractBorder
  implements UIResource
{
  protected Insets a = new Insets(3, 3, 3, 3);
  final e b;

  private c(e parame)
  {
  }

  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AbstractButton localAbstractButton = (AbstractButton)paramComponent;
    ButtonModel localButtonModel = localAbstractButton.getModel();
    if ((localButtonModel.isRollover()) && ((!localButtonModel.isPressed()) || (localButtonModel.isArmed())))
      if (localButtonModel.isEnabled())
      {
        int i = (localButtonModel.isPressed()) && (localButtonModel.isArmed()) ? 1 : 0;
        int j = ((localAbstractButton instanceof JButton)) && (((JButton)localAbstractButton).isDefaultButton()) ? 1 : 0;
        if ((i != 0) && (j != 0))
          e(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
        else if (i != 0)
          c(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
        else if (j != 0)
          b(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, false);
        else
          a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, false);
      }
      else
      {
        b(paramGraphics, paramInt1, paramInt2, paramInt3 - 1, paramInt4 - 1);
      }
  }

  void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.translate(paramInt1, paramInt2);
    paramGraphics.setColor(MetalLookAndFeel.getControlDarkShadow());
    paramGraphics.drawRect(0, 0, paramInt3 - 2, paramInt4 - 2);
    paramGraphics.setColor(MetalLookAndFeel.getControlHighlight());
    paramGraphics.drawRect(1, 1, paramInt3 - 2, paramInt4 - 2);
    paramGraphics.setColor(MetalLookAndFeel.getControl());
    paramGraphics.drawLine(0, paramInt4 - 1, 1, paramInt4 - 2);
    paramGraphics.drawLine(paramInt3 - 1, 0, paramInt3 - 2, 1);
    paramGraphics.translate(-paramInt1, -paramInt2);
  }

  void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.translate(paramInt1, paramInt2);
    paramGraphics.setColor(MetalLookAndFeel.getControlShadow());
    paramGraphics.drawRect(0, 0, paramInt3 - 1, paramInt4 - 1);
    paramGraphics.translate(-paramInt1, -paramInt2);
  }

  void c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.translate(paramInt1, paramInt2);
    a(paramGraphics, 0, 0, paramInt3, paramInt4);
    paramGraphics.setColor(MetalLookAndFeel.getControlShadow());
    paramGraphics.drawLine(1, 1, 1, paramInt4 - 2);
    paramGraphics.drawLine(1, 1, paramInt3 - 2, 1);
    paramGraphics.translate(-paramInt1, -paramInt2);
  }

  void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    if (paramBoolean)
      d(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
    else
      a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
    paramGraphics.setColor(MetalLookAndFeel.getPrimaryControl());
    paramGraphics.drawLine(paramInt1 + 1, paramInt2 + 1, paramInt1 + 1, paramInt4 - 3);
    paramGraphics.drawLine(paramInt1 + 1, paramInt2 + 1, paramInt3 - 3, paramInt1 + 1);
    paramGraphics.setColor(MetalLookAndFeel.getPrimaryControlDarkShadow());
    paramGraphics.drawLine(paramInt1 + 2, paramInt4 - 2, paramInt3 - 2, paramInt4 - 2);
    paramGraphics.drawLine(paramInt3 - 2, paramInt2 + 2, paramInt3 - 2, paramInt4 - 2);
  }

  void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    a(paramGraphics, paramInt1 + 1, paramInt2 + 1, paramInt3 - 1, paramInt4 - 1, paramBoolean);
    paramGraphics.translate(paramInt1, paramInt2);
    paramGraphics.setColor(MetalLookAndFeel.getControlDarkShadow());
    paramGraphics.drawRect(0, 0, paramInt3 - 3, paramInt4 - 3);
    paramGraphics.drawLine(paramInt3 - 2, 0, paramInt3 - 2, 0);
    paramGraphics.drawLine(0, paramInt4 - 2, 0, paramInt4 - 2);
    paramGraphics.translate(-paramInt1, -paramInt2);
  }

  void e(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    c(paramGraphics, paramInt1 + 1, paramInt2 + 1, paramInt3 - 1, paramInt4 - 1);
    paramGraphics.translate(paramInt1, paramInt2);
    paramGraphics.setColor(MetalLookAndFeel.getControlDarkShadow());
    paramGraphics.drawRect(0, 0, paramInt3 - 3, paramInt4 - 3);
    paramGraphics.drawLine(paramInt3 - 2, 0, paramInt3 - 2, 0);
    paramGraphics.drawLine(0, paramInt4 - 2, 0, paramInt4 - 2);
    paramGraphics.setColor(MetalLookAndFeel.getControl());
    paramGraphics.drawLine(paramInt3 - 1, 0, paramInt3 - 1, 0);
    paramGraphics.drawLine(0, paramInt4 - 1, 0, paramInt4 - 1);
    paramGraphics.translate(-paramInt1, -paramInt2);
  }

  public Insets getBorderInsets(Component paramComponent)
  {
    return this.a;
  }

  public Insets getBorderInsets(Component paramComponent, Insets paramInsets)
  {
    paramInsets.top = this.a.top;
    paramInsets.left = this.a.left;
    paramInsets.bottom = this.a.bottom;
    paramInsets.right = this.a.right;
    return paramInsets;
  }

  c(e parame, b paramb)
  {
    this(parame);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.c.c
 * JD-Core Version:    0.6.0
 */