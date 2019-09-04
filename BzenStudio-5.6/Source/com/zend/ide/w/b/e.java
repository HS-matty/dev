package com.zend.ide.w.b;

import java.awt.Paint;
import java.awt.Polygon;

class e extends Polygon
{
  private int a;
  private Paint b;

  public e(int paramInt)
  {
    this.a = paramInt;
  }

  public e(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2)
  {
    super(paramArrayOfInt1, paramArrayOfInt2, paramInt1);
    this.a = paramInt2;
  }

  public int b()
  {
    return this.a;
  }

  public void a(int paramInt)
  {
    this.a = paramInt;
  }

  public Paint c()
  {
    return this.b;
  }

  public void a(Paint paramPaint)
  {
    this.b = paramPaint;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.e
 * JD-Core Version:    0.6.0
 */