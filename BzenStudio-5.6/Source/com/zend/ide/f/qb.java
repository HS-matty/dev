package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.m.e;
import com.zend.ide.n.bw;
import javax.swing.text.Document;

class qb extends ca
{
  final ob i;

  private qb(ob paramob)
  {
    super(paramob);
  }

  public boolean a(d paramd)
  {
    Document localDocument = ob.a(this.i).getDocument();
    int j = b() - o();
    ob.a(this.i, localDocument, j, ob.b(this.i).getCaretPosition(), cj.e);
    if ((paramd instanceof e))
    {
      String str = paramd.a() + " ";
      int k = j + str.length();
      try
      {
        ob.e(localDocument, j, str);
      }
      catch (Exception localException)
      {
      }
      ob.c(this.i).setCaretPosition(k);
    }
    return false;
  }

  qb(ob paramob, mb parammb)
  {
    this(paramob);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.qb
 * JD-Core Version:    0.6.0
 */