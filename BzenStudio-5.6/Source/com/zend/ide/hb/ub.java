package com.zend.ide.hb;

import com.zend.ide.bc.a;
import com.zend.ide.k.e;
import com.zend.ide.k.f;
import com.zend.ide.p.bc;
import com.zend.ide.p.bw;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import javax.swing.Icon;
import javax.swing.ListCellRenderer;

public class ub extends bc
  implements e, cu
{
  private static final Icon f = cv.b("searchresults.gif");
  private fb g;
  private String h;
  private String i = ct.a(366);
  private f j;
  private String k = "";
  private int l = 0;
  private int m;
  private int n = 12;
  private String o;
  private String p = "    ";
  private String q;
  private boolean r;

  public ub(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.q = paramString2;
    this.r = paramBoolean;
    d("find_in_files_messages");
    a(paramString1);
    setDoubleBuffered(true);
    a(((Integer)b.a("editing.tabSize").c()).intValue());
    a.a(this, "FIND_IN_FILES");
    this.e.addPropertyChangeListener("model", new eb(this));
  }

  private void a(String paramString)
  {
    if (paramString.length() > this.n)
      paramString = paramString.substring(0, this.n - 1) + "...";
    setName(ct.a(726, paramString));
  }

  protected ListCellRenderer o()
  {
    return new sb(this, null);
  }

  protected void a(Object paramObject)
  {
    x().h();
  }

  public String getName()
  {
    return ct.a(366);
  }

  public void setName(String paramString)
  {
    this.h = paramString;
  }

  public f x()
  {
    if (this.j == null)
      this.j = new lb(this, null);
    return this.j;
  }

  public void a(fb paramfb)
  {
    this.g = paramfb;
  }

  public void b(String paramString)
  {
    this.k = paramString;
  }

  private void a(int paramInt)
  {
    this.p = "";
    for (int i1 = 0; i1 < paramInt; i1++)
      this.p += " ";
  }

  static int a(ub paramub, int paramInt)
  {
    return paramub.l = paramInt;
  }

  static String a(ub paramub, String paramString)
  {
    return paramub.o = paramString;
  }

  static int b(ub paramub, int paramInt)
  {
    return paramub.m = paramInt;
  }

  static int a(ub paramub)
  {
    return paramub.l;
  }

  static int b(ub paramub)
  {
    return paramub.m;
  }

  static String c(ub paramub)
  {
    return paramub.o;
  }

  static String d(ub paramub)
  {
    return paramub.p;
  }

  static int c(ub paramub, int paramInt)
  {
    return paramub.l += paramInt;
  }

  static Icon a()
  {
    return f;
  }

  static String e(ub paramub)
  {
    return paramub.i;
  }

  static bw f(ub paramub)
  {
    return paramub.e;
  }

  static bw g(ub paramub)
  {
    return paramub.e;
  }

  static String h(ub paramub)
  {
    return paramub.h;
  }

  static boolean i(ub paramub)
  {
    return paramub.r;
  }

  static String j(ub paramub)
  {
    return paramub.q;
  }

  static bw k(ub paramub)
  {
    return paramub.e;
  }

  static bw l(ub paramub)
  {
    return paramub.e;
  }

  static fb m(ub paramub)
  {
    return paramub.g;
  }

  static bw n(ub paramub)
  {
    return paramub.e;
  }

  static bw o(ub paramub)
  {
    return paramub.e;
  }

  static bw p(ub paramub)
  {
    return paramub.e;
  }

  static bw q(ub paramub)
  {
    return paramub.e;
  }

  static bw r(ub paramub)
  {
    return paramub.e;
  }

  static bw s(ub paramub)
  {
    return paramub.e;
  }

  static bw t(ub paramub)
  {
    return paramub.e;
  }

  static bw u(ub paramub)
  {
    return paramub.e;
  }

  static bw v(ub paramub)
  {
    return paramub.e;
  }

  static bw w(ub paramub)
  {
    return paramub.e;
  }

  static bw x(ub paramub)
  {
    return paramub.e;
  }

  static bw y(ub paramub)
  {
    return paramub.e;
  }

  static bw z(ub paramub)
  {
    return paramub.e;
  }

  static bw A(ub paramub)
  {
    return paramub.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.ub
 * JD-Core Version:    0.6.0
 */