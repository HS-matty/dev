package com.zend.ide.bf;

import com.zend.ide.util.cl;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

class bc extends DefaultHighlighter.DefaultHighlightPainter
{
  private bc()
  {
    super(Color.RED);
  }

  public Shape paintLayer(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView)
  {
    paramGraphics.setColor(getColor());
    try
    {
      Rectangle localRectangle1 = paramJTextComponent.modelToView(paramInt1);
      Rectangle localRectangle2 = paramJTextComponent.modelToView(paramInt2);
      Rectangle localRectangle3 = localRectangle1.union(localRectangle2);
      paramGraphics.drawRect(localRectangle3.x, localRectangle3.y, localRectangle3.width, localRectangle3.height);
      return localRectangle3;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return null;
  }

  bc(n paramn)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.bc
 * JD-Core Version:    0.6.0
 */