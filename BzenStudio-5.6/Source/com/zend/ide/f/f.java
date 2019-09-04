package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.b.h;
import com.zend.ide.m.ba;
import com.zend.ide.m.bd;
import com.zend.ide.m.bh;
import com.zend.ide.m.l;
import com.zend.ide.m.s;
import com.zend.ide.m.u;
import com.zend.ide.m.v;
import com.zend.ide.m.x;
import com.zend.ide.m.z;
import com.zend.ide.util.cv;
import java.awt.Font;
import javax.swing.ImageIcon;

class f extends u
  implements l
{
  private final ImageIcon b = cv.b("classbrowser/htmltagdata16.gif");
  final by a;

  f(by paramby)
  {
  }

  public void a(d paramd)
  {
    String str1 = cj.d(this.a.p).a(paramd, by.a(this.a));
    String str2 = str1.substring(0, by.c(this.a));
    String str3 = str1.substring(by.b(this.a));
    by.y(this.a).a(str2, by.c(this.a), null);
    by.d(this.a).a(str3, null, null);
  }

  public void a(bh parambh)
  {
    if (cj.b(parambh))
    {
      by.e(this.a).a(this.b);
      String str1 = "?php";
      int j = by.f(this.a) + 1;
      str2 = str1.substring(0, j);
      str3 = str1.substring(j);
      by.F(this.a).a(str2, by.g(this.a), null);
      by.h(this.a).a(str3, null, null);
      return;
    }
    by.f(this.a).a(by.i(this.a));
    int i = by.a(this.a);
    ba localba = parambh.l();
    if (localba != null)
    {
      by.j(this.a).a(localba.a() + "::", null, null);
      if (by.a(this.a) > 0)
        i -= localba.a().length() + 2;
    }
    String str2 = cj.e(this.a.p).a(parambh, i);
    String str3 = str2.substring(0, by.g(this.a));
    String str4 = str2.substring(by.k(this.a));
    by.p(this.a).a(str3, by.l(this.a), null);
    by.m(this.a).a(str4, null, null);
  }

  public void a(z paramz)
  {
    by.r(this.a).a(by.n(this.a));
    int i = by.a(this.a);
    ba localba = paramz.l();
    if (localba != null)
    {
      by.o(this.a).a(localba.a() + "::", null, null);
      if (by.a(this.a) > 0)
        i -= localba.a().length() + 2;
    }
    String str1 = cj.f(this.a.p).a(paramz, i);
    String str2 = str1.substring(0, by.s(this.a));
    String str3 = str1.substring(by.p(this.a));
    by.x(this.a).a(str2, by.q(this.a), by.r(this.a) ? null : by.s(this.a));
    by.t(this.a).a(str3, null, by.r(this.a) ? null : by.s(this.a));
  }

  public void a(com.zend.ide.m.c paramc)
  {
    by.B(this.a).a(by.u(this.a));
    int i = by.a(this.a);
    ba localba = paramc.l();
    if (localba != null)
    {
      by.v(this.a).a(localba.a() + "::", null, null);
      if (by.a(this.a) > 0)
        i -= localba.a().length() + 2;
    }
    String str1 = cj.g(this.a.p).a(paramc, i);
    String str2 = str1.substring(0, by.C(this.a));
    String str3 = str1.substring(by.w(this.a));
    by.E(this.a).a(str2, by.x(this.a), by.r(this.a) ? null : by.s(this.a));
    by.Y(this.a).a(str3, null, by.r(this.a) ? null : by.s(this.a));
  }

  public void a(bd parambd)
  {
    by.z(this.a).a(by.u(this.a));
    super.a(parambd);
  }

  public void a(v paramv)
  {
    by.G(this.a).a(by.A(this.a));
    super.a(paramv);
  }

  public void a(s params)
  {
    Font localFont1 = by.C(this.a).getFont();
    Font localFont2 = localFont1.deriveFont(0x2 | localFont1.getStyle());
    by.H(this.a).a(by.D(this.a));
    String str1 = cj.h(this.a.p).a(params, by.a(this.a));
    String str2 = str1.substring(0, by.bg(this.a));
    String str3 = str1.substring(by.I(this.a));
    by.M(this.a).a(str2, by.J(this.a), by.r(this.a) ? null : by.K(this.a));
    by.O(this.a).a(str3, localFont2, by.r(this.a) ? null : by.K(this.a));
  }

  public void a(xd paramxd)
  {
    by.N(this.a).a(paramxd.b == '\001' ? by.L(this.a) : by.M(this.a));
    String str = cj.i(this.a.p).a(paramxd, by.a(this.a));
    by.S(this.a).a(str);
  }

  public void a(x paramx)
  {
    by.W(this.a).a(by.n(this.a));
    String str1 = paramx.a();
    String str2 = str1.substring(0, by.Q(this.a));
    String str3 = str1.substring(by.U(this.a));
    by.T(this.a).a(str2, by.R(this.a), null);
    by.X(this.a).a(str3, null, null);
  }

  public void a(com.zend.ide.m.bi parambi)
  {
    by.P(this.a).a(by.n(this.a));
    String str1 = parambi.a();
    String str2 = str1.substring(0, by.R(this.a));
    String str3 = str1.substring(by.S(this.a));
    by.U(this.a).a(str2, by.T(this.a), null);
    by.V(this.a).a(str3, null, null);
  }

  public void a(com.zend.ide.bf.c paramc)
  {
    String str1 = paramc.a();
    if (str1.length() < by.W(this.a))
      return;
    by.Z(this.a).a(by.X(this.a));
    String str2 = str1.substring(0, by.ab(this.a));
    String str3 = str1.substring(by.bb(this.a));
    by.db(this.a).a(str2, by.cb(this.a), null);
    by.eb(this.a).a(str3, null, null);
    String str4 = paramc.b();
    by.gb(this.a).a(" - ", by.fb(this.a), null);
    by.ib(this.a).a(str4, by.hb(this.a), null);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.f
 * JD-Core Version:    0.6.0
 */