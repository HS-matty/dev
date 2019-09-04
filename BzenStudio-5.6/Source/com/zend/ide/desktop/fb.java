package com.zend.ide.desktop;

import com.zend.ide.be.a.b;
import com.zend.ide.be.d;
import com.zend.ide.be.i;
import com.zend.ide.be.k;
import com.zend.ide.be.l;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.g;
import com.zend.ide.util.n;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

public class fb extends com.zend.ide.bd.c
  implements cu
{
  private d c = new b();
  private k d = this.c.g();
  private g f = new ez(this, this.c);
  private com.zend.ide.k.c g;
  private JDialog h;

  public fb()
  {
    g();
  }

  public d c()
  {
    return this.c;
  }

  public void a(JDialog paramJDialog)
  {
    this.h = paramJDialog;
  }

  public JDialog i()
  {
    return this.h;
  }

  public k d()
  {
    return this.d;
  }

  public g e()
  {
    return this.f;
  }

  public com.zend.ide.k.c f()
  {
    return this.g;
  }

  private void g()
  {
    ImageIcon localImageIcon = new ImageIcon(n.c().b("keys.toggleDebugMessagesArea"));
    i locali = new i(true, false, 1, 1.0D, 0, new Rectangle(150, 150, 200, 300));
    l locall = this.c.a(ct.a(1218), localImageIcon, null, false, locali);
    this.c.a("MessageComponent", locall);
    this.g = new fa(locall);
  }

  static d a(fb paramfb)
  {
    return paramfb.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.fb
 * JD-Core Version:    0.6.0
 */