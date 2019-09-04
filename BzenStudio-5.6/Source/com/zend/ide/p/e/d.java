package com.zend.ide.p.e;

import com.zend.ide.p.bj;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicGraphicsUtils;

public class d
{
  public static void a(bj parambj, Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList1 = parambj.b();
    ArrayList localArrayList2 = parambj.c();
    ArrayList localArrayList3 = parambj.d();
    Color localColor1 = parambj.getForeground();
    Font localFont1 = parambj.getFont();
    paramGraphics.setColor(localColor1);
    paramGraphics.setFont(localFont1);
    Object localObject1 = localColor1;
    Object localObject2 = localFont1;
    for (int i = 0; i < localArrayList1.size(); i++)
    {
      Color localColor2 = (Color)localArrayList2.get(i);
      if (localColor2 == null)
        localColor2 = localColor1;
      if (!localColor2.equals(localObject1))
      {
        localObject1 = localColor2;
        paramGraphics.setColor((Color)localObject1);
      }
      Font localFont2 = (Font)localArrayList3.get(i);
      if (localFont2 == null)
        localFont2 = localFont1;
      if (!localFont2.equals(localObject2))
      {
        localObject2 = localFont2;
        paramGraphics.setFont(localFont2);
      }
      String str = (String)localArrayList1.get(i);
      BasicGraphicsUtils.drawString(paramGraphics, str, 0, paramInt1, paramInt2);
      paramInt1 += paramGraphics.getFontMetrics().stringWidth(str);
    }
  }

  public static Dimension a(JButton[] paramArrayOfJButton)
  {
    Dimension localDimension1 = new Dimension(b.d);
    for (int i = 0; i < paramArrayOfJButton.length; i++)
    {
      Dimension localDimension2 = paramArrayOfJButton[i].getPreferredSize();
      if (localDimension2.height > localDimension1.height)
        localDimension1.height = localDimension2.height;
      if (localDimension2.width <= localDimension1.width)
        continue;
      localDimension1.width = localDimension2.width;
    }
    return localDimension1;
  }

  public static void a(JButton[] paramArrayOfJButton, Dimension paramDimension)
  {
    for (int i = 0; i < paramArrayOfJButton.length; i++)
      paramArrayOfJButton[i].setPreferredSize(paramDimension);
  }

  public static void b(JButton[] paramArrayOfJButton)
  {
    a(paramArrayOfJButton, a(paramArrayOfJButton));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.d
 * JD-Core Version:    0.6.0
 */