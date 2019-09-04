package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class gw
  implements fn
{
  public int a(char paramChar, Document paramDocument, int paramInt, boolean paramBoolean)
    throws BadLocationException
  {
    if (((paramBoolean) && (paramChar != '{') && (paramChar != '(') && (paramChar != '[')) || ((!paramBoolean) && (paramChar != '}') && (paramChar != ')') && (paramChar != ']')))
      return -1;
    int i = kc.h(132);
    bl localbl1 = (bl)fm.b(paramDocument, paramBoolean ? paramInt + 1 : paramInt - 1);
    if ((localbl1.c() != i) && (paramBoolean) && (a(paramDocument, localbl1, paramInt)))
      localbl1 = (bl)fm.b(paramDocument, paramInt + 2);
    if (localbl1.c() != i)
      return -1;
    int j = paramBoolean ? paramInt : 0;
    int k = paramBoolean ? paramDocument.getLength() : paramInt;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = fm.b(paramChar);
    paramDocument.getText(j, k - j, fm.b());
    for (int i3 = paramBoolean ? fm.b().first() : fm.b().last(); i3 != 65535; i3 = paramBoolean ? fm.b().next() : fm.b().previous())
    {
      int i4 = fm.b().getIndex() - fm.b().getBeginIndex();
      int i5 = j + i4;
      bl localbl2 = null;
      switch (i3)
      {
      case 40:
        localbl2 = (bl)fm.b(paramDocument, i5 + 1);
        if (localbl2.c() != i)
          break;
        m++;
        if ((paramBoolean) || (m <= 0))
          break;
        return fm.c(i5);
      case 91:
        localbl2 = (bl)fm.b(paramDocument, i5 + 1);
        if (localbl2.c() != i)
          break;
        n++;
        if ((paramBoolean) || (n <= 0))
          break;
        return fm.c(i5);
      case 123:
        localbl2 = (bl)fm.b(paramDocument, i5 + 1);
        if ((localbl2.c() != i) && (a(paramDocument, localbl2, i5)))
          localbl2 = (bl)fm.b(paramDocument, i5 + 2);
        if (localbl2.c() != i)
          break;
        i1++;
        if ((paramBoolean) || (i1 <= 0))
          break;
        return fm.c(i5);
      case 41:
        localbl2 = (bl)fm.b(paramDocument, i5);
        if (localbl2.c() != i)
          break;
        m--;
        if ((!paramBoolean) || (m >= 0))
          break;
        return fm.c(i5);
      case 93:
        localbl2 = (bl)fm.b(paramDocument, i5);
        if (localbl2.c() != i)
          break;
        n--;
        if ((!paramBoolean) || (n >= 0))
          break;
        return fm.c(i5);
      case 125:
        localbl2 = (bl)fm.b(paramDocument, i5);
        if (localbl2.c() != i)
          break;
        i1--;
        if ((!paramBoolean) || (i1 >= 0))
          break;
        return fm.c(i5);
      }
      if ((i3 != i2) || (localbl2.c() != i) || (!localbl2.a(localbl1)))
        continue;
      if (((i2 == 40) || (i2 == 41)) && (m == 0))
      {
        if ((i1 == 0) && (n == 0))
          return i5;
        return fm.c(i5);
      }
      if (((i2 == 91) || (i2 == 93)) && (n == 0))
      {
        if ((m == 0) && (i1 == 0))
          return i5;
        return fm.c(i5);
      }
      if (((i2 != 123) && (i2 != 125)) || (i1 != 0))
        continue;
      if ((m == 0) && (n == 0))
        return i5;
      return fm.c(i5);
    }
    return -2;
  }

  private boolean a(Document paramDocument, bl parambl, int paramInt)
    throws BadLocationException
  {
    int i = kc.g(parambl.c());
    if ((i != 135) && (i != 138) && (i != 137))
      return false;
    int j = paramDocument.getText(paramInt + 1, 1).charAt(0);
    return j == 36;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gw
 * JD-Core Version:    0.6.0
 */