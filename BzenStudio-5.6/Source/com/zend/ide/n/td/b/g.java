package com.zend.ide.n.td.b;

import com.zend.ide.n.bw;
import com.zend.ide.n.td.gb;
import com.zend.ide.n.td.hb;
import com.zend.ide.n.td.jb;
import com.zend.ide.n.td.mb;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class g extends c
{
  public g(bw parambw)
  {
    super(parambw, "Collapse All Functions");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    hb localhb = (hb)this.a.e();
    jb localjb = localhb.a();
    if (localjb != null)
    {
      mb[] arrayOfmb = localjb.e();
      for (int i = 0; i < arrayOfmb.length; i++)
      {
        if (!(arrayOfmb[i] instanceof com.zend.ide.n.td.g))
          continue;
        List localList1 = arrayOfmb[i].a();
        ArrayList localArrayList = new ArrayList(localList1.size());
        for (int j = localList1.size() - 1; j > -1; j--)
        {
          gb localgb = (gb)localList1.get(j);
          List localList2 = localjb.b(localgb.d());
          if (localList2.size() < 3)
          {
            localArrayList.add(localgb);
          }
          else
          {
            if ((localList2.size() != 3) || (!localgb.equals(localList2.get(localList2.size() - 1))))
              continue;
            localArrayList.add(localgb);
          }
        }
        localjb.a(localArrayList);
        break;
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.b.g
 * JD-Core Version:    0.6.0
 */