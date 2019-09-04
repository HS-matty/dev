package com.zend.ide.n;

import com.zend.ide.s.bb;
import com.zend.ide.s.kc;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;

class q extends n
{
  final k d;

  private q(k paramk)
  {
  }

  boolean b(Document paramDocument, int paramInt)
  {
    if ((!k.b(this.d)) && (!k.c(this.d)))
      return false;
    int i = c(paramDocument, paramInt);
    if ((i == bb.bm) || (i == bb.cX))
      return true;
    try
    {
      if ((i == bb.bd) && (paramDocument.getText(paramInt - 1, 1).charAt(0) == ':'))
      {
        Element localElement1 = paramDocument.getDefaultRootElement();
        int j = localElement1.getElementIndex(paramInt);
        Element localElement2 = localElement1.getElement(j);
        String str = paramDocument.getText(localElement2.getStartOffset(), localElement2.getEndOffset() - localElement2.getStartOffset());
        int k = k.c(str);
        int m = localElement2.getStartOffset() + k + 4;
        if (m >= paramDocument.getLength())
          return false;
        i = c(paramDocument, m);
        int n = c(paramDocument, localElement2.getStartOffset() + k + 5);
        if ((i == bb.v) && ((n == -1) || (n == bb.v) || (n == bb.bd)))
          return true;
        m = localElement2.getStartOffset() + k + 7;
        if (m >= paramDocument.getLength())
          return false;
        i = c(paramDocument, m);
        n = c(paramDocument, localElement2.getStartOffset() + k + 8);
        if ((i == bb.w) && ((n == -1) || (n == bb.w) || (n == bb.bd)))
          return true;
      }
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    return false;
  }

  boolean b(int paramInt1, int paramInt2)
  {
    paramInt1 = kc.g(paramInt1);
    paramInt2 = kc.g(paramInt2);
    return (paramInt1 != paramInt2) && ((paramInt1 == 142) || (paramInt1 == 135) || (paramInt1 == 138) || (paramInt1 == 134) || (paramInt1 == 137) || (paramInt1 == 143) || (paramInt1 == 136) || (paramInt1 == 139) || (paramInt1 == 133) || (paramInt1 == 131) || (paramInt1 == 127) || (paramInt1 == 130) || (paramInt1 == 126) || (paramInt1 == 115) || (paramInt1 == 118) || (paramInt1 == 122) || (paramInt1 == 101));
  }

  boolean a(int paramInt1, int paramInt2)
  {
    paramInt1 = kc.g(paramInt1);
    paramInt2 = kc.g(paramInt2);
    return (paramInt1 == 132) || (paramInt2 == 132) || (paramInt1 == 129) || (paramInt2 == 129);
  }

  q(k paramk, mc parammc)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.q
 * JD-Core Version:    0.6.0
 */