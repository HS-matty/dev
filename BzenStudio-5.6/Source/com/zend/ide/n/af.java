package com.zend.ide.n;

import com.zend.ide.s.bb;
import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Segment;

class af extends s
{
  private Segment f = new Segment();
  final k g;

  private af(k paramk)
  {
    super(paramk, null);
  }

  public ef a(gx paramgx, char paramChar, StringBuffer paramStringBuffer)
  {
    Document localDocument = paramgx.getDocument();
    int i = paramgx.getSelectionStart();
    if ((i < 7) || (!k.b(this.g)))
    {
      paramStringBuffer.append(paramChar);
      return r.f;
    }
    try
    {
      int j = paramgx.getSelectionStart();
      String str1 = "";
      bl localbl = (bl)r.a(paramgx.getDocument(), i);
      if (localbl.c() != kc.h(132))
      {
        paramStringBuffer.append(paramChar);
        return r.f;
      }
      String str2;
      if (paramChar == 'e')
      {
        str2 = localDocument.getText(i - 4, 4);
        if ((!Character.isWhitespace(str2.charAt(0))) || (!str2.trim().equals("cas")))
        {
          paramStringBuffer.append(paramChar);
          return r.f;
        }
        j -= 3;
        str1 = "case";
      }
      else if (paramChar == 't')
      {
        str2 = localDocument.getText(i - 7, 7);
        if ((!Character.isWhitespace(str2.charAt(0))) || (!str2.trim().equals("defaul")))
        {
          paramStringBuffer.append(paramChar);
          return r.f;
        }
        j -= 6;
        str1 = "default";
      }
      int k = paramgx.getSelectionEnd();
      Element localElement1 = localDocument.getDefaultRootElement();
      int m = localElement1.getElementIndex(j);
      Element localElement2 = localElement1.getElement(m);
      if (r.a(localDocument, localElement2.getStartOffset(), j, j))
      {
        a(paramgx, localDocument, paramStringBuffer, k, false);
        if (paramgx.getSelectedText() == null)
          paramgx.select(localElement2.getStartOffset(), k);
        else
          paramgx.select(localElement2.getStartOffset(), paramgx.getSelectionEnd());
        paramStringBuffer.append(str1);
      }
      else
      {
        paramStringBuffer.append(paramChar);
      }
      return r.f;
    }
    catch (BadLocationException localBadLocationException)
    {
      paramStringBuffer.append(paramChar);
    }
    return r.f;
  }

  public void a(gx paramgx, Document paramDocument, StringBuffer paramStringBuffer, int paramInt)
    throws BadLocationException
  {
    a(paramgx, paramDocument, paramStringBuffer, paramInt, true);
  }

  private void a(gx paramgx, Document paramDocument, StringBuffer paramStringBuffer, int paramInt, boolean paramBoolean)
    throws BadLocationException
  {
    if ((paramBoolean) && (!a(paramDocument, paramInt)))
    {
      this.g.a().a(paramgx, paramDocument, paramStringBuffer, paramInt);
      return;
    }
    bl localbl = (bl)r.a(paramDocument, paramInt);
    Element localElement1 = null;
    int i = 0;
    Element localElement2 = paramDocument.getDefaultRootElement();
    paramDocument.getText(0, paramInt, this.f);
    int k;
    for (int j = this.f.last(); j != 65535; j = this.f.previous())
    {
      boolean bool = false;
      if (j == 123)
      {
        bool = true;
        i = 1;
      }
      else
      {
        k = this.f.getIndex() - this.f.getBeginIndex();
        bool = a(paramDocument, k);
      }
      if (bool)
      {
        k = this.f.getIndex() - this.f.getBeginIndex();
        int m = k;
        if (r.a(paramDocument, this.f.getIndex() + 1).equals(localbl))
        {
          localElement1 = localElement2.getElement(localElement2.getElementIndex(m));
          break;
        }
      }
      i = 0;
    }
    if (localElement1 != null)
    {
      String str = a(paramgx, localElement1);
      paramStringBuffer.append(str);
      if (i != 0)
        if (!r.b())
          paramStringBuffer.append('\t');
        else
          for (k = 0; k < r.b(paramgx); k++)
            paramStringBuffer.append(' ');
    }
  }

  private boolean a(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    Element localElement1 = paramDocument.getDefaultRootElement();
    int i = localElement1.getElementIndex(paramInt);
    Element localElement2 = localElement1.getElement(i);
    String str = paramDocument.getText(localElement2.getStartOffset(), localElement2.getEndOffset() - localElement2.getStartOffset());
    int j = k.c(str);
    if (paramDocument.getLength() < localElement2.getStartOffset() + j + 4)
      return false;
    int k = c(paramDocument, localElement2.getStartOffset() + j + 4);
    int m = -1;
    if (localElement2.getStartOffset() + j + 5 < paramDocument.getLength())
      m = c(paramDocument, localElement2.getStartOffset() + j + 5);
    else
      m = bb.v;
    if ((k == bb.v) && ((m == -1) || (m == bb.v) || (m == bb.bd)))
      return true;
    if (paramDocument.getLength() < localElement2.getStartOffset() + j + 7)
      return false;
    k = c(paramDocument, localElement2.getStartOffset() + j + 7);
    if (localElement2.getStartOffset() + j + 5 < paramDocument.getLength())
      m = c(paramDocument, localElement2.getStartOffset() + j + 8);
    else
      m = bb.w;
    return (k == bb.w) && ((m == -1) || (m == bb.w) || (m == bb.bd));
  }

  af(k paramk, mc parammc)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.af
 * JD-Core Version:    0.6.0
 */