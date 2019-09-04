package com.zend.ide.r;

import java.util.Vector;
import javax.swing.JList;
import javax.swing.ListModel;

class z extends JList
{
  final ba a;

  z(ba paramba, ListModel paramListModel)
  {
    super(paramListModel);
  }

  public void setListData(Object[] paramArrayOfObject)
  {
    setModel(new eb(this, paramArrayOfObject));
  }

  public void setListData(Vector paramVector)
  {
    setModel(new fb(this, paramVector));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.z
 * JD-Core Version:    0.6.0
 */