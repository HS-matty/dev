package com.zend.ide.desktop;

import com.zend.ide.util.bi;
import com.zend.ide.util.cr;
import com.zend.ide.util.cv;
import com.zend.ide.util.f.a;
import com.zend.ide.util.f.f;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.MediaTracker;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JPanel;

public class dy extends JPanel
{
  private Image a = null;
  private String b = "";
  private Font c;

  public dy(Image paramImage)
  {
    MediaTracker localMediaTracker = new MediaTracker(this);
    this.a = paramImage;
    localMediaTracker.addImage(this.a, 0);
    try
    {
      localMediaTracker.waitForID(0);
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    int i = this.a.getWidth(this);
    int j = this.a.getHeight(this);
    setPreferredSize(new Dimension(i, j));
  }

  public void paintComponent(Graphics paramGraphics)
  {
    super.paintComponent(paramGraphics);
    f localf = a.a.c();
    Font localFont = a();
    paramGraphics.setFont(localFont.deriveFont(1, 11.0F));
    paramGraphics.drawImage(this.a, 0, 0, this);
    String str1 = bi.a("BUILD_ID");
    if (str1 == null)
      str1 = "";
    int i = 246;
    paramGraphics.setColor(new Color(75, 175, 30));
    if (a.a.a())
      paramGraphics.drawString("", i, 141);
    else
      paramGraphics.drawString("Version 5.5.1 ", i, 141);
    paramGraphics.setColor(new Color(153, 166, 176));
    paramGraphics.setFont(localFont.deriveFont(1, 15.0F));
    paramGraphics.drawString(a(localf.d()), i, 181);
    paramGraphics.setColor(new Color(75, 90, 100));
    paramGraphics.setFont(localFont.deriveFont(0, 10.0F));
    paramGraphics.drawString(this.b, i, 38);
    paramGraphics.drawString("Build " + str1, i, 206);
    String str2 = localf.a;
    if (localf.b())
    {
      String str3 = localf.b.substring(8, 16);
      int k = localf.a().get(5);
      int m = localf.a().get(2) + 1;
      int n = localf.a().get(1);
      str3 = k + "/" + m + "/" + n;
      paramGraphics.drawString("Licensed to: " + str2, i, 220);
      paramGraphics.drawString("Valid until " + str3, i, 234);
    }
    else
    {
      if (str2.length() > 21)
        str2 = str2.substring(0, 18) + "...";
      paramGraphics.drawString("Licensed to: " + str2, i, 220);
      int j = localf.e;
      if (j > 0)
        paramGraphics.drawString(j + " User License", i, 234);
    }
  }

  private Font a()
  {
    if ((this.c == null) && (cr.c() == 1))
    {
      String[] arrayOfString = arrayOfString = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(Locale.getDefault());
      for (int i = 0; i < arrayOfString.length; i++)
      {
        if (!arrayOfString[i].equals("Tahoma"))
          continue;
        this.c = new Font("Tahoma", 0, 11);
      }
    }
    if (this.c == null)
      this.c = cv.e();
    else if ((this.b != null) && (this.b.length() > 0) && (!this.c.canDisplay(this.b.charAt(0))))
      this.c = cv.e();
    return this.c;
  }

  private String a(int paramInt)
  {
    switch (paramInt)
    {
    case 1:
      return "Professional Edition";
    case 3:
      return "Professional Edition";
    case 2:
      return "Enterprise Edition";
    }
    return "Standard Edition";
  }

  public void a(String paramString)
  {
    this.b = paramString;
    repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.dy
 * JD-Core Version:    0.6.0
 */