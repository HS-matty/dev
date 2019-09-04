package com.zend.ide.n;

import com.zend.ide.util.bj;
import com.zend.ide.util.c.f;
import com.zend.ide.util.c.h;
import com.zend.ide.util.ca;
import com.zend.ide.util.cl;
import java.awt.Rectangle;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.JTextComponent;

class il extends DefaultHighlighter
  implements CaretListener, DocumentListener, ca
{
  private JTextComponent a;
  private int b;
  private boolean g;
  f c = h.c().b(new pd(this));
  f d = h.c().b(new qd(this));
  boolean e;
  final dr f;

  private il(dr paramdr)
  {
  }

  public void install(JTextComponent paramJTextComponent)
  {
    this.a = paramJTextComponent;
    super.install(paramJTextComponent);
    paramJTextComponent.addCaretListener(this);
    paramJTextComponent.getDocument().addDocumentListener(this);
    if ((paramJTextComponent instanceof bj))
      ((bj)paramJTextComponent).a(this);
  }

  public void deinstall(JTextComponent paramJTextComponent)
  {
    c();
    if ((paramJTextComponent instanceof bj))
      ((bj)paramJTextComponent).b(this);
    paramJTextComponent.removeCaretListener(this);
    paramJTextComponent.getDocument().removeDocumentListener(this);
    this.a = null;
    super.deinstall(paramJTextComponent);
  }

  public void caretUpdate(CaretEvent paramCaretEvent)
  {
    if (this.g)
      return;
    c();
    if (this.a.getSelectionStart() != this.a.getSelectionEnd())
      return;
    b();
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    if (this.g)
      return;
    int i = this.a.getCaretPosition();
    if (paramDocumentEvent.getOffset() > i)
      return;
    if (paramDocumentEvent.getOffset() + paramDocumentEvent.getLength() < i)
      return;
    c();
    b();
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
  }

  public void e()
  {
    this.g = true;
    c();
  }

  public void f()
  {
    this.g = false;
    b();
  }

  private void b()
  {
    if (((ho)this.a.getDocument()).m())
      return;
    if ((!dr.c(this.f)) && (!dr.d(this.f)))
      return;
    this.d.a(30L, 10000L);
  }

  private void c()
  {
    this.b = -1;
    this.e = false;
    this.d.d();
    this.d.f();
    if (this.d.j())
      this.c.g();
    g();
  }

  private void g()
  {
    if (this.a != null)
      removeAllHighlights();
    dr.e(this.f);
  }

  private void d()
  {
    this.e = true;
    Document localDocument = this.a.getDocument();
    int i = this.a.getCaretPosition();
    try
    {
      int j = fm.a(localDocument, i, false);
      if (!this.e)
        return;
      if (j != -1)
      {
        if (!this.e)
          return;
        if (j >= 0)
        {
          addHighlight(i - 1, i, dr.f(this.f));
          addHighlight(j, j + 1, dr.f(this.f));
          a(i, j);
        }
        else
        {
          addHighlight(i - 1, i, dr.g(this.f));
          if (j < -2)
          {
            j = fm.b(j);
            addHighlight(j, j + 1, dr.g(this.f));
          }
        }
      }
      if (!this.e)
        return;
      j = fm.a(localDocument, i, true);
      if (j != -1)
      {
        if (!this.e)
          return;
        if (j >= 0)
        {
          addHighlight(i, i + 1, dr.f(this.f));
          addHighlight(j, j + 1, dr.f(this.f));
        }
        else
        {
          addHighlight(i, i + 1, dr.g(this.f));
          if (j < -2)
          {
            j = fm.b(j);
            addHighlight(j, j + 1, dr.g(this.f));
          }
        }
      }
    }
    catch (Throwable localThrowable)
    {
      if (this.e)
        cl.a(localThrowable);
    }
  }

  public Object addHighlight(int paramInt1, int paramInt2, Highlighter.HighlightPainter paramHighlightPainter)
    throws BadLocationException
  {
    if (!this.e)
      return null;
    Object localObject = super.addHighlight(paramInt1, paramInt2, paramHighlightPainter);
    return localObject;
  }

  private void a(int paramInt1, int paramInt2)
    throws BadLocationException
  {
    if (!dr.h(this.f))
      return;
    if (!this.a.hasFocus())
      return;
    String str = this.a.getText(Math.min(paramInt1, paramInt2), Math.abs(paramInt1 - paramInt2));
    if (str.indexOf('\n') == -1)
      return;
    Rectangle localRectangle1 = this.a.getVisibleRect();
    Rectangle localRectangle2 = this.a.modelToView(paramInt2);
    if ((localRectangle2 != null) && ((localRectangle2.y > localRectangle1.y + localRectangle1.height) || (localRectangle2.y < localRectangle1.y)))
    {
      dr.a(this.f, this.a);
      dr.a(this.f, paramInt2);
      dr.i(this.f).a(500L, 1000L);
    }
  }

  il(dr paramdr, dx paramdx)
  {
    this(paramdr);
  }

  static void a(il paramil)
  {
    paramil.g();
  }

  static void b(il paramil)
  {
    paramil.d();
  }

  static void c(il paramil)
  {
    paramil.c();
  }

  static void d(il paramil)
  {
    paramil.b();
  }

  static int e(il paramil)
  {
    return paramil.b;
  }

  static int a(il paramil, int paramInt)
  {
    return paramil.b = paramInt;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.il
 * JD-Core Version:    0.6.0
 */