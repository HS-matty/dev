package com.zend.ide.desktop;

import com.zend.ide.be.d;
import com.zend.ide.fb.k;
import com.zend.ide.fb.q;
import com.zend.ide.fb.s;
import com.zend.ide.util.g;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;

class ez
  implements g
{
  private boolean a = b.a("desktop.internalBrowser") != null;
  private boolean b = (this.a) && (((Boolean)b.a("desktop.internalBrowser").c()).booleanValue());
  private e c;
  private PropertyChangeListener e = new gc(this);
  private com.zend.ide.fb.fb f;
  final fb d;

  public ez(fb paramfb, d paramd)
  {
    if (this.a)
    {
      JPopupMenu.setDefaultLightWeightPopupEnabled(false);
      ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
      b();
      paramd.b().addWindowListener(new o(this, paramfb));
    }
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    SwingUtilities.invokeLater(new ac(this, paramBoolean1, paramBoolean2));
  }

  private void a(String paramString)
  {
    this.f.b();
    k localk = q.c();
    this.f.a(localk);
    s locals = new s();
    if (paramString != null)
      locals.d(paramString);
    this.f.a(locals);
  }

  private void b()
  {
    f localf = new f();
    this.c = new e(localf);
    localf.a("desktop.internalBrowser", this.e);
    this.c.a("desktop.internalBrowser");
  }

  public void a(String paramString, boolean paramBoolean)
  {
    if ((paramBoolean) && (this.b))
    {
      if (!this.f.c())
        a(paramString);
      this.f.b().a(paramString, true);
      com.zend.ide.be.l locall = (com.zend.ide.be.l)fb.a(this.d).a("EditorComponent");
      locall.b("Browser");
      return;
    }
    com.zend.ide.fb.l.b(paramString);
  }

  static boolean a(ez paramez)
  {
    return paramez.b;
  }

  static void a(ez paramez, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramez.a(paramBoolean1, paramBoolean2);
  }

  static com.zend.ide.fb.fb b(ez paramez)
  {
    return paramez.f;
  }

  static com.zend.ide.fb.fb a(ez paramez, com.zend.ide.fb.fb paramfb)
  {
    return paramez.f = paramfb;
  }

  static void a(ez paramez, String paramString)
  {
    paramez.a(paramString);
  }

  static boolean a(ez paramez, boolean paramBoolean)
  {
    return paramez.b = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ez
 * JD-Core Version:    0.6.0
 */