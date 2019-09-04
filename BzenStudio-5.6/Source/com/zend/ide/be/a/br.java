package com.zend.ide.be.a;

import com.zend.ide.be.d;
import com.zend.ide.be.h;
import com.zend.ide.be.i;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.s;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;

class br extends JPanel
  implements MouseListener, bn
{
  private static final Color a = new Color(102, 102, 102);
  private d e;
  private Icon f;
  private s g;
  private String h = "projectTree";
  private bs i;
  private Action j;
  private Action k;
  private Action l;
  private Action m;
  private Action n;
  private Action o;
  private Action b;
  private String p;
  private h q;
  private Insets r = new Insets(0, 0, 0, 0);

  public br(d paramd, String paramString, h paramh)
  {
    this.e = paramd;
    this.q = paramh;
    this.p = paramString;
    LookAndFeel.installColorsAndFont(this, "Label.background", "Label.foreground", "Label.font");
    setBackground(a);
    setForeground(Color.white);
    this.j = new bb(paramd, paramString, 3);
    this.k = new bb(paramd, paramString, 2);
    this.l = new bb(paramd, paramString, 0);
    this.m = new bb(paramd, paramString, 1);
    this.n = new z(paramd, paramString);
    this.o = new y(paramd, paramString);
    this.b = new x(paramd, paramString);
    this.g = new s();
    this.i = new bt(this);
    addMouseListener(this);
  }

  protected void paintComponent(Graphics paramGraphics)
  {
    super.paintComponent(paramGraphics);
    getInsets(this.r);
    this.f.paintIcon(this, paramGraphics, this.r.left, this.r.top);
  }

  public Dimension getPreferredSize()
  {
    getInsets(this.r);
    Dimension localDimension = new Dimension(this.f.getIconWidth(), this.f.getIconHeight());
    localDimension.width += this.r.left + this.r.right;
    localDimension.height += this.r.top + this.r.bottom;
    return localDimension;
  }

  public void a(i parami, boolean paramBoolean)
  {
    setOpaque(parami.a);
    b(parami, paramBoolean);
    b(parami);
  }

  private void b(i parami)
  {
    String str1 = this.q.c();
    Icon localIcon = this.q.d();
    String str2 = this.q.h();
    setToolTipText(str2);
    int i1 = parami.c;
    boolean bool = parami.a;
    Object localObject;
    switch (i1)
    {
    case 2:
      localObject = new v(this, str1, 4);
      this.f = new e(localIcon, (Icon)localObject, 1);
      this.f = new e(this.f, bool ? bq.b : bq.c, 1);
      break;
    case 3:
      localObject = new v(this, str1, 2);
      this.f = new e(localIcon, (Icon)localObject, 3);
      this.f = new e(this.f, bool ? bq.d : bq.a, 3);
      break;
    case 0:
      localObject = new m(this, str1);
      this.f = new e(localIcon, (Icon)localObject, 2);
      this.f = new e(this.f, bool ? bq.c : bq.d, 2);
      break;
    case 1:
      localObject = new m(this, str1);
      this.f = new e(localIcon, (Icon)localObject, 2);
      this.f = new e(this.f, bool ? bq.a : bq.d, 2);
    }
  }

  private void b(i parami, boolean paramBoolean)
  {
    String str = r();
    this.g.a("keys.moveTo*keys.moveToLeft", str, true);
    this.g.a("keys.moveTo*keys.moveToRight", str, true);
    this.g.a("keys.moveTo*keys.moveToUp", str, true);
    this.g.a("keys.moveTo*keys.moveToDown", str, true);
    this.g.a("keys.dock", str, true);
    this.g.a("keys.float", str, true);
    this.g.a("keys.closeWindow", str, true);
    if (parami.b)
      this.g.a("keys.dock", this.o, str, true);
    else
      this.g.a("keys.float", this.n, str, true);
    int i1 = parami.c;
    if (i1 == 0)
    {
      this.g.a("keys.moveTo*keys.moveToLeft", this.j, str, true);
      this.g.a("keys.moveTo*keys.moveToRight", this.k, str, true);
      this.g.a("keys.moveTo*keys.moveToDown", this.m, str, true);
    }
    else if (i1 == 1)
    {
      this.g.a("keys.moveTo*keys.moveToLeft", this.j, str, true);
      this.g.a("keys.moveTo*keys.moveToRight", this.k, str, true);
      this.g.a("keys.moveTo*keys.moveToUp", this.l, str, true);
    }
    else if (i1 == 3)
    {
      this.g.a("keys.moveTo*keys.moveToRight", this.k, str, true);
      this.g.a("keys.moveTo*keys.moveToUp", this.l, str, true);
      this.g.a("keys.moveTo*keys.moveToDown", this.m, str, true);
    }
    else if (i1 == 2)
    {
      this.g.a("keys.moveTo*keys.moveToLeft", this.j, str, true);
      this.g.a("keys.moveTo*keys.moveToUp", this.l, str, true);
      this.g.a("keys.moveTo*keys.moveToDown", this.m, str, true);
    }
    if (paramBoolean)
      this.g.a("keys.closeWindow", this.b, str, true);
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (SwingUtilities.isLeftMouseButton(paramMouseEvent))
    {
      i locali = this.e.b(this.p);
      locali.a = (!locali.a);
      this.e.a(this.p, locali);
    }
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
  }

  public void mouseEntered(MouseEvent paramMouseEvent)
  {
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
  }

  public boolean d(boolean paramBoolean)
  {
    return true;
  }

  public com.zend.ide.util.bb q()
  {
    return this.g;
  }

  public JComponent c()
  {
    return this;
  }

  public void d(String paramString)
  {
    this.h = paramString;
  }

  public String r()
  {
    return this.h;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public void a(bn parambn)
  {
    this.g.a(parambn.q());
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public bs t()
  {
    return this.i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.br
 * JD-Core Version:    0.6.0
 */