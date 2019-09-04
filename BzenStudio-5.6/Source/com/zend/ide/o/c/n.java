package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.ab;
import javax.swing.Icon;

class n extends m
{
  final bp n;

  public n(bp parambp, a parama, ab paramab)
  {
    super(parama, paramab);
  }

  public String toString()
  {
    return "GLOBALS";
  }

  public boolean isLeaf()
  {
    return !this.n.j();
  }

  public String f()
  {
    return "";
  }

  public Icon e()
  {
    return this.n.j() ? bp.k() : bp.l();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.n
 * JD-Core Version:    0.6.0
 */