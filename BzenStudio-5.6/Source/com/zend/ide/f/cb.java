package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.m.x;
import com.zend.ide.n.bw;
import com.zend.ide.util.dj;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class cb extends ca
{
  final cj i;

  private cb(cj paramcj)
  {
    super(paramcj);
  }

  public boolean a(d paramd)
  {
    if (!(paramd instanceof x))
      return super.a(paramd);
    Document localDocument = cj.n(this.i).getDocument();
    int j = b() - o();
    cj.c(this.i, localDocument, j, cj.h(this.i).getCaretPosition(), cj.e);
    try
    {
      Segment localSegment = new Segment();
      localDocument.getText(0, j, localSegment);
      k = localSegment.last();
      if ((k == 39) || (k == 34))
      {
        cj.b(localDocument, j - 1, 1);
        j--;
        a(j);
        localDocument.getText(j, localDocument.getLength() - j, localSegment);
        int m = localSegment.first();
        for (int i1 = 0; m != 65535; i1++)
        {
          if (k == m)
          {
            cj.c(localDocument, j, i1 + 1);
            break;
          }
          if (!Character.isWhitespace(m))
            break;
          int n = localSegment.next();
        }
      }
    }
    catch (Exception localException1)
    {
      throw new dj(localException1);
    }
    String str = paramd.a();
    str = '\'' + str + '\'';
    int k = j + str.length();
    try
    {
      cj.d(localDocument, j, str);
    }
    catch (Exception localException2)
    {
    }
    cj.q(this.i).setCaretPosition(k);
    return false;
  }

  cb(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cb
 * JD-Core Version:    0.6.0
 */