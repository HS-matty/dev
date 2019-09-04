package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class gy
  implements fn
{
  public int a(char paramChar, Document paramDocument, int paramInt, boolean paramBoolean)
    throws BadLocationException
  {
    if (((paramBoolean) && (paramChar != '<')) || ((!paramBoolean) && (paramChar != '>')))
      return -1;
    bl localbl1 = (bl)fm.b(paramDocument, paramInt);
    int i = localbl1.c();
    if (kc.f(i))
      return -1;
    bl localbl2;
    if (paramBoolean)
    {
      if (paramInt == paramDocument.getLength())
        return -1;
      localbl2 = (bl)fm.b(paramDocument, paramInt + 2);
      if (!kc.f(localbl2.c()))
        return -1;
    }
    else
    {
      if (paramInt == 0)
        return -1;
      localbl2 = (bl)fm.b(paramDocument, paramInt - 1);
      if (!kc.f(localbl2.c()))
        return -1;
    }
    int j = paramBoolean ? paramInt : 0;
    int k = paramBoolean ? paramDocument.getLength() : paramInt;
    paramDocument.getText(j, k - j, fm.b());
    for (int m = paramBoolean ? fm.b().first() : fm.b().last(); m != 65535; m = paramBoolean ? fm.b().next() : fm.b().previous())
    {
      int n = fm.b().getIndex() - fm.b().getBeginIndex();
      int i1 = j + n;
      if (((m != 60) || (paramBoolean)) && ((m != 62) || (!paramBoolean)))
        continue;
      bl localbl3 = (bl)fm.b(paramDocument, i1 + 1);
      if (!kc.f(localbl3.c()))
        return i1;
    }
    return -1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gy
 * JD-Core Version:    0.6.0
 */