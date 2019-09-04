package com.zend.ide.n;

import com.zend.ide.i.n;
import com.zend.ide.p.ba;
import com.zend.ide.p.x;
import com.zend.ide.y.b;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class ct extends cs
{
  final gz a;

  private ct(gz paramgz)
  {
  }

  public void a(ho paramho)
  {
    JFrame localJFrame = com.zend.ide.bd.c.b().h();
    int i;
    if (paramho.l())
    {
      i = ba.b(localJFrame, com.zend.ide.util.ct.a(426, paramho.k()), com.zend.ide.util.ct.a(255), 0);
    }
    else if (!((Boolean)b.a("editing.automaticFileReload").c()).booleanValue())
    {
      ba localba = new ba(com.zend.ide.util.ct.a(254, paramho.k()), 3, 0);
      JPanel localJPanel = new JPanel(new FlowLayout(0));
      x localx = new x(com.zend.ide.util.ct.b(427));
      localx.setFocusPainted(false);
      localx.addItemListener(new wd(this));
      localJPanel.add(localx);
      localba.add(localJPanel, 1);
      n localn = (n)localba.createDialog(localJFrame, com.zend.ide.util.ct.a(255));
      localn.setVisible(true);
      Object localObject = localba.getValue();
      if ((localObject != null) && ((localObject instanceof Integer)))
        i = ((Integer)localObject).intValue();
      else
        i = 1;
    }
    else
    {
      i = 0;
    }
    if (i == 0)
      SwingUtilities.invokeLater(new xd(this));
  }

  ct(gz paramgz, cy paramcy)
  {
    this(paramgz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ct
 * JD-Core Version:    0.6.0
 */