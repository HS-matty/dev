package com.zend.ide.n;

import com.zend.ide.s.bb;
import com.zend.ide.s.nb;
import com.zend.ide.s.sb;
import java.awt.Color;

public class bf extends be
{
  protected Color f = Color.black;
  protected Color B = Color.gray;
  protected Color g = Color.red;
  protected Color e = Color.black;
  protected Color h = Color.gray;
  protected Color i = Color.red;
  protected Color j = new Color(102, 0, 0);
  protected Color k = new Color(0, 130, 0);
  protected Color l = Color.red;
  protected Color m = new Color(0, 130, 130);
  protected Color n = Color.blue;
  protected Color o = Color.green.darker();
  protected Color p = Color.gray;
  protected Color q = Color.blue;
  protected Color r = new Color(0, 130, 0);
  protected Color s = Color.black;
  protected Color t = Color.red;
  protected Color u = Color.lightGray;
  protected Color A = Color.black;
  protected Color v = new Color(0, 0, 180);
  protected Color w = new Color(130, 130, 0);
  protected Color x = new Color(64, 64, 64);
  protected Color y = Color.black;
  protected Color z = new Color(0, 130, 0);
  protected Color C = Color.black;
  protected Color D = Color.gray;
  protected Color E = new Color(0, 130, 0);
  protected Color F = Color.red;
  protected Color G = Color.blue;
  protected Color H = Color.black;
  protected Color I = new Color(153, 0, 153);
  protected Color J = new Color(0, 102, 204);
  protected Color K = new Color(171, 63, 51);
  protected Color L = new Color(203, 0, 153);
  protected Color M = Color.gray;
  protected Color N = new Color(0, 0, 255);
  protected Color O = new Color(0, 130, 0);
  protected Color P = new Color(153, 0, 153);
  protected Color Q = new Color(80, 74, 186);
  protected Color R = Color.black;
  protected Color S = new Color(0, 102, 51);
  protected Color T = new Color(177, 66, 15);
  protected Color U = Color.gray;
  protected Color V = Color.black;

  public bf()
  {
    e();
    f();
  }

  protected void e()
  {
  }

  private void f()
  {
    g();
    a();
    i();
    l();
    m();
    j();
    o();
    k();
    n();
    p();
    q();
    t();
    r();
    s();
    u();
    v();
    B();
    w();
    x();
    y();
    z();
    A();
    h();
    U();
    b();
    d();
    C();
    D();
    E();
    J();
    F();
    G();
    H();
    I();
    K();
    L();
    M();
    R();
    S();
    P();
    N();
    O();
    Q();
    T();
  }

  private bd a(int paramInt, Color paramColor)
  {
    bd localbd;
    if (b(paramInt))
      localbd = a(paramInt);
    else
      localbd = new bd();
    localbd.a(paramColor);
    a(paramInt, localbd);
    return localbd;
  }

  private void a(int paramInt1, Color paramColor, int paramInt2)
  {
    bd localbd = a(paramInt1, paramColor);
    localbd.a(paramInt2);
  }

  private void a(int paramInt1, Color paramColor, int paramInt2, boolean paramBoolean)
  {
    bd localbd = a(paramInt1, paramColor);
    localbd.a(paramInt2);
    localbd.b(paramBoolean);
  }

  private void g()
  {
    a(bb.bg, this.f);
    a(bb.bm, this.f);
    a(bb.bn, this.f);
    a(bb.bd, this.f);
    a(bb.bb, this.f);
    a(bb.bc, this.f);
  }

