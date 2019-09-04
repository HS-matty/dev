package com.zend.ide.z;

import com.zend.ide.util.d.a;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicLabelUI;

class bq extends BasicLabelUI
{
  final bl a;

  bq(bl parambl)
  {
  }

  protected void paintEnabledText(JLabel paramJLabel, Graphics paramGraphics, String paramString, int paramInt1, int paramInt2)
  {
    a(paramJLabel, paramGraphics, paramString, paramInt1, paramInt2);
  }

  void a(JLabel paramJLabel, Graphics paramGraphics, String paramString, int paramInt1, int paramInt2)
  {
    Color localColor = paramJLabel.getForeground();
    r localr = (r)bl.a(this.a).b(Integer.parseInt(paramString));
    double d1 = bi.a(this.a.g) * localr.j();
    double d2 = bi.a(this.a.g) * localr.i();
    double d3 = bl.b(this.a) * bi.a(this.a.g);
    int i = paramJLabel.getWidth() - 5;
    int j = (int)(d1 / d3 * i);
    int k = (int)(d2 / d3 * i);
    paramGraphics.setColor(localColor);
    paramInt2 -= paramJLabel.getHeight() - 2;
    paramGraphics.setColor(bi.b(this.a.g));
    paramGraphics.fill3DRect(paramInt1, paramInt2, k, paramJLabel.getHeight(), true);
    paramGraphics.setColor(bi.g(this.a.g));
    paramGraphics.fill3DRect(paramInt1, paramInt2 + 3, j, paramJLabel.getHeight() - 6, true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bq
 * JD-Core Version:    0.6.0
 */