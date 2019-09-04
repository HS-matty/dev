package com.zend.ide.n.td;

import com.zend.ide.b.m;
import com.zend.ide.m.bf;
import com.zend.ide.m.v;
import com.zend.ide.n.ho;
import com.zend.ide.n.td.a.o;
import com.zend.ide.util.cl;
import java.util.ArrayList;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Segment;

public class e extends d
{
  public e(jb paramjb, ho paramho)
  {
    super(paramjb, paramho);
  }

  public void a(bf parambf)
  {
    if (this.h)
    {
      this.g = a.b();
      this.h = false;
    }
    a();
    if (parambf == null)
      return;
    v[] arrayOfv = parambf.c();
    try
    {
      a(arrayOfv);
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

  private void a(v[] paramArrayOfv)
    throws BadLocationException
  {
    b(paramArrayOfv);
  }

  private void b(v[] paramArrayOfv)
    throws BadLocationException
  {
    this.d.clear();
    for (int i = 0; i < paramArrayOfv.length; i++)
      a(paramArrayOfv[i], this.f);
  }

  private void a(v paramv, Document paramDocument)
    throws BadLocationException
  {
    int i = paramv.f().f();
    int j = paramv.f().e() - 1;
    if (j + 1 < paramDocument.getLength())
    {
      if ((!paramDocument.getText(j, 1).equals("}")) && (!paramDocument.getText(j - 1, 1).equals("}")))
        return;
    }
    else if (j + 1 > paramDocument.getLength())
      return;
    int k = 0;
    Element localElement1 = paramDocument.getDefaultRootElement();
    int m = paramDocument.getLength();
    Element localElement2 = localElement1.getElement(localElement1.getElementIndex(i));
    if (localElement2.getStartOffset() <= j)
    {
      int n = Math.min(localElement2.getEndOffset(), m);
      i = localElement2.getStartOffset();
      if (n - i > 0)
      {
        Segment localSegment = o.b();
        paramDocument.getText(i, n - i, localSegment);
        for (int i1 = localSegment.offset; i1 < localSegment.offset + localSegment.count; i1++)
        {
          if (localSegment.array[i1] == '{')
          {
            k = 1;
            break;
          }
          i++;
        }
        o.a(localSegment);
      }
    }
    if (k == 0)
      i--;
    if (i < j)
      this.d.add(new s(this.g, paramDocument.createPosition(i), paramDocument.createPosition(j)));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.e
 * JD-Core Version:    0.6.0
 */