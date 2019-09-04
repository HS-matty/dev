package com.zend.ide.n;

import com.zend.ide.util.bh;
import com.zend.ide.util.bn;
import com.zend.ide.util.cu;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;
import java.io.InputStream;
import javax.swing.event.CaretListener;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public abstract interface bw extends dz, cu, bn
{
  public abstract void a(String paramString, Highlighter paramHighlighter, int paramInt);

  public abstract void a(String paramString, Highlighter paramHighlighter);

  public abstract void grabFocus();

  public abstract void a(int paramInt, boolean paramBoolean);

  public abstract int d();

  public abstract int a();

  public abstract int b();

  public abstract void b(int paramInt);

  public abstract int getCaretPosition();

  public abstract JTextComponent e();

  public abstract void select(int paramInt1, int paramInt2);

  public abstract String getSelectedText();

  public abstract void a(el paramel);

  public abstract void b(el paramel);

  public abstract void d(int paramInt);

  public abstract void setCaretPosition(int paramInt);

  public abstract void a(cq paramcq);

  public abstract void b(cq paramcq);

  public abstract void addCaretListener(CaretListener paramCaretListener);

  public abstract void removeCaretListener(CaretListener paramCaretListener);

  public abstract void addMouseListener(MouseListener paramMouseListener);

  public abstract void removeMouseListener(MouseListener paramMouseListener);

  public abstract void addKeyListener(KeyListener paramKeyListener);

  public abstract void removeKeyListener(KeyListener paramKeyListener);

  public abstract void a(Object paramObject1, Object paramObject2);

  public abstract Object a(Object paramObject);

  public abstract void a(PropertyChangeListener paramPropertyChangeListener);

  public abstract void b(PropertyChangeListener paramPropertyChangeListener);

  public abstract boolean a(String paramString, bh parambh, int paramInt);

  public abstract boolean a(String paramString, bh parambh, InputStream paramInputStream);

  public abstract boolean a(dz paramdz, int paramInt);

  public abstract boolean a(boolean paramBoolean);

  public abstract boolean a(String paramString, boolean paramBoolean);

  public abstract boolean b(boolean paramBoolean);

  public abstract boolean c(boolean paramBoolean);

  public abstract dz f();

  public abstract boolean g();

  public abstract boolean h();

  public abstract dz[] i();

  public abstract int j();

  public abstract void a(String paramString, is paramis, int paramInt);

  public abstract void a(String paramString, is paramis);

  public abstract dz[] c(String paramString);

  public abstract dz a(String paramString);

  public abstract void repaint();

  public abstract void b(boolean paramBoolean);

  public abstract boolean c();
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bw
 * JD-Core Version:    0.6.0
 */