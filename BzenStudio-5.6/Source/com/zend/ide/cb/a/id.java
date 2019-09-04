package com.zend.ide.cb.a;

import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class id extends JPanel
{
  private JLabel a;
  final v b;

  public id(v paramv)
  {
    a();
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 != paramInt3) && (paramInt3 != 1) && (paramInt1 != 0))
      this.a.setText(ct.a(1495, String.valueOf(paramInt1)) + '(' + paramInt2 + " - " + paramInt3 + ")  ");
    else if (paramInt1 == 0)
      this.a.setText(ct.a(1495, String.valueOf(paramInt1)) + ' ');
    else
      this.a.setText(ct.a(1496) + ' ');
  }

  public void a(String paramString)
  {
    this.a.setText(paramString);
  }

  public void setBackground(Color paramColor)
  {
    super.setBackground(paramColor);
    if (this.a != null)
      this.a.setBackground(paramColor);
  }

  private void a()
  {
    this.a = new JLabel(cv.b("sql/table.gif"), 2);
    setLayout(new FlowLayout(0));
    add(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.id
 * JD-Core Version:    0.6.0
 */