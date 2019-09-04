package com.zend.ide.n;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class db
  implements md
{
  md a = new vc();

  public boolean a(gx paramgx)
  {
    md localmd = null;
    int i = paramgx.getCaretPosition();
    if (i > 0)
      paramgx.a(i - 1);
    if ((paramgx.getSelectedText() == null) && (i > 0))
      try
      {
        char c = paramgx.getText(i - 1, 1).charAt(0);
        localmd = a(c);
      }
      catch (BadLocationException localBadLocationException)
      {
      }
    if (localmd == null)
      localmd = a();
    return localmd.a(paramgx);
  }

  public boolean b(gx paramgx)
  {
    md localmd = null;
    int i = paramgx.getCaretPosition();
    paramgx.a(i + 1);
    Document localDocument = paramgx.getDocument();
    if ((paramgx.getSelectedText() == null) && (i + 1 < localDocument.getLength()))
      try
      {
        char c = localDocument.getText(i + 1, 1).charAt(0);
        localmd = a(c);
      }
      catch (BadLocationException localBadLocationException)
      {
      }
    if (localmd == null)
      localmd = a();
    return localmd.b(paramgx);
  }

  protected md a(char paramChar)
  {
    return a();
  }

  private md a()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.db
 * JD-Core Version:    0.6.0
 */