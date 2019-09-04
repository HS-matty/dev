package com.zend.ide.s;

import com.zend.ide.bf.m;
import com.zend.ide.n.bw;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class bg extends bd
{
  private String g;
  private String h;
  final k i;

  bg(k paramk)
  {
    super(paramk);
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (!k.d(this.i)))
    {
      a(null);
      return;
    }
    Segment localSegment = j.a(0, paramInt, this.i.d());
    this.h = "";
    this.e = "";
    this.g = "";
    for (int j = paramInt - 1; (j > 0) && (localSegment.array[j] != '='); j--);
    if (j > 0)
    {
      for (int k = j; (k < paramInt) && (!Character.isJavaIdentifierPart(localSegment.array[k])); k++);
      this.e = j.a(localSegment, k, paramInt);
      for (int m = j; (m > 0) && (!Character.isLetter(localSegment.array[(m - 1)])); m--);
      int n = 0;
      if (m != 0)
      {
        for (n = m; (n > 0) && (Character.isLetter(localSegment.array[(n - 1)])); n--);
        this.h = j.a(localSegment, n, m).toLowerCase();
      }
      this.g = k.b(this.i.d().getDocument(), n, localSegment);
    }
    c(paramInt);
  }

  protected com.zend.ide.b.d[] q()
  {
    return com.zend.ide.x.j.a(this.g, this.h, this.e);
  }

  public boolean a(com.zend.ide.b.d paramd)
  {
    Document localDocument = this.i.d().getDocument();
    int j = b() - o();
    int k = this.i.a(localDocument, j, this.i.d().getCaretPosition(), k.e());
    if ((paramd instanceof com.zend.ide.bf.d))
    {
      m.b().a(this.i.d(), (com.zend.ide.bf.d)paramd, j);
      return false;
    }
    String str1 = paramd.a();
    int m = j + str1.length() + 1;
    String str2 = "";
    try
    {
      str2 = localDocument.getText(j, 1);
    }
    catch (BadLocationException localBadLocationException)
    {
      localBadLocationException.printStackTrace();
    }
    switch (kc.g(j.a(localDocument, j)))
    {
    case 123:
      if ((k == 39) || (str2.equals("'")))
        break;
      str1 = str1 + "'";
      break;
    case 116:
      if ((k == 34) || (str2.equals("\"")))
        break;
      str1 = str1 + "\"";
      break;
    default:
      str1 = "\"" + str1 + "\"";
      m++;
    }
    try
    {
      j.a(localDocument, j, str1);
    }
    catch (Exception localException)
    {
    }
    this.i.d().setCaretPosition(m);
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.bg
 * JD-Core Version:    0.6.0
 */