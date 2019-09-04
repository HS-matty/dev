package com.zend.ide.n;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.WrappedPlainView;

class ii extends WrappedPlainView
{
  private Font b;
  private FontMetrics c;
  final ih a;

  public ii(ih paramih, Element paramElement, boolean paramBoolean)
  {
    super(paramElement, paramBoolean);
  }

  public void paint(Graphics paramGraphics, Shape paramShape)
  {
    super.paint(paramGraphics, paramShape);
    if (this.a.a())
    {
      a();
      Color localColor = paramGraphics.getColor();
      paramGraphics.setColor(ih.c());
      int i = this.c.charWidth('m') * this.a.b();
      Rectangle localRectangle = (Rectangle)paramShape;
      paramGraphics.drawLine(i, localRectangle.y, i, localRectangle.y + localRectangle.height);
      paramGraphics.setColor(localColor);
    }
  }

  protected void a()
  {
    Container localContainer = getContainer();
    if (localContainer != null)
    {
      Font localFont = localContainer.getFont();
      if (this.b != localFont)
      {
        this.b = localFont;
        this.c = localContainer.getFontMetrics(this.b);
      }
    }
  }

  protected int drawUnselectedText(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws BadLocationException
  {
    int i = this.a.a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
    if (i < 0)
      i = super.drawUnselectedText(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4);
    return i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ii
 * JD-Core Version:    0.6.0
 */