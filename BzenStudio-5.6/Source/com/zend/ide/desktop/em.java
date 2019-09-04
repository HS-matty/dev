package com.zend.ide.desktop;

import com.zend.ide.util.cl;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

class em extends DefaultHighlighter.DefaultHighlightPainter
{
  private em()
  {
    super(Color.RED);
  }

  public Shape paintLayer(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView)
  {
    paramGraphics.setColor(getColor());
    try
    {
      FontMetrics localFontMetrics = paramJTextComponent.getFontMetrics(paramJTextComponent.getFont());
      int i = localFontMetrics.getMaxAdvance() / 4;
      int j = localFontMetrics.getHeight() / 5;
      int k = -1;
      Rectangle localRectangle1 = paramJTextComponent.modelToView(paramInt1);
      int m = (int)localRectangle1.getX();
      int n = (int)(localRectangle1.getY() + localRectangle1.getHeight()) - 2;
      Rectangle localRectangle2 = paramJTextComponent.modelToView(paramInt2);
      int i1 = (int)(localRectangle2.getX() + localRectangle2.getWidth());
      if (paramJTextComponent.getDocument().getLength() < paramInt2)
        i1 += 20;
      int i2 = n;
      int i3 = m;
      while (i3 < i1)
      {
        int i4 = i2 + k * j;
        paramGraphics.drawLine(i3, i2, i3 + i, i4);
        i2 = i4;
        i3 += i;
        k *= -1;
      }
      return new Rectangle(m, n - j, i1 - m, j);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return null;
  }

  em(eh parameh)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.em
 * JD-Core Version:    0.6.0
 */