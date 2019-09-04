package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class gl
  implements fn
{
  public int a(char paramChar, Document paramDocument, int paramInt, boolean paramBoolean)
    throws BadLocationException
  {
    if (((paramBoolean) && (paramChar != '<')) || ((!paramBoolean) && (paramChar != '>')))
      return -1;
    int i = kc.h(120);
    int j = kc.h(121);
    bl localbl1 = (bl)fm.b(paramDocument, paramInt);
    int k = localbl1.c();
    if ((k != j) && (k != i))
      return -1;
    int m = paramBoolean ? paramInt : 0;
    int n = paramBoolean ? paramDocument.getLength() : paramInt;
    int i1 = 0;
    paramDocument.getText(m, n - m, fm.b());
    for (int i2 = paramBoolean ? fm.b().first() : fm.b().last(); i2 != 65535; i2 = paramBoolean ? fm.b().next() : fm.b().previous())
    {
      int i3 = fm.b().getIndex() - fm.b().getBeginIndex();
      int i4 = m + i3;
      bl localbl2;
      switch (i2)
      {
      case 60:
        localbl2 = (bl)fm.b(paramDocument, i4);
        if ((localbl2.c() != i) && (localbl2.c() != j))
          continue;
        i1++;
        if ((paramBoolean) || (i1 != 0) || (!localbl2.equals(localbl1)))
          continue;
        return i4;
      case 62:
        localbl2 = (bl)fm.b(paramDocument, i4 + 1);
        if ((localbl2.c() != i) && (localbl2.c() != j))
          continue;
        i1--;
        if ((!paramBoolean) || (i1 != 0) || (!localbl2.equals(localbl1)))
          continue;
        return i4;
      }
    }
    return -1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gl
 * JD-Core Version:    0.6.0
 */