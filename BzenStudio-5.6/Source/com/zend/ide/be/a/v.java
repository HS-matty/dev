package com.zend.ide.be.a;

import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Icon;

class v
  implements Icon, PropertyChangeListener
{
  private String a;
  private String[] b;
  private int[] c;
  private int[] d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private Component j;
  private static final double k = Math.toRadians(90.0D);

  public v(Component paramComponent, String paramString, int paramInt)
  {
    this.j = paramComponent;
    this.a = paramString;
    this.i = a(paramString, paramInt);
    c();
    this.j.addPropertyChangeListener(this);
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    String str = paramPropertyChangeEvent.getPropertyName();
    if ("font".equals(str))
      b();
  }

  private void b()
  {
    int m = getIconWidth();
    int n = getIconHeight();
    c();
    if ((m != getIconWidth()) || (n != getIconHeight()))
      this.j.invalidate();
  }

  private void c()
  {
    FontMetrics localFontMetrics = this.j.getFontMetrics(this.j.getFont());
    this.g = (localFontMetrics.getAscent() + localFontMetrics.getDescent());
    this.h = localFontMetrics.getDescent();
    if (this.i == 1)
    {
      int m = this.a.length();
      char[] arrayOfChar = new char[m];
      this.a.getChars(0, m, arrayOfChar, 0);
      this.e = 0;
      this.b = new String[m];
      this.c = new int[m];
      this.d = new int[m];
      for (int n = 0; n < m; n++)
      {
        char c1 = arrayOfChar[n];
        this.c[n] = localFontMetrics.charWidth(c1);
        if (this.c[n] > this.e)
          this.e = this.c[n];
        this.b[n] = new String(arrayOfChar, n, 1);
        if ("ぁぃぅぇぉっゃゅょゎァィゥェォッャュョヮヵヶ".indexOf(c1) >= 0)
          this.d[n] = 1;
        else if ("、。".indexOf(c1) >= 0)
          this.d[n] = 2;
        else
          this.d[n] = 0;
      }
      this.f = (this.g * m + this.h);
    }
    else
    {
      this.e = this.g;
      this.f = (localFontMetrics.stringWidth(this.a) + 10);
    }
  }

  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    paramGraphics.setColor(paramComponent.getForeground());
    paramGraphics.setFont(paramComponent.getFont());
    if (this.i == 1)
    {
      int m = paramInt2 + this.g;
      for (int n = 0; n < this.b.length; n++)
      {
        int i1;
        switch (this.d[n])
        {
        case 0:
          paramGraphics.drawString(this.b[n], paramInt1 + (this.e - this.c[n]) / 2, m);
          break;
        case 1:
          i1 = this.g / 3;
          paramGraphics.drawString(this.b[n], paramInt1 + i1 / 2, m - i1);
          break;
        case 2:
          i1 = this.g - this.g / 3;
          paramGraphics.drawString(this.b[n], paramInt1 + i1 / 2, m - i1);
        }
        m += this.g;
      }
    }
    else if (this.i == 2)
    {
      paramGraphics.translate(paramInt1 + this.e, paramInt2 + this.f);
      ((Graphics2D)paramGraphics).rotate(-k);
      paramGraphics.drawString(this.a, 5, -this.h);
      ((Graphics2D)paramGraphics).rotate(k);
      paramGraphics.translate(-(paramInt1 + this.e), -(paramInt2 + this.f));
    }
    else if (this.i == 4)
    {
      paramGraphics.translate(paramInt1, paramInt2);
      ((Graphics2D)paramGraphics).rotate(k);
      paramGraphics.drawString(this.a, 5, -this.h);
      ((Graphics2D)paramGraphics).rotate(-k);
      paramGraphics.translate(-paramInt1, -paramInt2);
    }
  }

  public int getIconWidth()
  {
    return this.e;
  }

  public int getIconHeight()
  {
    return this.f;
  }

  private static int a(String paramString, int paramInt)
  {
    int m = 0;
    int n = 0;
    int i1 = paramString.length();
    char[] arrayOfChar = new char[i1];
    paramString.getChars(0, i1, arrayOfChar, 0);
    for (int i3 = 0; i3 < i1; i3++)
    {
      int i2 = arrayOfChar[i3];
      if (((i2 < 1424) || (i2 > 1535)) && ((i2 < 1536) || (i2 > 1791)) && ((i2 < 1792) || (i2 > 1871)))
        continue;
      n = 1;
    }
    if (m != 0)
      return 1;
    i3 = n != 0 ? 6 : 7;
    if ((paramInt & i3) > 0)
      return paramInt;
    return n != 0 ? 2 : 4;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.v
 * JD-Core Version:    0.6.0
 */