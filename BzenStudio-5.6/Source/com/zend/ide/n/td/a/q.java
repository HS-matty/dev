package com.zend.ide.n.td.a;

import java.util.ArrayList;
import javax.swing.text.Segment;

public class q
{
  public static char[] a(ArrayList paramArrayList, char[] paramArrayOfChar)
  {
    int i = 0;
    int j = paramArrayList.size();
    for (int k = 0; k < j; k++)
      i += ((Segment)paramArrayList.get(k)).count;
    if (j == 1)
      i += paramArrayOfChar.length;
    else
      i += (j - 1) * paramArrayOfChar.length;
    if (i == 0)
      i = paramArrayOfChar.length;
    char[] arrayOfChar = new char[i];
    int m = 0;
    for (int n = 0; n < j; n++)
    {
      Segment localSegment = (Segment)paramArrayList.get(n);
      System.arraycopy(localSegment.array, localSegment.getBeginIndex(), arrayOfChar, m, localSegment.count);
      m += localSegment.count;
      if (m >= i)
        continue;
      System.arraycopy(paramArrayOfChar, 0, arrayOfChar, m, paramArrayOfChar.length);
      m += paramArrayOfChar.length;
    }
    return arrayOfChar;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.q
 * JD-Core Version:    0.6.0
 */