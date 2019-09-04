package com.zend.ide.n;

import com.zend.ide.s.bb;
import com.zend.ide.s.bk;
import com.zend.ide.s.bl;
import com.zend.ide.util.cl;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Segment;

public class n
  implements m
{
  private Segment a = new Segment();
  private StringBuffer b = new StringBuffer(50);

  public ef a(gx paramgx, char paramChar, StringBuffer paramStringBuffer)
  {
    paramStringBuffer.append(paramChar);
    return r.f;
  }

  public void a(gx paramgx, Document paramDocument, StringBuffer paramStringBuffer, int paramInt)
    throws BadLocationException
  {
    Element localElement = a(paramDocument, paramInt);
    if (localElement != null)
    {
      String str = a(paramgx, localElement);
      paramStringBuffer.append(str);
      if (b(paramDocument, Math.min(paramInt, localElement.getEndOffset() - 1)))
        if (!r.b())
          paramStringBuffer.append('\t');
        else
          for (int i = 0; i < r.b(paramgx); i++)
            paramStringBuffer.append(' ');
    }
  }

  private Element a(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    Element localElement1 = paramDocument.getDefaultRootElement();
    int i = localElement1.getElementIndex(paramInt);
    for (int j = i; j >= 0; j--)
    {
      Element localElement2 = localElement1.getElement(j);
      if (a(paramDocument, Math.min(paramInt, localElement2.getEndOffset() - 1), paramInt))
        return localElement1.getElement(j);
    }
    return null;
  }

  boolean b(Document paramDocument, int paramInt)
  {
    return false;
  }

  boolean b(int paramInt1, int paramInt2)
  {
    return false;
  }

  boolean a(int paramInt1, int paramInt2)
  {
    return true;
  }

  String a(gx paramgx, Element paramElement)
    throws BadLocationException
  {
    this.b.setLength(0);
    int i = paramElement.getStartOffset();
    int j = paramElement.getEndOffset();
    paramgx.getDocument().getText(i, j - i, this.a);
    for (char c = this.a.first(); Character.isWhitespace(c); c = this.a.next())
      this.b.append(c);
    return this.b.toString();
  }

  protected int c(Document paramDocument, int paramInt)
  {
    Element localElement = d(paramDocument, paramInt);
    int i = localElement.getStartOffset();
    int j = paramInt - i;
    try
    {
      Object localObject = r.a(paramDocument, i);
      Segment localSegment = new Segment();
      paramDocument.getText(i, j, localSegment);
      int k = localSegment.last();
      for (int m = 0; (k != 65535) && (k <= 32); m++)
      {
        k = localSegment.previous();
        localSegment.count -= 1;
      }
      r.b(paramDocument);
      r.a().a(localSegment);
      r.a().a(localObject);
      int n = r.a().d();
      if (((n == bb.be) || (k == 47) || (n == bb.cS)) && (i <= paramInt - (m + 1)))
        return c(paramDocument, paramInt - (m + 1));
      return n;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    throw new RuntimeException(localException.getMessage());
  }

  private Element d(Document paramDocument, int paramInt)
  {
    Element localElement = paramDocument.getDefaultRootElement();
    int i = localElement.getElementIndex(paramInt);
    return localElement.getElement(i);
  }

  private boolean a(Document paramDocument, int paramInt1, int paramInt2)
    throws BadLocationException
  {
    Element localElement1 = paramDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(localElement1.getElementIndex(paramInt1));
    int i = localElement2.getStartOffset();
    if (r.a(paramDocument, i, paramInt1, paramInt2))
      return false;
    Object localObject1 = r.a(paramDocument, i);
    int j = ((bl)localObject1).c();
    Object localObject2 = r.a(paramDocument, paramInt1);
    int k = ((bl)localObject2).c();
    Object localObject3 = r.a(paramDocument, paramInt2);
    int m = ((bl)localObject3).c();
    if (b(j, m))
      return false;
    return (a(j, k)) || (m == j);
  }

  public ef a(gx paramgx, int paramInt, StringBuffer paramStringBuffer)
  {
    return r.f;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.n
 * JD-Core Version:    0.6.0
 */