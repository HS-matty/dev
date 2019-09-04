package com.zend.ide.n;

import com.zend.ide.util.bb;
import com.zend.ide.util.bh;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;
import java.io.InputStream;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class dl
  implements bw
{
  private bw a;
  private ek b;

  protected void a(bw parambw)
  {
    this.a = parambw;
  }

  protected bw u()
  {
    return this.a;
  }

  public dz[] c(String paramString)
  {
    return this.a.c(paramString);
  }

  public dz a(String paramString)
  {
    return this.a.a(paramString);
  }

  public void a(String paramString, Highlighter paramHighlighter, int paramInt)
  {
    u().a(paramString, paramHighlighter, paramInt);
  }

  public bs t()
  {
    return this.a.t();
  }

  public void a(String paramString, Highlighter paramHighlighter)
  {
    u().a(paramString, paramHighlighter);
  }

  public int getLineStartOffset(int paramInt)
    throws BadLocationException
  {
    return u().getLineStartOffset(paramInt);
  }

  public int getLineOfOffset(int paramInt)
    throws BadLocationException
  {
    return u().getLineOfOffset(paramInt);
  }

  public void b(String paramString)
  {
    u().b(paramString);
  }

  public String k()
  {
    return u().k();
  }

  public boolean l()
  {
    return u().l();
  }

  public void c(boolean paramBoolean)
  {
    u().c(paramBoolean);
  }

  public void grabFocus()
  {
    u().grabFocus();
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    u().a(paramInt, paramBoolean);
  }

  public int d()
  {
    return u().d();
  }

  public int a()
  {
    return u().a();
  }

  public int b()
  {
    return u().b();
  }

  public void b(int paramInt)
  {
    u().b(paramInt);
  }

  public Document getDocument()
  {
    return u().getDocument();
  }

  public int getCaretPosition()
  {
    return u().getCaretPosition();
  }

  public JTextComponent e()
  {
    return u().e();
  }

  public String getText()
  {
    return u().getText();
  }

  public String getText(int paramInt1, int paramInt2)
    throws BadLocationException
  {
    return u().getText(paramInt1, paramInt2);
  }

  public void select(int paramInt1, int paramInt2)
  {
    u().select(paramInt1, paramInt2);
  }

  public String getSelectedText()
  {
    return u().getSelectedText();
  }

  public void a(int paramInt, String paramString, Object paramObject)
  {
    u().a(paramInt, paramString, paramObject);
  }

  public void a(int paramInt, String paramString)
  {
    u().a(paramInt, paramString);
  }

  public void a(el paramel)
  {
    u().a(paramel);
  }

  public void b(el paramel)
  {
    u().b(paramel);
  }

  public void setCaretPosition(int paramInt)
  {
    u().setCaretPosition(paramInt);
  }

  public void d(int paramInt)
  {
    u().d(paramInt);
  }

  public void a(cq paramcq)
  {
    w().a(paramcq);
  }

  public void b(cq paramcq)
  {
    w().b(paramcq);
  }

  public void a(bh parambh)
  {
    u().a(parambh);
  }

  public bh n()
  {
    return u().n();
  }

  public JComponent c()
  {
    return u().c();
  }

  protected ek v()
  {
    return new ek(this);
  }

  protected ek w()
  {
    if (this.b == null)
    {
      this.b = v();
      this.b.b(u());
    }
    return this.b;
  }

  public void a(Object paramObject1, Object paramObject2)
  {
    u().a(paramObject1, paramObject2);
  }

  public Object a(Object paramObject)
  {
    return u().a(paramObject);
  }

  public void a(PropertyChangeListener paramPropertyChangeListener)
  {
    w().a(paramPropertyChangeListener);
  }

  public void b(PropertyChangeListener paramPropertyChangeListener)
  {
    w().b(paramPropertyChangeListener);
  }

  public void addDocumentListener(DocumentListener paramDocumentListener)
  {
    w().a(paramDocumentListener);
  }

  public void removeDocumentListener(DocumentListener paramDocumentListener)
  {
    w().b(paramDocumentListener);
  }

  public void a(ea paramea)
  {
    w().a(paramea);
  }

  public void b(ea paramea)
  {
    w().b(paramea);
  }

  public void addCaretListener(CaretListener paramCaretListener)
  {
    w().a(paramCaretListener);
  }

  public void removeCaretListener(CaretListener paramCaretListener)
  {
    w().b(paramCaretListener);
  }

  public void addMouseListener(MouseListener paramMouseListener)
  {
    w().a(paramMouseListener);
  }

  public void removeMouseListener(MouseListener paramMouseListener)
  {
    w().b(paramMouseListener);
  }

  public void addKeyListener(KeyListener paramKeyListener)
  {
    w().a(paramKeyListener);
  }

  public void removeKeyListener(KeyListener paramKeyListener)
  {
    w().b(paramKeyListener);
  }

  public boolean d(boolean paramBoolean)
  {
    return u().d(paramBoolean);
  }

  public bb q()
  {
    return u().q();
  }

  public void d(String paramString)
  {
    u().d(paramString);
  }

  public String a(int paramInt1, int paramInt2)
  {
    return u().a(paramInt1, paramInt2);
  }

  public String r()
  {
    return u().r();
  }

  public void a(bn parambn)
  {
    u().a(parambn);
  }

  public Object s()
  {
    return u().s();
  }

  public void c(Object paramObject)
  {
    u().c(paramObject);
  }

  public boolean a(String paramString, bh parambh, int paramInt)
  {
    return u().a(paramString, parambh, paramInt);
  }

  public boolean a(String paramString, bh parambh, InputStream paramInputStream)
  {
    return u().a(paramString, parambh, paramInputStream);
  }

  public boolean a(dz paramdz, int paramInt)
  {
    if (paramdz == this)
    {
      grabFocus();
      if (paramInt >= 0)
        SwingUtilities.invokeLater(new dn(this, paramInt));
      return true;
    }
    return u().a(paramdz, paramInt);
  }

  public dz f()
  {
    return u().f();
  }

  public boolean a(boolean paramBoolean)
  {
    return u().a(paramBoolean);
  }

  public boolean a(String paramString, boolean paramBoolean)
  {
    return u().a(paramString, paramBoolean);
  }

  public boolean b(boolean paramBoolean)
  {
    return u().b(paramBoolean);
  }

  public boolean c(boolean paramBoolean)
  {
    return u().c(paramBoolean);
  }

  public boolean g()
  {
    return u().g();
  }

  public boolean h()
  {
    return u().h();
  }

  public dz[] i()
  {
    return u().i();
  }

  public int j()
  {
    return u().j();
  }

  public int p()
  {
    return u().p();
  }

  public void a(String paramString, is paramis, int paramInt)
  {
    u().a(paramString, paramis, paramInt);
  }

  public void a(String paramString, is paramis)
  {
    u().a(paramString, paramis);
  }

  public void repaint()
  {
    u().repaint();
  }

  public pb a()
  {
    return u().a();
  }

  public boolean c()
  {
    return u().c();
  }

  public void b(boolean paramBoolean)
  {
    u().b(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dl
 * JD-Core Version:    0.6.0
 */