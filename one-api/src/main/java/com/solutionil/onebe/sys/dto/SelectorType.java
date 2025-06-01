package com.solutionil.onebe.sys.dto;

import com.solutionil.onebe.sys.dto.response.SelectorDataResponse;

import java.util.Arrays;

public enum SelectorType {
    COMP("comp", SelectorDataResponse.Comp.class),
    BIZ("biz", SelectorDataResponse.Biz.class),
    WH("wh", SelectorDataResponse.Wh.class),
    DEPT("dept", SelectorDataResponse.Dept.class),
    ZONE("zone", SelectorDataResponse.Zone.class),
    LOC("loc", SelectorDataResponse.Loc.class),
    CUST("cust", SelectorDataResponse.Cust.class),
    CUST_DELIV("custDeliv", SelectorDataResponse.CustDeliv.class),
    SUPPL("suppl", SelectorDataResponse.Suppl.class),
    ITEM("item", SelectorDataResponse.Item.class),
    EMP("emp", SelectorDataResponse.Emp.class),
    MENU("menu", SelectorDataResponse.Menu.class);

    private final String typeName;
    private final Class<?> responseClass;

    SelectorType(String typeName, Class<?> responseClass) {
        this.typeName = typeName;
        this.responseClass = responseClass;
    }

    public String getTypeName() {
        return typeName;
    }

    public Class<?> getResponseClass() {
        return responseClass;
    }

    public static SelectorType fromString(String typeName) {
        return Arrays.stream(SelectorType.values())
                .filter(type -> type.typeName.equalsIgnoreCase(typeName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown selector type: " + typeName));
    }
}
