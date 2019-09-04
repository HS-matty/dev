package com.zend.ide.p;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.tree.TreeCellRenderer;

public class be extends bj
  implements TreeCellRenderer
{
  private JTree a;
  protected boolean b;
  protected boolean f;
  private boolean g;
  protected transient Icon h;
  protected transient Icon i;
  protected transient Icon j;
  protected Color k;
  protected Color l;
  protected Color m;
  protected Color n;
  protected Color o;

  public be()
  {
    setHorizontalAlignment(2);
    c(UIManager.getIcon("Tree.leafIcon"));
    b(UIManager.getIcon("Tree.closedIcon"));
    a(UIManager.getIcon("Tree.openIcon"));
    a(UIManager.getColor("Tree.selectionForeground"));
    b(UIManager.getColor("Tree.textForeground"));
    c(UIManager.getColor("Tree.selectionBackground"));
    d(UIManager.getColor("Tree.textBackground"));
    e(UIManager.getColor("Tree.selectionBorderColor"));
    Object localObject = UIManager.get("Tree.drawsFocusBorderAroundIcon");
    this.g = ((localObject != null) && (((Boolean)localObject).booleanValue()));
  }

  public void a(Icon paramIcon)
  {
    this.j = paramIcon;
  }

  public Icon f()
  {
    return this.j;
  }

  public void b(Icon paramIcon)
  {
    this.h = paramIcon;
  }

  public Icon g()
  {
    return this.h;
  }

  public void c(Icon paramIcon)
  {
    this.i = paramIcon;
  }

  public Icon h()
  {
    return this.i;
  }

  public void a(Color paramColor)
  {
    this.k = paramColor;
  }

  public Color i()
  {
    return this.k;
  }

  public void b(Color paramColor)
  {
    this.l = paramColor;
  }

  public Color j()
  {
    return this.l;
  }

  public void c(Color paramColor)
  {
    this.m = paramColor;
  }

  public Color k()
  {
    return this.m;
  }

  public void d(Color paramColor)
  {
    this.n = paramColor;
  }

  public Color l()
  {
    return this.n;
  }

  public void e(Color paramColor)
  {
    this.o = paramColor;
  }

  public Color m()
  {
    return this.o;
  }

  public void setFont(Font paramFont)
  {
    if ((paramFont instanceof FontUIResource))
      paramFont = null;
    super.setFont(paramFont);
  }

  public Font getFont()
  {
    Font localFont = super.getFont();
    if ((localFont == null) && (this.a != null))
      localFont = this.a.getFont();
    return localFont;
  }

  public void setBackground(Color paramColor)
  {
    if ((paramColor instanceof ColorUIResource))
      paramColor = null;
    super.setBackground(paramColor);
  }

  public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
  {
    String str = paramJTree.convertValueToText(paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
    this.a = paramJTree;
    this.f = paramBoolean4;
    setText(str);
    if (paramBoolean1)
      setForeground(i());
    else
      setForeground(j());
    if (!paramJTree.isEnabled())
    {
      setEnabled(false);
      if (paramBoolean3)
        setDisabledIcon(h());
      else if (paramBoolean2)
        setDisabledIcon(f());
      else
        setDisabledIcon(g());
    }
    else
    {
      setEnabled(true);
      if (paramBoolean3)
        setIcon(h());
      else if (paramBoolean2)
        setIcon(f());
      else
        setIcon(g());
    }
    setComponentOrientation(paramJTree.getComponentOrientation());
    this.b = paramBoolean1;
    return this;
  }

  public void paint(Graphics paramGraphics)
  {
    Color localColor;
    if (this.b)
    {
      localColor = k();
    }
    else
    {
      localColor = l();
      if (localColor == null)
        localColor = getBackground();
    }
    int i1 = -1;
    Object localObject;
    if (localColor != null)
    {
      localObject = getIcon();
      i1 = n();
      paramGraphics.setColor(localColor);
      if (getComponentOrientation().isLeftToRight())
        paramGraphics.fillRect(i1, 0, getWidth() - 1 - i1, getHeight());
      else
        paramGraphics.fillRect(0, 0, getWidth() - 1 - i1, getHeight());
    }
    if (this.f)
    {
      if (this.g)
        i1 = 0;
      else if (i1 == -1)
        i1 = n();
      localObject = m();
      if (localObject != null)
      {
        paramGraphics.setColor((Color)localObject);
        if (getComponentOrientation().isLeftToRight())
          paramGraphics.drawRect(i1, 0, getWidth() - 1 - i1, getHeight() - 1);
        else
          paramGraphics.drawRect(0, 0, getWidth() - 1 - i1, getHeight() - 1);
      }
    }
    super.paint(paramGraphics);
  }

  private int n()
  {
    Icon localIcon = getIcon();
    if ((localIcon != null) && (getText() != null))
      return localIcon.getIconWidth() + Math.max(0, getIconTextGap() - 1);
    return 0;
  }

  public Dimension getPreferredSize()
  {
    Dimension localDimension = super.getPreferredSize();
    if (localDimension != null)
      localDimension = new Dimension(localDimension.width + 3, localDimension.height);
    return localDimension;
  }

  public void validate()
  {
  }

  public void revalidate()
  {
  }

  public void repaint(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void repaint(Rectangle paramRectangle)
  {
  }

  protected void firePropertyChange(String paramString, Object paramObject1, Object paramObject2)
  {
    if (paramString == "text")
      super.firePropertyChange(paramString, paramObject1, paramObject2);
  }

  public void firePropertyChange(String paramString, byte paramByte1, byte paramByte2)
  {
  }

  public void firePropertyChange(String paramString, char paramChar1, char paramChar2)
  {
  }

  public void firePropertyChange(String paramString, short paramShort1, short paramShort2)
  {
  }

  public void firePropertyChange(String paramString, int paramInt1, int paramInt2)
  {
  }

  public void firePropertyChange(String paramString, long paramLong1, long paramLong2)
  {
  }

  public void firePropertyChange(String paramString, float paramFloat1, float paramFloat2)
  {
  }

  public void firePropertyChange(String paramString, double paramDouble1, double paramDouble2)
  {
  }

  public void firePropertyChange(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.be
 * JD-Core Version:    0.6.0
 */