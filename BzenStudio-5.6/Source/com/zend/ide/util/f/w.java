package com.zend.ide.util.f;

import com.zend.ide.p.cb;
import com.zend.ide.util.ct;
import java.awt.FlowLayout;
import javax.swing.JPanel;

class w extends cb
{
  w(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
  }

  protected JPanel c()
  {
    this.b = new JPanel(new FlowLayout(2));
    com.zend.ide.p.w localw1 = new com.zend.ide.p.w(ct.b(1071));
    com.zend.ide.p.w localw2 = new com.zend.ide.p.w(ct.b(1067));
    localw2.addActionListener(new q(this));
    localw1.addActionListener(new r(this));
    this.b.add(localw1);
    this.b.add(localw2);
    return this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.w
 * JD-Core Version:    0.6.0
 */