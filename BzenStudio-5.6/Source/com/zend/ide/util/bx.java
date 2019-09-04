package com.zend.ide.util;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

public class bx
  implements CharSequence
{
  private Segment a;
  private int b;
  private int c;

  public bx(Segment paramSegment, int paramInt1, int paramInt2)
  {
    this.a = paramSegment;
    this.b = paramInt1;
    this.c = paramInt2;
  }

  public int length()
  {
    return this.c;
  }

  public char charAt(int paramInt)
  {
    int i = this.a.offset + this.b + paramInt;
    return this.a.array[i];
  }

  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return new bx(this.a, this.b + paramInt1, paramInt2 - paramInt1);
  }

  public String toString()
  {
    return new String(this.a.array, this.a.offset + this.b, this.c);
  }

  public static final CharSequence a(Document paramDocument, int paramInt1, int paramInt2)
  {
    Segment localSegment = new Segment();
    try
    {
      paramDocument.getText(paramInt1, paramInt2, localSegment);
    }
    catch (BadLocationException localBadLocationException)
    {
      return null;
    }
    bx localbx = new bx(localSegment, 0, localSegment.count);
    return localbx;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bx
 * JD-Core Version:    0.6.0
 */