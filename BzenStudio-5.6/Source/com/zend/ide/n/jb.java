package com.zend.ide.n;

import com.zend.ide.n.a.e;
import com.zend.ide.n.a.h;
import javax.swing.table.DefaultTableModel;

class jb
  implements h
{
  final sc a;

  private jb(sc paramsc)
  {
  }

  public void a(e parame)
  {
    sc.a(this.a, parame);
    sc.d(this.a);
  }

  public void b(e parame)
  {
    co localco1 = (co)parame;
    for (int i = 0; i < sc.e(this.a).getRowCount(); i++)
    {
      Object localObject = sc.e(this.a).getValueAt(i, 0);
      if ((localObject == null) || (localObject.equals("")))
        continue;
      co localco2 = (co)localObject;
      if (!localco2.equals(localco1))
        continue;
      sc.e(this.a).removeRow(i);
      break;
    }
    sc.d(this.a);
  }

  public void a(e parame, String paramString, Object paramObject1, Object paramObject2)
  {
  }

  jb(sc paramsc, uc paramuc)
  {
    this(paramsc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.jb
 * JD-Core Version:    0.6.0
 */