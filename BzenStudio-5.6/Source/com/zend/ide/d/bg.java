package com.zend.ide.d;

import com.zend.ide.bd.c;
import com.zend.ide.i.n;
import com.zend.ide.p.w;
import com.zend.ide.util.a.f;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.ds;
import com.zend.ide.util.en;
import com.zend.ide.util.s;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.List;
import java.util.ListIterator;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;

public class bg extends n
  implements bn, cu
{
  private bb c;
  private String d = "customizationTool";
  private en e;
  private com.zend.ide.util.bs f;
  private com.zend.ide.y.a g;
  private com.zend.ide.y.a h;
  private com.zend.ide.y.a i;
  private com.zend.ide.y.a m;
  private com.zend.ide.y.a l;
  private com.zend.ide.y.a n;
  private com.zend.ide.y.a b;
  private com.zend.ide.y.a k;
  private bi p;
  private com.zend.ide.r.ba v;
  private com.zend.ide.bf.ba j;
  private com.zend.ide.y.a q;
  private JButton r;
  private JButton s;
  private JButton t;

  public bg()
  {
    super(c.b().h());
    setTitle(ct.a(236));
    e();
    this.c = new s();
    this.f = new com.zend.ide.util.bt(this);
    ((com.zend.ide.util.bt)this.f).a(this);
    ((com.zend.ide.util.bt)this.f).a(this.r);
    ((com.zend.ide.util.bt)this.f).a(this.s);
    ((com.zend.ide.util.bt)this.f).a(this.t);
    a(this.e);
    pack();
    B();
    addComponentListener(new d(this));
  }

  private void e()
  {
    this.e = new en();
    this.e.addChangeListener(new e(this));
    this.e.setTabPlacement(1);
    this.e.setMinimumSize(new Dimension(300, 400));
    this.e.setFocusable(true);
    this.e.setFocusCycleRoot(false);
    this.e.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
    JTabbedPane localJTabbedPane = new JTabbedPane();
    localJTabbedPane.setFocusable(false);
    localJTabbedPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    localJTabbedPane.setTabPlacement(2);
    this.g = new rd();
    this.h = new bs();
    this.i = new dc();
    this.m = new ca();
    this.l = new sd();
    this.n = new od();
    this.p = new bi();
    this.v = com.zend.ide.r.p.e().a(this);
    this.j = new com.zend.ide.bf.ba(this);
    this.q = new qd();
    this.b = new pb();
    this.k = new td();
    com.zend.ide.bc.a.a((JComponent)this.g, "CUSTOMIZATION_EDITING");
    com.zend.ide.bc.a.a((JComponent)this.h, "CUSTOMIZATION_COMPLETION");
    com.zend.ide.bc.a.a((JComponent)this.i, "CUSTOMIZATION_COLOR");
    com.zend.ide.bc.a.a((JComponent)this.m, "CUSTOMIZATION_DEBUG");
    com.zend.ide.bc.a.a((JComponent)this.l, "CUSTOMIZATION_PLATFORM");
    com.zend.ide.bc.a.a((JComponent)this.n, "CUSTOMIZATION_DESKTOP");
    com.zend.ide.bc.a.a((JComponent)this.q, "CUSTOMIZATION_DIALOGS");
    com.zend.ide.bc.a.a((JComponent)this.b, "CUSTOMIZATION_CVS");
    com.zend.ide.bc.a.a(this.p, "CUSTOMIZATION_KEYMAP");
    com.zend.ide.bc.a.a(this.v, "CUSTOMIZATION_FILE_TYPES");
    com.zend.ide.bc.a.a(this.j, "CUSTOMIZATION_TEMPLATES");
    com.zend.ide.bc.a.a((JComponent)this.k, "CUSTOMIZATION_SQL");
    a(this.g, "editor_options");
    a(this.h, "code_completion_settings");
    a(this.i, "general_colors");
    a(this.m, "debug_options");
    a(this.l, "platform_integration");
    a(this.n, "desktop_options");
    a(this.b, "cvs_options");
    a(this.b, "svn_options");
    a(this.q, "dialogs_options");
    a(this.k, "sql_options");
    this.p.a(0, "application.openNextEntry");
    this.p.a(0, "completionTool.showCompletionList");
    this.p.a(0, "completionTool.showFunctionArguments");
    this.p.a(0, "phpEditorPane.beginLine");
    this.p.a(0, "phpEditorPane.endLine");
    this.p.a(0, "editor.showRecentFiles");
    this.p.a(1, "editorComponent.newDocument");
    this.p.a(1, "editorComponent.openDocument");
    this.p.a(1, "editorComponent.closeDocument");
    this.p.a(1, "editorComponent.closeAll");
    this.p.a(1, "phpEditorPane.saveFile");
    this.p.a(1, "phpEditorPane.saveAs");
    this.p.a(1, "editorComponent.saveAll");
    this.p.a(1, "phpEditorPane.print");
    this.p.a(1, "project.openProject");
    this.p.a(2, "phpEditorPane.cut");
    this.p.a(2, "phpEditorPane.copy");
    this.p.a(2, "phpEditorPane.paste");
    this.p.a(2, "phpEditorPane.selectAll");
    this.p.a(2, "phpEditorPane.reformatCode");
    this.p.a(2, "phpEditorPane.undo");
    this.p.a(2, "phpEditorPane.redo");
    this.p.a(2, "editnig.toLowerCase");
    this.p.a(2, "editnig.toUpperCase");
    this.p.a(2, "phpEditorPane.duplicateSelection");
    this.p.a(2, "phpEditorPane.eraseLine");
    this.p.a(2, "phpEditorPane.addRemoveComment");
    this.p.a(2, "phpEditorPane.addRemovePHPBlockComment");
    this.p.a(2, "editor.toggleLineWrap");
    this.p.a(2, "phpEditorPane.toggleBookmark");
    this.p.a(2, "phpEditorPane.removeAllBookmarks");
    this.p.a(2, "phpEditorPane.openBookmarksDialog");
    this.p.a(2, "editnig.breakTag");
    this.p.a(2, "editnig.nbspTag");
    this.p.a(2, "editnig.boldTag");
    this.p.a(2, "editnig.italicTag");
    this.p.a(2, "editnig.heading1Tag");
    this.p.a(2, "editnig.heading2Tag");
    this.p.a(2, "editnig.heading3Tag");
    this.p.a(2, "application.closeMessageComponent");
    this.p.a(2, "editor.expandAllFolds");
    this.p.a(2, "editor.collapseAllFolds");
    this.p.a(2, "editor.foldNonPHP");
    this.p.a(2, "editor.foldClasses");
    this.p.a(2, "editor.foldFunctions");
    this.p.a(2, "editor.foldDocs");
    this.p.a(2, "editor.collapseInScope");
    this.p.a(3, "phpEditorPane.find");
    this.p.a(3, "phpEditorPane.replace");
    this.p.a(3, "phpEditorPane.find-next");
    this.p.a(3, "phpEditorPane.find-prev");
    this.p.a(3, "application.findInFiles");
    this.p.a(4, "editor.gotoResource");
    this.p.a(4, "editor.gotoFile");
    this.p.a(4, "editor.gotoLine");
    this.p.a(4, "editnig.findMatchingBracket");
    this.p.a(4, "phpEditorPane.gotoNextBookmark");
    this.p.a(4, "phpEditorPane.gotoNextProjectBookmark");
    this.p.a(4, "phpEditorPane.back");
    this.p.a(4, "phpEditorPane.forward");
    this.p.a(5, "project.newProject");
    this.p.a(5, "project.openProject");
    this.p.a(5, "project.saveProject");
    this.p.a(5, "project.checkIncludes");
    this.p.a(5, "project.removeFromProject");
    this.p.a(6, "debugging.toggleBreakpoint");
    this.p.a(6, "debugging.addWatch");
    this.p.a(6, "debugging.stepOver");
    this.p.a(6, "debugging.stepOut");
    this.p.a(6, "debugging.stepInto");
    this.p.a(6, "debugging.go");
    this.p.a(6, "debugging.gotoCursor");
    this.p.a(6, "debugging.run");
    this.p.a(6, "debugging.serverConnection");
    this.p.a(6, "debugging.debugURL");
    this.p.a(6, "debugging.profileURL");
    this.p.a(6, "debugging.showInBrowser");
    this.p.a(6, "debugging.finishDebugger");
    this.p.a(7, "codeAnalyzer");
    this.p.a(8, "vcs.update");
    this.p.a(8, "vcs.commit");
    this.p.a(8, "vcs.add");
    this.p.a(8, "vcs.status");
    this.p.a(8, "vcs.diff");
    this.p.a(8, "vcs.log");
    this.p.a(8, "vcs.checkout");
    this.p.a(9, "editor.functionHelpAction");
    this.e.add(ct.a(243), this.n.c());
    this.e.add(ct.a(240), this.g.c());
    this.e.add(ct.a(458), this.h.c());
    this.e.add(ct.a(1175), this.i.c());
    this.e.add(ct.a(242), this.m.c());
    this.e.add(ct.a(399), this.l.c());
    this.e.add(ct.a(244), this.p);
    this.e.add(ct.a(1060), this.v);
    this.e.add(ct.a(1213), this.j);
    this.e.add(ct.a(1589), this.b.c());
    this.e.add(ct.a(245), this.q.c());
    this.e.add(ct.a(1349), this.k.c());
    setSize(300, 400);
    setModal(true);
    setModal(true);
    JPanel localJPanel = new JPanel(new FlowLayout(2));
    this.r = new JButton();
    com.zend.ide.bc.a.a(this.r, "CUSTOMIZATION_GENERAL");
    this.r.setAction(new f(new q(this)));
    this.s = new w();
    com.zend.ide.bc.a.a(this.s, "CUSTOMIZATION_GENERAL");
    this.s.setAction(new f(new p(this)));
    this.t = new JButton(ct.a(117));
    com.zend.ide.bc.a.a(this.t, "CUSTOMIZATION_GENERAL");
    this.t.addActionListener(new bt(this));
    JButton localJButton = new JButton(ct.a(639));
    localJButton.setPreferredSize(com.zend.ide.p.e.b.d);
    localJButton.addActionListener(new dp(this));
    com.zend.ide.p.e.d.b(new JButton[] { this.r, this.s, this.t, localJButton });
    localJPanel.add(this.r);
    localJPanel.add(this.s);
    localJPanel.add(this.t);
    localJPanel.add(localJButton);
    Container localContainer = getContentPane();
    localContainer.add(c(), "Center");
    localContainer.add(localJPanel, "South");
    f();
    pack();
    B();
    doLayout();
    addFocusListener(new dq(this));
  }

  private static void a(com.zend.ide.y.a parama, String paramString)
  {
    List localList = com.zend.ide.y.b.c(paramString);
    ListIterator localListIterator = localList.listIterator();
    while (localListIterator.hasNext())
    {
      String str = (String)localListIterator.next();
      parama.a(str);
    }
  }

  private static void a(JComponent paramJComponent)
  {
    KeyStroke localKeyStroke = KeyStroke.getKeyStroke(27, 0);
    ActionMap localActionMap = paramJComponent.getActionMap();
    InputMap localInputMap = paramJComponent.getInputMap(1);
    String str = "escapeKey";
    localInputMap.put(localKeyStroke, str);
    localActionMap.put(str, new ds());
  }

  public void f()
  {
    this.g.f();
    this.h.f();
    this.i.f();
    this.m.f();
    this.l.f();
    this.n.f();
    this.p.f();
    this.b.f();
    this.q.f();
    this.k.f();
  }

  private void g()
  {
    this.g.d();
    this.h.d();
    this.i.d();
    this.m.d();
    this.l.d();
    this.n.d();
    this.p.d();
    this.b.d();
    this.q.d();
    this.k.d();
    com.zend.ide.y.b.d();
  }

  private void h()
  {
    this.g.e();
    this.h.e();
    this.i.e();
    this.m.e();
    this.l.e();
    this.n.e();
    this.p.e();
    this.b.e();
    this.q.e();
    this.k.e();
  }

  public boolean d(boolean paramBoolean)
  {
    return this.f.d(paramBoolean);
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public bb q()
  {
    return this.c;
  }

  public com.zend.ide.util.bs t()
  {
    return this.f;
  }

  public JComponent c()
  {
    return this.e;
  }

  public void d(String paramString)
  {
    this.d = paramString;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public String r()
  {
    return this.d;
  }

  public void a(bn parambn)
  {
    this.c.a(parambn.q());
  }

  public void a(int paramInt)
  {
    this.e.setSelectedIndex(paramInt);
  }

  private void i()
  {
    g();
    setVisible(false);
    getOwner().repaint();
  }

  static en a(bg parambg)
  {
    return parambg.e;
  }

  static void a(bg parambg)
  {
    parambg.h();
  }

  static JButton b(bg parambg)
  {
    return parambg.r;
  }

  static void c(bg parambg)
  {
    parambg.i();
  }

  static void d(bg parambg)
  {
    parambg.g();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bg
 * JD-Core Version:    0.6.0
 */