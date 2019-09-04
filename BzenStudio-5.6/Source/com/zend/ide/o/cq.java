package com.zend.ide.o;

import com.zend.ide.k.d;
import com.zend.ide.p.bw;
import javax.swing.DefaultListModel;

class cq
  implements Runnable
{
  final Object a;
  final fn b;

  cq(fn paramfn, Object paramObject)
  {
  }

  public void run()
  {
    fn.a(this.b, this.a);
    fn.b(this.b).ensureIndexIsVisible(((DefaultListModel)fn.a(this.b).getModel()).indexOf(this.a));
    ((d)this.b.x()).n();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.cq
 * JD-Core Version:    0.6.0
 */