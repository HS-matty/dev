package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class hh
  implements fn
{
  public int a(char paramChar, Document paramDocument, int paramInt, boolean paramBoolean)
    throws BadLocationException
  {
    if ((paramChar != '"') && (paramChar != '\'') && (paramChar != '`'))
      return -1;
    if (a((bl)fm.b(paramDocument, paramInt)))
      return -1;
    bl localbl1 = (bl)fm.b(paramDocument, paramBoolean ? paramInt + 1 : paramInt - 1);
    if (!a(localbl1))
      return -1;
    paramInt += (paramBoolean ? 1 : -1);
    int i = paramBoolean ? paramInt : 0;
    int j = paramBoolean ? paramDocument.getLength() : paramInt;
    paramDocument.getText(i, j - i, fm.b());
    for (char c = paramBoolean ? fm.b().first() : fm.b().last(); c != 65535; c = paramBoolean ? fm.b().next() : fm.b().previous())
    {
      if (c != paramChar)
        continue;
      int k = fm.b().getIndex() - fm.b().getBeginIndex();
      int m = i + k;
      bl localbl2 = (bl)fm.b(paramDocument, m + (paramBoolean ? 0 : 1));
      if (!a(localbl2))
        continue;
      if (a((bl)fm.b(paramDocument, m + (paramBoolean ? 1 : 0))))
        continue;
      boolean bool1 = kc.f(localbl1.c());
      boolean bool2 = kc.f(localbl2.c());
      if ((bool1) && (bool2))
        return m;
      boolean bool3 = kc.b(localbl1.c());
      boolean bool4 = kc.b(localbl2.c());
      if ((bool3) && (bool4))
        return m;
      if ((!bool1) && (!bool3) && (!bool2) && (!bool4))
        return m;
    }
    return -1;
  }

  private static boolean a(bl parambl)
  {
    int i = kc.g(parambl.c());
    return (i == 135) || (i == 142) || (i == 138) || (i == 127) || (i == 131) || (i == 116) || (i == 123);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hh
 * JD-Core Version:    0.6.0
 */