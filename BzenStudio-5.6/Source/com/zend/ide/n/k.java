package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.util.cl;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;

public class k extends r
{
  private StringBuffer e = new StringBuffer();
  private m f = new q(this, null);
  private m g = new s(this, null);
  private m h = new y(this, null);
  private m i = new zc(this, null);
  private m j = new yc();
  private m k = new xc();
  private m x = new af(this, null);
  private boolean l = true;
  private boolean m = true;
  private boolean n = true;
  private boolean o = true;
  private boolean p = true;
  private boolean q = false;
  protected PropertyChangeListener r = new ne(this, null);
  protected PropertyChangeListener s = new me(this, null);
  protected PropertyChangeListener t = new ke(this, null);
  protected PropertyChangeListener u = new je(this, null);
  protected PropertyChangeListener v = new le(this, null);
  protected e w;

  public k()
  {
    f localf = new f();
    this.w = new e(localf);
    localf.a("editing.autoIndent", this.r);
    localf.a("editing.bracketPairInsertion", this.u);
    localf.a("editing.curlyPairInsertion", this.t);
    localf.a("editing.htmlClosingTagInsertion", this.v);
    localf.a("editing.quotePairInsertion", this.s);
    this.w.a("editing.autoIndent");
    this.w.a("editing.bracketPairInsertion");
    this.w.a("editing.curlyPairInsertion");
    this.w.a("editing.htmlClosingTagInsertion");
    this.w.a("editing.quotePairInsertion");
  }

  public void a(gx paramgx, int paramInt1, int paramInt2)
  {
    this.q = true;
    try
    {
      paramgx.B();
      Document localDocument = paramgx.getDocument();
      Element localElement = localDocument.getDefaultRootElement();
      int i1 = localElement.getElementIndex(paramInt1);
      int i2 = localElement.getElementIndex(paramInt2);
      int i3 = localElement.getElementIndex(paramgx.getCaretPosition());
      try
      {
        while (i1 <= i2)
        {
          a(paramgx, i1);
          i1++;
        }
      }
      catch (Throwable localThrowable)
      {
        cl.a(localThrowable);
      }
      paramgx.setCaretPosition(localElement.getElement(i3).getStartOffset());
    }
    finally
    {
      paramgx.D();
    }
    this.q = false;
  }

  private void a(gx paramgx, int paramInt)
    throws BadLocationException
  {
    Document localDocument = paramgx.getDocument();
    if (!a(localDocument, paramInt))
      return;
    this.e.setLength(0);
    Element localElement = localDocument.getDefaultRootElement().getElement(paramInt);
    int i1 = localElement.getStartOffset();
    int i2 = localElement.getEndOffset() - i1 - 1;
    String str = localDocument.getText(i1, i2);
    int i3 = b(str);
    if (i3 != i2)
      localDocument.remove(i1 + i3, i2 - i3);
    if (i3 == 0)
      return;
    int i4 = a(str);
    m localm;
    if ((str.trim().startsWith("case")) || (str.trim().startsWith("default")))
      localm = this.x;
    else
      localm = a(str.charAt(i4));
    localm.a(paramgx, localDocument, this.e, i1);
    ((AbstractDocument)localDocument).replace(i1, i4, this.e.toString(), null);
  }

  private static int a(String paramString)
  {
    for (int i1 = 0; i1 < paramString.length(); i1++)
    {
      int i2 = paramString.charAt(i1);
      if ((i2 != 32) && (i2 != 9))
        break;
    }
    return i1;
  }

  private static int b(String paramString)
  {
    for (int i1 = paramString.length() - 1; i1 >= 0; i1--)
    {
      int i2 = paramString.charAt(i1);
      if ((i2 != 32) && (i2 != 9))
        break;
    }
    return i1 + 1;
  }

  protected m a(char paramChar)
  {
    boolean bool = false;
    switch (paramChar)
    {
    case '{':
      return this.g;
    case '}':
      return this.h;
    case '>':
      if (!this.p)
        break;
      return this.i;
    case '"':
    case '\'':
    case '`':
      bool = this.o;
      break;
    case '(':
    case ')':
    case '[':
    case ']':
      bool = this.m;
      break;
    case 'e':
    case 't':
      return this.x;
    }
    if (bool)
      return this.j;
    return super.a(paramChar);
  }

  protected m a(bl parambl, Document paramDocument, int paramInt, char paramChar)
  {
    int i1 = kc.g(parambl.c());
    if (i1 == 134)
      return this.k;
    if (i1 == 133)
    {
      if (paramInt > 2)
        try
        {
          Element localElement1 = paramDocument.getDefaultRootElement();
          int i2 = localElement1.getElementIndex(paramInt);
          Element localElement2 = localElement1.getElement(i2);
          int i3 = localElement2.getStartOffset();
          String str = paramDocument.getText(i3, paramInt - i3);
          int i4 = str.indexOf("/**");
          if (i4 != -1)
          {
            bl localbl = (bl)a(paramDocument, i3 + i4);
            if (kc.g(localbl.c()) == 132)
              return this.k;
          }
        }
        catch (BadLocationException localBadLocationException)
        {
          cl.a(localBadLocationException);
        }
    }
    else if ((paramChar == '{') && ((i1 == 132) || (i1 == 129)))
      return this.g;
    return super.a(parambl, paramDocument, paramInt, paramChar);
  }

  protected m a()
  {
    return this.f;
  }

  private static boolean a(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    Element localElement = paramDocument.getDefaultRootElement().getElement(paramInt);
    bl localbl = (bl)a(paramDocument, localElement.getEndOffset());
    int i1 = kc.g(localbl.c());
    if ((i1 == 120) || (i1 == 124) || (i1 == 118) || (i1 == 114) || (i1 == 121) || (i1 == 125) || (i1 == 116) || (i1 == 123) || (i1 == 117))
      return false;
    Object localObject = a(paramDocument, localElement.getStartOffset());
    int i2 = kc.g(((bl)localObject).c());
    return (i2 == 132) || (i2 == 133) || (i2 == 129) || (i2 == 126);
  }

  private void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  private void b(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  private void c(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }

  private void d(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }

  private void e(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }

  static void b(k paramk, boolean paramBoolean)
  {
    paramk.a(paramBoolean);
  }

  static void c(k paramk, boolean paramBoolean)
  {
    paramk.b(paramBoolean);
  }

  static void d(k paramk, boolean paramBoolean)
  {
    paramk.c(paramBoolean);
  }

  static void e(k paramk, boolean paramBoolean)
  {
    paramk.d(paramBoolean);
  }

  static void a(k paramk, boolean paramBoolean)
  {
    paramk.e(paramBoolean);
  }

  static boolean b(k paramk)
  {
    return paramk.l;
  }

  static boolean c(k paramk)
  {
    return paramk.q;
  }

  static int c(String paramString)
  {
    return a(paramString);
  }

  static boolean a(k paramk)
  {
    return paramk.n;
  }

  static m b(k paramk)
  {
    return paramk.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.k
 * JD-Core Version:    0.6.0
 */