package com.zend.ide.l;

import com.zend.ide.d.fc;
import com.zend.ide.d.ld;
import com.zend.ide.d.n;
import com.zend.ide.f.zc.b.j;
import com.zend.ide.f.zc.b.l;
import com.zend.ide.p.ba;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;

class gb
  implements ActionListener
{
  final ub a;

  gb(ub paramub)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    fc localfc = new fc();
    ld localld = new ld(sb.a(this.a.c), true, localfc, a(), n.ADD);
    localld.setLocationRelativeTo(null);
    localld.setVisible(true);
    if (localfc.c())
      try
      {
        l.a(localfc.a(), new j(localfc.a(), new File(localfc.b())));
        ub.a(this.a).addItem(localfc.a());
        ub.a(this.a).setSelectedItem(localfc.a());
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
        ba.a(this.a, new String[] { ct.a(1847), localIOException.getMessage() });
      }
  }

  private ArrayList a()
  {
    String[] arrayOfString = l.d();
    ArrayList localArrayList = new ArrayList(arrayOfString.length);
    for (int i = 0; i < arrayOfString.length; i++)
      localArrayList.add(arrayOfString[i]);
    return localArrayList;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.gb
 * JD-Core Version:    0.6.0
 */