package com.zend.ide.p;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class db extends JComboBox
{
  public void a(String paramString)
  {
    if ((paramString == null) || (paramString.trim().length() == 0))
      return;
    DefaultComboBoxModel localDefaultComboBoxModel = (DefaultComboBoxModel)getModel();
    if (localDefaultComboBoxModel.getIndexOf(paramString) == -1)
      localDefaultComboBoxModel.insertElementAt(paramString, 0);
    localDefaultComboBoxModel.setSelectedItem(paramString);
    doLayout();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.db
 * JD-Core Version:    0.6.0
 */