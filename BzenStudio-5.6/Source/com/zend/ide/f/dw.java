package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.m.v;
import com.zend.ide.n.bw;
import javax.swing.text.Document;

class dw extends ca
{
  final cj i;

  private dw(cj paramcj)
  {
    super(paramcj);
  }

  public boolean a(d paramd)
  {
    if (!(paramd instanceof v))
      return super.a(paramd);
    Document localDocument = cj.k(this.i).getDocument();
    int j = b() - o();
    cj.a(this.i, localDocument, j, cj.m(this.i).getCaretPosition(), cj.e);
    v localv = (v)paramd;
    String str = localv.a() + "::";
    int k = j + str.length();
    try
    {
      cj.c(localDocument, j, str);
    }
    catch (Exception localException)
    {
    }
    cj.g(this.i).setCaretPosition(k);
    return true;
  }

  dw(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.dw
 * JD-Core Version:    0.6.0
 */