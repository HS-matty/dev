package com.zend.ide.o;

import com.zend.ide.util.w;

class dr extends w
{
  final g c;

  private dr(g paramg)
  {
  }

  public boolean b()
  {
    Object[] arrayOfObject = this.c.g.getSelectedValues();
    for (int i = 0; i < arrayOfObject.length; i++)
      if (!((di)arrayOfObject[i]).i())
        return true;
    return false;
  }

  dr(g paramg, f paramf)
  {
    this(paramg);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dr
 * JD-Core Version:    0.6.0
 */