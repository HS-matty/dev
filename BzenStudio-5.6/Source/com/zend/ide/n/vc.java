package com.zend.ide.n;

import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;

public class vc
  implements md
{
  public boolean a(gx paramgx)
  {
    int i = 1;
    Document localDocument = paramgx.getDocument();
    Caret localCaret = paramgx.getCaret();
    int j = localCaret.getDot();
    int k = localCaret.getMark();
    try
    {
      if (j != k)
      {
        localDocument.remove(Math.min(j, k), Math.abs(j - k));
        i = 0;
      }
      else if (j > 0)
      {
        int m = 1;
        if (j > 1)
        {
          String str = localDocument.getText(j - 2, 2);
          int n = str.charAt(0);
          int i1 = str.charAt(1);
          if ((n >= 55296) && (n <= 56319) && (i1 >= 56320) && (i1 <= 57343))
            m = 2;
        }
        localDocument.remove(j - m, m);
        i = 0;
      }
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    return i;
  }

  public boolean b(gx paramgx)
  {
    int i = 1;
    try
    {
      Document localDocument = paramgx.getDocument();
      Caret localCaret = paramgx.getCaret();
      int j = localCaret.getDot();
      int k = localCaret.getMark();
      if (j != k)
      {
        localDocument.remove(Math.min(j, k), Math.abs(j - k));
        i = 0;
      }
      else if (j < localDocument.getLength())
      {
        int m = 1;
        if (j < localDocument.getLength() - 1)
        {
          String str = localDocument.getText(j, 2);
          int n = str.charAt(0);
          int i1 = str.charAt(1);
          if ((n >= 55296) && (n <= 56319) && (i1 >= 56320) && (i1 <= 57343))
            m = 2;
        }
        localDocument.remove(j, m);
        i = 0;
      }
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    return i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.vc
 * JD-Core Version:    0.6.0
 */