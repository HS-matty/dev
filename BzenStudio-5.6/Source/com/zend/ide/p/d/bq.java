package com.zend.ide.p.d;

import com.zend.ide.p.z;
import java.awt.Dimension;

class bq extends z
{
  private bq[] a;
  private int b = 0;
  final bw c;

  bq(bw parambw, String paramString)
  {
    super(paramString);
    setAlignmentX(0.0F);
  }

  public Dimension getPreferredSize()
  {
    Dimension localDimension = super.getPreferredSize();
    return new Dimension(c() + 11, localDimension.height);
  }

  private int c()
  {
    if ((this.b == 0) && (this.a != null))
    {
      int i = 0;
      for (int j = 0; j < this.a.length; j++)
        i = Math.max(this.a[j].b(), i);
      for (j = 0; j < this.a.length; j++)
        this.a[j].b = i;
    }
    return this.b;
  }

  private int b()
  {
    return super.getPreferredSize().width;
  }

  static bq[] a(bq parambq, bq[] paramArrayOfbq)
  {
    return parambq.a = paramArrayOfbq;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bq
 * JD-Core Version:    0.6.0
 */