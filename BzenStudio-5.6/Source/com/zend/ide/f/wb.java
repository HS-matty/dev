package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.n.bw;
import javax.swing.text.Document;

class wb extends ca
{
  final cj i;

  private wb(cj paramcj)
  {
    super(paramcj);
  }

  public boolean a(d paramd)
  {
    Document localDocument = cj.i(this.i).getDocument();
    int j = b() - o();
    cj.b(this.i, localDocument, j, cj.j(this.i).getCaretPosition(), cj.e);
    String str = paramd.a() + '(';
    int k = j + str.length();
    try
    {
      cj.b(localDocument, j, str);
    }
    catch (Exception localException)
    {
    }
    cj.f(this.i).setCaretPosition(k);
    return true;
  }

  public boolean d()
  {
    return false;
  }

  wb(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.wb
 * JD-Core Version:    0.6.0
 */