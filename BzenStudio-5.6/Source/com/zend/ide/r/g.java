package com.zend.ide.r;

import javax.swing.JList;
import javax.swing.ListModel;

class g extends JList
{
  final ba a;

  g(ba paramba, ListModel paramListModel)
  {
    super(paramListModel);
  }

  public void setListData(Object[] paramArrayOfObject)
  {
    setModel(new gb(this, paramArrayOfObject));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.g
 * JD-Core Version:    0.6.0
 */