package com.zend.ide.n;

import com.zend.ide.util.cr;
import com.zend.ide.util.ct;
import java.io.File;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

class lg extends JComboBox
{
  public final boolean a = cr.c() != 2;
  public static final String b = ct.a(1725);
  public static final String c = ct.a(226);
  private String d;

  public lg()
  {
    DefaultComboBoxModel localDefaultComboBoxModel = new DefaultComboBoxModel();
    localDefaultComboBoxModel.addElement("Zend Studio");
    localDefaultComboBoxModel.addElement(b);
    localDefaultComboBoxModel.addElement(c);
    setModel(localDefaultComboBoxModel);
    addActionListener(new nf(this));
  }

  public void setSelectedIndex(int paramInt)
  {
    if (paramInt == 0)
      setSelectedItem("Zend Studio");
    else if (paramInt == 1)
      setSelectedItem(b);
    else if (paramInt == 2)
      setSelectedItem(this.d);
    super.setSelectedIndex(paramInt);
  }

  public int getSelectedIndex()
  {
    if (getSelectedItem() == null)
      return super.getSelectedIndex();
    if (getSelectedItem().equals("Zend Studio"))
      return 0;
    if (getSelectedItem().equals(b))
      return 1;
    if (getSelectedItem().equals(this.d))
      return 2;
    return super.getSelectedIndex();
  }

  public void a(String paramString)
  {
    this.d = new File(paramString).getName();
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
  }

  static String a(lg paramlg, String paramString)
  {
    return paramlg.d = paramString;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.lg
 * JD-Core Version:    0.6.0
 */