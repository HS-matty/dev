package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class wc extends vc
{
  public boolean a(gx paramgx)
  {
    int i = paramgx.getCaretPosition();
    Document localDocument = paramgx.getDocument();
    try
    {
      String str = localDocument.getText(i - 1, 2);
      char c = str.charAt(0);
      int j = str.charAt(1);
      int k = lb.b(c);
      if ((k == 45) || (j != k))
        return super.a(paramgx);
      int m = 0;
      switch (c)
      {
      case '(':
      case '[':
        bl localbl = lb.b(localDocument, i);
        int n = kc.g(localbl.c());
        if ((n != 132) && (n != 129))
          break;
        m = !lb.b(paramgx, i - 1, c) ? 1 : 0;
        break;
      case '"':
      case '\'':
      case '`':
        int i1 = fm.a(localDocument, i - 1, true);
        m = i == i1 ? 1 : 0;
      }
      if (m != 0)
      {
        localDocument.remove(i - 1, 2);
        return false;
      }
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    return super.a(paramgx);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.wc
 * JD-Core Version:    0.6.0
 */