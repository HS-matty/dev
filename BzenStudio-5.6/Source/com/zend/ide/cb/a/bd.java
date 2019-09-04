package com.zend.ide.cb.a;

import com.zend.ide.cb.g;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

class bd extends JComboBox
{
  final n a;

  public bd(n paramn, ComboBoxModel paramComboBoxModel)
  {
    super(paramComboBoxModel);
    setToolTipText("Loading...");
  }

  public String getToolTipText()
  {
    Object localObject = getSelectedItem();
    if (localObject != null)
      return ((g)localObject).a();
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.bd
 * JD-Core Version:    0.6.0
 */