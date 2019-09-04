package com.zend.ide.hb;

import com.zend.ide.b.d;
import com.zend.ide.f.bl;
import com.zend.ide.f.bt;
import com.zend.ide.f.s;
import com.zend.ide.m.v;
import com.zend.ide.p.bc;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JTextField;

class ec
  implements Runnable
{
  final dc a;

  ec(dc paramdc)
  {
  }

  public void run()
  {
    rb.b(this.a.d).f();
    if (dc.a(this.a).length() == 0)
      return;
    d[] arrayOfd1 = null;
    d[] arrayOfd2 = null;
    d[] arrayOfd3 = null;
    d[] arrayOfd4 = null;
    d[] arrayOfd5 = null;
    if (rb.c(this.a.d))
      arrayOfd1 = r.a(this.a.d.g).g().e(dc.a(this.a));
    ArrayList localArrayList;
    int i;
    d[] arrayOfd7;
    int j;
    if (rb.d(this.a.d))
    {
      arrayOfd4 = r.a(this.a.d.g).g().d(dc.a(this.a));
      arrayOfd6 = r.a(this.a.d.g).g().c();
      localArrayList = new ArrayList();
      for (i = 0; i < arrayOfd6.length; i++)
      {
        arrayOfd7 = ((v)arrayOfd6[i]).b(dc.a(this.a));
        for (j = 0; j < arrayOfd7.length; j++)
          localArrayList.add(arrayOfd7[j]);
      }
      arrayOfd2 = new d[localArrayList.size()];
      localArrayList.toArray(arrayOfd2);
    }
    if (rb.e(this.a.d))
    {
      arrayOfd5 = r.a(this.a.d.g).g().h(dc.a(this.a));
      arrayOfd6 = r.a(this.a.d.g).g().c();
      localArrayList = new ArrayList();
      for (i = 0; i < arrayOfd6.length; i++)
      {
        arrayOfd7 = ((v)arrayOfd6[i]).a(dc.a(this.a));
        for (j = 0; j < arrayOfd7.length; j++)
          localArrayList.add(arrayOfd7[j]);
      }
      arrayOfd3 = new d[localArrayList.size()];
      localArrayList.toArray(arrayOfd3);
    }
    d[] arrayOfd6 = arrayOfd1;
    arrayOfd6 = bl.a(arrayOfd2, arrayOfd6);
    arrayOfd6 = bl.a(arrayOfd4, arrayOfd6);
    arrayOfd6 = bl.a(arrayOfd5, arrayOfd6);
    arrayOfd6 = bl.a(arrayOfd3, arrayOfd6);
    if (arrayOfd6 != null)
      rb.b(this.a.d).d().setListData(arrayOfd6);
    rb.b(this.a.d).d().setSelectedIndex(0);
    rb.a(this.a.d).grabFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.ec
 * JD-Core Version:    0.6.0
 */