package com.zend.ide.eb;

import com.zend.ide.p.b.e;
import com.zend.ide.p.b.f;
import com.zend.ide.util.ct;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

class b extends Thread
{
  final k a;

  b(k paramk)
  {
  }

  public void run()
  {
    k.a(this.a, false);
    f.a(k.a(this.a));
    boolean bool = j.a().c();
    if (k.b(this.a) != null)
      k.b(this.a).d();
    if (bool)
      JOptionPane.showMessageDialog(this.a, ct.a(1420), ct.a(1421), 1);
    else if (!k.c(this.a))
      JOptionPane.showMessageDialog(this.a, ct.a(1422), ct.a(94), 0);
    TreePath localTreePath = k.d(this.a).getSelectionPath();
    k.d(this.a).b();
    this.a.repaint();
    SwingUtilities.invokeLater(new hb(this, localTreePath));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.b
 * JD-Core Version:    0.6.0
 */