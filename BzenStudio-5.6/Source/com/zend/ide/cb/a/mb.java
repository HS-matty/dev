package com.zend.ide.cb.a;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class mb
{
  public static int a = 80;
  public static int b = 15;

  public static void a(Throwable paramThrowable, Component paramComponent, String paramString, int paramInt)
  {
    String[] arrayOfString = a(paramThrowable.getMessage(), a, b);
    JOptionPane.showMessageDialog(paramComponent, arrayOfString, paramString, paramInt);
  }

  public static void a(String paramString1, Component paramComponent, String paramString2, int paramInt)
  {
    String[] arrayOfString = a(paramString1, a, b);
    JOptionPane.showMessageDialog(paramComponent, arrayOfString, paramString2, paramInt);
  }

  private static String[] a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null)
      paramString = "";
    StringBuffer localStringBuffer1 = new StringBuffer();
    StringBuffer localStringBuffer2 = new StringBuffer();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (int j = 0; i < paramString.length(); j++)
    {
      switch (paramString.charAt(i))
      {
      case ' ':
        localStringBuffer1.append(localStringBuffer2 + " ");
        localStringBuffer2 = new StringBuffer();
        break;
      case '\n':
        localStringBuffer1.append(localStringBuffer2);
        localArrayList.add(localStringBuffer1.toString());
        localStringBuffer2 = new StringBuffer();
        localStringBuffer1 = new StringBuffer();
        j = 0;
        break;
      case '\t':
        localStringBuffer1.append(localStringBuffer2 + "    ");
        localStringBuffer2 = new StringBuffer();
        break;
      default:
        localStringBuffer2.append(paramString.charAt(i));
      }
      if (j > paramInt1)
      {
        localArrayList.add(localStringBuffer1.toString());
        localStringBuffer1 = new StringBuffer();
        j = 0;
      }
      i++;
    }
    if (!localStringBuffer1.toString().endsWith((localStringBuffer2 + "\n").toString()))
    {
      localStringBuffer1.append(localStringBuffer2);
      localArrayList.add(localStringBuffer1.toString());
    }
    String[] arrayOfString1 = new String[localArrayList.size()];
    String[] arrayOfString2 = arrayOfString1;
    localArrayList.toArray(arrayOfString1);
    if (arrayOfString2.length > paramInt2)
    {
      arrayOfString2 = new String[paramInt2];
      System.arraycopy(arrayOfString1, 0, arrayOfString2, 0, paramInt2 - 1);
      arrayOfString2[(paramInt2 - 1)] = "...";
    }
    return arrayOfString2;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.mb
 * JD-Core Version:    0.6.0
 */