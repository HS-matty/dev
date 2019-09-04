package com.zend.ide.gb.a;

import java.awt.event.ActionEvent;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

class lb extends JComboBox
{
  final sb a;

  lb(sb paramsb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = (String)getEditor().getItem();
    super.actionPerformed(paramActionEvent);
    if ((str == null) || (str.equals("")))
      return;
    DefaultComboBoxModel localDefaultComboBoxModel = (DefaultComboBoxModel)getModel();
    for (int i = 0; i < localDefaultComboBoxModel.getSize(); i++)
      if (str.equals(localDefaultComboBoxModel.getElementAt(i)))
        return;
    localDefaultComboBoxModel.insertElementAt(str, 0);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.lb
 * JD-Core Version:    0.6.0
 */