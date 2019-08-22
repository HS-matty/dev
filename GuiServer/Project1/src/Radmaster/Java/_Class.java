package Radmaster.Java;

import Radmaster.Std.Element;

import Radmaster.StdClass;

public class _Class extends StdClass{
    public _Class() {
        super();
    }
    
    
    
/*
** StdClass  overrides
*/
    protected static _Class self;
    @Override
    public _Class _this() {
        return this;
    }

    @Override
    public _Class value(String value) {
        return (_Class)super.value(value);
    }

    @Override
    public _Class name(String name) {
        return (_Class)super.name(name);
    }
/*
** End StdClass overrides
*/
    
    
}
