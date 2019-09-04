package com.zend.ide.gb.a;

import com.zend.ide.gb.b.a;
import com.zend.ide.gb.b.b;
import com.zend.ide.gb.b.c;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class qb extends ob
{
  private JTextArea c;
  private JCheckBox d;
  private JTextPane e;

  public qb(mb parammb)
  {
    b = parammb;
    c();
    d();
  }

  private void c()
  {
    this.c = new JTextArea(ct.a(1624));
    this.c.setFocusable(false);
    this.c.setBackground(getBackground());
    this.c.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.DARK_GRAY), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
    this.c.setEditable(false);
    this.c.setLineWrap(true);
    this.c.setWrapStyleWord(true);
    this.d = new JCheckBox(ct.a(1625));
    this.d.setSelected(true);
    this.e = new JTextPane();
    this.e.setEditable(false);
    this.e.setBackground(getBackground());
  }

  private void d()
  {
    setLayout(new BorderLayout());
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    localJPanel1.add(this.c, "Center");
    add(localJPanel1, "North");
    JScrollPane localJScrollPane = new JScrollPane(this.e);
    localJScrollPane.setBorder(BorderFactory.createBevelBorder(1));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createTitledBorder(ct.a(1626))));
    localJPanel2.add(localJScrollPane, "Center");
    add(localJPanel2, "Center");
    JPanel localJPanel3 = new JPanel(new FlowLayout(0));
    localJPanel3.add(this.d);
    add(localJPanel3, "South");
  }

  boolean e()
  {
    return this.d.isSelected();
  }

  void a(b paramb)
  {
    this.a = paramb;
  }

  void a()
  {
  }

  void b()
  {
    b.b(false);
    b.c(true);
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    String str = f();
    this.e.setText(str);
    this.e.setCaretPosition(0);
  }

  private String f()
  {
    StringBuffer localStringBuffer1 = new StringBuffer();
    StringBuffer localStringBuffer2 = new StringBuffer();
    int i = 0;
    if (this.a == null)
      return localStringBuffer1.toString();
    ArrayList localArrayList1 = this.a.b();
    for (int j = 0; j < localArrayList1.size(); j++)
    {
      c localc = (c)localArrayList1.get(j);
      ArrayList localArrayList2 = localc.e();
      if ((localArrayList2.isEmpty()) && (!localc.c()))
        continue;
      i++;
      localStringBuffer2.append(localc + ":\n");
      if (localArrayList2.isEmpty())
      {
        localStringBuffer2.append(ct.a(1630) + "\n");
      }
      else
      {
        localStringBuffer2.append(ct.a(1631));
        if (localArrayList2.size() > 1)
          localStringBuffer2.append(ct.a(1632));
        else
          localStringBuffer2.append(ct.a(1633));
        localStringBuffer2.append(ct.a(1634) + "\n");
        for (int k = 0; k < localArrayList2.size(); k++)
          localStringBuffer2.append("    " + ((a)localArrayList2.get(k)).a() + "\n");
        if (!localc.c())
          continue;
        localStringBuffer2.append(ct.a(1635) + "\n");
      }
    }
    localStringBuffer1.append(ct.a(1627));
    if (i > 1)
      localStringBuffer1.append(ct.a(1628));
    else
      localStringBuffer1.append(ct.a(1629));
    localStringBuffer1.append(":\n");
    localStringBuffer1.append(localStringBuffer2);
    localStringBuffer1.append("\n" + ct.a(1636) + "\n");
    localStringBuffer1.append(this.a.c() + "\n");
    return localStringBuffer1.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.qb
 * JD-Core Version:    0.6.0
 */