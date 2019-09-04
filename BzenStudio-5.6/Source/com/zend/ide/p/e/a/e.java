package com.zend.ide.p.e.a;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class e extends BasicScrollBarUI
{
  private a a;
  private a b;

  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new e();
  }

  public void uninstallUI(JComponent paramJComponent)
  {
    super.uninstallUI(paramJComponent);
    this.a = (this.b = null);
  }

  protected void configureScrollBarColors()
  {
    super.configureScrollBarColors();
    Color localColor = UIManager.getColor("ScrollBar.trackForeground");
    this.a = a.a(localColor, this.trackColor);
    localColor = UIManager.getColor("ScrollBar.trackHighlightForeground");
    this.b = a.a(localColor, this.trackHighlightColor);
  }

  protected JButton createDecreaseButton(int paramInt)
  {
    return new d(this, paramInt, UIManager.getColor("ScrollBar.thumb"), UIManager.getColor("ScrollBar.thumbShadow"), UIManager.getColor("ScrollBar.thumbDarkShadow"), UIManager.getColor("ScrollBar.thumbHighlight"));
  }

  protected JButton createIncreaseButton(int paramInt)
  {
    return new d(this, paramInt, UIManager.getColor("ScrollBar.thumb"), UIManager.getColor("ScrollBar.thumbShadow"), UIManager.getColor("ScrollBar.thumbDarkShadow"), UIManager.getColor("ScrollBar.thumbHighlight"));
  }

  protected void paintTrack(Graphics paramGraphics, JComponent paramJComponent, Rectangle paramRectangle)
  {
    if (this.a == null)
    {
      super.paintTrack(paramGraphics, paramJComponent, paramRectangle);
    }
    else
    {
      this.a.a(paramGraphics, paramRectangle.x, paramRectangle.y, paramRectangle.width, paramRectangle.height);
      if (this.trackHighlight == 1)
        paintDecreaseHighlight(paramGraphics);
      else if (this.trackHighlight == 2)
        paintIncreaseHighlight(paramGraphics);
    }
  }

  protected void paintDecreaseHighlight(Graphics paramGraphics)
  {
    if (this.b == null)
    {
      super.paintDecreaseHighlight(paramGraphics);
    }
    else
    {
      Insets localInsets = this.scrollbar.getInsets();
      Rectangle localRectangle = getThumbBounds();
      int i;
      int j;
      int k;
      int m;
      if (this.scrollbar.getOrientation() == 1)
      {
        i = localInsets.left;
        j = this.decrButton.getY() + this.decrButton.getHeight();
        k = this.scrollbar.getWidth() - (localInsets.left + localInsets.right);
        m = localRectangle.y - j;
      }
      else
      {
        i = this.decrButton.getX() + this.decrButton.getHeight();
        j = localInsets.top;
        k = localRectangle.x - i;
        m = this.scrollbar.getHeight() - (localInsets.top + localInsets.bottom);
      }
      this.b.a(paramGraphics, i, j, k, m);
    }
  }

  protected void paintIncreaseHighlight(Graphics paramGraphics)
  {
    if (this.b == null)
    {
      super.paintDecreaseHighlight(paramGraphics);
    }
    else
    {
      Insets localInsets = this.scrollbar.getInsets();
      Rectangle localRectangle = getThumbBounds();
      int i;
      int j;
      int k;
      int m;
      if (this.scrollbar.getOrientation() == 1)
      {
        i = localInsets.left;
        j = localRectangle.y + localRectangle.height;
        k = this.scrollbar.getWidth() - (localInsets.left + localInsets.right);
        m = this.incrButton.getY() - j;
      }
      else
      {
        i = localRectangle.x + localRectangle.width;
        j = localInsets.top;
        k = this.incrButton.getX() - i;
        m = this.scrollbar.getHeight() - (localInsets.top + localInsets.bottom);
      }
      this.b.a(paramGraphics, i, j, k, m);
    }
  }

  static JScrollBar a(e parame)
  {
    return parame.scrollbar;
  }

  static JScrollBar b(e parame)
  {
    return parame.scrollbar;
  }

  static JScrollBar c(e parame)
  {
    return parame.scrollbar;
  }

  static JScrollBar d(e parame)
  {
    return parame.scrollbar;
  }

  static
  {
    Color localColor1 = new Color(200, 200, 200);
    Color localColor2 = Color.gray;
    Color localColor3 = Color.lightGray.brighter();
    Color localColor4 = Color.lightGray;
    Color localColor5 = Color.lightGray.darker();
    Color localColor6 = Color.lightGray.darker();
    UIDefaults localUIDefaults = UIManager.getDefaults();
    localUIDefaults.put("ScrollBar.background", localColor4);
    localUIDefaults.put("ScrollBar.foreground", localColor1);
    localUIDefaults.put("ScrollBar.track", Color.white);
    localUIDefaults.put("ScrollBar.trackForeground", localColor4);
    localUIDefaults.put("ScrollBar.trackHighlight", Color.black);
    localUIDefaults.put("ScrollBar.trackHighlightForeground", localColor5);
    localUIDefaults.put("ScrollBar.thumb", localColor1);
    localUIDefaults.put("ScrollBar.thumbHighlight", localColor3);
    localUIDefaults.put("ScrollBar.thumbDarkShadow", localColor2);
    localUIDefaults.put("ScrollBar.thumbShadow", localColor6);
    localUIDefaults.put("ScrollBar.width", new Integer(16));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.a.e
 * JD-Core Version:    0.6.0
 */