package com.zend.ide.n.td;

import com.zend.ide.b.m;
import com.zend.ide.m.bf;
import com.zend.ide.n.ho;
import com.zend.ide.n.td.a.o;
import com.zend.ide.util.cl;
import java.util.ArrayList;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Position.Bias;
import javax.swing.text.Segment;

public class h extends d
{
  private int i;
  private int j;

  public h(jb paramjb, ho paramho)
  {
    super(paramjb, paramho);
  }

  public void a(bf parambf)
  {
    if (this.h)
    {
      this.g = a.e();
      this.h = false;
    }
    a();
    this.i = -1;
    this.j = this.f.p();
    if (parambf == null)
      return;
    com.zend.ide.m.d[] arrayOfd = parambf.a();
    try
    {
      a(arrayOfd);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    finally
    {
      this.g = false;
    }
  }

  private void a(com.zend.ide.m.d[] paramArrayOfd)
    throws BadLocationException
  {
    b(paramArrayOfd);
  }

  private void b(com.zend.ide.m.d[] paramArrayOfd)
    throws BadLocationException
  {
    for (int k = 0; k < paramArrayOfd.length; k++)
      a(paramArrayOfd[k].a(), paramArrayOfd[k].b(), this.f);
    if (this.i > -1)
    {
      k = this.i + 1;
      if (this.j - k > 1)
      {
        Element localElement = this.f.getDefaultRootElement();
        Position localPosition1 = this.f.createPosition(localElement.getElement(k).getStartOffset());
        Position localPosition2 = this.f.createPosition(this.f.getEndPosition().getOffset() - 2);
        if (!a(localPosition1.getOffset(), localPosition2.getOffset(), this.f))
          this.d.add(new v(this.g, localPosition1, localPosition2));
      }
    }
  }

  private void a(m paramm1, m paramm2, Document paramDocument)
    throws BadLocationException
  {
    Position localPosition1 = b(paramm1.d(), paramDocument);
    Position localPosition2 = a(paramm2.e() - 1, paramDocument);
    Element localElement = paramDocument.getDefaultRootElement();
    int k = localElement.getElementIndex(localPosition1.getOffset());
    int m = localElement.getElementIndex(localPosition2.getOffset());
    if (this.i > -1)
    {
      int n = this.i + 1;
      int i1 = k - 1;
      if (i1 - n > 0)
      {
        Position localPosition4 = paramDocument.createPosition(localElement.getElement(n).getStartOffset());
        Position localPosition5 = paramDocument.createPosition(localElement.getElement(i1).getEndOffset() - 1);
        this.d.add(new v(this.g, localPosition4, localPosition5));
      }
    }
    else if (k > 2)
    {
      Position localPosition3 = paramDocument.createPosition(localElement.getElement(k - 1).getEndOffset() - 1);
      if (!a(0, localPosition3.getOffset(), paramDocument))
        this.d.add(new v(this.g, paramDocument.createPosition(0), localPosition3));
    }
    this.i = m;
  }

  private Position a(int paramInt, Document paramDocument)
    throws BadLocationException
  {
    return a(paramInt, paramDocument, Position.Bias.Backward);
  }

  private Position b(int paramInt, Document paramDocument)
    throws BadLocationException
  {
    return a(paramInt, paramDocument, Position.Bias.Forward);
  }

  private Position a(int paramInt, Document paramDocument, Position.Bias paramBias)
    throws BadLocationException
  {
    Position localPosition = null;
    int k = 2;
    int m = 1;
    if (paramBias == Position.Bias.Backward)
    {
      k = -2;
      m = -1;
    }
    int n = paramDocument.getLength();
    if (n - paramInt > 1)
    {
      String str = paramDocument.getText(paramInt, 2);
      if (str.charAt(0) == '\n')
      {
        if (str.charAt(1) == '\r')
          localPosition = paramDocument.createPosition(paramInt + k);
        else
          localPosition = paramDocument.createPosition(paramInt + m);
      }
      else if ((str.charAt(0) == '\r') && (str.charAt(1) == '\n'))
        localPosition = paramDocument.createPosition(paramInt + k);
    }
    else if (n - paramInt > 0)
    {
      if (paramDocument.getText(paramInt, 1).equals("\n"))
        localPosition = paramDocument.createPosition(paramInt + m);
      else
        localPosition = paramDocument.createPosition(paramInt);
    }
    if (localPosition == null)
      localPosition = paramDocument.createPosition(paramInt);
    return localPosition;
  }

  private boolean a(int paramInt1, int paramInt2, Document paramDocument)
  {
    Segment localSegment = o.b();
    try
    {
      paramDocument.getText(paramInt1, paramInt2 - paramInt1, localSegment);
      for (int k = localSegment.offset; k < localSegment.offset + localSegment.count; k++)
      {
        if (Character.isWhitespace(localSegment.array[k]))
          continue;
        int m = 0;
        return m;
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    finally
    {
      o.a(localSegment);
    }
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.h
 * JD-Core Version:    0.6.0
 */