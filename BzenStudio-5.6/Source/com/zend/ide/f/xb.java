package com.zend.ide.f;

import com.zend.ide.b.d;

class xb extends ca
{
  final cj i;

  private xb(cj paramcj)
  {
    super(paramcj);
  }

  protected d[] q()
  {
    if (this.e.length() == 0)
      return this.g;
    d[] arrayOfd;
    if (this.e.charAt(0) == '$')
    {
      arrayOfd = bl.a(this.g, bl.a);
      arrayOfd = bl.a(arrayOfd, this.e.substring(1));
    }
    else
    {
      arrayOfd = bl.a(this.g, this.e);
      arrayOfd = bl.a(arrayOfd, bl.b);
    }
    return arrayOfd;
  }

  xb(cj paramcj, bs parambs)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.xb
 * JD-Core Version:    0.6.0
 */