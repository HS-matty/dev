package com.zend.ide.d;

import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import com.zend.ide.y.g;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class w extends AbstractAction
{
  final bi a;

  private w(bi parambi)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = ba.a(this.a.getTopLevelAncestor(), ct.a(877, g.e()), "New Config" + bi.j(this.a));
    if (str != null)
    {
      bi.t(this.a);
      DefaultListModel localDefaultListModel = (DefaultListModel)bi.d(this.a).getModel();
      if (localDefaultListModel.contains(str))
      {
        ba.a(this.a.getTopLevelAncestor(), str + ct.b(654), ct.b(132), -1, 2);
      }
      else
      {
        localDefaultListModel.addElement(str);
        g.g(str);
        bi.d(this.a).setSelectedIndex(localDefaultListModel.indexOf(str));
        bi.d(this.a).repaint();
        bi.b(this.a, g.e());
      }
    }
  }

  w(bi parambi, f paramf)
  {
    this(parambi);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.w
 * JD-Core Version:    0.6.0
 */