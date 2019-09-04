package com.zend.ide.gb.a;

import com.zend.ide.gb.b.b;
import javax.swing.JList;
import javax.swing.JTextField;

class h
  implements Runnable
{
  final JTextField a;
  final pb b;

  h(pb parampb, JTextField paramJTextField)
  {
  }

  public void run()
  {
    String str = this.a.getText();
    b localb = (b)pb.c(this.b).getSelectedValue();
    if (str.equals(localb.d()))
      return;
    localb.b(str);
    if (pb.a(this.b))
    {
      pb.a(this.b, true);
      pb.c(this.b).setText(str);
      pb.a(this.b, false);
    }
    pb.c(this.b).updateUI();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.h
 * JD-Core Version:    0.6.0
 */