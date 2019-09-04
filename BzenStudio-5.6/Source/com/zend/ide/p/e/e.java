package com.zend.ide.p.e;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JToolTip;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.ToolTipUI;

public class e extends ToolTipUI
{
  private static e a = new e();
  private int b = 3;
  private static Rectangle c = new Rectangle();
  private static Rectangle d = new Rectangle();
  private static Rectangle e = new Rectangle();

  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return a;
  }

  public void installUI(JComponent paramJComponent)
  {
    LookAndFeel.installColorsAndFont(paramJComponent, "ToolTip.background", "ToolTip.foreground", "ToolTip.font");
    LookAndFeel.installBorder(paramJComponent, "ToolTip.border");
  }

  public void uninstallUI(JComponent paramJComponent)
  {
    LookAndFeel.uninstallBorder(paramJComponent);
  }

  public Dimension getPreferredSize(JComponent paramJComponent)
  {
    String str = ((JToolTip)paramJComponent).getTipText();
    if ((str == null) || (str.trim().length() == 0))
      return new Dimension(0, 0);
    String[] arrayOfString = str.split("\n|\r|\r\n");
    int i = arrayOfString.length;
    FontMetrics localFontMetrics = paramJComponent.getFontMetrics(paramJComponent.getFont());
    int j = localFontMetrics.getHeight();
    int k = i * j;
    int m = Toolkit.getDefaultToolkit().getScreenSize().width;
    int n = 0;
    for (int i1 = 0; i1 < i; i1++)
    {
      n = Math.max(n, localFontMetrics.stringWidth(arrayOfString[i1]));
      if (n <= m)
        continue;
      n = m;
    }
    return new Dimension(n + this.b * 2, k + this.b * 2);
  }

  public void paint(Graphics paramGraphics, JComponent paramJComponent)
  {
    String str = ((JToolTip)paramJComponent).getTipText();
    if ((str == null) || (str.trim().length() == 0))
      return;
    FontMetrics localFontMetrics = paramJComponent.getFontMetrics(paramJComponent.getFont());
    Dimension localDimension = paramJComponent.getSize();
    int i = localFontMetrics.getHeight();
    int j = localFontMetrics.getAscent();
    String[] arrayOfString = str.split("\n|\r|\r\n");
    int k = arrayOfString.length;
    paramGraphics.setColor(paramJComponent.getBackground());
    paramGraphics.fillRect(0, 0, localDimension.width, localDimension.height);
    paramGraphics.setColor(paramJComponent.getForeground());
    int m = 2 + j;
    for (int n = 0; n < k; n++)
    {
      int i1 = localFontMetrics.stringWidth(arrayOfString[n]);
      if (i1 > localDimension.width)
      {
        e.x = 0;
        e.y = 0;
        e.width = (paramJComponent.getWidth() - this.b * 2);
        e.height = (paramJComponent.getHeight() - this.b * 2);
        d.x = (d.y = d.width = d.height = 0);
        c.x = (c.y = c.width = c.height = 0);
        arrayOfString[n] = SwingUtilities.layoutCompoundLabel(paramJComponent, localFontMetrics, arrayOfString[n], null, 0, 0, 0, 0, e, d, c, 0);
      }
      paramGraphics.drawString(arrayOfString[n], this.b, m);
      m += i;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.e
 * JD-Core Version:    0.6.0
 */