package com.zend.ide.n.a;

import com.zend.ide.util.cl;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

final class l extends DefaultHighlighter.DefaultHighlightPainter
{
  public l(Color paramColor)
  {
    super(paramColor);
  }

  public Shape paintLayer(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView)
  {
    paramGraphics.setColor(getColor());
    try
    {
      Rectangle localRectangle1 = paramJTextComponent.modelToView(paramInt1);
      Rectangle localRectangle2 = paramJTextComponent.getVisibleRect();
      localRectangle1.x = localRectangle2.x;
      localRectangle1.width = localRectangle2.width;
      localRectangle1.height = paramJTextComponent.getFontMetrics(paramJTextComponent.getFont()).getHeight();
      paramGraphics.fillRect(localRectangle1.x, localRectangle1.y, localRectangle1.width, localRectangle1.height);
      return localRectangle1;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.a.l
 * JD-Core Version:    0.6.0
 */