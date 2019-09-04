package com.zend.ide.p.e.a;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.lang.ref.WeakReference;
import java.util.HashMap;

class a
{
  private static HashMap a = new HashMap();
  private BufferedImage b;

  public static a a(Color paramColor1, Color paramColor2)
  {
    String str = paramColor1.getRGB() + " " + paramColor2.getRGB();
    WeakReference localWeakReference = (WeakReference)a.get(str);
    a locala = localWeakReference == null ? null : (a)localWeakReference.get();
    if (locala == null)
    {
      locala = new a(paramColor1, paramColor2);
      a.put(str, new WeakReference(locala));
    }
    return locala;
  }

  public a(Color paramColor1, Color paramColor2)
  {
    int[] arrayOfInt = { paramColor1.getRGB(), paramColor2.getRGB() };
    IndexColorModel localIndexColorModel = new IndexColorModel(8, 2, arrayOfInt, 0, false, -1, 0);
    this.b = new BufferedImage(64, 64, 13, localIndexColorModel);
    Graphics localGraphics = this.b.getGraphics();
    try
    {
      localGraphics.setClip(0, 0, 64, 64);
      a(localGraphics, paramColor1, paramColor2);
    }
    finally
    {
      localGraphics.dispose();
    }
  }

  public void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rectangle localRectangle = paramGraphics.getClipBounds();
    int i = Math.max(paramInt1, localRectangle.x);
    int j = Math.max(paramInt2, localRectangle.y);
    int k = Math.min(localRectangle.x + localRectangle.width, paramInt1 + paramInt3);
    int m = Math.min(localRectangle.y + localRectangle.height, paramInt2 + paramInt4);
    if ((k <= i) || (m <= j))
      return;
    int n = (i - paramInt1) % 2;
    for (int i1 = i; i1 < k; i1 += 64)
    {
      int i2 = (j - paramInt2) % 2;
      int i3 = Math.min(64 - n, k - i1);
      for (int i4 = j; i4 < m; i4 += 64)
      {
        int i5 = Math.min(64 - i2, m - i4);
        paramGraphics.drawImage(this.b, i1, i4, i1 + i3, i4 + i5, n, i2, n + i3, i2 + i5, null);
        if (i2 == 0)
          continue;
        i4 -= i2;
        i2 = 0;
      }
      if (n == 0)
        continue;
      i1 -= n;
      n = 0;
    }
  }

  private void a(Graphics paramGraphics, Color paramColor1, Color paramColor2)
  {
    Rectangle localRectangle = paramGraphics.getClipBounds();
    paramGraphics.setColor(paramColor2);
    paramGraphics.fillRect(localRectangle.x, localRectangle.y, localRectangle.width, localRectangle.height);
    paramGraphics.setColor(paramColor1);
    paramGraphics.translate(localRectangle.x, localRectangle.y);
    int i = localRectangle.width;
    int j = localRectangle.height;
    int k = localRectangle.x % 2;
    int m = i - j;
    while (k < m)
    {
      paramGraphics.drawLine(k, 0, k + j, j);
      k += 2;
    }
    m = i;
    while (k < m)
    {
      paramGraphics.drawLine(k, 0, i, i - k);
      k += 2;
    }
    m = localRectangle.x % 2 == 0 ? 2 : 1;
    int n = j - i;
    while (m < n)
    {
      paramGraphics.drawLine(0, m, i, m + i);
      m += 2;
    }
    n = j;
    while (m < n)
    {
      paramGraphics.drawLine(0, m, j - m, j);
      m += 2;
    }
    paramGraphics.translate(-localRectangle.x, -localRectangle.y);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.a.a
 * JD-Core Version:    0.6.0
 */