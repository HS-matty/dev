package com.zend.ide.p.a;

import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class c extends PlainDocument
{
  public void insertString(int paramInt, String paramString, AttributeSet paramAttributeSet)
    throws BadLocationException
  {
    if (paramString == null)
      return;
    char[] arrayOfChar1 = paramString.toCharArray();
    char[] arrayOfChar2 = new char[arrayOfChar1.length];
    int i = 0;
    for (int j = 0; j < arrayOfChar2.length; j++)
      if (a(arrayOfChar1[j]))
        arrayOfChar2[(i++)] = arrayOfChar1[j];
      else
        Toolkit.getDefaultToolkit().beep();
    String str = new String(arrayOfChar2, 0, i);
    super.insertString(paramInt, str, paramAttributeSet);
  }

  private static boolean a(char paramChar)
  {
    switch (paramChar)
    {
    case '/':
      return false;
    case '\\':
      return false;
    case ':':
      return false;
    case '*':
      return false;
    case '?':
      return false;
    case '"':
      return false;
    case '\'':
      return false;
    case '>':
      return false;
    case '<':
      return false;
    case '|':
      return false;
    }
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.a.c
 * JD-Core Version:    0.6.0
 */