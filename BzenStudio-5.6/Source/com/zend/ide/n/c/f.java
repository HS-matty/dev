package com.zend.ide.n.c;

import com.zend.ide.n.bw;
import com.zend.ide.n.ho;
import com.zend.ide.s.bl;
import com.zend.ide.util.cl;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;

public abstract class f
  implements a
{
  public void a(bw parambw, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    JTextComponent localJTextComponent = parambw.e();
    Document localDocument = localJTextComponent.getDocument();
    Element localElement = localDocument.getDefaultRootElement();
    String str1 = localElement.getElementIndex(paramInt1);
    String str2 = localElement.getElementIndex(paramInt2);
    try
    {
      String str3;
      if (a(localJTextComponent, paramInt1))
        for (int k = str1; k <= str2; k++)
        {
          paramInt1 = localElement.getElement(k).getStartOffset();
          paramInt2 = localElement.getElement(k).getEndOffset();
          int j = paramInt2 - paramInt1;
          try
          {
            str3 = localDocument.getText(paramInt1, j);
          }
          catch (Exception localException2)
          {
            cl.a(localException2);
            return;
          }
          if (!str3.trim().startsWith("//"))
            continue;
          int i = localElement.getElement(k).getStartOffset() + a(str3);
          localDocument.remove(i, 2);
        }
      else
        for (str3 = str1; str3 <= str2; str3++)
        {
          paramInt1 = localElement.getElement(str3).getStartOffset();
          if (str3 == str2)
          {
            paramInt2 = localElement.getElement(str3).getEndOffset();
            if ((paramInt1 == localJTextComponent.getCaretPosition()) && (str1 != str2))
              continue;
          }
          localDocument.insertString(paramInt1, "//", null);
        }
    }
    catch (Exception localException1)
    {
      cl.a(localException1);
    }
  }

  public void b(bw parambw, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    JTextComponent localJTextComponent = parambw.e();
    Document localDocument = localJTextComponent.getDocument();
    Object localObject;
    if (paramInt1 == paramInt2)
    {
      if (a(paramInt3))
      {
        paramInt1 = b(localJTextComponent, paramInt1);
        paramInt2 = c(localJTextComponent, paramInt2);
      }
      else
      {
        localObject = localDocument.getDefaultRootElement();
        paramInt1 = ((Element)localObject).getElement(((Element)localObject).getElementIndex(paramInt1)).getStartOffset();
        paramInt2 = ((Element)localObject).getElement(((Element)localObject).getElementIndex(paramInt2)).getEndOffset();
        paramInt2 = paramInt2-- == localDocument.getLength() ? paramInt2-- : paramInt2;
        try
        {
          paramInt3 = ((bl)((ho)parambw.getDocument()).b(paramInt1)).c();
          paramInt4 = ((bl)((ho)parambw.getDocument()).b(paramInt2)).c();
          if ((a(paramInt3)) || (a(paramInt4)))
            paramInt1 = b(localJTextComponent, paramInt1);
          if ((a(paramInt4)) || (a(paramInt3)))
            paramInt2 = c(localJTextComponent, paramInt2);
        }
        catch (BadLocationException localBadLocationException)
        {
          cl.a(localBadLocationException);
        }
      }
    }
    else if ((paramInt1 == -1) || (paramInt2 == -1))
      return;
    try
    {
      localObject = localJTextComponent.getText(paramInt1, paramInt2 - paramInt1);
      if (d(((String)localObject).trim()))
      {
        int i = "/*".length();
        int j = "*/".length();
        if (!((String)localObject).equals(((String)localObject).trim()))
        {
          i += b((String)localObject);
          j += c((String)localObject);
        }
        localDocument.remove(paramInt1, i);
        localDocument.remove(paramInt2 - i - j, j);
      }
      else
      {
        localDocument.insertString(paramInt1, "/*", null);
        localDocument.insertString(paramInt2 + "/*".length(), "*/", null);
        localJTextComponent.setSelectionStart(paramInt1);
        localJTextComponent.setSelectionEnd(paramInt2 + 4);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private int b(String paramString)
  {
    int i = paramString.length();
    int j = 0;
    char[] arrayOfChar = paramString.toCharArray();
    while ((j < i) && (arrayOfChar[j] <= ' '))
      j++;
    return j;
  }

  private int c(String paramString)
  {
    int i = paramString.length();
    int j = 0;
    char[] arrayOfChar = paramString.toCharArray();
    while ((0 < i) && (arrayOfChar[(i - 1)] <= ' '))
    {
      i--;
      j++;
    }
    return j;
  }

  protected abstract boolean a(int paramInt);

  private static boolean a(JTextComponent paramJTextComponent, int paramInt)
  {
    Document localDocument = paramJTextComponent.getDocument();
    Element localElement = localDocument.getDefaultRootElement();
    int i = localElement.getElementIndex(paramInt);
    paramInt = localElement.getElement(i).getStartOffset();
    int j = localElement.getElement(i).getEndOffset();
    try
    {
      String str = paramJTextComponent.getText(paramInt, j - paramInt - 1).trim();
      return str.startsWith("//");
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  private static boolean d(String paramString)
  {
    try
    {
      return (paramString.startsWith("/*")) && (paramString.endsWith("*/"));
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  private static int a(String paramString)
  {
    for (int i = 0; (i < paramString.length()) && (Character.isWhitespace(paramString.charAt(i))); i++);
    return i;
  }

  private static int b(JTextComponent paramJTextComponent, int paramInt)
  {
    Document localDocument = paramJTextComponent.getDocument();
    Element localElement1 = localDocument.getDefaultRootElement();
    int i = localElement1.getElementIndex(paramInt);
    Element localElement2 = localElement1.getElement(i);
    int j = localElement2.getStartOffset();
    int k = paramInt;
    try
    {
      while (true)
      {
        String str = localDocument.getText(j, k - j);
        int m = str.indexOf("/*");
        if (m != -1)
          return j + m;
        localElement2 = localElement1.getElement(i--);
        j = localElement2.getStartOffset();
        k = localElement2.getEndOffset();
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    return -1;
  }

  private static int c(JTextComponent paramJTextComponent, int paramInt)
  {
    Document localDocument = paramJTextComponent.getDocument();
    Element localElement1 = localDocument.getDefaultRootElement();
    int i = localElement1.getElementIndex(paramInt);
    Element localElement2 = localElement1.getElement(i);
    int j = paramInt;
    int k = localElement2.getEndOffset();
    try
    {
      while (true)
      {
        String str = localDocument.getText(j, k - j);
        int m = str.indexOf("*/");
        if (m != -1)
          return j + m + "*/".length();
        localElement2 = localElement1.getElement(i++);
        j = localElement2.getStartOffset();
        k = localElement2.getEndOffset();
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    return -1;
  }

  public abstract boolean a(int paramInt1, int paramInt2);
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.c.f
 * JD-Core Version:    0.6.0
 */