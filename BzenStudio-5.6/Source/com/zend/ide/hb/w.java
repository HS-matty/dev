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

class w extends bc
{
  final rb a;

  w(rb paramrb)
  {
  }

  public void f()
  {
    d().setListData(new Object[0]);
  }

  protected bw a()
  {
    bw localbw = super.a();
    localbw.getActionMap().put("ok", new qc(this, localbw));
    localbw.getInputMap().put(KeyStroke.getKeyStroke(10, 0), "ok");
    localbw.setCellRenderer(new tc(this));
    return localbw;
  }

  protected void a(Object paramObject)
  {
    rb.a(this.a);
  }

  protected ListCellRenderer o()
  {
    return new tc(this);
  }

  protected bb m()
  {
    return new o(this);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.w
 * JD-Core Version:    0.6.0
 */