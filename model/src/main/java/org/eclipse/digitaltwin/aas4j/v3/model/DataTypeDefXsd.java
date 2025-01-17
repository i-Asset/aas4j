/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

/**
 * Enumeration listing all XSD anySimpleTypes
 */
@IRI("aas:DataTypeDefXsd")
public enum DataTypeDefXsd {

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/AnyUri")
    ANY_URI("xs:anyURI"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Base64Binary")
    BASE64BINARY("xs:base64Binary"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Boolean")
    BOOLEAN("xs:boolean"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Byte")
    BYTE("xs:byte"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Date")
    DATE("xs:date"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/DateTime")
    DATE_TIME("xs:dateTime"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Decimal")
    DECIMAL("xs:decimal"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Double")
    DOUBLE("xs:double"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Duration")
    DURATION("xs:duration"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Float")
    FLOAT("xs:float"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/GDay")
    GDAY("xs:gDay"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/GMonth")
    GMONTH("xs:gMonth"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/GMonthDay")
    GMONTH_DAY("xs:gMonthDay"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/GYear")
    GYEAR("xs:gYear"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/GYearMonth")
    GYEAR_MONTH("xs:gYearMonth"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/HexBinary")
    HEX_BINARY("xs:hexBinary"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Int")
    INT("xs:int"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Integer")
    INTEGER("xs:integer"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Long")
    LONG("xs:long"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/NegativeInteger")
    NEGATIVE_INTEGER("xs:negativeInteger"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/NonNegativeInteger")
    NON_NEGATIVE_INTEGER("xs:nonNegativeInteger"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/NonPositiveInteger")
    NON_POSITIVE_INTEGER("xs:nonPositiveInteger"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/PositiveInteger")
    POSITIVE_INTEGER("xs:positiveInteger"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Short")
    SHORT("xs:short"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/String")
    STRING("xs:string"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Time")
    TIME("xs:time"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/UnsignedByte")
    UNSIGNED_BYTE("xs:unsignedByte"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/UnsignedInt")
    UNSIGNED_INT("xs:unsignedInt"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/UnsignedLong")
    UNSIGNED_LONG("xs:unsignedLong"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/UnsignedShort")
    UNSIGNED_SHORT("xs:unsignedShort");

    private String value;

    DataTypeDefXsd(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static DataTypeDefXsd fromValue(String text) {
        for (DataTypeDefXsd b : DataTypeDefXsd.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