  private void a()
  {
    a(bb.ib, this.B, 1, true);
    a(bb.hb, this.B, 1, true);
    a(bb.jb, this.B, 1, true);
    a(bb.lb, this.B, 1, true);
    a(bb.kb, this.B, 1, true);
    a(bb.mb, this.B, 1, true);
    a(bb.Mb, this.B, 1, true);
    a(bb.nb, this.B, 1, true);
    a(bb.Jb, this.B, 1, true);
    a(bb.ob, this.B, 1, true);
    a(bb.pb, this.B, 1, true);
    a(bb.qb, this.B, 1, true);
    a(bb.sb, this.B, 1, true);
    a(bb.rb, this.B, 1, true);
    a(bb.tb, this.B, 1, true);
    a(bb.ub, this.B, 1, true);
    a(bb.Kb, this.B, 1, true);
    a(bb.vb, this.B, 1, true);
    a(bb.wb, this.B, 1, true);
    a(bb.xb, this.B, 1, true);
    a(bb.yb, this.B, 1, true);
    a(bb.zb, this.B, 1, true);
    a(bb.Ab, this.B, 1, true);
    a(bb.Bb, this.B, 1, true);
    a(bb.Cb, this.B, 1, true);
    a(bb.Db, this.B, 1, true);
    a(bb.Lb, this.B, 1, true);
    a(bb.Eb, this.B, 1, true);
    a(bb.Fb, this.B, 1, true);
    a(bb.Gb, this.B, 1, true);
    a(bb.Hb, this.B, 1, true);
    a(bb.Ib, this.B, 1, true);
  }

  private void h()
  {
    a(bb.by, this.g);
    a(nb.l, this.g);
    a(sb.i, this.g);
  }

  private void U()
  {
    a(bb.Yb, this.e);
  }

  private void i()
  {
    a(bb.be, this.h);
  }

  private void j()
  {
    a(bb.bi, this.i);
    a(bb.bj, this.i);
  }

  private void k()
  {
    a(bb.bk, this.j);
  }

  private void l()
  {
    a(bb.bh, this.k);
    a(bb.ba, this.k);
  }

  private void m()
  {
    a(bb.bf, this.l);
  }

  private void n()
  {
    a(bb.bl, this.m);
  }

  private void o()
  {
    for (int i1 = bb.Y; i1 <= bb.Z; i1++)
      a(i1, this.n);
  }

  private void p()
  {
    a(bb.cQ, this.o);
    a(bb.cR, this.o);
  }

  private void q()
  {
    a(bb.cS, this.p);
  }

  private void r()
  {
    for (int i1 = bb.cO; i1 <= bb.cP; i1++)
      a(i1, this.q);
  }

  private void s()
  {
    a(bb.cT, this.r);
  }

  private void t()
  {
    a(bb.cU, this.s);
    a(bb.cX, this.s);
    a(bb.cY, this.s);
    a(bb.cW, this.s);
  }

  private void u()
  {
    a(bb.cV, this.t);
  }

  private void v()
  {
    a(bb.bv, this.u);
  }

  private void B()
  {
    a(bb.da, this.A, 2);
  }

  private void w()
  {
    a(bb.bp, this.v);
  }

  private void x()
  {
    a(bb.bq, this.w);
  }

  private void y()
  {
    a(bb.br, this.x);
  }

  private void z()
  {
    a(bb.bs, this.y);
  }

  private void A()
  {
    a(bb.bu, this.z);
  }

  private void b()
  {
    a(nb.h, this.C);
    a(nb.e, this.C);
  }

  private void d()
  {
    a(nb.f, this.D);
  }

  private void C()
  {
    a(nb.i, this.E);
  }

  private void D()
  {
    a(nb.g, this.F);
  }

  private void E()
  {
    a(nb.b, this.G);
  }

  private void F()
  {
    a(bb.Tb, this.H);
    a(bb.Pb, this.H);
  }

  private void G()
  {
    a(bb.Qb, this.I);
  }

  private void H()
  {
    a(bb.Rb, this.J);
  }

  private void I()
  {
    a(bb.Sb, this.K);
  }

  private void J()
  {
    a(bb.Nb, this.L);
    a(bb.Ob, this.L);
  }

  private void K()
  {
    a(bb.Ub, this.M);
  }

  private void L()
  {
    a(bb.Vb, this.N, 1);
  }

  private void M()
  {
    a(bb.Wb, this.O);
  }

  private void N()
  {
    a(sb.b, this.P);
  }

  private void O()
  {
    a(sb.c, this.Q);
  }

  private void P()
  {
    a(sb.g, this.R);
  }

  private void Q()
  {
    a(sb.e, this.S);
  }

  private void R()
  {
    a(sb.d, this.T);
  }

  private void S()
  {
    a(sb.f, this.U);
  }

  private void T()
  {
    a(sb.h, this.V, 1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bf
 * JD-Core Version:    0.6.0
 */