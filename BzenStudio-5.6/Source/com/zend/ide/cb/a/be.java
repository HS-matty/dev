package com.zend.ide.cb.a;

import com.zend.ide.util.cl;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

class be extends DefaultHighlighter.DefaultHighlightPainter
{
  private static final Color a = new Color(51, 153, 255);

  public be()
  {
    super(Color.blue);
  }

  public Shape paintLayer(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView)
  {
    if (Math.abs(paramInt1 - paramInt2) > 1)
      return null;
    Graphics2D localGraphics2D = (Graphics2D)paramGraphics;
    localGraphics2D.setStroke(new BasicStroke(1.0F));
    Rectangle localRectangle1 = (paramShape instanceof Rectangle) ? (Rectangle)paramShape : paramShape.getBounds();
    try
    {
      Rectangle localRectangle2 = paramJTextComponent.modelToView(paramInt2);
      int i = localRectangle1.width;
      int j = localRectangle2.y + localRectangle2.height / 2 - 1;
      Paint localPaint = localGraphics2D.getPaint();
      localGraphics2D.setPaint(new GradientPaint(0.0F, j, Color.blue, i / 2, j, a, true));
      localGraphics2D.drawLine(0, j, i, j);
      localGraphics2D.setPaint(localPaint);
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
 * Qualified Name:     com.zend.ide.cb.a.be
 * JD-Core Version:    0.6.0
 */