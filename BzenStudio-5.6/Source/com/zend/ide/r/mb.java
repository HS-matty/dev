package com.zend.ide.r;

import com.zend.ide.util.cr;
import com.zend.ide.util.ct;
import java.io.File;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

class mb extends JComboBox
{
  public final boolean a = cr.c() != 2;
  public final String b = "Zend Studio";
  public final String c = ct.a(1725);
  public final String d = ct.a(226);
  private String e;
  final bp f;

  public mb(bp parambp)
  {
    DefaultComboBoxModel localDefaultComboBoxModel = new DefaultComboBoxModel();
    localDefaultComboBoxModel.addElement("Zend Studio");
    localDefaultComboBoxModel.addElement(this.c);
    localDefaultComboBoxModel.addElement(this.d);
    setModel(localDefaultComboBoxModel);
    addActionListener(new ib(this, parambp));
  }

  public void setSelectedIndex(int paramInt)
  {
    if (paramInt == 0)
      setSelectedItem("Zend Studio");
    else if (paramInt == 1)
      setSelectedItem(this.c);
    else if (paramInt == 2)
      setSelectedItem(this.e);
    super.setSelectedIndex(paramInt);
  }

  public int getSelectedIndex()
  {
    if (getSelectedItem() == null)
      return super.getSelectedIndex();
    if (getSelectedItem().equals("Zend Studio"))
      return 0;
    if (getSelectedItem().equals(this.c))
      return 1;
    if (getSelectedItem().equals(this.e))
      return 2;
    return super.getSelectedIndex();
  }

  public void a(String paramString)
  {
    if (paramString == null)
      return;
    this.e = new File(paramString).getName();
    int i;
    if (this.a)
    {
      i = 2;
      if (getModel().getSize() > 3)
        removeItemAt(i);
    }
    else
    {
      i = 1;
      if (getModel().getSize() > 2)
        removeItemAt(i);
    }
    if ((paramString != null) && (paramString.length() > 0))
    {
      insertItemAt(paramString, i);
      setSelectedItem(paramString);
    }
    else
    {
      setSelectedItem("Zend Studio");
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.mb
 * JD-Core Version:    0.6.0
 */