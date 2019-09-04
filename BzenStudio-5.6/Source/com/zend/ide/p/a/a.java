package com.zend.ide.p.a;

import com.zend.ide.util.cl;
import java.io.IOException;
import java.io.Reader;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

public class a extends Reader
{
  private Document a;
  private Segment b;
  private int c;
  private int d;
  private int e;

  public a(Document paramDocument)
  {
    this(0, paramDocument.getLength(), paramDocument);
  }

  public a(int paramInt1, int paramInt2, Document paramDocument)
  {
    this.a = paramDocument;
    this.c = paramInt1;
    this.d = paramInt2;
    this.b = new Segment();
    try
    {
      a(this.c, this.d);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public int read(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramArrayOfChar == null)
      throw new NullPointerException();
    if ((paramInt1 < 0) || (paramInt1 > paramArrayOfChar.length) || (paramInt2 < 0) || (paramInt1 + paramInt2 > paramArrayOfChar.length) || (paramInt1 + paramInt2 < 0))
      throw new IndexOutOfBoundsException();
    if (paramInt2 == 0)
      return 0;
    int i = this.b.getEndIndex() - this.e;
    if (i <= 0)
      return -1;
    int j = Math.min(paramInt2, i);
    System.arraycopy(this.b.array, this.e, paramArrayOfChar, paramInt1, j);
    this.e += j;
    return j;
  }

  public boolean ready()
    throws IOException
  {
    return true;
  }

  public void close()
    throws IOException
  {
  }

  void a(int paramInt1, int paramInt2)
    throws RuntimeException
  {
    try
    {
      int i = paramInt2 - paramInt1;
      this.a.getText(paramInt1, i, this.b);
      this.e = this.b.getBeginIndex();
      this.b.setIndex(this.e);
    }
    catch (BadLocationException localBadLocationException)
    {
      throw new RuntimeException(localBadLocationException.getMessage());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.a.a
 * JD-Core Version:    0.6.0
 */