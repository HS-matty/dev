package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.util.cl;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class uf
  implements sd
{
  private uf()
  {
  }

  public int a(Document paramDocument, int paramInt, char paramChar)
  {
    if ((paramChar != '{') && (paramChar != '(') && (paramChar != '['))
      return -1;
    try
    {
      bl localbl1 = yc.a(paramDocument, paramInt + 1);
      int i = kc.h(129);
      if (localbl1.c() != i)
        return -1;
      Segment localSegment = new Segment();
      paramDocument.getText(0, paramInt + 1, localSegment);
      int j = 0;
      for (char c = localSegment.last(); c != 65535; c = localSegment.previous())
      {
        int m = localSegment.getIndex() - localSegment.getBeginIndex();
        int n = j + m;
        bl localbl2 = null;
        int k;
        switch (c)
        {
        case '(':
          localbl2 = yc.a(paramDocument, n + 1);
          if ((localbl2.c() != i) || (c != paramChar))
            continue;
          k = fm.a(paramDocument, n, true);
          if (k > -1)
            continue;
          return 0;
        case '[':
          localbl2 = yc.a(paramDocument, n + 1);
          if ((localbl2.c() != i) || (c != paramChar))
            continue;
          k = fm.a(paramDocument, n, true);
          if (k > -1)
            continue;
          return 0;
        case '{':
        case '}':
          return 1;
        }
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    return 1;
  }

  uf(rd paramrd)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.uf
 * JD-Core Version:    0.6.0
 */