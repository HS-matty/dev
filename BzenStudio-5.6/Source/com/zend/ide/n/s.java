package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.util.cl;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Segment;

class s extends q
{
  private Segment c = new Segment();
  final k e;

  private s(k paramk)
  {
    super(paramk, null);
  }

  public ef a(gx paramgx, char paramChar, StringBuffer paramStringBuffer)
  {
    Document localDocument = paramgx.getDocument();
    int i = paramgx.getSelectionStart();
    int j = paramgx.getSelectionEnd();
    Element localElement1 = localDocument.getDefaultRootElement();
    int k = localElement1.getElementIndex(i);
    int m = localElement1.getElementIndex(j);
    Element localElement2 = localElement1.getElement(k);
    Element localElement3 = localElement1.getElement(m);
    paramStringBuffer.setLength(0);
    try
    {
      if (r.a(localDocument, localElement2.getStartOffset(), localElement3.getEndOffset(), i))
      {
        a(paramgx, localDocument, paramStringBuffer, j);
        if (paramgx.getSelectedText() == null)
          paramgx.select(localElement2.getStartOffset(), j);
        else
          paramgx.select(localElement2.getStartOffset(), paramgx.getSelectionEnd());
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    paramStringBuffer.append(paramChar);
    return r.f;
  }

  public ef a(gx paramgx, int paramInt, StringBuffer paramStringBuffer)
  {
    try
    {
      if (!k.a(this.e))
        return r.f;
      Document localDocument = paramgx.getDocument();
      int i = ((bl)r.a(localDocument, paramInt)).c();
      int j = paramInt + paramStringBuffer.length();
      j += b(paramgx, paramStringBuffer);
      char c1 = localDocument.getText(paramgx.getSelectionEnd(), 1).charAt(0);
      if (!Character.isWhitespace(c1))
      {
        this.e.a(paramgx, paramStringBuffer.toString(), r.f);
        paramStringBuffer.setLength(0);
        Element localElement1 = localDocument.getDefaultRootElement();
        Element localElement2 = localElement1.getElement(localElement1.getElementIndex(paramgx.getSelectionEnd()));
        paramgx.setCaretPosition(localElement2.getEndOffset() - 1);
      }
      localDocument.getText(0, paramInt, this.c);
      int k = 0;
      int m = 0;
      for (int n = paramInt - 1; n >= 0; n--)
        if (this.c.array[n] == '}')
        {
          if (i != ((bl)r.a(localDocument, n)).c())
            continue;
          k++;
        }
        else
        {
          if (this.c.array[n] != '{')
            continue;
          int i1 = ((bl)r.a(localDocument, n)).c();
          if ((i != i1) && ((i != kc.h(132)) || (a(i1)) || (i != ((bl)r.a(localDocument, n + 2)).c())))
            continue;
          k--;
          if (k >= 0)
            continue;
          int i2 = fm.a(localDocument, n, true);
          if (i2 <= -1)
          {
            m = 1;
            break;
          }
          k++;
        }
      if (m != 0)
        a(paramgx, paramStringBuffer);
      return new ef(j, null);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    return r.f;
  }

  private void a(gx paramgx, StringBuffer paramStringBuffer)
    throws BadLocationException
  {
    Document localDocument = paramgx.getDocument();
    Element localElement1 = localDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(localElement1.getElementIndex(paramgx.getSelectionEnd()));
    int i = localElement2.getEndOffset();
    paramStringBuffer.append('\n');
    ((y)k.b(this.e)).a(paramgx, localDocument, paramStringBuffer, i);
    paramStringBuffer.append('}');
  }

  private int b(gx paramgx, StringBuffer paramStringBuffer)
    throws BadLocationException
  {
    Document localDocument = paramgx.getDocument();
    Element localElement1 = localDocument.getDefaultRootElement();
    int i = paramgx.getSelectionEnd();
    Element localElement2 = localElement1.getElement(localElement1.getElementIndex(i));
    int j = localElement2.getEndOffset();
    int k = 0;
    String str1 = localDocument.getText(i, j - i);
    int n;
    for (int m = 0; m < str1.length(); m++)
    {
      n = str1.charAt(m);
      if ((n != 10) && (Character.isWhitespace(n)))
        continue;
      if (m <= 0)
        break;
      paramgx.setSelectionEnd(i + m);
      break;
    }
    String str2 = str1.trim();
    if ((str2.length() > 0) && (str2.charAt(0) == '}'))
    {
      if (k.b(this.e))
        if (!r.b())
        {
          paramStringBuffer.append('\t');
          k++;
        }
        else
        {
          for (n = 0; n < r.b(paramgx); n++)
          {
            paramStringBuffer.append(' ');
            k++;
          }
        }
      paramStringBuffer.append('\n');
      String str3 = a(paramgx, localElement2);
      paramStringBuffer.append(str3);
    }
    return k;
  }

  private boolean a(int paramInt)
  {
    paramInt = kc.g(paramInt);
    return (paramInt == 133) || (paramInt == 134) || (paramInt == 139);
  }

  s(k paramk, mc parammc)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.s
 * JD-Core Version:    0.6.0
 */