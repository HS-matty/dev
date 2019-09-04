package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.util.cl;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;

class p extends n
{
  final r d;

  private p(r paramr)
  {
  }

  public void a(gx paramgx, Document paramDocument, StringBuffer paramStringBuffer, int paramInt)
    throws BadLocationException
  {
    Element localElement1 = paramDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(localElement1.getElementIndex(paramInt));
    int i = localElement2.getEndOffset();
    int j = i - paramInt;
    String str1 = paramDocument.getText(paramInt, j);
    String str2 = str1.trim();
    char c = str2.length() == 0 ? '{' : str2.charAt(0);
    m localm = this.d.a(c);
    localm.a(paramgx, paramDocument, paramStringBuffer, paramInt);
  }

  public ef a(gx paramgx, char paramChar, StringBuffer paramStringBuffer)
  {
    ef localef = r.f;
    try
    {
      paramStringBuffer.append('\n');
      Document localDocument = paramgx.getDocument();
      int i = paramgx.getSelectionStart();
      a(paramgx, localDocument, paramStringBuffer, i);
      if (i > 0)
      {
        char c = localDocument.getText(i - 1, 1).charAt(0);
        localObject = (bl)r.a(localDocument, i);
        m localm = this.d.a((bl)localObject, localDocument, i, c);
        localef = localm.a(paramgx, i, paramStringBuffer);
        i = paramgx.getSelectionStart();
      }
      Element localElement = localDocument.getDefaultRootElement();
      Object localObject = localElement.getElement(localElement.getElementIndex(i));
      int j = ((Element)localObject).getStartOffset();
      int k = ((Element)localObject).getEndOffset();
      int m = k - i;
      String str = localDocument.getText(j, m);
      int i1 = str.length();
      for (int n = 0; (n < i1) && ((str.charAt(n) == ' ') || (str.charAt(n) == '\t')); n++);
      if (i < j + n)
      {
        if (paramgx.getSelectionStart() != paramgx.getSelectionEnd())
          j = Math.min(paramgx.getSelectionStart(), j);
        paramgx.select(j, Math.max(j + n, paramgx.getSelectionEnd() + 1));
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    return (ef)localef;
  }

  p(r paramr, l paraml)
  {
    this(paramr);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.p
 * JD-Core Version:    0.6.0
 */