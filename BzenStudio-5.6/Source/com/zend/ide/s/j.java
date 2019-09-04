package com.zend.ide.s;

import com.zend.ide.b.h;
import com.zend.ide.bf.d;
import com.zend.ide.bf.r;
import com.zend.ide.n.bw;
import com.zend.ide.n.ho;
import com.zend.ide.util.cl;
import com.zend.ide.util.dj;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.Segment;
import javax.swing.text.Utilities;

public abstract class j
  implements m
{
  private boolean a = false;
  private boolean h = false;
  private bw b;
  protected h d = g();
  protected x c;
  private int e = 1000;
  private int f = 0;
  protected boolean i = false;
  protected boolean g = false;

  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public boolean i()
  {
    return this.a;
  }

  public void a(int paramInt)
  {
    this.e = paramInt;
  }

  public int b()
  {
    return this.e;
  }

  public int c()
  {
    return this.f;
  }

  public void b(int paramInt)
  {
    this.f = paramInt;
  }

  public void a(bw parambw)
  {
    this.b = parambw;
  }

  protected bw d()
  {
    return this.b;
  }

  public void b(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public boolean a(int paramInt1, int paramInt2)
  {
    JTextComponent localJTextComponent = d().e();
    int j;
    String str;
    try
    {
      j = localJTextComponent.getCaretPosition();
      int k = Utilities.getPreviousWord(localJTextComponent, j);
      str = localJTextComponent.getText(k, j - k);
    }
    catch (BadLocationException localBadLocationException1)
    {
      return false;
    }
    d locald = r.b().a(paramInt1, str);
    if (locald != null)
    {
      try
      {
        d().getDocument().remove(j - str.length(), str.length());
      }
      catch (BadLocationException localBadLocationException2)
      {
        cl.a(localBadLocationException2);
      }
      com.zend.ide.bf.m.b().a(d(), locald, j - str.length());
      return true;
    }
    return false;
  }

  protected static void a(Document paramDocument, int paramInt, String paramString)
    throws BadLocationException
  {
    if (com.zend.ide.bf.m.b().d())
    {
      com.zend.ide.bf.m.b().a(paramString, paramInt, paramString.length(), 0, -1, null);
      return;
    }
    paramDocument.insertString(paramInt, paramString, null);
  }

  protected static void a(Document paramDocument, int paramInt1, int paramInt2)
    throws BadLocationException
  {
    if (com.zend.ide.bf.m.b().d())
    {
      com.zend.ide.bf.m.b().a(paramDocument, paramInt1, paramInt2);
      return;
    }
    paramDocument.remove(paramInt1, paramInt2);
  }

  protected abstract h g();

  protected char a(Document paramDocument, int paramInt1, int paramInt2, char[] paramArrayOfChar)
  {
    Segment localSegment = new Segment();
    Element localElement1 = paramDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(localElement1.getElementIndex(paramInt1));
    int j = this.i ? localElement2.getEndOffset() - 1 : paramInt2;
    int k = 0;
    try
    {
      paramDocument.getText(paramInt1, j - paramInt1, localSegment);
      int m = paramInt1;
      int n = localSegment.first();
      while (n != 65535)
      {
        if (a(n, paramArrayOfChar))
        {
          k = n;
          break;
        }
        int i1 = localSegment.next();
        m++;
      }
      if (m > paramInt1)
        a(paramDocument, paramInt1, m - paramInt1);
    }
    catch (Exception localException)
    {
    }
    return k;
  }

  private static final boolean a(char paramChar, char[] paramArrayOfChar)
  {
    for (int j = 0; j < paramArrayOfChar.length; j++)
      if (paramChar == paramArrayOfChar[j])
        return true;
    return false;
  }

  protected static final Segment a(int paramInt1, int paramInt2, bw parambw)
  {
    Segment localSegment = new Segment();
    localSegment.setPartialReturn(false);
    try
    {
      parambw.getDocument().getText(paramInt1, paramInt2 - paramInt1, localSegment);
    }
    catch (BadLocationException localBadLocationException)
    {
      throw new dj(localBadLocationException);
    }
    return localSegment;
  }

  protected static final String a(Segment paramSegment, int paramInt1, int paramInt2)
  {
    return new String(paramSegment.array, paramInt1, paramInt2 - paramInt1);
  }

  protected final char c(int paramInt)
  {
    return a(paramInt, paramInt + 1, d()).first();
  }

  protected static int a(Document paramDocument, int paramInt)
  {
    return b(paramDocument, paramInt).c();
  }

  private static bl b(Document paramDocument, int paramInt)
  {
    try
    {
      ho localho = (ho)paramDocument;
      return (bl)localho.b(paramInt);
    }
    catch (Exception localException)
    {
    }
    throw new dj(localException);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.j
 * JD-Core Version:    0.6.0
 */