package com.zend.ide.n.td;

import javax.swing.text.Position;

public class t extends r
{
  public t(boolean paramBoolean, Position paramPosition1, Position paramPosition2)
  {
    super(paramBoolean, paramPosition1, paramPosition2);
  }

  protected ob d()
  {
    return new y();
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("DocumentationFold (");
    localStringBuffer.append(d());
    localStringBuffer.append(", ");
    localStringBuffer.append(e());
    localStringBuffer.append("), ");
    localStringBuffer.append(c() ? "collapsed" : "expanded");
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.t
 * JD-Core Version:    0.6.0
 */