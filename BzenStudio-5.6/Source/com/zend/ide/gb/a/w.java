package com.zend.ide.gb.a;

import com.zend.ide.gb.b.c;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

class w
  implements Runnable
{
  final v a;

  w(v paramv)
  {
  }

  public void run()
  {
    if (rb.r() == null)
      return;
    if (rb.s().isSelected())
    {
      rb.r().a(true);
      rb.r().a((String)rb.a(this.a.a).getSelectedItem());
      rb.a(this.a.a).setEnabled(true);
      ob.b.b(true);
      ob.b.c(true);
    }
    else
    {
      rb.r().a(false);
      rb.a(this.a.a).setEnabled(false);
      rb.t();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.w
 * JD-Core Version:    0.6.0
 */