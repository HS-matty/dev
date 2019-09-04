package com.zend.ide.util.kc;

import com.zend.ide.bd.c;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.table.TableCellEditor;

public class g extends JDialog
{
  private b a;
  private TableCellEditor b;
  private Date c;
  private int d;

  public g(TableCellEditor paramTableCellEditor, Frame paramFrame, String paramString, boolean paramBoolean, int paramInt)
    throws HeadlessException
  {
    super(paramFrame, paramString, paramBoolean);
    this.b = paramTableCellEditor;
    this.d = paramInt;
    b();
  }

  public Date a()
  {
    return this.c;
  }

  public void a(Date paramDate)
  {
    this.a.a(paramDate);
  }

  private void b()
  {
    if (this.d == 1)
    {
      localObject = new m();
      ((m)localObject).setFont(cv.e().deriveFont(12.0F));
      this.a = ((b)localObject);
    }
    else
    {
      this.a = new h();
    }
    setLayout(new BorderLayout());
    add((Component)this.a, "Center");
    Object localObject = new JPanel(new FlowLayout(2));
    JButton localJButton1 = new JButton(new e(this));
    JButton localJButton2 = new JButton(new d(this));
    ((JPanel)localObject).add(localJButton1);
    ((JPanel)localObject).add(localJButton2);
    com.zend.ide.p.e.d.b(new JButton[] { localJButton1, localJButton2 });
    add((Component)localObject, "South");
    setDefaultCloseOperation(1);
    addWindowListener(new a(this));
    pack();
    setLocationRelativeTo(c.b().h());
  }

  static TableCellEditor a(g paramg)
  {
    return paramg.b;
  }

  static Date a(g paramg, Date paramDate)
  {
    return paramg.c = paramDate;
  }

  static b b(g paramg)
  {
    return paramg.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.kc.g
 * JD-Core Version:    0.6.0
 */