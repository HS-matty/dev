package com.zend.ide.n.td;

import java.util.EventObject;
import java.util.List;

public class ec extends EventObject
{
  private List a;
  private gb b;
  private c c;

  public ec(jb paramjb, gb paramgb, c paramc)
  {
    super(paramjb);
    if ((paramgb == null) && (paramc != c.EXPAND_ALL) && (paramc != c.COLLAPSE_ALL) && (paramc != c.REMOVE_ALL))
      throw new IllegalArgumentException("The Fold cannot be null");
    this.b = paramgb;
    this.c = paramc;
  }

  public ec(jb paramjb, List paramList, c paramc)
  {
    super(paramjb);
    if ((paramList == null) && (paramc != c.EXPAND_ALL) && (paramc != c.COLLAPSE_ALL) && (paramc != c.REMOVE_ALL))
      throw new IllegalArgumentException("The Folds cannot be null");
    this.a = paramList;
    this.c = paramc;
  }

  public ec(jb paramjb, c paramc)
  {
    super(paramjb);
    this.c = paramc;
  }

  public gb a()
  {
    return this.b;
  }

  public List b()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.ec
 * JD-Core Version:    0.6.0
 */