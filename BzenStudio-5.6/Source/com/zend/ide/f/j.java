package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.m.bh;
import com.zend.ide.s.x;
import com.zend.ide.s.z;
import com.zend.ide.util.cr;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

class j
  implements x
{
  private Border a = new EmptyBorder(0, 7, 1, 7);
  private Border b = new ec(this);
  private com.zend.ide.p.bi c = new com.zend.ide.p.bi();
  private Border d = BorderFactory.createCompoundBorder(this.a, this.b);
  private Font e;
  private Color f = new Color(255, 255, 215);
  final bz g;

  private j(bz parambz)
  {
    this.c.setOpaque(true);
    this.c.setComponentOrientation(ComponentOrientation.UNKNOWN);
    this.c.setBackground(this.f);
    this.c.setForeground(Color.BLACK);
    Font localFont1 = cr.b();
    Font localFont2 = localFont1.deriveFont(localFont1.getStyle(), localFont1.getSize() - 1);
    this.c.setFont(localFont2);
    this.e = localFont1.deriveFont(0x1 | localFont1.getStyle());
  }

  public Component a(z paramz, d paramd, JList paramJList, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    int i = paramInt2 == paramJList.getModel().getSize() - 1 ? 1 : 0;
    this.c.setBorder(i != 0 ? this.a : this.d);
    a((bh)paramd, bz.a(this.g));
    return this.c;
  }

  private void a(bh parambh, int paramInt)
  {
    this.c.a("");
    if (bz.b(this.g))
      this.c.a(parambh.a() + "( ", null, null);
    com.zend.ide.m.bi[] arrayOfbi = parambh.c();
    if (arrayOfbi.length == 0)
    {
      this.c.a("< empty >", null, null);
      return;
    }
    for (int i = 0; i < arrayOfbi.length; i++)
    {
      if (i != 0)
        this.c.a(", ", null, null);
      this.c.a(bz.c(this.g).a(arrayOfbi[i]), i == paramInt ? this.e : null, null);
    }
    if (bz.b(this.g))
      this.c.a(" )", null, null);
  }

  j(bz parambz, h paramh)
  {
    this(parambz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.j
 * JD-Core Version:    0.6.0
 */