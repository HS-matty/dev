package com.zend.ide.w.b;

import com.zend.ide.util.cl;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

class bx extends DefaultHighlighter.DefaultHighlightPainter
{
  private boolean a;
  private int b;
  private h c;
  private int d;

  public bx(boolean paramBoolean, int paramInt, h paramh)
  {
    super(Color.white);
    this.a = paramBoolean;
    this.b = paramInt;
    this.c = paramh;
    this.d = 0;
  }

  public Color getColor()
  {
    return this.c.a(this.b);
  }

  public Shape paintLayer(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView)
  {
    Color localColor = paramGraphics.getColor();
    paramGraphics.setColor(getColor());
    Rectangle localRectangle1 = (paramShape instanceof Rectangle) ? (Rectangle)paramShape : paramShape.getBounds();
    try
    {
      Rectangle localRectangle2 = paramJTextComponent.modelToView(paramInt1);
      localRectangle2.width = localRectangle1.width;
      localRectangle2.height = paramJTextComponent.getFontMetrics(paramJTextComponent.getFont()).getHeight();
      if (this.a)
      {
        if (this.d == 1)
          localRectangle2.translate(0, localRectangle2.height - 1);
        localRectangle2.height = 1;
      }
      paramGraphics.fillRect(localRectangle2.x, localRectangle2.y, localRectangle2.width, localRectangle2.height);
      return localRectangle2;
    }
    catch (Exception localException)
    {
      cl.a(localException);
      paramGraphics.setColor(localColor);
    }
    return null;
  }

  public void a(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1))
      throw new IllegalArgumentException("Position can be TOP or BOTTOM only");
    this.d = paramInt;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bx
 * JD-Core Version:    0.6.0
 */