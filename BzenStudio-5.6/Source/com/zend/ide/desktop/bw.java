package com.zend.ide.desktop;

import com.zend.ide.j.bd;
import com.zend.ide.j.h;
import com.zend.ide.n.pb;
import com.zend.ide.util.bc;
import java.io.File;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Segment;

public class bw
{
  private com.zend.ide.n.bw b;

  public bw(com.zend.ide.n.bw parambw)
  {
    this.b = parambw;
    parambw.a().a(new lb(this, null));
  }

  private String b(String paramString1, String paramString2)
  {
    File localFile = h.m.g(paramString2).getParentFile();
    if ((localFile instanceof bd))
      return null;
    bc localbc = bl.a().a(paramString1, localFile);
    if (localbc.b != null)
      return localbc.a;
    return null;
  }

  private static String a(String paramString)
  {
    if (paramString == null)
      return null;
    paramString = paramString.replace('/', h.m.d());
    paramString = paramString.replace('\\', h.m.d());
    return paramString;
  }

  private static int a(Document paramDocument, int paramInt, Element paramElement)
    throws BadLocationException
  {
    int i = paramElement.getStartOffset();
    Segment localSegment = new Segment();
    paramDocument.getText(i, paramInt - i, localSegment);
    int j = localSegment.last();
    int m = paramInt;
    while ((j != 65535) && (a(j)))
    {
      m--;
      int k = localSegment.previous();
    }
    return m;
  }

  private static int b(Document paramDocument, int paramInt, Element paramElement)
    throws BadLocationException
  {
    int i = paramElement.getEndOffset();
    Segment localSegment = new Segment();
    paramDocument.getText(paramInt, i - paramInt, localSegment);
    int j = localSegment.first();
    int m = paramInt;
    while ((j != 65535) && (a(j)))
    {
      m++;
      int k = localSegment.next();
    }
    return m;
  }

  private static boolean a(char paramChar)
  {
    return (Character.isLetterOrDigit(paramChar)) || (b(paramChar)) || (Character.isWhitespace(paramChar));
  }

  private static boolean b(char paramChar)
  {
    switch (paramChar)
    {
    case '{':
      return true;
    case '}':
      return true;
    case '(':
      return true;
    case ')':
      return true;
    case '[':
      return true;
    case ']':
      return true;
    case '_':
      return true;
    case '.':
      return true;
    case '+':
      return true;
    case '-':
      return true;
    case '~':
      return true;
    case '`':
      return true;
    case '!':
      return true;
    case '@':
      return true;
    case '#':
      return true;
    case '$':
      return true;
    case '%':
      return true;
    case '^':
      return true;
    case '&':
      return true;
    case '*':
      return true;
    case '<':
      return true;
    case '>':
      return true;
    case '?':
      return true;
    case '/':
      return true;
    case ';':
      return true;
    case ':':
      return true;
    case ',':
      return true;
    case '|':
      return true;
    case '\\':
      return true;
    case '"':
    case '\'':
    case '0':
    case '1':
    case '2':
    case '3':
    case '4':
    case '5':
    case '6':
    case '7':
    case '8':
    case '9':
    case '=':
    case 'A':
    case 'B':
    case 'C':
    case 'D':
    case 'E':
    case 'F':
    case 'G':
    case 'H':
    case 'I':
    case 'J':
    case 'K':
    case 'L':
    case 'M':
    case 'N':
    case 'O':
    case 'P':
    case 'Q':
    case 'R':
    case 'S':
    case 'T':
    case 'U':
    case 'V':
    case 'W':
    case 'X':
    case 'Y':
    case 'Z':
    case 'a':
    case 'b':
    case 'c':
    case 'd':
    case 'e':
    case 'f':
    case 'g':
    case 'h':
    case 'i':
    case 'j':
    case 'k':
    case 'l':
    case 'm':
    case 'n':
    case 'o':
    case 'p':
    case 'q':
    case 'r':
    case 's':
    case 't':
    case 'u':
    case 'v':
    case 'w':
    case 'x':
    case 'y':
    case 'z':
    }
    return false;
  }

  static int c(Document paramDocument, int paramInt, Element paramElement)
    throws BadLocationException
  {
    return a(paramDocument, paramInt, paramElement);
  }

  static int d(Document paramDocument, int paramInt, Element paramElement)
    throws BadLocationException
  {
    return b(paramDocument, paramInt, paramElement);
  }

  static String b(String paramString)
  {
    return a(paramString);
  }

  static String a(bw parambw, String paramString1, String paramString2)
  {
    return parambw.b(paramString1, paramString2);
  }

  static com.zend.ide.n.bw a(bw parambw)
  {
    return parambw.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bw
 * JD-Core Version:    0.6.0
 */