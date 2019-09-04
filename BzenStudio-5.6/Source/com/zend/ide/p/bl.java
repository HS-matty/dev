package com.zend.ide.p;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

class bl extends JPanel
{
  JLabel a;
  bh b;
  int c;
  int[] d;
  int[] e;
  int f;
  int g;
  int h;
  int i;
  double[] j;
  Color k = Color.black;
  boolean l = false;
  final bk m;

  public bl(bk parambk, int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2, String paramString)
  {
    super(new BorderLayout());
    this.a = new JLabel(paramString, 0);
    add(this.a, "North");
    if ((paramArrayOfInt2 == null) || (paramArrayOfInt1 == null))
      throw new IllegalArgumentException();
    if (paramInt > paramArrayOfInt2.length)
      throw new IllegalArgumentException();
    if (paramInt > paramArrayOfInt1.length)
      throw new IllegalArgumentException();
    this.c = paramInt;
    this.d = paramArrayOfInt1;
    this.e = paramArrayOfInt2;
    this.f = (this.g = 0);
    this.h = (this.i = 0);
    for (int n = 0; n < this.c; n++)
    {
      this.f = Math.min(this.f, this.d[n]);
      this.g = Math.max(this.g, this.d[n]);
      this.h = Math.min(this.h, this.e[n]);
      this.i = Math.max(this.i, this.e[n]);
    }
    if (this.f == this.g)
      this.g += 1;
    if (this.h == this.i)
      this.i += 1;
    double d1 = 0.0D;
    for (int i1 = 0; i1 < this.c; i1++)
    {
      this.e[i1] = Math.max(this.e[i1], 0);
      d1 += this.e[i1];
    }
    this.j = new double[this.c];
    for (i1 = 0; i1 < this.c; i1++)
      this.j[i1] = (this.e[i1] * 360.0D / d1);
    this.b = new bh(this);
    add(this.b, "Center");
  }

  public void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
    this.b.repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bl
 * JD-Core Version:    0.6.0
 */