package com.cmeza.sdgenerator.support.maker.values;

import static com.cmeza.sdgenerator.support.maker.values.CommonValues.SPACE;

/**
 * Created by carlos on 08/04/17.
 */
public enum ObjectTypeValues {

    CLASS("class" + SPACE),
    INTERFACE("interface" + SPACE);

    private String value;

    ObjectTypeValues(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
