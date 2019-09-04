package com.zend.ide.m;

import com.zend.ide.b.d;

class b extends u
  implements com.zend.ide.b.b, l
{
  final a d;

  b(a parama)
  {
  }

  public void a(d paramd)
  {
    a.a(this.d, paramd);
  }

  public void a(bh parambh)
  {
    a.a(this.d).append(parambh.a());
    a.b(this.d).append("(");
    bi[] arrayOfbi = parambh.c();
    for (int i = 0; i < arrayOfbi.length; i++)
    {
      if (i != 0)
        a.c(this.d).append(", ");
      a(arrayOfbi[i]);
    }
    a.d(this.d).append(")");
    String str1 = parambh.d().trim();
    str1 = str1.split(" ", 2)[0];
    str1 = "  " + str1;
    if (a.e(this.d) == -1)
    {
      a.f(this.d).append(str1);
      return;
    }
    int j = str1.length();
    int k = a.g(this.d).length() + j;
    if (k > a.h(this.d))
    {
      String str2 = this.d.b();
      int n = str2.length();
      int i1 = a.i(this.d) / 2;
      if (a.j(this.d).length() > i1)
      {
        int i2;
        if (j > a.k(this.d) - i1)
          i2 = i1 - n;
        else
          i2 = a.l(this.d) - j - n;
        a.m(this.d).setLength(i2);
        a.n(this.d).append(str2);
      }
    }
    for (int m = a.o(this.d).length(); m < a.p(this.d) - j; m++)
      a.q(this.d).append(" ");
    a.r(this.d).append(str1);
  }

  public void a(bi parambi)
  {
    String str1 = parambi.g();
    if ((str1 != null) && (str1.length() != 0))
    {
      a.s(this.d).append(str1);
      a.t(this.d).append(" ");
    }
    if (parambi.d())
      a.u(this.d).append("const ");
    if (parambi.c())
      a.v(this.d).append("&");
    a.w(this.d).append("$");
    a.x(this.d).append(parambi.a());
    String str2 = parambi.h();
    if ((str2 != null) && (str2.length() != 0))
    {
      a.y(this.d).append(" = ");
      a.z(this.d).append(str2);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.m.b
 * JD-Core Version:    0.6.0
 */