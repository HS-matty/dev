package com.zend.ide.n;

import com.zend.ide.n.td.a.s;
import com.zend.ide.n.td.c;
import com.zend.ide.n.td.e;
import com.zend.ide.n.td.ec;
import com.zend.ide.n.td.f;
import com.zend.ide.n.td.g;
import com.zend.ide.n.td.gb;
import com.zend.ide.n.td.h;
import com.zend.ide.n.td.hb;
import com.zend.ide.n.td.ib;
import com.zend.ide.n.td.ic;
import com.zend.ide.n.td.jb;
import com.zend.ide.n.td.kb;
import com.zend.ide.n.td.mb;
import com.zend.ide.s.cx;
import com.zend.ide.util.bj;
import com.zend.ide.util.bz;
import com.zend.ide.util.ca;
import com.zend.ide.util.cl;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.JToolTip;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.plaf.TextUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

public class gx extends JTextArea
  implements hn, bj, hb, Cloneable
{
  private static String a = com.zend.ide.n.td.bc.b() ? "SyntaxHighlightingFoldableUI" : "SyntaxHighlightingUI";
  private xb b = new xb();
  protected boolean e;
  private ArrayList g;
  private hl c;
  private bz d = new bz();
  private cs h;
  private gq i;
  protected jb f;
  protected ib j;
  private MouseListener k;
  private MouseMotionListener l;
  private ye m;
  private hi n;
  private boolean o = com.zend.ide.n.td.bc.b();
  private boolean p;

  public gx()
  {
    setFont(new Font("Courier", 0, 12));
    setDragEnabled(true);
    this.c = new bc();
    a(this.i);
    setHighlighter(new hi());
    if (this.o)
    {
      this.n = new hi();
      a(this.n, 0);
      this.f = new kb();
      this.j = new ib(this.n);
      this.f.a(this.j);
      this.m = new ye(this);
      this.f.a(this.m);
      this.k = new ud(this, null);
      addMouseListener(this.k);
      this.l = new se(this, null);
      addMouseMotionListener(this.l);
      b();
    }
    this.e = true;
  }

  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
    TextUI localTextUI = getUI();
    if ((localTextUI instanceof ha))
      ((ha)localTextUI).a(paramBoolean);
  }

  public boolean a()
  {
    return this.e;
  }

  public void d(int paramInt)
  {
    b(paramInt, true);
  }

  public void b(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      a(paramInt);
      setCaretPosition(paramInt);
    }
    else
    {
      c(paramInt, false);
    }
    SwingUtilities.invokeLater(new we(this, paramInt));
  }

  public void setCaretPosition(int paramInt)
  {
    c(paramInt, !this.p);
  }

  public void c(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
      a(paramInt);
    Document localDocument = getDocument();
    if (localDocument != null)
    {
      if (paramInt < 0)
        paramInt = 0;
      else if (paramInt > localDocument.getLength())
        paramInt = localDocument.getLength();
      super.setCaretPosition(paramInt);
      requestFocus();
    }
  }

  public int a(int paramInt)
  {
    if ((this.f == null) || (paramInt == 0))
      return paramInt;
    List localList = this.f.b(paramInt);
    if (localList == null)
      localList = this.f.b(paramInt - 1);
    if (localList != null)
    {
      Object localObject = null;
      for (int i1 = 0; i1 < localList.size(); i1++)
      {
        gb localgb2 = (gb)localList.get(i1);
        if (!localgb2.c())
          continue;
        if (localObject == null)
          localObject = localgb2;
        this.f.b(localgb2);
      }
      if (localObject == null)
        return paramInt;
      gb localgb1 = (gb)localList.get(localList.size() - 1);
      int i2 = localgb1.d();
      int i3 = localgb1.e() + 1;
      if (paramInt - i2 > i3 - paramInt)
        paramInt = i3;
      else
        paramInt = i2;
      repaint();
      firePropertyChange("foldChanged", null, localObject);
    }
    return paramInt;
  }

  public void a(hl paramhl)
  {
    this.c.b(this);
    this.c = paramhl;
    this.c.a(this);
    repaint();
  }

  public hl w()
  {
    return this.c;
  }

  public void o()
  {
    repaint();
  }

  protected Document createDefaultModel()
  {
    return new ho();
  }

  protected cs u()
  {
    return new cs();
  }

  private cs v()
  {
    if (this.h == null)
      this.h = u();
    return this.h;
  }

  public void setDocument(Document paramDocument)
  {
    ho localho = (ho)getDocument();
    if (paramDocument == localho)
      return;
    b(localho);
    if (paramDocument != null)
      super.setDocument(paramDocument);
    a((ho)paramDocument);
  }

  protected void a(ho paramho)
  {
    if (paramho != null)
      paramho.addDocumentListener(v());
    if (this.f != null)
      b();
  }

  protected void b(ho paramho)
  {
    if (paramho != null)
      paramho.removeDocumentListener(v());
    if (this.f != null)
      c();
  }

  protected void b()
  {
    Document localDocument = getDocument();
    Object localObject = new h(this.f, (ho)localDocument);
    this.f.a((mb)localObject);
    localObject = new e(this.f, (ho)localDocument);
    this.f.a((mb)localObject);
    localObject = new g(this.f, (ho)localDocument);
    this.f.a((mb)localObject);
    localObject = new f(this.f, (ho)localDocument);
    this.f.a((mb)localObject);
  }

  protected void c()
  {
    mb[] arrayOfmb = this.f.e();
    for (int i1 = 0; i1 < arrayOfmb.length; i1++)
      this.f.b(arrayOfmb[i1]);
  }

  public void d(boolean paramBoolean)
  {
    if (paramBoolean)
      d();
    else
      e();
  }

  private void d()
  {
    if (this.o)
      return;
    this.f = new kb();
    this.o = true;
    a = "SyntaxHighlightingFoldableUI";
    UIManager.getDefaults().put(a, ic.class.getName());
    setUI(UIManager.getUI(this));
    ((s)getUI().getRootView(this).getView(0)).a(this.f);
    this.n = new hi();
    a(this.n, 0);
    this.j = new ib(this.n);
    this.f.a(this.j);
    this.m = new ye(this);
    this.f.a(this.m);
    this.k = new ud(this, null);
    addMouseListener(this.k);
    this.l = new se(this, null);
    addMouseMotionListener(this.l);
    b();
  }

  private void e()
  {
    if (!this.o)
      return;
    this.o = false;
    a = "SyntaxHighlightingUI";
    UIManager.getDefaults().put(a, cx.class.getName());
    setUI(UIManager.getUI(this));
    c();
    this.f = null;
    this.j = null;
    this.m = null;
    this.n.removeAllHighlights();
    a(this.n);
    removeMouseListener(this.k);
    removeMouseMotionListener(this.l);
    this.k = null;
    this.l = null;
    this.n = null;
  }

  public void a(Highlighter paramHighlighter, int paramInt)
  {
    Highlighter localHighlighter = getHighlighter();
    if ((localHighlighter instanceof hi))
      ((hi)localHighlighter).a(paramHighlighter, paramInt);
  }

  public void a(Highlighter paramHighlighter)
  {
    Highlighter localHighlighter = getHighlighter();
    if ((localHighlighter instanceof hi))
      ((hi)localHighlighter).a(paramHighlighter);
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    int i1 = 0;
    if (paramInt > 0)
    {
      Document localDocument = getDocument();
      Element localElement1 = localDocument.getDefaultRootElement();
      Element localElement2 = localElement1.getElement(paramInt);
      if (localElement2 == null)
        i1 = localElement1.getEndOffset() - 1;
      else
        i1 = localElement2.getStartOffset();
    }
    if (paramBoolean)
      d(i1);
    else
      setCaretPosition(i1);
  }

  public int d()
  {
    int i1 = getCaretPosition();
    Document localDocument = getDocument();
    Element localElement = localDocument.getDefaultRootElement();
    return localElement.getElementIndex(i1);
  }

  public int a()
  {
    int i1 = -1;
    if (this.o)
    {
      int i2 = getCaretPosition();
      try
      {
        Rectangle localRectangle = modelToView(i2);
        i2 = viewToModel(new Point(0, localRectangle.y));
        Document localDocument = getDocument();
        Element localElement = localDocument.getDefaultRootElement();
        i1 = localElement.getElementIndex(i2);
      }
      catch (BadLocationException localBadLocationException)
      {
        cl.a(localBadLocationException);
      }
    }
    else
    {
      i1 = d();
    }
    return i1;
  }

  public void b(int paramInt)
  {
    Document localDocument = getDocument();
    int i1 = ((Integer)localDocument.getProperty("tabSize")).intValue();
    int i2 = getCaretPosition();
    Element localElement = localDocument.getDefaultRootElement();
    localElement = localElement.getElement(localElement.getElementIndex(i2));
    int i3 = localElement.getStartOffset();
    int i4 = i3;
    try
    {
      int i5 = 0;
      int i6 = 0;
      String str;
      while ((paramInt > 1) && (!(str = getText(i3 + i6, 1)).equalsIgnoreCase("\n")))
      {
        i4++;
        i6++;
        if (str.equalsIgnoreCase("\t"))
        {
          paramInt -= i1 - i5;
          i5 = 0;
          continue;
        }
        paramInt--;
        i5++;
      }
    }
    catch (Exception localException)
    {
    }
    setCaretPosition(i4);
    requestFocus();
  }

  public int b()
  {
    Document localDocument = getDocument();
    int i1 = ((Integer)localDocument.getProperty("tabSize")).intValue();
    int i2 = getCaretPosition();
    Element localElement = localDocument.getDefaultRootElement();
    localElement = localElement.getElement(localElement.getElementIndex(i2));
    int i3 = localElement.getStartOffset();
    int i4 = 0;
    int i5 = 0;
    try
    {
      String str = getText(i3, i2 - i3);
      char[] arrayOfChar = new char[str.length()];
      str.getChars(0, arrayOfChar.length, arrayOfChar, 0);
      for (int i6 = 0; i6 < i2 - i3; i6++)
        if (arrayOfChar[i6] == '\t')
        {
          i4 += i1 - i5;
          i5 = 0;
        }
        else
        {
          i4++;
          i5++;
          if (i5 != i1)
            continue;
          i5 = 0;
        }
      return i4;
    }
    catch (Exception localException)
    {
    }
    return -1;
  }

  public void a(el paramel)
  {
    this.b.a(paramel);
    ToolTipManager.sharedInstance().registerComponent(this);
  }

  public void b(el paramel)
  {
    this.b.b(paramel);
  }

  public JToolTip createToolTip()
  {
    ng localng = new ng(this);
    localng.setComponent(this);
    return localng;
  }

  public String getToolTipText(MouseEvent paramMouseEvent)
  {
    return this.b.a(paramMouseEvent);
  }

  public String getUIClassID()
  {
    return a;
  }

  public void a(int paramInt, String paramString, Object paramObject)
  {
    ho localho = (ho)getDocument();
    localho.a(paramInt, paramString, paramObject);
  }

  public void a(int paramInt, String paramString)
  {
    ho localho = (ho)getDocument();
    localho.a(paramInt, paramString);
  }

  public void setCaret(Caret paramCaret)
  {
    if (this.i == null)
      this.i = new gq(this, this);
    if (getCaret() != null)
      getCaret().removeChangeListener(this.i);
    super.setCaret(paramCaret);
    if (paramCaret != null)
      paramCaret.addChangeListener(this.i);
  }

  public void a(CaretListener paramCaretListener)
  {
    if (this.g == null)
      this.g = new ArrayList(2);
    this.g.add(paramCaretListener);
  }

  public void b(CaretListener paramCaretListener)
  {
    if (this.g != null)
      this.g.remove(paramCaretListener);
  }

  private void a(CaretEvent paramCaretEvent)
  {
    if (this.g != null)
      synchronized (this.g)
      {
        int i1 = this.g.size();
        for (int i2 = 0; i2 < i1; i2++)
        {
          CaretListener localCaretListener = (CaretListener)this.g.get(i2);
          localCaretListener.caretUpdate(paramCaretEvent);
        }
      }
  }

  public jb a()
  {
    return this.f;
  }

  public void a(jb paramjb)
  {
    if (this.f != null)
    {
      c();
      this.f.b(this.m);
      this.f.b(this.j);
    }
    this.f = paramjb;
    if (this.f != null)
    {
      this.f.a(this.m);
      this.f.a(this.j);
      b();
      s locals = (s)getUI().getRootView(this).getView(0);
      locals.a(this.f);
      locals.g();
      Iterator localIterator = paramjb.b();
      ArrayList localArrayList = new ArrayList();
      while (localIterator.hasNext())
        localArrayList.add(localIterator.next());
      ec localec = new ec(this.f, localArrayList, c.COLLAPSE);
      this.j.f(localec);
    }
  }

  public JTextComponent f()
  {
    return this;
  }

  public Object clone()
    throws CloneNotSupportedException
  {
    gx localgx = new gx();
    if (this.o)
    {
      localgx.f = this.f;
      localgx.j = this.j;
    }
    localgx.setTabSize(getTabSize());
    localgx.setFont(getFont());
    localgx.a(w());
    localgx.setDocument(getDocument());
    return localgx;
  }

  public void B()
  {
    this.d.B();
  }

  public void D()
  {
    this.d.D();
  }

  public boolean E()
  {
    return this.d.b();
  }

  public void a(ca paramca)
  {
    this.d.a(paramca);
  }

  public void b(ca paramca)
  {
    this.d.b(paramca);
  }

  static void a(gx paramgx, CaretEvent paramCaretEvent)
  {
    paramgx.a(paramCaretEvent);
  }

  static boolean a(gx paramgx, boolean paramBoolean)
  {
    return paramgx.p = paramBoolean;
  }

  static void a(gx paramgx, String paramString, Object paramObject1, Object paramObject2)
  {
    paramgx.firePropertyChange(paramString, paramObject1, paramObject2);
  }

  static void b(gx paramgx, String paramString, Object paramObject1, Object paramObject2)
  {
    paramgx.firePropertyChange(paramString, paramObject1, paramObject2);
  }

  static void c(gx paramgx, String paramString, Object paramObject1, Object paramObject2)
  {
    paramgx.firePropertyChange(paramString, paramObject1, paramObject2);
  }

  static void d(gx paramgx, String paramString, Object paramObject1, Object paramObject2)
  {
    paramgx.firePropertyChange(paramString, paramObject1, paramObject2);
  }

  static void e(gx paramgx, String paramString, Object paramObject1, Object paramObject2)
  {
    paramgx.firePropertyChange(paramString, paramObject1, paramObject2);
  }

  static void f(gx paramgx, String paramString, Object paramObject1, Object paramObject2)
  {
    paramgx.firePropertyChange(paramString, paramObject1, paramObject2);
  }

  static void g(gx paramgx, String paramString, Object paramObject1, Object paramObject2)
  {
    paramgx.firePropertyChange(paramString, paramObject1, paramObject2);
  }

  static void h(gx paramgx, String paramString, Object paramObject1, Object paramObject2)
  {
    paramgx.firePropertyChange(paramString, paramObject1, paramObject2);
  }

  static void i(gx paramgx, String paramString, Object paramObject1, Object paramObject2)
  {
    paramgx.firePropertyChange(paramString, paramObject1, paramObject2);
  }

  static
  {
    if (com.zend.ide.n.td.bc.b())
      UIManager.getDefaults().put(a, ic.class.getName());
    else
      UIManager.getDefaults().put(a, cx.class.getName());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gx
 * JD-Core Version:    0.6.0
 */