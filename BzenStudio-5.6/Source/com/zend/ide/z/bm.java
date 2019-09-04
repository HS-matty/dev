package com.zend.ide.z;

import com.zend.ide.p.bk;
import com.zend.ide.p.cd;
import com.zend.ide.p.z;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

class bm extends cd
  implements cu
{
  private u a;
  private m b;
  private JLabel c;
  private JLabel d;
  private JLabel e;
  private JLabel f;
  private JLabel g;
  private JLabel h;
  private ArrayList i;
  private Date j;
  private DecimalFormat k;

  public bm(m paramm, Date paramDate)
  {
    this.j = paramDate;
    this.a = paramm.d();
    this.b = paramm;
    e();
    this.k = new DecimalFormat("#0.0#", new DecimalFormatSymbols(new Locale("en")));
    setBackground(Color.white);
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.add(b(), "Center");
    JPanel localJPanel2 = null;
    try
    {
      localJPanel2 = c();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    if (localJPanel2 != null)
      localJPanel1.add(localJPanel2, "East");
    localJPanel1.setBackground(getBackground());
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    setViewportView(localJPanel1);
    setAlignmentX(0.0F);
    setName("infoPanel");
  }

  private void e()
  {
    this.i = new ArrayList();
    this.i.add(Color.red);
    this.i.add(new Color(75, 118, 255));
    this.i.add(new Color(2, 242, 2));
    this.i.add(new Color(255, 240, 0));
    this.i.add(new Color(255, 153, 0));
  }

  private JPanel b()
  {
    JPanel localJPanel = new JPanel();
    localJPanel.setBorder(BorderFactory.createTitledBorder(ct.a(917)));
    localJPanel.setLayout(new BoxLayout(localJPanel, 1));
    localJPanel.setBackground(getBackground());
    this.c = new JLabel();
    this.d = new JLabel();
    this.e = new JLabel();
    this.f = new JLabel();
    this.g = new JLabel();
    this.h = new JLabel();
    d();
    if (!this.b.a())
    {
      localJPanel.add(Box.createRigidArea(new Dimension(20, 10)));
      localJPanel.add(this.c);
      localJPanel.add(Box.createRigidArea(new Dimension(10, 5)));
      localJPanel.add(this.d);
      localJPanel.add(Box.createRigidArea(new Dimension(10, 5)));
      localJPanel.add(this.e);
      localJPanel.add(Box.createRigidArea(new Dimension(10, 5)));
    }
    localJPanel.add(this.f);
    localJPanel.add(Box.createRigidArea(new Dimension(10, 5)));
    localJPanel.add(this.g);
    localJPanel.add(Box.createRigidArea(new Dimension(10, 5)));
    localJPanel.add(this.h);
    localJPanel.setPreferredSize(new Dimension(250, (int)localJPanel.getPreferredSize().getHeight()));
    return localJPanel;
  }

  private JPanel c()
  {
    int m = 5;
    String[] arrayOfString = this.a.f();
    int n = arrayOfString.length;
    v[] arrayOfv = new v[n];
    for (int i1 = 0; i1 < n; i1++)
    {
      localObject = this.b.a(arrayOfString[i1]);
      if (localObject == null)
        continue;
      arrayOfv[i1] = new v(((n)localObject).d(), ((n)localObject).e());
    }
    Arrays.sort(arrayOfv);
    i1 = Math.min(m, n);
    Object localObject = new v[i1];
    int i2 = 0;
    for (int i3 = n - 1; i3 >= 0; i3--)
      if ((i2 >= m - 1) && (n != m))
      {
        if (localObject[(m - 1)] == null)
          localObject[(m - 1)] = new v(arrayOfv[i3].c(), ct.a(918, "" + (n - m + 1)));
        else
          localObject[(m - 1)].a(localObject[(m - 1)].c() + arrayOfv[i3].c());
      }
      else
      {
        localObject[i2] = new v(arrayOfv[i3].c(), arrayOfv[i3].b());
        i2++;
      }
    double[] arrayOfDouble = new double[localObject.length];
    double d1 = 0.0D;
    for (int i4 = 0; i4 < localObject.length; i4++)
    {
      arrayOfDouble[i4] = localObject[i4].c();
      d1 += localObject[i4].c();
    }
    JPanel localJPanel1 = new JPanel();
    localJPanel1.setLayout(new BoxLayout(localJPanel1, 1));
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(919)));
    localJPanel1.setBackground(getBackground());
    if (d1 <= 0.0D)
      return null;
    bk localbk = new bk(i1, arrayOfDouble, this.i, getBackground());
    localbk.setPreferredSize(new Dimension(200, 180));
    localbk.setMaximumSize(new Dimension(200, 180));
    localJPanel1.add(localbk);
    localJPanel1.add(Box.createRigidArea(new Dimension(0, 20)));
    JPanel localJPanel2 = a(localObject, d1);
    localJPanel2.setMaximumSize(localJPanel2.getPreferredSize());
    localJPanel1.add(localJPanel2);
    return (JPanel)localJPanel1;
  }

  private JPanel a(v[] paramArrayOfv, double paramDouble)
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.setLayout(new BoxLayout(localJPanel1, 1));
    localJPanel1.setBackground(getBackground());
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    DecimalFormat localDecimalFormat = new DecimalFormat("#0.#", new DecimalFormatSymbols(new Locale("en")));
    double d1 = 0.0D;
    for (int m = 0; m < paramArrayOfv.length; m++)
    {
      v localv = paramArrayOfv[m];
      if (localv == null)
        continue;
      File localFile = new File(localv.b());
      String str1 = "";
      if (m == paramArrayOfv.length - 1)
      {
        str1 = ct.a(920, "" + localDecimalFormat.format(100.0D - d1));
      }
      else
      {
        double d2 = localv.c() / paramDouble * 100.0D;
        d1 += d2;
        str1 = ct.a(920, "" + localDecimalFormat.format(d2));
      }
      z localz1 = new z(ct.a(921, localFile.getName(), this.k.format(localv.c()), str1));
      String str2 = localFile.getAbsolutePath();
      if ((localFile.getName().startsWith(ct.a(918).substring(0, ct.a(918).indexOf("(")))) && (m == paramArrayOfv.length - 1))
        str2 = localFile.getName();
      localz1.setToolTipText(ct.a(921, str2, "" + this.k.format(localv.c()), str1));
      z localz2 = new z("    ");
      localz2.setBorder(BorderFactory.createLineBorder(Color.black));
      localz2.setBackground((Color)this.i.get(m));
      localz2.setOpaque(true);
      JPanel localJPanel2 = new JPanel(new BorderLayout(5, 5));
      localJPanel2.setBackground(getBackground());
      localJPanel2.add(localz2, "West");
      localJPanel2.add(localz1, "Center");
      localJPanel1.add(localJPanel2);
      localJPanel1.add(Box.createRigidArea(new Dimension(10, 5)));
    }
    return localJPanel1;
  }

  private void d()
  {
    this.c.setText(ct.a(922, this.a.h()));
    this.c.setToolTipText(ct.a(922, this.a.h()));
    this.d.setText(ct.a(923, a(this.a.b())));
    this.d.setToolTipText(ct.a(923, a(this.a.b())));
    this.e.setText(ct.a(924, this.a.c()));
    this.e.setToolTipText(ct.a(924, this.a.c()));
    String str = ct.a(925, "" + this.k.format(this.a.g()));
    this.f.setText(str);
    this.f.setToolTipText(str);
    this.g.setText(ct.a(926, "" + this.a.d()));
    this.g.setToolTipText(ct.a(926, "" + this.a.d()));
    this.h.setText(ct.a(927, this.j.toString()));
    this.h.setToolTipText(ct.a(927, this.j.toString()));
    revalidate();
    repaint();
  }

  private static String a(String paramString)
  {
    String str = paramString;
    if (paramString.indexOf("start_debug") != -1)
      str = paramString.substring(0, paramString.indexOf("start_debug"));
    if (str.equals(""))
      return ct.a(928);
    if (str.endsWith("&"))
      str = str.substring(0, str.length() - 1);
    return str;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bm
 * JD-Core Version:    0.6.0
 */