package com.zend.ide.s;

import com.zend.ide.bf.m;
import com.zend.ide.bf.r;
import com.zend.ide.n.bw;
import com.zend.ide.util.cl;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class bi extends bd
{
  boolean h = true;
  final k g;

  bi(k paramk)
  {
    super(paramk);
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (!k.a(this.g)))
    {
      a(null);
      return;
    }
    Segment localSegment = j.a(0, paramInt, this.g.d());
    this.e = "";
    if (paramInt > 0)
    {
      char c = localSegment.array[(paramInt - 1)];
      if (!Character.isWhitespace(c))
      {
        for (int i = paramInt - 1; i >= 0; i--)
        {
          c = localSegment.array[i];
          if ((Character.isWhitespace(c)) || (c == '\n') || (c == '\r'))
            break;
          if (c != '<')
            continue;
          this.e = j.a(localSegment, i, paramInt);
          this.h = true;
          break;
        }
        if ((this.e.length() == 0) && (paramBoolean))
        {
          this.e = j.a(localSegment, i + 1, paramInt);
          this.h = false;
        }
      }
    }
    if ((paramBoolean) || ((k.a(this.g)) && (this.e.length() > 0)))
      c(paramInt);
    else
      a(null);
  }

  protected com.zend.ide.b.d[] q()
  {
    if (this.h)
      return com.zend.ide.x.j.a(this.e);
    return r.b().a(k.a(this.g), this.e);
  }

  protected void c(int paramInt)
  {
    for (int i = 0; (i < this.e.length()) && ((this.e.charAt(i) == '<') || (this.e.charAt(i) == '/')); i++);
    if (i > 0)
      this.e = this.e.substring(i);
    super.c(paramInt);
  }

  protected boolean a(char paramChar)
  {
    return (paramChar == '<') || (paramChar == '/') || (k.a(paramChar));
  }

  public boolean a(com.zend.ide.b.d paramd)
  {
    Document localDocument = this.g.d().getDocument();
    int i = b() - o();
    this.g.a(localDocument, i, this.g.d().getCaretPosition(), k.e());
    if ((paramd instanceof com.zend.ide.bf.d))
    {
      m.b().a(this.g.d(), (com.zend.ide.bf.d)paramd, i);
      return false;
    }
    String str = paramd.a();
    char c = ' ';
    int j = i - 1;
    if (j >= 0)
      try
      {
        c = localDocument.getText(j, 1).charAt(0);
      }
      catch (BadLocationException localBadLocationException)
      {
        cl.a(localBadLocationException);
      }
    if (!Character.isJavaIdentifierPart(c))
      if (c == '/')
        str = str + ">";
      else if (c != '<')
        str = "<" + str;
    if (paramd.a().equals("?"))
      str = str + "\n";
    int k = i + str.length();
    try
    {
      if (k.c(this.g))
        str = str.toUpperCase();
      else
        str = str.toLowerCase();
      j.a(localDocument, i, str);
    }
    catch (Exception localException)
    {
    }
    this.g.d().setCaretPosition(k);
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.bi
 * JD-Core Version:    0.6.0
 */