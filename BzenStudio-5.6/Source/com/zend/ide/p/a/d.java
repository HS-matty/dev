package com.zend.ide.p.a;

import java.awt.Toolkit;
import javax.swing.event.DocumentEvent.EventType;
import javax.swing.text.AbstractDocument.DefaultDocumentEvent;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class d extends PlainDocument
{
  private int a = -1;

  public d()
  {
  }

  public d(int paramInt)
  {
    this.a = paramInt;
  }

  public void insertString(int paramInt, String paramString, AttributeSet paramAttributeSet)
    throws BadLocationException
  {
    if ((this.a != -1) && (getLength() + paramString.length() > this.a))
    {
      Toolkit.getDefaultToolkit().beep();
      return;
    }
    char[] arrayOfChar1 = paramString.toCharArray();
    char[] arrayOfChar2 = new char[arrayOfChar1.length];
    int i = 0;
    for (int j = 0; j < arrayOfChar2.length; j++)
      if (Character.isDigit(arrayOfChar1[j]))
        arrayOfChar2[(i++)] = arrayOfChar1[j];
      else
        Toolkit.getDefaultToolkit().beep();
    String str = new String(arrayOfChar2, 0, i);
    super.insertString(paramInt, str, paramAttributeSet);
  }

  protected void insertUpdate(AbstractDocument.DefaultDocumentEvent paramDefaultDocumentEvent, AttributeSet paramAttributeSet)
  {
    if ((this.a != -1) && (getLength() > this.a))
    {
      a(paramDefaultDocumentEvent.getOffset(), paramDefaultDocumentEvent.getLength());
      return;
    }
    if (paramDefaultDocumentEvent.getType() == DocumentEvent.EventType.INSERT)
    {
      String str = null;
      try
      {
        str = getText(paramDefaultDocumentEvent.getOffset(), paramDefaultDocumentEvent.getLength());
        for (int i = 0; i < str.length(); i++)
        {
          if (Character.isDigit(str.charAt(i)))
            continue;
          a(paramDefaultDocumentEvent.getOffset(), paramDefaultDocumentEvent.getLength());
          return;
        }
      }
      catch (BadLocationException localBadLocationException)
      {
      }
    }
    super.insertUpdate(paramDefaultDocumentEvent, paramAttributeSet);
  }

  private void a(int paramInt1, int paramInt2)
  {
    try
    {
      remove(paramInt1, paramInt2);
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    Toolkit.getDefaultToolkit().beep();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.a.d
 * JD-Core Version:    0.6.0
 */