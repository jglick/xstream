/*
 * Copyright (C) 2007 XStream Committers.
 * All rights reserved.
 *
 * The software in this package is published under the terms of the BSD
 * style license a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 * 
 * Created on 13. September 2007 by Joerg Schaible
 */
package com.thoughtworks.xstream.benchmark.xmlfriendly.target;

import com.thoughtworks.xstream.benchmark.reflection.targets.AbstractReflectionTarget;
import com.thoughtworks.xstream.benchmark.xmlfriendly.model.A100_Fields;
import com.thoughtworks.xstream.tools.benchmark.Target;

import java.util.ArrayList;
import java.util.List;

/**
 * A Target for a 100 fields class with each field name containing 5 underscores.
 * 
 * @author J&ouml;rg Schaible
 * @see com.thoughtworks.xstream.tools.benchmark.Harness
 * @see Target
 */
public class Field_Reflection extends AbstractReflectionTarget {

    public Field_Reflection() {
        super(new ArrayList());
        List list = (List)target();
        for(int i = 0; i < 100; ++i) {
            Object o = new A100_Fields();
            fill(o);
            list.add(o);
        }
    }

    public String toString() {
        return "Field with underscores Target";
    }

}
