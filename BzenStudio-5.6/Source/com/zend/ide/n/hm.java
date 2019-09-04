package com.zend.ide.n;

import com.zend.ide.util.cl;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

class hm extends DefaultHighlighter.DefaultHighlightPainter
{
  final bk a;

  hm(bk parambk, Color paramColor)
  {
    super(paramColor);
  }

  public Shape paintLayer(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView)
  {
    paramGraphics.setColor(this.a.a);
    Rectangle localRectangle1 = (paramShape instanceof Rectangle) ? (Rectangle)paramShape : paramShape.getBounds();
    try
    {
      Rectangle localRectangle2 = paramJTextComponent.modelToView(paramInt1);
      localRectangle2.width = localRectangle1.width;
      localRectangle2.height = paramJTextComponent.getFontMetrics(paramJTextComponent.getFont()).getHeight();
      paramGraphics.fillRect(localRectangle2.x, localRectangle2.y, localRectangle2.width, localRectangle2.height);
      return localRectangle2;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hm
 * JD-Core Version:    0.6.0
 */