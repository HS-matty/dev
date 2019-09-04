package com.zend.ide.fb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Map;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

class ab
  implements ActionListener
{
  final db a;

  ab(db paramdb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = (String)this.a.getSelectedItem();
    if ((!str.startsWith("http")) && (!str.startsWith("https")) && (!str.startsWith("ftp")) && (!str.startsWith("file")))
    {
      if (!new File(str).exists())
        str = "http://" + str;
      db.a(this.a).setItem(str);
      localObject = (DefaultComboBoxModel)this.a.getModel();
      if (((DefaultComboBoxModel)localObject).getIndexOf(str) == -1)
        this.a.insertItemAt(str, 0);
    }
    Object localObject = (ImageIcon)db.b(this.a).get(db.b((String)this.a.getSelectedItem()));
    gb.a(db.c(this.a)).setIcon((Icon)localObject);
    gb.b(db.c(this.a)).requestFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.ab
 * JD-Core Version:    0.6.0
 */