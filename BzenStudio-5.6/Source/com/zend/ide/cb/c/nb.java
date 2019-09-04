package com.zend.ide.cb.c;

import com.zend.ide.cb.q;
import com.zend.ide.cb.y;
import com.zend.ide.util.ct;

class nb
  implements Runnable
{
  final y a;
  final w b;

  nb(w paramw, y paramy)
  {
  }

  public void run()
  {
    if ((this.a.getSource() instanceof q))
      this.b.b((q)this.a.getSource(), ct.a(1578), true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.nb
 * JD-Core Version:    0.6.0
 */