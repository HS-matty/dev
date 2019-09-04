package com.zend.ide.n;

import com.zend.ide.s.bk;
import com.zend.ide.s.bl;
import com.zend.ide.y.b;
import java.awt.Toolkit;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.Element;

public class r
  implements cn, cm
{
  private static bk a = null;
  protected m b = new n();
  protected m c = new p(this, null);
  protected StringBuffer d = new StringBuffer();
  private static ad e = null;
  protected static final ef f = new ef(-1, null);

  public r()
  {
    if (e == null)
    {
      e = new ad(this, null);
      b.a(e, "desktop.phpVersion");
    }
  }

  public void a(gx paramgx, String paramString)
  {
    char c1 = paramString.charAt(0);
    m localm = a(c1);
    this.d.setLength(0);
    ef localef = localm.a(paramgx, c1, this.d);
    a(paramgx, this.d.toString(), localef);
  }

  protected void a(gx paramgx, String paramString, ef paramef)
  {
    Caret localCaret = paramgx.getCaret();
    try
    {
      Document localDocument = paramgx.getDocument();
      if (!f.d())
      {
        int i = Math.min(localCaret.getDot(), localCaret.getMark());
        int j = Math.max(localCaret.getDot(), localCaret.getMark());
        Element localElement1 = localDocument.getDefaultRootElement();
        Element localElement2 = localElement1.getElement(localElement1.getElementIndex(i));
        int k = localElement2.getEndOffset();
        if (k - 1 != i)
          if (i == j)
            localDocument.remove(i, 1);
          else
            localDocument.remove(i, j - i);
      }
      if (paramString.length() > 0)
        paramgx.replaceSelection(paramString);
      if (paramef != f)
      {
        paramgx.setCaretPosition(paramef.b());
        if (paramef.a() != null)
          localCaret.setMagicCaretPosition(paramef.a());
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      paramgx.getToolkit().beep();
    }
  }

  protected static final boolean b()
  {
    return f.b();
  }

  protected static final int b(gx paramgx)
  {
    return paramgx.getTabSize();
  }

  public void a(gx paramgx, int paramInt1, int paramInt2)
  {
  }

  private static void a(Document paramDocument)
  {
    if (a != null)
      return;
    a = kc.b(paramDocument);
  }

  protected m a(char paramChar)
  {
    switch (paramChar)
    {
    case '\n':
      return this.c;
    }
    return a();
  }

  protected m a(bl parambl, Document paramDocument, int paramInt, char paramChar)
  {
    return a();
  }

  protected m a()
  {
    return this.b;
  }

  protected static Object a(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    return ((ho)paramDocument).b(paramInt);
  }

  protected static boolean a(Document paramDocument, int paramInt1, int paramInt2, int paramInt3)
    throws BadLocationException
  {
    return (paramDocument.getText(paramInt1, paramInt2 - paramInt1).trim().length() == 0) || (paramDocument.getText(paramInt1, paramInt3 - paramInt1).trim().length() == 0);
  }

  static bk a(bk parambk)
  {
    a = parambk;
    return parambk;
  }

  static void b(Document paramDocument)
  {
    a(paramDocument);
  }

  static bk a()
  {
    return a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.r
 * JD-Core Version:    0.6.0
 */