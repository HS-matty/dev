package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.util.cl;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class xf
  implements sd
{
  private xf()
  {
  }

  public int a(Document paramDocument, int paramInt, char paramChar)
  {
    if ((paramChar != '"') && (paramChar != '\'') && (paramChar != '`'))
      return -1;
    try
    {
      int i = kc.h(132);
      bl localbl1 = yc.a(paramDocument, paramInt + 1);
      if ((localbl1.c() != i) && (yc.b(paramDocument, localbl1, paramInt)))
        localbl1 = yc.a(paramDocument, paramInt + 2);
      if (localbl1.c() != i)
        return -1;
      Segment localSegment = new Segment();
      paramDocument.getText(paramInt, paramDocument.getLength() - paramInt, localSegment);
      int j = paramInt;
      char c = localSegment.first();
      while (c != 65535)
      {
        int m = localSegment.getIndex() - localSegment.getBeginIndex();
        int n = j + m;
        bl localbl2 = null;
        if (c != paramChar)
        {
          c = localSegment.next();
          continue;
        }
        localbl2 = yc.a(paramDocument, n);
        if (localbl2.c() != i)
        {
          c = localSegment.next();
          continue;
        }
        int k = fm.a(paramDocument, n, true);
        if (k <= -1)
          return 1;
        for (int i1 = n; i1 < k; i1++)
          c = localSegment.next();
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    return 0;
  }

  xf(rd paramrd)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.xf
 * JD-Core Version:    0.6.0
 */