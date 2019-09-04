package com.zend.ide.s;

import com.zend.ide.bf.m;
import com.zend.ide.n.bw;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class bf extends bd
{
  private String g;
  final k h;

  bf(k paramk)
  {
    super(paramk);
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (!k.b(this.h)))
    {
      a(null);
      return;
    }
    Segment localSegment = j.a(0, paramInt, this.h.d());
    for (int i = paramInt; (i > 0) && (Character.isLetter(localSegment.array[(i - 1)])); i--);
    this.e = j.a(localSegment, i, paramInt);
    this.g = k.b(this.h.d().getDocument(), paramInt, localSegment);
    c(paramInt);
  }

  protected com.zend.ide.b.d[] q()
  {
    return com.zend.ide.x.j.a(this.g, this.e);
  }

  public boolean a(com.zend.ide.b.d paramd)
  {
    Document localDocument = this.h.d().getDocument();
    int i = b() - o();
    this.h.a(localDocument, i, this.h.d().getCaretPosition(), k.e());
    if ((paramd instanceof com.zend.ide.bf.d))
    {
      m.b().a(this.h.d(), (com.zend.ide.bf.d)paramd, i);
      return false;
    }
    Segment localSegment = new Segment();
    if (a(localSegment, localDocument, i))
      b(localSegment, localDocument, i);
    String str = paramd.a();
    int j = i + str.length();
    if (com.zend.ide.x.j.d(str))
    {
      str = str + "=\"\"";
      j += "=\"\"".length() - 1;
    }
    try
    {
      j.a(localDocument, i, str);
    }
    catch (Exception localException)
    {
    }
    this.h.d().setCaretPosition(j);
    return true;
  }

  private boolean a(Segment paramSegment, Document paramDocument, int paramInt)
  {
    int i = 32;
    int j = 0;
    try
    {
      for (int k = paramInt; (i == 32) || (i == 9); k++)
      {
        paramDocument.getText(k, 1, paramSegment);
        i = paramSegment.first();
        if (i != 61)
          continue;
        j = 1;
      }
    }
    catch (Exception localException)
    {
    }
    return j;
  }

  private void b(Segment paramSegment, Document paramDocument, int paramInt)
  {
    int i = 0;
    int j = 0;
    int k = 1;
    int m = 0;
    try
    {
      int i1;
      for (int n = paramInt; k != 0; n++)
      {
        paramDocument.getText(n, 1, paramSegment);
        i1 = paramSegment.first();
        if ((i1 == 62) || (i1 == 10))
          k = 0;
        if (i1 != 61)
          continue;
        k = 0;
        i = n;
      }
      k = 1;
      if (i > 0)
      {
        for (n = i; k != 0; n++)
        {
          paramDocument.getText(n, 1, paramSegment);
          i1 = paramSegment.first();
          if ((i1 == 62) || (i1 == 10))
            k = 0;
          if ((i1 != 34) && (i1 != 39))
            continue;
          if (m != 0)
          {
            k = 0;
            j = n;
          }
          m = 1;
        }
        if ((j > 0) && (j > i))
          j.a(paramDocument, i, j + 1 - i);
      }
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.bf
 * JD-Core Version:    0.6.0
 */