package com.zend.ide.n.td.b;

import com.zend.ide.n.bw;
import com.zend.ide.n.td.hb;
import com.zend.ide.n.td.jb;
import com.zend.ide.n.td.mb;
import com.zend.ide.n.td.v;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class h extends c
{
  public h(bw parambw)
  {
    super(parambw, "Collapse All Non-PHP");
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
        if (!(arrayOfmb[i] instanceof com.zend.ide.n.td.h))
          continue;
        List localList = arrayOfmb[i].a();
        ArrayList localArrayList = new ArrayList(localList.size());
        for (int j = 0; j < localList.size(); j++)
        {
          if (!(localList.get(j) instanceof v))
            continue;
          localArrayList.add(localList.get(j));
        }
        localjb.a(localArrayList);
        break;
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.b.h
 * JD-Core Version:    0.6.0
 */