package com.zend.ide.i;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

class k extends AbstractAction
{
  final p a;

  public k(p paramp)
  {
    super("OKAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = (String)this.a.e.getEditor().getItem();
    DefaultComboBoxModel localDefaultComboBoxModel;
    if ((str != null) && (!str.equals("")))
    {
      localDefaultComboBoxModel = (DefaultComboBoxModel)this.a.e.getModel();
      if (localDefaultComboBoxModel.getIndexOf(str) == -1)
        localDefaultComboBoxModel.insertElementAt(str, 0);
      localDefaultComboBoxModel.setSelectedItem(str);
      this.a.e.doLayout();
    }
    else
    {
      return;
    }
    str = (String)this.a.f.getEditor().getItem();
    if ((str != null) && (!str.equals("")))
    {
      localDefaultComboBoxModel = (DefaultComboBoxModel)this.a.f.getModel();
      if (localDefaultComboBoxModel.getIndexOf(str) == -1)
        localDefaultComboBoxModel.insertElementAt(str, 0);
      localDefaultComboBoxModel.setSelectedItem(str);
      this.a.f.doLayout();
    }
    this.a.e.hidePopup();
    this.a.f.hidePopup();
    this.a.setVisible(false);
    this.a.c = 1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.k
 * JD-Core Version:    0.6.0
 */