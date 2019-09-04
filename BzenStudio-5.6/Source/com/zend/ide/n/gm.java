package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class gm
  implements fn
{
  public int a(char paramChar, Document paramDocument, int paramInt, boolean paramBoolean)
    throws BadLocationException
  {
    if (((paramBoolean) && (paramChar != '{') && (paramChar != '(') && (paramChar != '[')) || ((!paramBoolean) && (paramChar != '}') && (paramChar != ')') && (paramChar != ']')))
      return -1;
    int i = kc.h(129);
    bl localbl1 = (bl)fm.b(paramDocument, paramBoolean ? paramInt + 1 : paramInt - 1);
    int j = localbl1.c();
    if (j != i)
      return -1;
    int k = paramBoolean ? paramInt : 0;
    int m = paramBoolean ? paramDocument.getLength() : paramInt;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = fm.b(paramChar);
    paramDocument.getText(k, m - k, fm.b());
    for (int i4 = paramBoolean ? fm.b().first() : fm.b().last(); i4 != 65535; i4 = paramBoolean ? fm.b().next() : fm.b().previous())
    {
      int i5 = fm.b().getIndex() - fm.b().getBeginIndex();
      int i6 = k + i5;
      bl localbl2 = null;
      switch (i4)
      {
      case 40:
        localbl2 = (bl)fm.b(paramDocument, i6 + 1);
        if (localbl2.c() != i)
          break;
        n++;
        if ((paramBoolean) || (n <= 0))
          break;
        return fm.c(i6);
      case 91:
        localbl2 = (bl)fm.b(paramDocument, i6 + 1);
        if (localbl2.c() != i)
          break;
        i1++;
        if ((paramBoolean) || (i1 <= 0))
          break;
        return fm.c(i6);
      case 123:
        localbl2 = (bl)fm.b(paramDocument, i6 + 1);
        if (localbl2.c() != i)
          break;
        i2++;
        if ((paramBoolean) || (i2 <= 0))
          break;
        return fm.c(i6);
      case 41:
        localbl2 = (bl)fm.b(paramDocument, i6);
        if (localbl2.c() != i)
          break;
        n--;
        if ((!paramBoolean) || (n >= 0))
          break;
        return fm.c(i6);
      case 93:
        localbl2 = (bl)fm.b(paramDocument, i6);
        if (localbl2.c() != i)
          break;
        i1--;
        if ((!paramBoolean) || (i1 >= 0))
          break;
        return fm.c(i6);
      case 125:
        localbl2 = (bl)fm.b(paramDocument, i6);
        if (localbl2.c() != i)
          break;
        i2--;
        if ((!paramBoolean) || (i2 >= 0))
          break;
        return fm.c(i6);
      }
      if ((i4 != i3) || (localbl2.c() != i) || (!localbl2.a(localbl1)))
        continue;
      if (((i3 == 40) || (i3 == 41)) && (n == 0))
      {
        if ((i2 == 0) && (i1 == 0))
          return i6;
        return fm.c(i6);
      }
      if (((i3 == 91) || (i3 == 93)) && (i1 == 0))
      {
        if ((n == 0) && (i2 == 0))
          return i6;
        return fm.c(i6);
      }
      if (((i3 != 123) && (i3 != 125)) || (i2 != 0))
        continue;
      if ((n == 0) && (i1 == 0))
        return i6;
      return fm.c(i6);
    }
    return -2;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gm
 * JD-Core Version:    0.6.0
 */