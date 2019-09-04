package com.zend.ide.p.e.b;

import com.sun.java.swing.SwingUtilities2;
import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.text.View;

public class m extends WindowsTabbedPaneUI
{
  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new m();
  }

  protected void paintText(Graphics paramGraphics, int paramInt1, Font paramFont, FontMetrics paramFontMetrics, int paramInt2, String paramString, Rectangle paramRectangle, boolean paramBoolean)
  {
    paramGraphics.setFont(paramFont);
    View localView = getTextViewForTab(paramInt2);
    if (localView != null)
    {
      localView.paint(paramGraphics, paramRectangle);
    }
    else
    {
      if (paramFontMetrics.stringWidth(paramString) > getTabBounds(this.tabPane, paramInt2).width)
        paramString = SwingUtilities2.clipString(this.tabPane, paramFontMetrics, paramString, paramRectangle.width - 5);
      int i = this.tabPane.getDisplayedMnemonicIndexAt(paramInt2);
      if ((this.tabPane.isEnabled()) && (this.tabPane.isEnabledAt(paramInt2)))
      {
        Object localObject = this.tabPane.getForegroundAt(paramInt2);
        if ((paramBoolean) && ((localObject instanceof UIResource)))
        {
          Color localColor = UIManager.getColor("TabbedPane.selectedForeground");
          if (localColor != null)
            localObject = localColor;
        }
        paramGraphics.setColor((Color)localObject);
        SwingUtilities2.drawStringUnderlineCharAt(this.tabPane, paramGraphics, paramString, i, paramRectangle.x, paramRectangle.y + paramFontMetrics.getAscent());
      }
      else
      {
        paramGraphics.setColor(this.tabPane.getBackgroundAt(paramInt2).brighter());
        SwingUtilities2.drawStringUnderlineCharAt(this.tabPane, paramGraphics, paramString, i, paramRectangle.x, paramRectangle.y + paramFontMetrics.getAscent());
        paramGraphics.setColor(this.tabPane.getBackgroundAt(paramInt2).darker());
        SwingUtilities2.drawStringUnderlineCharAt(this.tabPane, paramGraphics, paramString, i, paramRectangle.x - 1, paramRectangle.y + paramFontMetrics.getAscent() - 1);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.b.m
 * JD-Core Version:    0.6.0
 */