package com.zend.ide.n;

import com.zend.ide.j.h;
import com.zend.ide.n.b.g;
import com.zend.ide.n.td.bc;
import com.zend.ide.p.ba;
import com.zend.ide.util.bb;
import com.zend.ide.util.bh;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.cr;
import com.zend.ide.util.dj;
import com.zend.ide.util.s;
import com.zend.ide.v.p;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import com.zend.ide.y.i;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.InputStream;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.Keymap;

public class gz extends gx
  implements bw, bn, DocumentListener, Cloneable
{
  private bs k;
  private em l = (em)y();
  private String m = "textComponent";
  protected e n;
  protected PropertyChangeListener o = new dc(this, null);
  protected PropertyChangeListener q = new dd(this, null);
  protected PropertyChangeListener s = new dg(this, null);
  protected PropertyChangeListener t = new dh(this, null);
  protected PropertyChangeListener u = new di(this, null);
  private mb e;
  private cn r = null;
  private md w = null;
  private static final boolean p = cr.c() == 3;
  protected i v;
  private boolean x;
  private String z;
  private boolean A;
  private ej B;

  public gz()
  {
    em.a(this.l);
    this.k = new bt(this);
    InputMap localInputMap = getInputMap();
    localInputMap.put(KeyStroke.getKeyStroke(10, 1), "insert-break");
    localInputMap.put(KeyStroke.getKeyStroke(9, 1), "backspace-tab");
    localInputMap.put(KeyStroke.getKeyStroke(8, 2), "backspaceCtrlAction");
    Action localAction = getActionMap().get("default-typed");
    getKeymap().setDefaultAction(localAction);
    z();
    addDocumentListener(this);
    this.e = new mb(this);
  }

  private s y()
  {
    return new em(this, null);
  }

  protected void z()
  {
    this.v = new i(c());
    this.v.a("editor.functionHelpAction", "functionHelp", 0);
    f localf = new f();
    this.n = new e(localf);
    localf.a("editing.background", this.o);
    localf.a("editing.font", this.q);
    localf.a("editing.tabSize", this.s);
    localf.a("editing.lineWrap", this.t);
    localf.a("editing.wordWrap", this.u);
    this.n.a("editing.background");
    this.n.a("editing.font");
    this.n.a("editing.tabSize");
    this.n.a("editing.lineWrap");
    this.n.a("editing.wordWrap");
    a(new cy(this));
  }

  public bs t()
  {
    return this.k;
  }

  public dz[] c(String paramString)
  {
    if (paramString.equals(k()))
      return new dz[] { this };
    return null;
  }

  public dz a(String paramString)
  {
    return paramString.equals(k()) ? this : null;
  }

  public boolean c()
  {
    return this.x;
  }

  public void b(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }

  public void a(String paramString, Highlighter paramHighlighter, int paramInt)
  {
    if ((paramString == null) || (paramString.equals(k())))
      a(paramHighlighter, paramInt);
  }

  public void a(String paramString, Highlighter paramHighlighter)
  {
    if (paramString.equals(k()))
      a(paramHighlighter);
  }

  public boolean d(boolean paramBoolean)
  {
    if ((!paramBoolean) && (l()) && (((ho)getDocument()).f() < 2))
    {
      String str1 = k();
      String str2 = com.zend.ide.util.ct.a(248, str1);
      int i = ba.a(getTopLevelAncestor(), str2, com.zend.ide.util.ct.a(150), 1, 3);
      if ((i == -1) || (i == 2))
        return false;
      if ((i == 0) && (br.a(this) != 1))
        return false;
    }
    setDocument(null);
    this.n.b("editing.background");
    this.n.b("editing.font");
    this.n.b("editing.tabSize");
    this.n.b("editing.lineWrap");
    this.n.b("editing.wordWrap");
    return this.k.d(false);
  }

  public boolean l()
  {
    return ((ho)getDocument()).l();
  }

  public void c(boolean paramBoolean)
  {
    ((ho)getDocument()).c(paramBoolean);
  }

  public void b(String paramString)
  {
    ((ho)getDocument()).b(paramString);
  }

  public String k()
  {
    ho localho = (ho)getDocument();
    if (localho == null)
      return null;
    return localho.k();
  }

  public Object s()
  {
    p localp = new p();
    String str = k();
    localp.a(n());
    localp.a(str);
    localp.a(getCaretPosition());
    return localp;
  }

  public void c(Object paramObject)
  {
    p localp = (p)paramObject;
    File localFile = h.m.g(localp.e());
    boolean bool = localFile.exists();
    if (bool)
      bool = br.a(this, localp.e(), localp.b());
    if (!bool)
      throw new RuntimeException("error in loading file");
    SwingUtilities.invokeLater(new cz(this, localp));
    g localg = (g)getDocument().getProperty("undoTool");
    if (localg != null)
      localg.discardAllEdits();
  }

  public bb q()
  {
    return this.l;
  }

  public JComponent c()
  {
    return this;
  }

  public void d(String paramString)
  {
    this.m = paramString;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public String r()
  {
    return this.m;
  }

  public void a(bn parambn)
  {
    this.l.a(parambn.q());
  }

  public Object clone()
    throws CloneNotSupportedException
  {
    gz localgz = new gz();
    if (bc.b())
    {
      localgz.f = this.f;
      localgz.j = this.j;
    }
    localgz.setTabSize(getTabSize());
    localgz.setFont(getFont());
    localgz.a(w());
    localgz.setDocument(getDocument());
    return localgz;
  }

  public void a(bh parambh)
  {
    ho localho = (ho)getDocument();
    localho.a(parambh);
  }

  public bh n()
  {
    ho localho = (ho)getDocument();
    return localho.n();
  }

  protected cs u()
  {
    return new ct(this, null);
  }

  public cn A()
  {
    if (this.r == null)
      this.r = kc.d((ho)getDocument());
    return this.r;
  }

  public md a()
  {
    if (this.w == null)
      this.w = kc.a((ho)getDocument());
    return this.w;
  }

  public JTextComponent e()
  {
    return this;
  }

  public void a(cq paramcq)
  {
  }

  public void b(cq paramcq)
  {
  }

  protected void b(ho paramho)
  {
    super.b(paramho);
    if (paramho != null)
    {
      C().c(paramho);
      this.z = paramho.k();
      this.A = paramho.l();
    }
    else
    {
      this.z = null;
      this.A = false;
    }
  }

  protected void a(ho paramho)
  {
    super.a(paramho);
    String str = null;
    boolean bool = false;
    if (paramho != null)
    {
      C().b(paramho);
      str = paramho.k();
      bool = paramho.l();
    }
    if ((str != null) && ((this.z == null) || (!this.z.equals(str))))
      C().a(this.z, str);
    if (this.A != bool)
      C().a(k(), bool);
    if (paramho != null)
      C().changedUpdate(null);
  }

  private ej C()
  {
    if (this.B == null)
      this.B = new ej(this);
    return this.B;
  }

  public void addDocumentListener(DocumentListener paramDocumentListener)
  {
    C().a(paramDocumentListener);
  }

  public void removeDocumentListener(DocumentListener paramDocumentListener)
  {
    C().b(paramDocumentListener);
  }

  public void a(Object paramObject1, Object paramObject2)
  {
    putClientProperty(paramObject1, paramObject2);
  }

  public Object a(Object paramObject)
  {
    return getClientProperty(paramObject);
  }

  public void a(PropertyChangeListener paramPropertyChangeListener)
  {
    addPropertyChangeListener(paramPropertyChangeListener);
  }

  public void b(PropertyChangeListener paramPropertyChangeListener)
  {
    removePropertyChangeListener(paramPropertyChangeListener);
  }

  public void a(ea paramea)
  {
    C().a(paramea);
  }

  public void b(ea paramea)
  {
    C().b(paramea);
  }

  public boolean a(String paramString, bh parambh, int paramInt)
  {
    boolean bool = br.a(this, paramString, parambh, null);
    if ((bool) && (paramInt > -1))
      SwingUtilities.invokeLater(new da(this, paramInt));
    return bool;
  }

  public boolean a(String paramString, bh parambh, InputStream paramInputStream)
  {
    boolean bool = br.a(this, paramString, parambh, paramInputStream);
    if (bool)
      setCaretPosition(0);
    return bool;
  }

  public boolean a(dz paramdz, int paramInt)
  {
    int i = (paramdz != null) && ((paramdz == this) || (paramdz.equals(getDocument()))) ? 1 : 0;
    if (i != 0)
    {
      grabFocus();
      if (paramInt >= 0)
        SwingUtilities.invokeLater(new t(this, paramInt));
    }
    return i;
  }

  public dz f()
  {
    return (dz)getDocument();
  }

  public boolean g()
  {
    return (!l()) || (br.a(this) == 1);
  }

  public boolean h()
  {
    return l();
  }

  public dz[] i()
  {
    return new dz[] { this };
  }

  public int j()
  {
    return 1;
  }

  public int p()
  {
    return ((dz)getDocument()).p();
  }

  public boolean a(boolean paramBoolean)
  {
    return false;
  }

  public boolean a(String paramString, boolean paramBoolean)
  {
    if (k().equals(paramString))
      return a(paramBoolean);
    return false;
  }

  public boolean b(boolean paramBoolean)
  {
    return a(paramBoolean);
  }

  public boolean c(boolean paramBoolean)
  {
    return false;
  }

  public void setTabSize(int paramInt)
  {
    if (paramInt <= 0)
      throw new dj(com.zend.ide.util.ct.a(729));
    super.setTabSize(paramInt);
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    repaint();
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    repaint();
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    repaint();
  }

  public void a(String paramString, is paramis, int paramInt)
  {
  }

  public void a(String paramString, is paramis)
  {
  }

  public pb a()
  {
    return ((ho)getDocument()).a();
  }

  public ob a()
  {
    return mb.a(this.e);
  }

  static cn a(gz paramgz, cn paramcn)
  {
    return paramgz.r = paramcn;
  }

  static md a(gz paramgz, md parammd)
  {
    return paramgz.w = parammd;
  }

  static boolean b()
  {
    return p;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gz
 * JD-Core Version:    0.6.0
 */