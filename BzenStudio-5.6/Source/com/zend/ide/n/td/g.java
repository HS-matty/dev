package com.zend.ide.n.td;

import com.zend.ide.b.m;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.v;
import com.zend.ide.n.ho;
import com.zend.ide.n.td.a.o;
import com.zend.ide.util.cl;
import java.util.ArrayList;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Segment;

public class g extends d
{
  public g(jb paramjb, ho paramho)
  {
    super(paramjb, paramho);
  }

  public void a(bf parambf)
  {
    if (this.h)
    {
      this.g = a.d();
      this.h = false;
    }
    a();
    if (parambf == null)
      return;
    bh[] arrayOfbh = parambf.d();
    v[] arrayOfv = parambf.c();
    try
    {
      a(arrayOfbh, arrayOfv);
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

  private void a(bh[] paramArrayOfbh, v[] paramArrayOfv)
    throws BadLocationException
  {
    b(paramArrayOfbh, paramArrayOfv);
  }

  private void b(bh[] paramArrayOfbh, v[] paramArrayOfv)
    throws BadLocationException
  {
    this.d.clear();
    for (int i = 0; i < paramArrayOfbh.length; i++)
      a(paramArrayOfbh[i], this.f);
    for (int j = 0; j < paramArrayOfv.length; j++)
    {
      bh[] arrayOfbh = paramArrayOfv[j].h();
      for (int k = 0; k < arrayOfbh.length; k++)
        a(arrayOfbh[k], this.f);
    }
  }

  private void a(bh parambh, Document paramDocument)
    throws BadLocationException
  {
    int i = parambh.f().f();
    int j = parambh.f().e() - 1;
    int k = 0;
    Element localElement1 = paramDocument.getDefaultRootElement();
    int m = paramDocument.getLength();
    while (k == 0)
    {
      Element localElement2 = localElement1.getElement(localElement1.getElementIndex(i));
      int n = Math.min(localElement2.getEndOffset(), m);
      if (n - i > 0)
      {
        Segment localSegment = o.b();
        paramDocument.getText(i, n - i, localSegment);
        for (int i1 = localSegment.offset; i1 < localSegment.offset + localSegment.count; i1++)
        {
          i++;
          if (localSegment.array[i1] != ')')
            continue;
          k = 1;
          break;
        }
        if (k == 0)
          i++;
        o.a(localSegment);
      }
      else
      {
        k = 1;
      }
    }
    if ((i < j) && (j < paramDocument.getLength()) && ((paramDocument.getText(j, 1).equals("}")) || (paramDocument.getText(j - 1, 1).equals("}"))))
      this.d.add(new u(this.g, paramDocument.createPosition(i), paramDocument.createPosition(j)));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.g
 * JD-Core Version:    0.6.0
 */