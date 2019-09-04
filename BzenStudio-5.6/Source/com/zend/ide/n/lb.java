package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import java.util.Vector;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class lb extends db
{
  protected wc b = new wc();
  protected PropertyChangeListener c = new de(this, null);
  protected PropertyChangeListener d = new ae(this, null);
  protected e e;
  private boolean f = true;
  private boolean g = true;
  private static yf h = new ag(null);
  private static yf i = new zf(null);
  private static Vector j;

  public lb()
  {
    f localf = new f();
    this.e = new e(localf);
    localf.a("editing.bracketPairInsertion", this.d);
    localf.a("editing.quotePairInsertion", this.c);
    this.e.a("editing.bracketPairInsertion");
    this.e.a("editing.quotePairInsertion");
    j = new Vector();
    j.add(h);
    j.add(i);
  }

  protected md a(char paramChar)
  {
    boolean bool = false;
    switch (paramChar)
    {
    case '"':
    case '\'':
    case '`':
      bool = this.g;
      break;
    case '(':
    case '[':
      bool = this.f;
    }
    if (bool)
      return this.b;
    return super.a(paramChar);
  }

  private static boolean a(gx paramgx, int paramInt, char paramChar)
  {
    for (int m = 0; m < j.size(); m++)
    {
      int k = ((yf)j.get(m)).a(paramgx.getDocument(), paramInt, paramChar);
      if (k == 0)
        return true;
      if (k == 1)
        return false;
    }
    return false;
  }

  private static boolean a(Document paramDocument, bl parambl, int paramInt)
    throws BadLocationException
  {
    int k = kc.g(parambl.c());
    if ((k != 135) && (k != 138) && (k != 137))
      return false;
    int m = paramDocument.getText(paramInt + 1, 1).charAt(0);
    return m == 36;
  }

  private static bl a(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    return (bl)((ho)paramDocument).b(paramInt);
  }

  private static char a(char paramChar)
  {
    switch (paramChar)
    {
    case '(':
      return ')';
    case '[':
      return ']';
    case '"':
    case '\'':
    case '`':
      return paramChar;
    }
    return '-';
  }

  private void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  private void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  static char b(char paramChar)
  {
    return a(paramChar);
  }

  static bl b(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    return a(paramDocument, paramInt);
  }

  static boolean b(gx paramgx, int paramInt, char paramChar)
  {
    return a(paramgx, paramInt, paramChar);
  }

  static boolean b(Document paramDocument, bl parambl, int paramInt)
    throws BadLocationException
  {
    return a(paramDocument, parambl, paramInt);
  }

  static void a(lb paramlb, boolean paramBoolean)
  {
    paramlb.a(paramBoolean);
  }

  static void b(lb paramlb, boolean paramBoolean)
  {
    paramlb.b(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.lb
 * JD-Core Version:    0.6.0
 */