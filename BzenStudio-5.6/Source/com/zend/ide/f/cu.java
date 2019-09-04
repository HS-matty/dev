package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.m.g;
import com.zend.ide.m.l;
import com.zend.ide.m.x;
import com.zend.ide.util.cz;

class cu extends br
  implements x
{
  private boolean g;

  public cu(String paramString, g paramg, m paramm)
  {
    super(paramString, paramg, paramm);
    this.g = false;
  }

  public cu(String paramString, boolean paramBoolean, g paramg, m paramm)
  {
    super(paramString, paramg, paramm);
    this.g = paramBoolean;
  }

  public boolean i()
  {
    return this.g;
  }

  public void a(cz paramcz)
  {
    ((l)paramcz).a(this);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cu
 * JD-Core Version:    0.6.0
 */