package com.zend.ide.gb.a;

import java.awt.event.ActionEvent;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

class kb extends JComboBox
{
  DefaultCellEditor a = new DefaultCellEditor(this);
  final rb b;

  private kb(rb paramrb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = (String)getEditor().getItem();
    super.actionPerformed(paramActionEvent);
    if ((str == null) || (str.equals("")))
      return;
    DefaultComboBoxModel localDefaultComboBoxModel = (DefaultComboBoxModel)rb.g(this.b)[0].getModel();
    for (int i = 0; i < localDefaultComboBoxModel.getSize(); i++)
      if (str.equals(localDefaultComboBoxModel.getElementAt(i)))
        return;
    localDefaultComboBoxModel.insertElementAt(str, 0);
    ((DefaultComboBoxModel)rb.g(this.b)[1].getModel()).insertElementAt(str, 0);
  }

  kb(rb paramrb, v paramv)
  {
    this(paramrb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.kb
 * JD-Core Version:    0.6.0
 */