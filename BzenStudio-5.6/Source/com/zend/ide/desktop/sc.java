package com.zend.ide.desktop;

import com.zend.ide.n.dz;
import com.zend.ide.n.ho;
import com.zend.ide.n.ob;
import com.zend.ide.n.qb;
import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.util.cl;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Segment;

public class sc
  implements qb
{
  public ob a(dz paramdz, int paramInt)
  {
    Document localDocument = paramdz.getDocument();
    try
    {
      int i = ((bl)((ho)localDocument).b(paramInt)).c();
      i = kc.g(i);
      if ((i != 135) && (i != 142))
        return null;
      Element localElement1 = localDocument.getDefaultRootElement();
      Element localElement2 = localElement1.getElement(localElement1.getElementIndex(paramInt));
      int j = a(localDocument, paramInt, localElement2);
      int k = b(localDocument, paramInt, localElement2);
      if ((j >= -1) && (k > -1))
      {
        String str = paramdz.getText(j, k - j);
        if ((str == null) || (str.equals("")))
          return null;
        URL localURL;
        try
        {
          localURL = new URL(str);
        }
        catch (MalformedURLException localMalformedURLException)
        {
          return null;
        }
        if (localURL != null)
          return new tc(this, j, k, str);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return null;
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
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.sc
 * JD-Core Version:    0.6.0
 */