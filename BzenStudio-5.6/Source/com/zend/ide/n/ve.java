package com.zend.ide.n;

public enum ve
{
  public static final ve OK = new ve("OK", 0);
  public static final ve EUC_JP = new ve("EUC_JP", 1);
  public static final ve UTF8 = new ve("UTF8", 2);
  public static final ve SHIFT_JIS = new ve("SHIFT_JIS", 3);
  public static final ve JIS = new ve("JIS", 4);
  public static final ve MS932 = new ve("MS932", 5);
  private static final ve[] a = { OK, EUC_JP, UTF8, SHIFT_JIS, JIS, MS932 };
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ve
 * JD-Core Version:    0.6.0
 */