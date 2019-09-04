package com.zend.ide.n.td.b;

import com.zend.ide.n.bw;
import com.zend.ide.n.td.e;
import com.zend.ide.n.td.hb;
import com.zend.ide.n.td.jb;
import com.zend.ide.n.td.mb;
import java.awt.event.ActionEvent;

public class d extends c
{
  public d(bw parambw)
  {
    super(parambw, "Collapse All Classes");
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
        if (!(arrayOfmb[i] instanceof e))
          continue;
        localjb.a(arrayOfmb[i].a());
        break;
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.b.d
 * JD-Core Version:    0.6.0
 */