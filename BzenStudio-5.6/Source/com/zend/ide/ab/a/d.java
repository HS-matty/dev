package com.zend.ide.ab.a;

import com.zend.ide.ab.b;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.Timer;

public class d
  implements b
{
  private static final String[] a = { "byte", "short", "int", "float", "long", "double" };
  private static Color b = new Color(105, 205, 255);
  private boolean c;
  private boolean d;
  private long e;
  private long f;
  private h g;
  private t h;
  private JScrollBar i;
  private JTextField j;
  private JRadioButton k;
  private JRadioButton l;
  private JRadioButton m;
  private JRadioButton n;
  private JComboBox o;
  private Timer p;
  private JPanel q;
  private char r;

  public void a(byte[] paramArrayOfByte)
  {
    this.g = new i(paramArrayOfByte);
    try
    {
      a();
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }

  private void a()
    throws IOException
  {
    this.e = this.g.b();
    this.h = new t(this);
    this.h.setBackground(Color.white);
    this.h.setBorder(BorderFactory.createBevelBorder(1));
    this.i = new JScrollBar(1, 0, 0, 0, (int)((this.e + 15L) / 16L));
    this.i.addAdjustmentListener(new e(this));
    this.h.addComponentListener(new a(this));
    JPanel localJPanel = e();
    this.q = new JPanel(new BorderLayout(0, 5));
    this.q.add(this.h);
    this.q.add("East", this.i);
    this.q.add("South", localJPanel);
    this.q.setSize(580, 450);
    b(20);
    a(30);
    this.p = new Timer(150, new f(this));
    this.p.setRepeats(false);
    this.p.start();
  }

  public void a(int paramInt)
  {
    if ((paramInt != 40) && (paramInt != 30))
      throw new IllegalArgumentException("Endian type can only be BIG_ENDIAN or LITTLE_ENDIAN");
    if (paramInt == 40)
    {
      if (this.c)
        return;
      this.c = true;
      this.l.setSelected(true);
    }
    else
    {
      if (!this.c)
        return;
      this.c = false;
      this.k.setSelected(true);
    }
    g();
  }

  public void b(int paramInt)
  {
    if ((paramInt != 20) && (paramInt != 10))
      throw new IllegalArgumentException("Display type can only be DECIMAL_DISPLAY or HEX_DISPLAY");
    if (paramInt == 20)
    {
      if (this.d)
        return;
      this.d = true;
      this.n.setSelected(true);
    }
    else
    {
      if (!this.d)
        return;
      this.d = false;
      this.m.setSelected(true);
    }
    g();
  }

  public JComponent a()
  {
    return this.q;
  }

  public void b()
  {
    try
    {
      this.g.c();
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }

  private void c()
  {
    a(this.k.isSelected() ? 30 : 40);
  }

  private void d()
  {
    b(this.n.isSelected() ? 20 : 10);
  }

  private JPanel e()
  {
    JPanel localJPanel1 = new JPanel(new FlowLayout(0));
    localJPanel1.setBorder(BorderFactory.createLoweredBevelBorder());
    JPanel localJPanel2 = new JPanel(new GridLayout(2, 2));
    this.k = new JRadioButton(new s(this, "Little Endian"));
    this.l = new JRadioButton(new s(this, "Big Endian"));
    this.n = new JRadioButton(new r(this, "Decimal"));
    this.m = new JRadioButton(new r(this, "Hex"));
    this.k.setSelected(!this.c);
    this.l.setSelected(this.c);
    this.n.setSelected(this.d);
    this.m.setSelected(!this.d);
    ButtonGroup localButtonGroup1 = new ButtonGroup();
    localButtonGroup1.add(this.k);
    localButtonGroup1.add(this.l);
    ButtonGroup localButtonGroup2 = new ButtonGroup();
    localButtonGroup2.add(this.n);
    localButtonGroup2.add(this.m);
    localJPanel2.add(this.k);
    localJPanel2.add(this.n);
    localJPanel2.add(this.l);
    localJPanel2.add(this.m);
    localJPanel1.add(localJPanel2);
    JPanel localJPanel3 = new JPanel(new GridBagLayout());
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.gridheight = 1;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.insets = new Insets(1, 3, 0, 1);
    this.o = f();
    this.r = 'b';
    this.j = new JTextField(24);
    this.j.setHorizontalAlignment(4);
    this.j.setEditable(false);
    this.j.setBackground(Color.white);
    localJPanel3.add(this.o, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localJPanel3.add(this.j, localGridBagConstraints);
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.insets = new Insets(1, 0, 0, 1);
    localJPanel3.add(new JLabel(" "), localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localJPanel3.add(new JLabel(" "), localGridBagConstraints);
    localJPanel1.add(localJPanel3);
    a(new Font("Courier New", 0, 12));
    return localJPanel1;
  }

  private void a(Font paramFont)
  {
    this.k.setFont(paramFont);
    this.l.setFont(paramFont);
    this.n.setFont(paramFont);
    this.o.setFont(paramFont);
    this.j.setFont(paramFont);
    this.m.setFont(paramFont);
  }

  private JComboBox f()
  {
    JComboBox localJComboBox = new JComboBox(a);
    localJComboBox.addItemListener(new g(this));
    localJComboBox.setPreferredSize(new Dimension(80, localJComboBox.getPreferredSize().height));
    return localJComboBox;
  }

  public void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      throw new IllegalArgumentException("Illegal value type");
    this.r = paramString.toLowerCase().charAt(0);
    this.h.repaint();
  }

  private void g()
  {
    if (this.j == null)
      return;
    long l1 = this.f;
    try
    {
      this.g.a(l1);
      byte[] arrayOfByte;
      switch (this.r)
      {
      case 'b':
        if (l1 <= this.e - 1L)
        {
          arrayOfByte = new byte[1];
          this.g.a(arrayOfByte);
          byte b1 = arrayOfByte[0];
          a(b1);
        }
        else
        {
          this.j.setText("");
        }
        break;
      case 's':
        if (l1 <= this.e - 2L)
        {
          arrayOfByte = new byte[2];
          this.g.a(arrayOfByte);
          short s;
          if (this.c)
            s = a(arrayOfByte[0], arrayOfByte[1]);
          else
            s = b(arrayOfByte[0], arrayOfByte[1]);
          a(s);
        }
        else
        {
          this.j.setText("");
        }
        break;
      case 'i':
        if (l1 <= this.e - 4L)
          c(h());
        else
          this.j.setText("");
        break;
      case 'f':
        if (l1 <= this.e - 4L)
        {
          float f1 = Float.intBitsToFloat(h());
          this.j.setText("" + f1);
        }
        else
        {
          this.j.setText("");
        }
        break;
      case 'l':
        if (l1 <= this.e - 8L)
          a(i());
        else
          this.j.setText("");
        break;
      case 'd':
        if (l1 <= this.e - 8L)
        {
          double d1 = Double.longBitsToDouble(i());
          this.j.setText("" + d1);
        }
        else
        {
          this.j.setText("");
        }
        break;
      case 'c':
      case 'e':
      case 'g':
      case 'h':
      case 'j':
      case 'k':
      case 'm':
      case 'n':
      case 'o':
      case 'p':
      case 'q':
      case 'r':
      default:
        this.j.setText("");
      }
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }

  private int h()
    throws IOException
  {
    byte[] arrayOfByte = new byte[4];
    this.g.a(arrayOfByte);
    int i1;
    if (this.c)
      i1 = a(arrayOfByte[0], arrayOfByte[1], arrayOfByte[2], arrayOfByte[3]);
    else
      i1 = b(arrayOfByte[0], arrayOfByte[1], arrayOfByte[2], arrayOfByte[3]);
    return i1;
  }

  private long i()
    throws IOException
  {
    byte[] arrayOfByte = new byte[8];
    this.g.a(arrayOfByte);
    long l1;
    if (this.c)
      l1 = a(arrayOfByte[0], arrayOfByte[1], arrayOfByte[2], arrayOfByte[3], arrayOfByte[4], arrayOfByte[5], arrayOfByte[6], arrayOfByte[7]);
    else
      l1 = b(arrayOfByte[0], arrayOfByte[1], arrayOfByte[2], arrayOfByte[3], arrayOfByte[4], arrayOfByte[5], arrayOfByte[6], arrayOfByte[7]);
    return l1;
  }

  private void a(byte paramByte)
  {
    if (this.d)
      this.j.setText(Integer.toString(paramByte));
    else
      this.j.setText("0x" + Integer.toHexString(paramByte & 0xFF));
  }

  private void a(short paramShort)
  {
    if (this.d)
      this.j.setText(Integer.toString(paramShort));
    else
      this.j.setText("0x" + Integer.toHexString(paramShort & 0xFFFF));
  }

  private void a(long paramLong)
  {
    if (this.d)
      this.j.setText(Long.toString(paramLong));
    else
      this.j.setText("0x" + Long.toHexString(paramLong));
  }

  private void c(int paramInt)
  {
    if (this.d)
      this.j.setText(Integer.toString(paramInt));
    else
      this.j.setText("0x" + Integer.toHexString(paramInt));
  }

  private static short a(byte paramByte1, byte paramByte2)
  {
    return (short)((paramByte1 & 0xFF) << 8 | paramByte2 & 0xFF);
  }

  private static int a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    return (paramByte1 & 0xFF) << 24 | (paramByte2 & 0xFF) << 16 | (paramByte3 & 0xFF) << 8 | paramByte4 & 0xFF;
  }

  private static long a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8)
  {
    return (paramByte1 & 0xFF) << 56 | (paramByte2 & 0xFF) << 48 | (paramByte3 & 0xFF) << 40 | (paramByte4 & 0xFF) << 32 | (paramByte5 & 0xFF) << 24 | (paramByte6 & 0xFF) << 16 | (paramByte7 & 0xFF) << 8 | paramByte8 & 0xFF;
  }

  private static short b(byte paramByte1, byte paramByte2)
  {
    return (short)((paramByte2 & 0xFF) << 8 | paramByte1 & 0xFF);
  }

  private static int b(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    return (paramByte4 & 0xFF) << 24 | (paramByte3 & 0xFF) << 16 | (paramByte2 & 0xFF) << 8 | paramByte1 & 0xFF;
  }

  private static long b(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8)
  {
    return (paramByte8 & 0xFF) << 56 | (paramByte7 & 0xFF) << 48 | (paramByte6 & 0xFF) << 40 | (paramByte5 & 0xFF) << 32 | (paramByte4 & 0xFF) << 24 | (paramByte3 & 0xFF) << 16 | (paramByte2 & 0xFF) << 8 | paramByte1 & 0xFF;
  }

  static t a(d paramd)
  {
    return paramd.h;
  }

  static JScrollBar b(d paramd)
  {
    return paramd.i;
  }

  static void c(d paramd)
  {
    paramd.g();
  }

  static long a(d paramd)
  {
    return paramd.f;
  }

  static long d(d paramd)
  {
    return paramd.e;
  }

  static long a(d paramd, long paramLong)
  {
    return paramd.f += paramLong;
  }

  static Timer b(d paramd)
  {
    return paramd.p;
  }

  static long b(d paramd, long paramLong)
  {
    return paramd.f -= paramLong;
  }

  static long c(d paramd, long paramLong)
  {
    return paramd.f = paramLong;
  }

  static h c(d paramd)
  {
    return paramd.g;
  }

  static Color a()
  {
    return b;
  }

  static char d(d paramd)
  {
    return paramd.r;
  }

  static void e(d paramd)
  {
    paramd.c();
  }

  static void i(d paramd)
  {
    paramd.d();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.d
 * JD-Core Version:    0.6.0
 */