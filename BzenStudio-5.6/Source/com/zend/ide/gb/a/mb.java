package com.zend.ide.gb.a;

import com.a.f;
import com.zend.ide.desktop.cj;
import com.zend.ide.gb.g;
import com.zend.ide.i.n;
import com.zend.ide.m.bf;
import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class mb extends n
  implements cu
{
  protected static final String b = cv.d() + File.separator + "wsdl";
  private g c;
  private JPanel d;
  private JPanel e;
  private w f;
  private w g;
  private w h;
  private w i;
  private int j = 0;
  private ob[] k;
  private z l;
  private JLabel m;
  private JPanel n;
  private com.zend.ide.gb.b.b o;
  private pb p;
  private rb q;
  private sb r;
  private qb s;
  private cj t;

  public mb(g paramg, cj paramcj)
  {
    super(com.zend.ide.bd.c.b().h(), ct.a(1612));
    this.c = paramg;
    this.t = paramcj;
    a();
  }

  private void a()
  {
    this.d = new JPanel(new BorderLayout());
    this.d.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEtchedBorder()));
    e();
    g();
    c();
    getContentPane().add(this.d, "Center");
    getContentPane().add(this.e, "South");
    getContentPane().add(this.n, "West");
    setModal(true);
    setSize(620, 400);
    setResizable(false);
    Dimension localDimension1 = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension localDimension2 = getSize();
    setLocation(localDimension1.width / 2 - localDimension2.width / 2, localDimension1.height / 2 - localDimension2.height / 2);
  }

  private void c()
  {
    this.p = new pb(this);
    this.q = new rb(this);
    this.r = new sb(this);
    this.s = new qb(this);
    this.k = new ob[] { this.p, this.q, this.r, this.s };
    this.p.a(i());
    this.j = 0;
    this.d.add(this.k[this.j], "Center");
    this.p.n();
    this.h.setEnabled(false);
  }

  public void a(com.zend.ide.gb.b.b paramb)
  {
    this.o = paramb;
    for (int i1 = 0; i1 < this.k.length; i1++)
      this.k[i1].a(paramb);
    SwingUtilities.invokeLater(new a(this));
  }

  public void d()
  {
    for (int i1 = 0; i1 < this.k.length; i1++)
      this.k[i1].a();
  }

  public bf a(String paramString)
  {
    return this.c.c(paramString);
  }

  private void e()
  {
    this.e = new JPanel(new FlowLayout(2));
    this.f = new w(ct.b(117));
    this.g = new w(ct.b(699));
    this.h = new w(ct.b(700));
    this.i = new w(ct.b(701));
    JButton localJButton = new JButton(ct.a(639));
    localJButton.addActionListener(new b(this));
    this.f.addActionListener(new c(this));
    this.g.addActionListener(new d(this));
    this.h.addActionListener(new e(this));
    this.i.addActionListener(new wb(this));
    this.e.add(this.h);
    this.e.add(this.i);
    this.e.add(this.g);
    this.e.add(this.f);
    this.e.add(localJButton);
  }

  private void f()
  {
    this.c.a(this.o);
  }

  private void g()
  {
    this.l = new z(ct.a(1601));
    this.l.setForeground(com.zend.ide.p.e.b.b);
    this.l.setFont(this.l.getFont().deriveFont(1));
    JPanel localJPanel = new JPanel(new FlowLayout(1));
    localJPanel.add(this.l);
    this.m = new JLabel(cv.b("wsdlCreator/WSDL_img.gif"), 0);
    this.n = new JPanel(new BorderLayout());
    this.n.add(this.m, "Center");
    this.n.add(localJPanel, "North");
    this.n.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black)));
  }

  private void h()
  {
    this.h.setEnabled(this.j != 0);
    this.k[this.j].b();
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!this.k[this.j].b(paramBoolean1))
      return;
    this.d.remove(this.k[this.j]);
    if (paramBoolean1)
      this.j += 1;
    else
      this.j -= 1;
    if (this.j == 2)
    {
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      this.c.a(this.o, localArrayList1, localArrayList2, true);
      if (localArrayList1.isEmpty())
      {
        if (paramBoolean1)
          this.j += 1;
        else
          this.j -= 1;
      }
      else if (paramBoolean1)
        this.r.a(localArrayList1, localArrayList2);
    }
    this.k[this.j].a(paramBoolean1, paramBoolean2);
    this.d.add(this.k[this.j], "Center");
    h();
    validate();
    repaint();
  }

  public void b(boolean paramBoolean)
  {
    this.i.setEnabled(paramBoolean);
  }

  public void c(boolean paramBoolean)
  {
    this.g.setEnabled(paramBoolean);
  }

  private ArrayList i()
  {
    ArrayList localArrayList = new ArrayList();
    File localFile = new File(b);
    if (!localFile.exists())
      localFile.mkdirs();
    File[] arrayOfFile = localFile.listFiles();
    for (int i1 = 0; i1 < arrayOfFile.length; i1++)
      try
      {
        localArrayList.add(f.a(arrayOfFile[i1].getAbsolutePath()));
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
      }
      catch (ParserConfigurationException localParserConfigurationException)
      {
        cl.a(localParserConfigurationException);
      }
      catch (SAXException localSAXException)
      {
        cl.a(localSAXException);
      }
    return localArrayList;
  }

  private void j()
  {
    File localFile = new File(b);
    if (!localFile.exists())
      localFile.mkdirs();
    File[] arrayOfFile = localFile.listFiles();
    for (int i1 = 0; i1 < arrayOfFile.length; i1++)
      arrayOfFile[i1].delete();
    Object[] arrayOfObject = this.p.m();
    for (int i2 = 0; i2 < arrayOfObject.length; i2++)
    {
      String str = b + File.separator + ((com.zend.ide.gb.b.b)arrayOfObject[i2]).d() + ".xml";
      try
      {
        f.a(str, arrayOfObject[i2]);
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
      }
    }
  }

  public boolean k()
  {
    return this.q.q();
  }

  public void l()
  {
    while (this.j > 0)
      a(false, true);
    this.p.n();
    super.setVisible(true);
  }

  cj a()
  {
    return this.t;
  }

  static ob[] a(mb parammb)
  {
    return parammb.k;
  }

  static int b(mb parammb)
  {
    return parammb.j;
  }

  static com.zend.ide.gb.b.b c(mb parammb)
  {
    return parammb.o;
  }

  static g d(mb parammb)
  {
    return parammb.c;
  }

  static void e(mb parammb)
  {
    parammb.f();
  }

  static void f(mb parammb)
  {
    parammb.j();
  }

  static qb g(mb parammb)
  {
    return parammb.s;
  }

  static void a(mb parammb, boolean paramBoolean1, boolean paramBoolean2)
  {
    parammb.a(paramBoolean1, paramBoolean2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.mb
 * JD-Core Version:    0.6.0
 */