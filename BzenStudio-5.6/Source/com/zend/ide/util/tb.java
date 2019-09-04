package com.zend.ide.util;

import com.zend.ide.n.bd;
import com.zend.ide.n.hl;
import com.zend.ide.n.hn;
import com.zend.ide.util.d.a;
import java.awt.Color;

class tb
  implements hl
{
  hl a;
  private a b = new a(50);

  public tb(hl paramhl)
  {
    a(paramhl);
  }

  public void a(hl paramhl)
  {
    this.a = paramhl;
  }

  public bd a(int paramInt)
  {
    bd localbd = (bd)this.b.b(paramInt);
    if (localbd != null)
      return localbd;
    localbd = this.a.a(paramInt);
    localbd = (bd)localbd.clone();
    localbd.a(Color.black);
    this.b.a(paramInt, localbd);
    return localbd;
  }

  public void a(hn paramhn)
  {
  }

  public void b(hn paramhn)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.tb
 * JD-Core Version:    0.6.0
 */