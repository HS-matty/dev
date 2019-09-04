package com.zend.ide.desktop.e;

import com.zend.ide.be.i;
import com.zend.ide.be.l;
import com.zend.ide.desktop.cj;
import com.zend.ide.f.bg;
import com.zend.ide.f.db;
import com.zend.ide.f.dd;
import com.zend.ide.f.de;
import com.zend.ide.f.nd;
import com.zend.ide.j.h;
import com.zend.ide.j.y;
import com.zend.ide.n.bw;
import com.zend.ide.p.cd;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.util.wb;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.File;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JToggleButton;
import javax.swing.JViewport;

public class a
  implements cu
{
  private cj b;
  private com.zend.ide.f.bp c = com.zend.ide.f.bp.d();
  private bg e;
  private JComponent a;
  private JComponent d;
  private JComponent g;
  private l h;
  private db i;
  private db j;
  private nd f;

  public a(cj paramcj)
  {
    this.b = paramcj;
    this.c.a(paramcj.o);
    this.e = this.c.c();
    c();
    this.e.a(new c(this, null));
    paramcj.X().a(new d(this, null));
    b();
    com.zend.ide.util.f.a.a.a(new b(this));
  }

  private void b()
  {
    com.zend.ide.be.d locald = com.zend.ide.bd.c.b().c();
    i locali = new i(true, false, 3, 1.0D, 2, new Rectangle(300, 300, 300, 200));
    ImageIcon localImageIcon = cv.b("classbrowser/phpfiledata.gif");
    this.h = locald.a(ct.a(1222), localImageIcon, null, false, locali);
    this.h.c(ct.a(1582));
    this.h.a(null);
    this.h.a(true);
    locald.a(ct.a(1222), this.h);
    localImageIcon = cv.b("explorer/phpfile.gif");
    this.h.a(ct.a(162), localImageIcon, d(), null, "FILE_INSPECTOR");
    localImageIcon = cv.b("project16.gif");
    this.h.a(ct.a(208), localImageIcon, e(), null, "PROJECT_INSPECTOR");
    localImageIcon = cv.b("classbrowser/phpfiledata.gif");
    this.h.a(ct.a(237), localImageIcon, this.g, null, "PHP_FUNCTIONS");
    Action localAction1 = ((dd)this.i).a();
    JToggleButton localJToggleButton1 = new JToggleButton(localAction1);
    localJToggleButton1.setSelected(dd.c());
    localJToggleButton1.setToolTipText((String)localAction1.getValue("Name"));
    localAction1.putValue("Name", null);
    localJToggleButton1.setPreferredSize(new Dimension(24, 22));
    this.h.a(ct.a(162), "FileBrowserComponent.grouped", localJToggleButton1);
    com.zend.ide.bc.a.a(localJToggleButton1, "FILE_INSPECTOR");
    Action localAction2 = ((dd)this.i).b();
    JToggleButton localJToggleButton2 = new JToggleButton(localAction2);
    localJToggleButton2.setSelected(dd.d());
    localJToggleButton2.setToolTipText((String)localAction2.getValue("Name"));
    localAction2.putValue("Name", null);
    localJToggleButton2.setPreferredSize(new Dimension(24, 22));
    this.h.a(ct.a(162), "FileBrowserComponent.sortByName", localJToggleButton2);
    com.zend.ide.bc.a.a(localJToggleButton2, "FILE_INSPECTOR");
    Action localAction3 = a();
    JToggleButton localJToggleButton3 = new JToggleButton(localAction3);
    localJToggleButton3.setToolTipText((String)localAction3.getValue("Name"));
    localAction3.putValue("Name", null);
    localJToggleButton3.setPreferredSize(new Dimension(24, 22));
    this.h.a(ct.a(162), "FileBrowserComponent.linkToEditor", localJToggleButton3);
    com.zend.ide.bc.a.a(localJToggleButton3, "FILE_INSPECTOR");
  }

  private Action a()
  {
    return new q(this);
  }

  private JComponent d()
  {
    return this.a;
  }

  private JComponent e()
  {
    return this.d;
  }

  private void f()
  {
    this.h.a(ct.a(162), d());
    this.h.a(ct.a(208), e());
  }

  private void c()
  {
    this.i = this.e.e();
    com.zend.ide.util.bp.a(this.i);
    this.i.a(this.b);
    this.a = new cd(this.i.c());
    ((cd)this.a).getViewport().setBackground(this.i.getBackground());
    this.j = this.e.b();
    com.zend.ide.util.bp.a(this.j);
    this.j.a(this.b);
    this.d = new cd(this.j.c());
    de localde = this.e.c();
    com.zend.ide.util.bp.a(localde);
    localde.a(this.b);
    this.g = new cd(localde.c());
  }

  public Object b()
  {
    JToggleButton localJToggleButton1 = (JToggleButton)this.h.a(ct.a(162), "FileBrowserComponent.grouped");
    JToggleButton localJToggleButton2 = (JToggleButton)this.h.a(ct.a(162), "FileBrowserComponent.sortByName");
    JToggleButton localJToggleButton3 = (JToggleButton)this.h.a(ct.a(162), "FileBrowserComponent.linkToEditor");
    if (localJToggleButton1 == null)
      return new Object[] { Boolean.FALSE, Boolean.FALSE, Boolean.FALSE };
    return new Object[] { new Boolean(localJToggleButton1.isSelected()), new Boolean(localJToggleButton2.isSelected()), new Boolean(localJToggleButton3.isSelected()) };
  }

  public void a(Object paramObject)
  {
    Object[] arrayOfObject = (Object[])(Object[])paramObject;
    JToggleButton localJToggleButton1 = (JToggleButton)this.h.a(ct.a(162), "FileBrowserComponent.grouped");
    JToggleButton localJToggleButton2 = (JToggleButton)this.h.a(ct.a(162), "FileBrowserComponent.sortByName");
    JToggleButton localJToggleButton3 = (JToggleButton)this.h.a(ct.a(162), "FileBrowserComponent.linkToEditor");
    boolean bool1 = ((Boolean)arrayOfObject[0]).booleanValue();
    boolean bool2 = ((Boolean)arrayOfObject[1]).booleanValue();
    boolean bool3 = ((Boolean)arrayOfObject[2]).booleanValue();
    localJToggleButton1.setSelected(bool1);
    localJToggleButton2.setSelected(bool2);
    localJToggleButton3.setSelected(bool3);
    ((dd)this.i).b(bool1);
    ((dd)this.i).c(bool2);
    if (bool3)
    {
      this.f = new nd((dd)this.i, this.b.X());
      this.f.a(bool3);
    }
  }

  private static String a(y paramy, String paramString1, String paramString2)
  {
    String str = b(paramy, paramString1, paramString2);
    return str == null ? a(paramString1, paramString2) : str;
  }

  private static String a(String paramString1, String paramString2)
  {
    File localFile1 = h.m.g(paramString2);
    File localFile2 = localFile1.getParentFile();
    if (localFile2 == null)
      return null;
    String str = localFile2.getPath() + h.m.d() + paramString1;
    File localFile3 = h.m.g(str);
    if ((localFile3.exists()) && (localFile3.isFile()))
      return str;
    return null;
  }

  private static String b(y paramy, String paramString1, String paramString2)
  {
    if ((paramy == null) || (paramString1.equals("")))
      return null;
    if (wb.b(paramString2))
      return paramy.a(paramString1, false);
    File localFile1 = h.m.g(paramString2);
    File localFile2 = localFile1.getParentFile();
    if (localFile2 == null)
      return null;
    return paramy.a(paramString1, localFile2);
  }

  static void a(a parama)
  {
    parama.f();
  }

  static nd a(a parama)
  {
    return parama.f;
  }

  static nd a(a parama, nd paramnd)
  {
    return parama.f = paramnd;
  }

  static db b(a parama)
  {
    return parama.i;
  }

  static cj c(a parama)
  {
    return parama.b;
  }

  static l d(a parama)
  {
    return parama.h;
  }

  static bg e(a parama)
  {
    return parama.e;
  }

  static String c(y paramy, String paramString1, String paramString2)
  {
    return a(paramy, paramString1, paramString2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.a
 * JD-Core Version:    0.6.0
 */