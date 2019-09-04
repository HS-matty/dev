package com.zend.ide.p.e.a;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ButtonModel;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import javax.swing.plaf.basic.BasicMenuUI;

public class n extends BasicMenuUI
{
  private boolean a = false;

  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new n();
  }

  protected void installDefaults()
  {
    super.installDefaults();
    this.checkIcon = null;
  }

  protected void paintBackground(Graphics paramGraphics, JMenuItem paramJMenuItem, Color paramColor)
  {
    JMenu localJMenu = (JMenu)paramJMenuItem;
    ButtonModel localButtonModel = paramJMenuItem.getModel();
    if (!localJMenu.isTopLevelMenu())
    {
      super.paintBackground(paramGraphics, paramJMenuItem, paramColor);
      return;
    }
    Color localColor1 = paramGraphics.getColor();
    int i = paramJMenuItem.getWidth();
    int j = paramJMenuItem.getHeight();
    UIDefaults localUIDefaults = UIManager.getLookAndFeelDefaults();
    Color localColor2 = localUIDefaults.getColor("controlLtHighlight");
    Color localColor3 = localUIDefaults.getColor("controlShadow");
    paramGraphics.setColor(paramJMenuItem.getBackground());
    paramGraphics.fillRect(0, 0, i, j);
    if (paramJMenuItem.isOpaque())
      if ((localButtonModel.isArmed()) || (localButtonModel.isSelected()))
      {
        paramGraphics.setColor(localColor3);
        paramGraphics.drawLine(0, 0, i - 1, 0);
        paramGraphics.drawLine(0, 0, 0, j - 2);
        paramGraphics.setColor(localColor2);
        paramGraphics.drawLine(i - 1, 0, i - 1, j - 2);
        paramGraphics.drawLine(0, j - 2, i - 1, j - 2);
      }
      else if ((b()) && (localButtonModel.isEnabled()))
      {
        paramGraphics.setColor(localColor2);
        paramGraphics.drawLine(0, 0, i - 1, 0);
        paramGraphics.drawLine(0, 0, 0, j - 2);
        paramGraphics.setColor(localColor3);
        paramGraphics.drawLine(i - 1, 0, i - 1, j - 2);
        paramGraphics.drawLine(0, j - 2, i - 1, j - 2);
      }
      else
      {
        paramGraphics.setColor(paramJMenuItem.getBackground());
        paramGraphics.fillRect(0, 0, i, j);
      }
    paramGraphics.setColor(localColor1);
  }

  protected void paintText(Graphics paramGraphics, JMenuItem paramJMenuItem, Rectangle paramRectangle, String paramString)
  {
    JMenu localJMenu = (JMenu)paramJMenuItem;
    ButtonModel localButtonModel = paramJMenuItem.getModel();
    if (!localButtonModel.isEnabled())
    {
      super.paintText(paramGraphics, paramJMenuItem, paramRectangle, paramString);
    }
    else
    {
      FontMetrics localFontMetrics = paramGraphics.getFontMetrics();
      int i = paramJMenuItem.getDisplayedMnemonicIndex();
      Color localColor = paramGraphics.getColor();
      if ((localButtonModel.isSelected()) && (!localJMenu.isTopLevelMenu()))
        paramGraphics.setColor(this.selectionForeground);
      BasicGraphicsUtils.drawStringUnderlineCharAt(paramGraphics, paramString, i, paramRectangle.x, paramRectangle.y + localFontMetrics.getAscent());
      paramGraphics.setColor(localColor);
    }
  }

  private void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  private boolean b()
  {
    return this.a;
  }

  protected MouseInputListener createMouseInputListener(JComponent paramJComponent)
  {
    return new o(this, null);
  }

  static void a(n paramn, boolean paramBoolean)
  {
    paramn.a(paramBoolean);
  }

  static JMenuItem a(n paramn)
  {
    return paramn.menuItem;
  }

  static JMenuItem b(n paramn)
  {
    return paramn.menuItem;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.a.n
 * JD-Core Version:    0.6.0
 */