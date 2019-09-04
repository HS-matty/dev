package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.util.cl;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.Segment;

class y extends s
{
  private Segment f = new Segment();
  final k g;

  private y(k paramk)
  {
    super(paramk, null);
  }

  public ef a(gx paramgx, char paramChar, StringBuffer paramStringBuffer)
  {
    if (!k.a(this.g))
      return super.a(paramgx, paramChar, paramStringBuffer);
    int i = paramgx.getSelectionEnd();
    if (i != paramgx.getSelectionStart())
      return super.a(paramgx, paramChar, paramStringBuffer);
    Document localDocument = paramgx.getDocument();
    try
    {
      int j = ((bl)r.a(localDocument, i)).c();
      localDocument.getText(0, i, this.f);
      int k = 0;
      int m = 0;
      int n = -1;
      int i1 = -1;
      int i2 = 0;
      for (int i3 = i - 1; i3 >= 0; i3--)
      {
        if (this.f.array[i3] == '}')
        {
          if (j == ((bl)r.a(localDocument, i3)).c())
            k++;
          if (n != -1)
            continue;
          m = 1;
          break;
        }
        if (this.f.array[i3] == '{')
        {
          if (j != ((bl)r.a(localDocument, i3)).c())
            continue;
          if (n == -1)
          {
            n = i3;
            i1 = fm.a(localDocument, i3, true);
            if (i1 <= -1)
            {
              m = 1;
              break;
            }
            Segment localSegment = new Segment();
            localDocument.getText(i, i1 - i, localSegment);
            int i5 = localSegment.first();
            int i7 = 0;
            while (i5 != 65535)
            {
              if (!Character.isWhitespace(i5))
                return super.a(paramgx, paramChar, paramStringBuffer);
              if (i5 == 10)
                i7++;
              if (i7 > 1)
                return super.a(paramgx, paramChar, paramStringBuffer);
              int i6 = localSegment.next();
            }
          }
          k--;
          if (k >= 0)
            continue;
          i4 = fm.a(localDocument, i3, true);
          if (i4 <= -1)
          {
            m = 1;
            break;
          }
          k++;
        }
        else
        {
          if (n != -1)
            continue;
          if (!Character.isWhitespace(this.f.array[i3]))
          {
            m = 1;
            break;
          }
          if (this.f.array[i3] != '\n')
            continue;
          i2++;
          if (i2 <= 1)
            continue;
          m = 1;
          break;
        }
      }
      if ((m != 0) || (n == -1))
        return super.a(paramgx, paramChar, paramStringBuffer);
      Caret localCaret = paramgx.getCaret();
      int i4 = localCaret.getDot();
      Point localPoint = paramgx.f().modelToView(i4).getLocation();
      localPoint.x = 2147483647;
      return new ef(i1 + 1, localPoint);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    return super.a(paramgx, paramChar, paramStringBuffer);
  }

  public void a(gx paramgx, Document paramDocument, StringBuffer paramStringBuffer, int paramInt)
    throws BadLocationException
  {
    Object localObject = r.a(paramDocument, paramInt);
    Element localElement = a(paramDocument, paramInt, (bl)localObject);
    if (localElement != null)
    {
      String str = a(paramgx, localElement);
      paramStringBuffer.append(str);
    }
  }

  private Element a(Document paramDocument, int paramInt, bl parambl)
    throws BadLocationException
  {
    Element localElement = paramDocument.getDefaultRootElement();
    paramDocument.getText(0, paramInt, this.f);
    for (int i = this.f.last(); i != 65535; i = this.f.previous())
    {
      if (i != 123)
        continue;
      int j = this.f.getIndex() - this.f.getBeginIndex();
      int k = j;
      if (r.a(paramDocument, this.f.getIndex() + 1).equals(parambl))
        return localElement.getElement(localElement.getElementIndex(k));
    }
    return null;
  }

  y(k paramk, mc parammc)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.y
 * JD-Core Version:    0.6.0
 */