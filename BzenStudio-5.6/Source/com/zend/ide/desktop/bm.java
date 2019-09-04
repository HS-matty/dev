package com.zend.ide.desktop;

import javax.swing.JOptionPane;

public class bm
{
  public static void b()
  {
    try
    {
      String str1 = System.getProperty("java.version");
      String str2 = str1.substring(0, "1.4.1".length());
      if (str2.compareToIgnoreCase("1.4.1") < 0)
      {
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("Zend Studio does not support the version of Java Virtual Machine that is installed on your computer.\n");
        localStringBuffer.append("Please reinstall Zend Studio Client using the full installation (include JRE),\n");
        localStringBuffer.append("or install version 1.4.1 (or higher) of the Java Virtual Machine, from Sun Microsystems (java.sun.com).");
        JOptionPane.showMessageDialog(null, localStringBuffer.toString(), "Incompatible Java Version", 0);
        System.exit(1);
      }
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bm
 * JD-Core Version:    0.6.0
 */