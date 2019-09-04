package com.zend.ide.l;

import com.zend.ide.util.f.a;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

class z extends JTabbedPane
{
  final bx a;

  z(bx parambx, int paramInt)
  {
    super(paramInt);
  }

  public void setSelectedIndex(int paramInt)
  {
    super.setSelectedIndex(paramInt);
    if ((paramInt == 1) && (this.a.isVisible()))
    {
      boolean bool = a.a.b();
      bx.a(this.a).setEnabled(!bool);
      if (bool)
        SwingUtilities.invokeLater(new jb(this));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.z
 * JD-Core Version:    0.6.0
 */