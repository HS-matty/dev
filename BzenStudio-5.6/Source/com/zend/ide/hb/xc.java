package com.zend.ide.hb;

import com.zend.ide.b.d;
import com.zend.ide.p.bw;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.util.ct;
import java.util.TreeSet;
import javax.swing.JComboBox;

class xc extends bw
{
  final yc e;

  xc(yc paramyc)
  {
  }

  public void setListData(Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject.length > 0) && (!wc.d(this.e.f).getSelectedItem().equals(p.f())) && (!wc.d(this.e.f).getSelectedItem().toString().equals(ct.a(226))))
    {
      localObject = new TreeSet();
      o localo = (o)wc.d(this.e.f).getSelectedItem();
      for (int i = 0; i < paramArrayOfObject.length; i++)
      {
        if (!localo.b(((d)paramArrayOfObject[i]).a()))
          continue;
        ((TreeSet)localObject).add(paramArrayOfObject[i]);
      }
      paramArrayOfObject = ((TreeSet)localObject).toArray();
    }
    Object localObject = paramArrayOfObject;
    setModel(new vc(this, localObject));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.xc
 * JD-Core Version:    0.6.0
 */