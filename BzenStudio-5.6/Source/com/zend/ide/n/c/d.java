package com.zend.ide.n.c;

import com.zend.ide.n.bw;
import com.zend.ide.n.ho;
import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.util.cl;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.Segment;

public class d
  implements a
{
  public void a(bw parambw, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Document localDocument = parambw.getDocument();
    JTextComponent localJTextComponent = parambw.e();
    int i = localJTextComponent.getSelectionStart();
    int j = localJTextComponent.getSelectionEnd();
    String str = localJTextComponent.getSelectedText();
    int k = j > i ? 1 : 0;
    int m = (str != null) && (str.startsWith("<!--")) && (str.endsWith("-->")) ? 1 : 0;
    try
    {
      if ((a(localDocument, paramInt1, paramInt2, false)) || (m != 0))
      {
        if (m != 0)
        {
          localDocument.remove(i, "<!--".length());
          localDocument.remove(j - "<!--".length() - "-->".length(), "-->".length());
        }
        else
        {
          int n = a(parambw.e(), paramInt1);
          int i2 = b(parambw.e(), paramInt2);
          if ((n != -1) && (i2 != -1))
          {
            localDocument.remove(n, "<!--".length());
            localDocument.remove(i2 - "<!--".length() - "-->".length(), "-->".length());
          }
        }
      }
      else
      {
        if ((paramInt3 == kc.h(118)) || (paramInt4 == kc.h(118)))
          return;
        if (k == 0)
        {
          Element localElement = localDocument.getDefaultRootElement();
          i = localElement.getElement(localElement.getElementIndex(i)).getStartOffset();
          j = localElement.getElement(localElement.getElementIndex(j)).getEndOffset();
          j = j-- == localDocument.getLength() ? j-- : j;
        }
        int i1 = (k == 0) && (j == parambw.getCaretPosition()) ? 1 : 0;
        localDocument.insertString(i, "<!--", null);
        localDocument.insertString(j + "<!--".length(), "-->", null);
        if (i1 != 0)
          parambw.setCaretPosition(j + "<!--".length());
      }
      if (k != 0)
        localJTextComponent.setSelectionStart(i);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public void b(bw parambw, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(parambw, paramInt1, paramInt2, paramInt1, paramInt4);
  }

  public boolean a(int paramInt1, int paramInt2)
  {
    return (kc.a(paramInt1)) && (kc.a(paramInt2));
  }

  private static int a(JTextComponent paramJTextComponent, int paramInt)
    throws BadLocationException
  {
    Document localDocument = paramJTextComponent.getDocument();
    int i = -1;
    if (!a(localDocument, paramInt, paramInt, false))
      return i;
    Segment localSegment = new Segment();
    localDocument.getText(0, paramInt, localSegment);
    int j = localSegment.last();
    i = -1;
    while (j != 65535)
    {
      if ((j == 60) && (!a(localDocument, localSegment.getIndex(), localSegment.getIndex(), true)))
      {
        i = localSegment.getIndex();
        break;
      }
      j = localSegment.previous();
    }
    Element localElement = localDocument.getDefaultRootElement();
    if ((i == -1) && (localElement.getElement(localElement.getElementIndex(paramInt)).getStartOffset() == paramInt) && (a(localDocument, paramInt + 4) == kc.h(118)))
      return paramInt;
    return i;
  }

  private static int b(JTextComponent paramJTextComponent, int paramInt)
    throws BadLocationException
  {
    Document localDocument = paramJTextComponent.getDocument();
    int i = -1;
    if (!a(localDocument, paramInt, paramInt, false))
      return i;
    Segment localSegment = new Segment();
    localDocument.getText(paramInt, localDocument.getLength() - paramInt, localSegment);
    for (int j = localSegment.first(); j != 65535; j = localSegment.next())
    {
      int k = localSegment.getIndex() - localSegment.getBeginIndex() + paramInt;
      if ((j != 62) || (a(localDocument, k + 1, k + 1, true)))
        continue;
      i = k + 1;
      break;
    }
    return i;
  }

  private static boolean a(Document paramDocument, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      int i = kc.g(a(paramDocument, paramInt1));
      int j = kc.g(a(paramDocument, paramInt2));
      if (!a(paramDocument, paramInt1, paramInt2))
        return false;
      if (paramBoolean)
        return (i == 118) && (j == 118);
      if ((i == 118) && (j == 118))
        return true;
      if (paramInt1 == paramInt2)
        return a(paramDocument, paramInt1);
      boolean bool = true;
      if (i != 118)
        bool = a(paramDocument, paramInt1);
      return bool;
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    return false;
  }

  private static boolean a(Document paramDocument, int paramInt1, int paramInt2)
  {
    try
    {
      int i = kc.h(118);
      if (paramInt1 == paramInt2)
        return a(paramDocument, paramInt1) == i;
      while (paramInt1 < paramInt2)
      {
        if (a(paramDocument, paramInt1) != i)
          return false;
        paramInt1++;
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      return false;
    }
    return true;
  }

  private static boolean a(Document paramDocument, int paramInt)
  {
    int i = kc.h(118);
    try
    {
      Element localElement = paramDocument.getDefaultRootElement();
      if ((localElement.getElement(localElement.getElementIndex(paramInt)).getStartOffset() == paramInt) && (a(paramDocument, paramInt + 4) == i))
        return true;
      int j = a(paramDocument, paramInt);
      for (int k = 0; (k < 3) && (j != i); k++)
      {
        paramInt++;
        j = a(paramDocument, paramInt);
      }
      return j == i;
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    return false;
  }

  private static int a(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    return ((bl)((ho)paramDocument).b(paramInt)).c();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.c.d
 * JD-Core Version:    0.6.0
 */