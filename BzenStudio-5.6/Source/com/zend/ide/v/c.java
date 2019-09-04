package com.zend.ide.v;

import com.zend.ide.n.br;
import com.zend.ide.n.bw;
import com.zend.ide.n.cq;
import com.zend.ide.n.dz;
import com.zend.ide.n.ea;
import com.zend.ide.n.ek;
import com.zend.ide.n.el;
import com.zend.ide.n.is;
import com.zend.ide.n.pb;
import com.zend.ide.util.bb;
import com.zend.ide.util.bh;
import com.zend.ide.util.bn;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public abstract class c
  implements bw
{
  private ek a;
  private boolean b = false;
  private y c = new y(this, null);
  private bw d = null;
  private bc e;
  private ab f;
  private boolean g;

  public c()
  {
    a(this.c);
  }

  protected bw u()
  {
    return this.d;
  }

  protected void a(bw parambw)
  {
    if (this.d == parambw)
      return;
    this.d = parambw;
  }

  protected abstract bw[] v();

  protected ek w()
  {
    return new ek(this);
  }

  protected ek x()
  {
    if (this.a == null)
      this.a = w();
    return this.a;
  }

  public dz[] c(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    bw[] arrayOfbw = v();
    for (int i = 0; i < arrayOfbw.length; i++)
    {
      dz[] arrayOfdz2 = arrayOfbw[i].c(paramString);
      if (arrayOfdz2 == null)
        continue;
      for (int j = 0; j < arrayOfdz2.length; j++)
        localArrayList.add(arrayOfdz2[j]);
    }
    if (localArrayList.isEmpty())
      return null;
    dz[] arrayOfdz1 = new dz[localArrayList.size()];
    localArrayList.toArray(arrayOfdz1);
    return arrayOfdz1;
  }

  public dz a(String paramString)
  {
    bw[] arrayOfbw = v();
    for (int i = 0; i < arrayOfbw.length; i++)
    {
      dz localdz = arrayOfbw[i].a(paramString);
      if (localdz != null)
        return localdz;
    }
    return null;
  }

  public Document getDocument()
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.getDocument();
    return null;
  }

  public String getText()
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.getText();
    return null;
  }

  public String getText(int paramInt1, int paramInt2)
    throws BadLocationException
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.getText(paramInt1, paramInt2);
    return null;
  }

  public void b(String paramString)
  {
    bw localbw = u();
    if (localbw != null)
      localbw.b(paramString);
  }

  public String k()
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.k();
    return null;
  }

  public boolean l()
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.l();
    return false;
  }

  public void c(boolean paramBoolean)
  {
    bw localbw = u();
    if (localbw != null)
      localbw.c(paramBoolean);
  }

  public void a(bh parambh)
  {
    bw localbw = u();
    if (localbw != null)
      localbw.a(parambh);
  }

  public bh n()
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.n();
    return null;
  }

  public int getLineStartOffset(int paramInt)
    throws BadLocationException
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.getLineStartOffset(paramInt);
    return -1;
  }

  public int getLineOfOffset(int paramInt)
    throws BadLocationException
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.getLineOfOffset(paramInt);
    return -1;
  }

  public int p()
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.p();
    return -1;
  }

  public void a(int paramInt, String paramString, Object paramObject)
  {
    bw localbw = u();
    if (localbw != null)
      localbw.a(paramInt, paramString, paramObject);
  }

  public void a(int paramInt, String paramString)
  {
    bw localbw = u();
    if (localbw != null)
      localbw.a(paramInt, paramString);
  }

  public void addDocumentListener(DocumentListener paramDocumentListener)
  {
    x().a(paramDocumentListener);
  }

  public void removeDocumentListener(DocumentListener paramDocumentListener)
  {
    x().b(paramDocumentListener);
  }

  public void a(ea paramea)
  {
    x().a(paramea);
  }

  public void b(ea paramea)
  {
    x().b(paramea);
  }

  public void a(String paramString, Highlighter paramHighlighter, int paramInt)
  {
    bw[] arrayOfbw = v();
    for (int i = 0; i < arrayOfbw.length; i++)
      arrayOfbw[i].a(paramString, paramHighlighter, paramInt);
  }

  public void a(String paramString, Highlighter paramHighlighter)
  {
    bw[] arrayOfbw = v();
    for (int i = 0; i < arrayOfbw.length; i++)
      arrayOfbw[i].a(paramString, paramHighlighter);
  }

  public void grabFocus()
  {
    bw localbw = u();
    if (localbw != null)
      localbw.grabFocus();
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    bw localbw = u();
    if (localbw != null)
      localbw.a(paramInt, true);
  }

  public int d()
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.d();
    return -1;
  }

  public int a()
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.a();
    return -1;
  }

  public int b()
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.b();
    return -1;
  }

  public void b(int paramInt)
  {
    bw localbw = u();
    if (localbw != null)
      localbw.b(paramInt);
  }

  public int getCaretPosition()
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.getCaretPosition();
    return -1;
  }

  public void setCaretPosition(int paramInt)
  {
    bw localbw = u();
    if (localbw != null)
      localbw.setCaretPosition(paramInt);
  }

  public void d(int paramInt)
  {
    bw localbw = u();
    if (localbw != null)
      localbw.d(paramInt);
  }

  public JTextComponent e()
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.e();
    return null;
  }

  public void select(int paramInt1, int paramInt2)
  {
    bw localbw = u();
    if (localbw != null)
      localbw.select(paramInt1, paramInt2);
  }

  public String getSelectedText()
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.getSelectedText();
    return null;
  }

  public void a(el paramel)
  {
    x().a(paramel);
  }

  public void b(el paramel)
  {
    x().b(paramel);
  }

  public void addKeyListener(KeyListener paramKeyListener)
  {
    x().a(paramKeyListener);
  }

  public void removeKeyListener(KeyListener paramKeyListener)
  {
    x().b(paramKeyListener);
  }

  public void a(cq paramcq)
  {
    x().a(paramcq);
  }

  public void b(cq paramcq)
  {
    x().b(paramcq);
  }

  public void addCaretListener(CaretListener paramCaretListener)
  {
    x().a(paramCaretListener);
  }

  public void removeCaretListener(CaretListener paramCaretListener)
  {
    x().b(paramCaretListener);
  }

  public void addMouseListener(MouseListener paramMouseListener)
  {
    x().a(paramMouseListener);
  }

  public void removeMouseListener(MouseListener paramMouseListener)
  {
    x().b(paramMouseListener);
  }

  protected boolean a(String paramString, int paramInt)
  {
    String str1 = k();
    paramString = br.c(paramString);
    if ((str1 != null) && (str1.equals(paramString)))
    {
      if (paramInt >= 0)
        d(paramInt);
      return true;
    }
    bw[] arrayOfbw = v();
    if (arrayOfbw != null)
      for (int i = 0; i < arrayOfbw.length; i++)
      {
        String str2 = arrayOfbw[i].k();
        if ((str2 == null) || (!str2.equals(paramString)))
          continue;
        if (paramInt >= 0)
          arrayOfbw[i].setCaretPosition(paramInt);
        a(arrayOfbw[i]);
        return true;
      }
    dz localdz = a(paramString);
    if (localdz != null)
      return a(localdz, paramInt);
    return false;
  }

  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public boolean c()
  {
    return this.g;
  }

  public abstract boolean a(String paramString, bh parambh, int paramInt);

  public abstract boolean a(String paramString, bh parambh, InputStream paramInputStream);

  public boolean a(dz paramdz, int paramInt)
  {
    bw[] arrayOfbw = v();
    for (int i = 0; i < arrayOfbw.length; i++)
    {
      if (!arrayOfbw[i].a(paramdz, paramInt))
        continue;
      arrayOfbw[i].grabFocus();
      return true;
    }
    return false;
  }

  public boolean a(boolean paramBoolean)
  {
    bw localbw = u();
    if (localbw != null)
      return localbw.a(paramBoolean);
    return true;
  }

  public abstract boolean a(String paramString, boolean paramBoolean);

  public abstract boolean b(boolean paramBoolean);

  public abstract boolean c(boolean paramBoolean);

  public abstract dz f();

  public boolean g()
  {
    boolean bool = true;
    bw[] arrayOfbw = v();
    for (int i = 0; (i < arrayOfbw.length) && (bool); i++)
      bool = arrayOfbw[i].g();
    return bool;
  }

  private void e(boolean paramBoolean)
  {
    if (h() == paramBoolean)
      return;
    this.b = paramBoolean;
    x().b(this.b);
  }

  public boolean h()
  {
    return this.b;
  }

  public dz[] i()
  {
    bw[] arrayOfbw = v();
    Hashtable localHashtable = new Hashtable();
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < arrayOfbw.length; i++)
    {
      dz[] arrayOfdz2 = arrayOfbw[i].i();
      for (int j = 0; j < arrayOfdz2.length; j++)
      {
        String str = arrayOfdz2[j].k();
        if (localHashtable.containsKey(str))
          continue;
        localHashtable.put(str, arrayOfdz2[j]);
        localArrayList.add(arrayOfdz2[j]);
      }
    }
    dz[] arrayOfdz1 = new dz[localArrayList.size()];
    localArrayList.toArray(arrayOfdz1);
    return arrayOfdz1;
  }

  public int j()
  {
    int i = 0;
    bw[] arrayOfbw = v();
    for (int j = 0; j < arrayOfbw.length; j++)
      i += arrayOfbw[j].j();
    return i;
  }

  public abstract bb q();

  public abstract void a(bn parambn);

  public String r()
  {
    return u().r();
  }

  public String a(int paramInt1, int paramInt2)
  {
    return u().a(paramInt1, paramInt2);
  }

  public abstract JComponent c();

  public abstract Object s();

  public abstract void c(Object paramObject);

  public abstract void d(String paramString);

  public boolean d(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      bw[] arrayOfbw = v();
      for (int i = 0; i < arrayOfbw.length; i++)
        arrayOfbw[i].d(true);
      return true;
    }
    if (this.e == null)
      this.e = new bc((JFrame)c().getTopLevelAncestor());
    return this.e.b(i());
  }

  public void a(Object paramObject1, Object paramObject2)
  {
  }

  public Object a(Object paramObject)
  {
    return null;
  }

  public void a(PropertyChangeListener paramPropertyChangeListener)
  {
  }

  public void b(PropertyChangeListener paramPropertyChangeListener)
  {
  }

  public void a(String paramString, is paramis, int paramInt)
  {
    bw[] arrayOfbw = v();
    for (int i = 0; i < arrayOfbw.length; i++)
      arrayOfbw[i].a(paramString, paramis, paramInt);
  }

  public void a(String paramString, is paramis)
  {
    bw[] arrayOfbw = v();
    for (int i = 0; i < arrayOfbw.length; i++)
      arrayOfbw[i].a(paramString, paramis);
  }

  public void repaint()
  {
    c().repaint();
  }

  public pb a()
  {
    if (this.f == null)
      this.f = new ab(this);
    return this.f;
  }

  static void a(c paramc, boolean paramBoolean)
  {
    paramc.e(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.c
 * JD-Core Version:    0.6.0
 */