package com.zend.ide.hb;

import com.zend.ide.m.bd;
import com.zend.ide.m.bh;
import com.zend.ide.m.c;
import com.zend.ide.m.v;
import com.zend.ide.util.cv;
import java.awt.Component;
import java.util.HashMap;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JList;

class tc extends DefaultListCellRenderer
{
  private HashMap a = new HashMap();
  final w b;

  public tc(w paramw)
  {
    this.a.put("class", cv.b("classbrowser/phpclassdata.gif"));
    this.a.put("function", cv.b("classbrowser/phpfunctiondata.gif"));
    this.a.put("const", cv.b("classbrowser/phpconstantdata.gif"));
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    if ((paramObject instanceof v))
      setIcon((Icon)this.a.get("class"));
    else if ((paramObject instanceof bh))
      setIcon((Icon)this.a.get("function"));
    else if (((paramObject instanceof bd)) || ((paramObject instanceof c)))
      setIcon((Icon)this.a.get("const"));
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.tc
 * JD-Core Version:    0.6.0
 */