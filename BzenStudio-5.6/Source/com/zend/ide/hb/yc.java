package com.zend.ide.hb;

import com.zend.ide.p.bc;
import com.zend.ide.p.bw;
import com.zend.ide.p.o;
import com.zend.ide.util.bb;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JList;
import javax.swing.KeyStroke;
import javax.swing.ListCellRenderer;

class yc extends bc
{
  final wc f;

  yc(wc paramwc)
  {
  }

  public void f()
  {
    d().setListData(new Object[0]);
  }

  protected bb m()
  {
    return new o(this);
  }

  protected bw a()
  {
    xc localxc = new xc(this);
    localxc.getActionMap().put("ok", new sc(this, localxc));
    localxc.getInputMap().put(KeyStroke.getKeyStroke(10, 0), "ok");
    localxc.setCellRenderer(new uc(this));
    localxc.addKeyListener(new ob(this));
    return localxc;
  }

  protected void a(Object paramObject)
  {
    wc.c(this.f);
  }

  protected ListCellRenderer o()
  {
    return new uc(this);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.yc
 * JD-Core Version:    0.6.0
 */