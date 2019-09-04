package com.zend.ide.f;

import com.zend.ide.p.f.e;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

class ge extends AbstractAction
{
  final dd a;

  public ge(dd paramdd)
  {
    super(ct.a(1722), cv.b("classbrowser/grouped.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    dd.e(!dd.e());
    e locale = (e)this.a.getModel().getRoot();
    if (locale.getChildCount() > 0)
      locale.removeAllChildren();
    ((DefaultTreeModel)this.a.getModel()).nodeChanged(locale);
    this.a.a(locale, locale.i());
    SwingUtilities.invokeLater(new id(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.ge
 * JD-Core Version:    0.6.0
 */