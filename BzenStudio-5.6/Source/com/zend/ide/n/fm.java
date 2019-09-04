package com.zend.ide.n;

import java.util.Vector;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

public abstract class fm
{
  private static Segment a = new Segment();
  private static fn b = new gl();
  private static fn c = new gy();
  private static fn d = new gw();
  private static fn e = new gm();
  private static fn f = new hh();
  private static Vector g = new Vector();
  private static boolean h;
  private static boolean i;

  public static void a(boolean paramBoolean)
  {
    h = paramBoolean;
  }

  public static void b(boolean paramBoolean)
  {
    i = paramBoolean;
  }

  public static int a(Document paramDocument, int paramInt, boolean paramBoolean)
    throws BadLocationException
  {
    if (((paramBoolean) && ((paramInt < 0) || (paramInt >= paramDocument.getLength()))) || ((!paramBoolean) && ((paramInt <= 0) || (paramInt > paramDocument.getLength()))))
      return -1;
    char c1 = paramDocument.getText(paramBoolean ? paramInt : paramInt - 1, 1).charAt(0);
    int j = -1;
    if (i)
    {
      j = f.a(c1, paramDocument, paramInt, paramBoolean);
      if ((j != -2) && (j != -1))
        return j;
    }
    if (h)
      for (int k = 0; k < g.size(); k++)
      {
        j = ((fn)g.get(k)).a(c1, paramDocument, paramInt, paramBoolean);
        if ((j != -2) && (j != -1))
          return j;
      }
    return j;
  }

  private static int a(int paramInt)
  {
    return paramInt * -1 - 2;
  }

  public static int b(int paramInt)
  {
    return (paramInt + 2) * -1;
  }

  private static Object a(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    return ((ho)paramDocument).b(paramInt);
  }

  private static char a(char paramChar)
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
    case '<':
      return '>';
    case '>':
      return '<';
    case '"':
    case '\'':
    case '`':
      return paramChar;
    }
    return '-';
  }

  static Object b(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    return a(paramDocument, paramInt);
  }

  static Segment b()
  {
    return a;
  }

  static char b(char paramChar)
  {
    return a(paramChar);
  }

  static int c(int paramInt)
  {
    return a(paramInt);
  }

  static
  {
    g.add(c);
    g.add(b);
    g.add(d);
    g.add(e);
    h = true;
    i = true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.fm
 * JD-Core Version:    0.6.0
 */