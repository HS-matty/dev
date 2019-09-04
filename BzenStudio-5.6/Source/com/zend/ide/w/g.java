package com.zend.ide.w;

import com.zend.ide.n.br;
import com.zend.ide.n.dz;
import com.zend.ide.n.gz;
import com.zend.ide.n.ho;

class g
  implements Runnable
{
  final dz a;
  final f b;

  g(f paramf, dz paramdz)
  {
  }

  public void run()
  {
    int i = -1;
    if ((this.a instanceof gz))
      i = ((gz)this.a).getCaretPosition();
    br.b(this.a);
    if (i != -1)
      ((gz)this.a).d(i);
    ((ho)this.a.getDocument()).a(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.g
 * JD-Core Version:    0.6.0
 */