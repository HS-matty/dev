package com.zend.ide.n.td;

import com.zend.ide.p.e.b;
import com.zend.ide.util.cl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;

public class fc extends JPanel
  implements PropertyChangeListener
{
  private static final Color a = b.b;
  private static final Color b = new Color(240, 240, 240);
  private JTextComponent c = null;
  private int d = 0;
  private int e;
  private int f;
  private int g;

  public fc(JTextComponent paramJTextComponent)
  {
    this.c = paramJTextComponent;
    this.g = paramJTextComponent.getDocument().getDefaultRootElement().getElementCount();
    this.e = -1;
    this.f = -1;
    a();
  }

  public void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2)
      throw new IllegalArgumentException("start > end");
    this.e = paramInt1;
    this.f = paramInt2;
    b();
  }

  private void a()
  {
    setBackground(b);
    this.c.addPropertyChangeListener("font", this);
    b();
  }

  protected void paintComponent(Graphics paramGraphics)
  {
    Rectangle localRectangle1 = this.c.getVisibleRect();
    paramGraphics.setFont(this.c.getGraphics().getFont());
    paramGraphics.translate(0, -localRectangle1.y);
    if ((this.e > -1) && (this.f > -1))
    {
      int i = this.f >= this.e ? this.f + 1 : this.f;
      int j = this.e;
      Element localElement2 = this.c.getDocument().getDefaultRootElement();
      try
      {
        do
        {
          paramGraphics.setColor(a);
          Element localElement1 = localElement2.getElement(j);
          Rectangle localRectangle2 = this.c.modelToView(localElement1.getStartOffset());
          if (localRectangle2 == null)
            return;
          String str = Integer.toString(j + 1);
          paramGraphics.drawString(str, localRectangle2.x + 3, localRectangle2.y + 3 * localRectangle2.height / 4);
          j++;
        }
        while (j < i);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
    paramGraphics.translate(0, localRectangle1.y);
  }

  private void b()
  {
    if ((this.f < 0) || (this.e < 0))
      return;
    FontMetrics localFontMetrics = getFontMetrics(this.c.getFont());
    int i = this.f - this.e + 1;
    int j = localFontMetrics.getHeight();
    int k = j * i;
    this.d = (SwingUtilities.computeStringWidth(localFontMetrics, Integer.toString(this.g)) + 6);
    int m = Math.max(8, j / 2);
    this.d += m + 4;
    Dimension localDimension = new Dimension(this.d, k);
    setPreferredSize(localDimension);
    setSize(localDimension);
    revalidate();
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.fc
 * JD-Core Version:    0.6.0
 */