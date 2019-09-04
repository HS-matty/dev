package com.zend.ide.n;

import com.zend.ide.util.c.h;
import com.zend.ide.util.s;
import com.zend.ide.y.e;
import com.zend.ide.y.i;
import java.awt.Color;
import java.awt.Container;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;

public class dr extends ca
{
  private e e = new e(this.f);
  private com.zend.ide.y.f f = new com.zend.ide.y.f();
  private ew g = new ew(this, null);
  private DefaultHighlighter.DefaultHighlightPainter h = new ir(this, null);
  private DefaultHighlighter.DefaultHighlightPainter i = new io(this, null);
  private hu j = new hu(this, null);
  private Map k = new HashMap();
  private Color l;
  private Color m;
  private boolean n;
  private boolean o;
  private boolean p;
  private hl q;
  private Color r = Color.blue;
  private ij s;
  private com.zend.ide.util.c.f t = h.c().b(new fh(this, null));
  private d u = new d(this, null);
  private JTextComponent v;
  private int w;

  public dr()
  {
    super("MatchingCharEditorTool");
  }

  protected void a(bw parambw)
  {
    parambw.a(this.j);
    iu localiu = new iu(this);
    ActionMap localActionMap = parambw.c().getActionMap();
    localActionMap.put("findMatchingBracket", localiu);
    s locals = (s)parambw.q();
    locals.a("keys.findMatchingBracket", localiu, "textComponent", false);
  }

  protected void d()
  {
    this.f.a("editing.bracketQuoteMatching", this.g);
    this.f.a("editing.bracketMatchingErrorColor", this.g);
    this.f.a("editing.bracketMatchingEnabled", this.g);
    this.f.a("editnig.matchingBracketLineTooltip", this.g);
    this.f.a("application.chosenScheme", this.g);
    this.f.a("editing.background", this.g);
    this.f.a("editing.font", this.g);
    this.f.a("editing.quoteMatchingEnabled", this.g);
    this.e.a("editing.bracketQuoteMatching");
    this.e.a("editing.bracketMatchingErrorColor");
    this.e.a("editing.bracketMatchingEnabled");
    this.e.a("editnig.matchingBracketLineTooltip");
    this.e.a("application.chosenScheme");
    this.e.a("editing.background");
    this.e.a("editing.font");
    this.e.a("editing.quoteMatchingEnabled");
    c().a("editnig.findMatchingBracket", "findMatchingBracket");
  }

  private void f()
  {
    this.t.d();
    this.t.f();
    if ((this.s != null) && (this.s.isShowing()))
    {
      this.s.setVisible(false);
      this.s.getParent().repaint();
    }
  }

  private void a()
  {
    if (this.s != null)
    {
      this.s.a(this.q);
      this.s.setBackground(this.r);
      this.s.setBorder(new LineBorder(new Color(255 - this.r.getRed(), 255 - this.r.getGreen(), 255 - this.r.getBlue()), 1));
    }
  }

  private static String a(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    Element localElement1 = paramDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(paramInt);
    int i1 = localElement2.getStartOffset();
    int i2 = localElement2.getEndOffset();
    return paramDocument.getText(i1, i2 - i1);
  }

  static d a(dr paramdr)
  {
    return paramdr.u;
  }

  static Map b(dr paramdr)
  {
    return paramdr.k;
  }

  static boolean c(dr paramdr)
  {
    return paramdr.n;
  }

  static boolean d(dr paramdr)
  {
    return paramdr.p;
  }

  static void e(dr paramdr)
  {
    paramdr.f();
  }

  static DefaultHighlighter.DefaultHighlightPainter f(dr paramdr)
  {
    return paramdr.h;
  }

  static DefaultHighlighter.DefaultHighlightPainter g(dr paramdr)
  {
    return paramdr.i;
  }

  static boolean h(dr paramdr)
  {
    return paramdr.o;
  }

  static JTextComponent a(dr paramdr, JTextComponent paramJTextComponent)
  {
    return paramdr.v = paramJTextComponent;
  }

  static int a(dr paramdr, int paramInt)
  {
    return paramdr.w = paramInt;
  }

  static com.zend.ide.util.c.f i(dr paramdr)
  {
    return paramdr.t;
  }

  static ij j(dr paramdr)
  {
    return paramdr.s;
  }

  static ij a(dr paramdr, ij paramij)
  {
    return paramdr.s = paramij;
  }

  static void k(dr paramdr)
  {
    paramdr.a();
  }

  static int l(dr paramdr)
  {
    return paramdr.w;
  }

  static JTextComponent m(dr paramdr)
  {
    return paramdr.v;
  }

  static String b(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    return a(paramDocument, paramInt);
  }

  static Color n(dr paramdr)
  {
    return paramdr.l;
  }

  static Color o(dr paramdr)
  {
    return paramdr.m;
  }

  static Color a(dr paramdr, Color paramColor)
  {
    return paramdr.l = paramColor;
  }

  static Color b(dr paramdr, Color paramColor)
  {
    return paramdr.m = paramColor;
  }

  static boolean a(dr paramdr, boolean paramBoolean)
  {
    return paramdr.n = paramBoolean;
  }

  static boolean b(dr paramdr, boolean paramBoolean)
  {
    return paramdr.o = paramBoolean;
  }

  static hl a(dr paramdr, hl paramhl)
  {
    return paramdr.q = paramhl;
  }

  static Color c(dr paramdr, Color paramColor)
  {
    return paramdr.r = paramColor;
  }

  static boolean c(dr paramdr, boolean paramBoolean)
  {
    return paramdr.p = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dr
 * JD-Core Version:    0.6.0
 */