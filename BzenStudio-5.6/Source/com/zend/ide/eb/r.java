package com.zend.ide.eb;

import com.zend.ide.p.f.e;
import java.util.Arrays;
import javax.swing.tree.DefaultMutableTreeNode;

public class r extends e
{
  String[] i;

  public r(String paramString, Object paramObject)
  {
    super(paramString);
    this.i = ((String[])(String[])paramObject);
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    if (paramObject.equals("User Defined"))
      return new t(paramObject);
    return new p(paramObject);
  }

  public Object d()
  {
    Arrays.sort(this.i);
    String[] arrayOfString = new String[this.i.length + 1];
    arrayOfString[0] = "User Defined";
    System.arraycopy(this.i, 0, arrayOfString, 1, this.i.length);
    this.i = arrayOfString;
    return this.i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.r
 * JD-Core Version:    0.6.0
 */