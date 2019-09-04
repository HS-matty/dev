package com.zend.ide.o;

import com.zend.ide.n.a.e;
import com.zend.ide.n.a.h;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;

public class dw extends DefaultListModel
  implements h
{
  public dw(dk paramdk)
  {
    Iterator localIterator = paramdk.m().iterator();
    while (localIterator.hasNext())
      a((e)localIterator.next());
    paramdk.a(this);
  }

  public void a(e parame)
  {
    addElement(parame);
  }

  public void b(e parame)
  {
    removeElement(parame);
  }

  public void a(e parame, String paramString, Object paramObject1, Object paramObject2)
  {
    int i = getSize();
    for (int j = 0; j < i; j++)
    {
      if (getElementAt(j) != parame)
        continue;
      fireContentsChanged(parame, j, j);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dw
 * JD-Core Version:    0.6.0
 */