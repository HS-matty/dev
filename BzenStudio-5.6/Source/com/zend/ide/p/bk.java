package com.zend.ide.p;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

public class bk extends JPanel
{
  private ArrayList a;

  public bk(int paramInt, double[] paramArrayOfDouble, ArrayList paramArrayList, Color paramColor)
  {
    super(new BorderLayout());
    this.a = paramArrayList;
    int[] arrayOfInt1 = new int[paramInt];
    int[] arrayOfInt2 = new int[paramInt];
    for (int i = 0; i < paramInt; i++)
    {
      arrayOfInt1[i] = i;
      arrayOfInt2[i] = (int)(paramArrayOfDouble[i] * 1000.0D);
    }
    bl localbl = new bl(this, paramInt, arrayOfInt1, arrayOfInt2, "");
    localbl.a(true);
    if (paramColor != null)
    {
      localbl.setBackground(paramColor);
      setBackground(paramColor);
    }
    add(localbl, "Center");
  }

  static ArrayList a(bk parambk)
  {
    return parambk.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bk
 * JD-Core Version:    0.6.0
 */