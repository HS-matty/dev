package com.zend.ide.d;

import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.ac;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.mc;
import com.zend.ide.util.qb;
import com.zend.ide.y.a;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import com.zend.ide.zendPlatformIntegration.a.r;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class sd extends JPanel
  implements a, cu, bn
{
  private static final long serialVersionUID = 1L;
  private JTextField a;
  private x b;
  private JTextField c;
  private JPasswordField d;
  private bb e;
  private String f = "propertyEditor";
  private bt g;

  public sd()
  {
    a();
    this.e = new oc(this, null);
    oc.a((oc)this.e);
    this.g = new bt(this);
  }

  private void a()
  {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    add(b(), "North");
  }

  private JPanel b()
  {
    JPanel localJPanel = new JPanel(new GridBagLayout());
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.gridwidth = 0;
    localJPanel.add(c(), localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(10, 0, 0, 0);
    localJPanel.add(d(), localGridBagConstraints);
    return localJPanel;
  }

  private JPanel c()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    JPanel localJPanel2 = new JPanel();
    GridBagLayout localGridBagLayout = new GridBagLayout();
    localJPanel2.setLayout(localGridBagLayout);
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    localJPanel1.add(localJPanel2, "Center");
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.fill = 2;
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1925)));
    z localz = new z();
    this.a = new JTextField();
    this.b = new x(ct.a(642));
    this.b.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    this.b.addActionListener(new gc(this));
    localGridBagConstraints.gridwidth = 0;
    localJPanel2.add(this.b, localGridBagConstraints);
    localGridBagConstraints.weightx = 0.0D;
    localGridBagConstraints.gridwidth = -1;
    String str = ct.a(148).toString();
    localz.setText(str);
    localz.setBorder(BorderFactory.createEmptyBorder(4, 18, 4, 0));
    localJPanel2.add(localz, localGridBagConstraints);
    localGridBagConstraints.gridwidth = 0;
    localJPanel2.add(this.a, localGridBagConstraints);
    JPanel localJPanel3 = new JPanel();
    FlowLayout localFlowLayout = new FlowLayout(0);
    localFlowLayout.setHgap(0);
    localFlowLayout.setVgap(0);
    localJPanel3.setLayout(localFlowLayout);
    localJPanel3.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
    JButton localJButton = mc.b();
    localJPanel3.add(localJButton);
    localJPanel2.add(localJPanel3, localGridBagConstraints);
    return localJPanel1;
  }

  private JPanel d()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    JLabel localJLabel1 = new JLabel(ct.a(1763) + ' ');
    JLabel localJLabel2 = new JLabel(ct.a(1764) + ' ');
    this.c = new JTextField();
    this.d = new JPasswordField();
    GridLayout localGridLayout = new GridLayout(2, 1, 1, 3);
    localGridLayout.setVgap(8);
    JPanel localJPanel3 = new JPanel(localGridLayout);
    JPanel localJPanel4 = new JPanel(localGridLayout);
    localJPanel3.add(localJLabel1);
    localJPanel4.add(this.c);
    this.c.setColumns(20);
    localJPanel3.add(localJLabel2);
    localJPanel4.add(this.d);
    localJPanel2.add(localJPanel3, "Center");
    localJPanel2.add(localJPanel4, "After");
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1968)));
    localJPanel1.add(localJPanel2, "West");
    return localJPanel1;
  }

  public void d()
  {
    b.a("platform.useDefaultGUI").a(new Boolean(this.b.isSelected()));
    String str1 = b.a("platform.guiURL").c().toString();
    String str2 = this.a.getText();
    if (!str1.equalsIgnoreCase(str2))
      b.a("platform.serversFilterArray").a(new r[0]);
    b.a("platform.guiURL").a(str2);
    b.a("platform.username").a(this.c.getText());
    b.a("platform.password").a(ac.a(this.d.getPassword()));
    f();
  }

  public void f()
  {
    boolean bool = ((Boolean)b.a("platform.useDefaultGUI").c()).booleanValue();
    this.b.setSelected(bool);
    if (bool)
    {
      str1 = b.a("debugging.serverHost").c().toString();
      if (str1.endsWith("/"))
        this.a.setText(str1 + "ZendPlatform");
      else
        this.a.setText(str1 + "/ZendPlatform");
      this.a.setEnabled(false);
    }
    else
    {
      str1 = (String)b.a("platform.guiURL").c();
      this.a.setText(str1);
    }
    String str1 = (String)b.a("platform.username").c();
    String str2 = b.a("platform.password").c().toString();
    this.c.setText(str1);
    try
    {
      this.d.setText(ac.b(str2));
    }
    catch (qb localqb)
    {
      this.d.setText("");
    }
  }

  private void g()
  {
  }

  public void e()
  {
  }

  public JComponent c()
  {
    return this;
  }

  public boolean d(boolean paramBoolean)
  {
    return this.g.d(paramBoolean);
  }

  public bb q()
  {
    return this.e;
  }

  public void d(String paramString)
  {
    this.f = paramString;
  }

  public String r()
  {
    return this.f;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public void a(bn parambn)
  {
    this.e.a(parambn.q());
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public bs t()
  {
    return this.g;
  }

  public void a(String paramString)
  {
  }

  static x a(sd paramsd)
  {
    return paramsd.b;
  }

  static JTextField b(sd paramsd)
  {
    return paramsd.a;
  }

  static void c(sd paramsd)
  {
    paramsd.g();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.sd
 * JD-Core Version:    0.6.0
 */