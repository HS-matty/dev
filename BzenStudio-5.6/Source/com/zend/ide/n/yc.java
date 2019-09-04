package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.util.cl;
import java.util.Vector;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class yc extends n
{
  private static sd c = new wf(null);
  private static sd d = new uf(null);
  private static sd f = new xf(null);
  private static sd g = new tf(null);
  private static sd h = new vf(null);
  private static Vector e = new Vector();
  private static Vector i;

  public ef a(gx paramgx, char paramChar, StringBuffer paramStringBuffer)
  {
    if (a(paramChar))
      return b(paramgx, paramChar, paramStringBuffer);
    if (c(paramChar))
      return d(paramgx, paramChar, paramStringBuffer);
    return c(paramgx, paramChar, paramStringBuffer);
  }

  private boolean a(char paramChar)
  {
    return (paramChar == '(') || (paramChar == '[');
  }

  private boolean b(char paramChar)
  {
    return (paramChar == ')') || (paramChar == ']') || (paramChar == '}');
  }

  private boolean c(char paramChar)
  {
    return (paramChar == '\'') || (paramChar == '"') || (paramChar == '`');
  }

  private ef b(gx paramgx, char paramChar, StringBuffer paramStringBuffer)
  {
    paramStringBuffer.append(paramChar);
    int j = paramgx.getSelectionStart();
    try
    {
      Document localDocument = paramgx.getDocument();
      if ((paramgx.getSelectionEnd() < localDocument.getLength()) && (!a(localDocument, paramgx.getSelectionEnd(), false)))
        return r.f;
      paramgx.insert(String.valueOf(paramChar), j);
      for (int m = 0; m < e.size(); m++)
      {
        int k = ((sd)e.get(m)).a(localDocument, j, paramChar);
        if (k == 0)
        {
          char c1 = d(paramChar);
          paramStringBuffer.append(c1);
          localDocument.remove(j, 1);
          return new ef(j + 1, null);
        }
        if (k != 1)
          continue;
        localDocument.remove(j, 1);
        return r.f;
      }
      localDocument.remove(j, 1);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return r.f;
  }

  private boolean a(Document paramDocument, int paramInt, boolean paramBoolean)
    throws BadLocationException
  {
    char c1 = paramDocument.getText(paramInt, 1).charAt(0);
    if ((Character.isWhitespace(c1)) || (b(c1)) || ((paramBoolean) && (c(c1))) || (c1 == ';'))
      return true;
    if (paramInt + 1 >= paramDocument.getLength())
      return false;
    int j = paramDocument.getText(paramInt + 1, 1).charAt(0);
    bl localbl1 = b(paramDocument, paramInt);
    if (localbl1.c() == kc.h(132))
    {
      if ((c1 == '?') && (j == 62))
        return true;
      if ((c1 == '<') && (j == 60))
        for (int k = paramInt + 2; k < paramDocument.getLength(); k++)
        {
          char c2 = paramDocument.getText(k, 1).charAt(0);
          if (!Character.isWhitespace(c2))
            continue;
          if (k + 1 == paramDocument.getLength())
            return true;
          bl localbl2 = b(paramDocument, k + 1);
          if (localbl2.c() != kc.h(143))
            break;
          return true;
        }
    }
    if ((localbl1.c() == kc.h(129)) && (c1 == '<') && (j == 63))
      return true;
    return (c1 == '/') && ((j == 47) || (j == 42));
  }

  private ef c(gx paramgx, char paramChar, StringBuffer paramStringBuffer)
  {
    int j = paramgx.getSelectionEnd();
    Document localDocument = paramgx.getDocument();
    try
    {
      char c1 = localDocument.getText(j, 1).charAt(0);
      if (c1 == paramChar)
        for (int m = 0; m < e.size(); m++)
        {
          int k = ((sd)e.get(m)).a(localDocument, j, d(paramChar));
          if (k == 0)
            break;
          if (k != 1)
            continue;
          int n = fm.a(localDocument, j + 1, false);
          if (n == -1)
            break;
          return new ef(j + 1, null);
        }
      paramStringBuffer.append(paramChar);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    return r.f;
  }

  private static char d(char paramChar)
  {
    switch (paramChar)
    {
    case '{':
      return '}';
    case '}':
      return '{';
    case '(':
      return ')';
    case ')':
      return '(';
    case '[':
      return ']';
    case ']':
      return '[';
    case '"':
    case '\'':
    case '`':
      return paramChar;
    }
    return '-';
  }

  private ef d(gx paramgx, char paramChar, StringBuffer paramStringBuffer)
  {
    Document localDocument = paramgx.getDocument();
    int j = paramgx.getSelectionEnd();
    int k = paramgx.getSelectionStart();
    try
    {
      bl localbl1 = b(localDocument, k);
      bl localbl2 = b(localDocument, j);
      char c1;
      int m;
      if ((a(localbl1)) || (a(localbl2)))
      {
        if ((j < localDocument.getLength()) && (k == j))
        {
          c1 = localDocument.getText(j, 1).charAt(0);
          if (paramChar == c1)
          {
            m = localDocument.getText(k - 1, 1).charAt(0);
            if (m != 92)
              return new ef(j + 1, null);
          }
        }
        paramStringBuffer.append(paramChar);
        return r.f;
      }
      paramStringBuffer.append(paramChar);
      if (a(localbl1, paramChar))
      {
        if ((!a(localDocument, j, true)) && ((!localbl1.a(kc.h(114))) || (localDocument.getText(j, 1).charAt(0) != '>')))
          return r.f;
        for (c1 = '\000'; c1 < i.size(); c1++)
        {
          m = ((sd)i.get(c1)).a(localDocument, j, paramChar);
          if (m == 1)
            return r.f;
          if (m == 0)
            break;
        }
        paramStringBuffer.append(paramChar);
        return new ef(k + 1, null);
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    return r.f;
  }

  private boolean a(bl parambl, char paramChar)
  {
    int j = kc.g(parambl.c());
    if ((j == 145) || (j == 132) || (j == 140) || (j == 141))
      return true;
    if (paramChar != '`')
      return (j == 114) || (j == 128) || (j == 129);
    return false;
  }

  private static boolean a(bl parambl)
  {
    return (parambl.a(kc.h(135))) || (parambl.a(kc.h(142))) || (parambl.a(kc.h(138))) || (parambl.a(kc.h(127))) || (parambl.a(kc.h(131))) || (parambl.a(kc.h(116))) || (parambl.a(kc.h(123)));
  }

  private static bl b(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    return (bl)((ho)paramDocument).b(paramInt);
  }

  private static boolean a(Document paramDocument, bl parambl, int paramInt)
    throws BadLocationException
  {
    int j = kc.g(parambl.c());
    if ((j != 135) && (j != 138) && (j != 137) && (j != 143) && (j != 136))
      return false;
    int k = paramDocument.getText(paramInt + 1, 1).charAt(0);
    return k == 36;
  }

  static bl a(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    return b(paramDocument, paramInt);
  }

  static boolean b(Document paramDocument, bl parambl, int paramInt)
    throws BadLocationException
  {
    return a(paramDocument, parambl, paramInt);
  }

  static
  {
    e.add(c);
    e.add(d);
    i = new Vector();
    i.add(f);
    i.add(g);
    i.add(h);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.yc
 * JD-Core Version:    0.6.0
 */