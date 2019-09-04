package com.zend.ide.v;

import com.zend.ide.n.dz;
import java.util.Enumeration;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class bd extends JList
{
  final bc a;

  public bd(bc parambc)
  {
    setCellRenderer(new bb(this));
    setModel(new DefaultListModel());
    addListSelectionListener(new k(this, parambc));
  }

  public dz[] c()
  {
    Object[] arrayOfObject = getSelectedValues();
    dz[] arrayOfdz = new dz[arrayOfObject.length];
    for (int i = 0; i < arrayOfObject.length; i++)
      arrayOfdz[i] = ((dz)arrayOfObject[i]);
    return arrayOfdz;
  }

  public dz[] b()
  {
    DefaultListModel localDefaultListModel = (DefaultListModel)bc.a(this.a).getModel();
    dz[] arrayOfdz = new dz[localDefaultListModel.getSize()];
    Enumeration localEnumeration = localDefaultListModel.elements();
    for (int i = 0; localEnumeration.hasMoreElements(); i++)
      arrayOfdz[i] = ((dz)localEnumeration.nextElement());
    return arrayOfdz;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.bd
 * JD-Core Version:    0.6.0
 */