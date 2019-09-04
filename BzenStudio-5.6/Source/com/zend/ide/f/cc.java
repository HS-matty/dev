package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.m.bh;
import com.zend.ide.m.v;
import com.zend.ide.n.bw;
import javax.swing.text.Document;

class cc extends ca
{
  final cj i;

  private cc(cj paramcj)
  {
    super(paramcj);
  }

  public boolean a(d paramd)
  {
    Document localDocument = cj.r(this.i).getDocument();
    int j = b() - o();
    cj.d(this.i, localDocument, j, cj.b(this.i).getCaretPosition(), cj.e);
    v localv = (v)paramd;
    int k = localv.j().c().length > 0 ? 1 : 0;
    String str = localv.a() + "()";
    int m = j + str.length();
    if (k != 0)
      m--;
    try
    {
      cj.f(localDocument, j, str);
    }
    catch (Exception localException)
    {
    }
    cj.c(this.i).setCaretPosition(m);
    return true;
  }

  cc(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cc
 * JD-Core Version:    0.6.0
 */