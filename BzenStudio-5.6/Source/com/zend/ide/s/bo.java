package com.zend.ide.s;

import com.zend.ide.b.d;
import com.zend.ide.n.bw;
import javax.swing.text.Document;

class bo extends bd
{
  final k g;

  bo(k paramk)
  {
    super(paramk);
  }

  private void a(String paramString, int paramInt)
  {
    this.e = paramString;
    c(paramInt);
  }

  protected d[] q()
  {
    return com.zend.ide.x.j.h(this.e);
  }

  public boolean a(d paramd)
  {
    Document localDocument = this.g.d().getDocument();
    int i = b() - o();
    this.g.a(localDocument, i, this.g.d().getCaretPosition(), k.e());
    String str = paramd.a();
    int j = i + str.length();
    try
    {
      j.a(localDocument, i, str);
    }
    catch (Exception localException)
    {
    }
    this.g.d().setCaretPosition(j);
    return true;
  }

  static void a(bo parambo, String paramString, int paramInt)
  {
    parambo.a(paramString, paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.bo
 * JD-Core Version:    0.6.0
 */