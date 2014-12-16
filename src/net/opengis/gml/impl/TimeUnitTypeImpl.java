/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.opengis.gml.impl; 
/**
 * An XML TimeUnitType(@http://www.opengis.net/gml).
 *
 * This is a union type. Instances are of one of the following types:
 *     net.opengis.gml.TimeUnitType$Member
 *     net.opengis.gml.TimeUnitType$Member2
 */
public class TimeUnitTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements net.opengis.gml.TimeUnitType, net.opengis.gml.TimeUnitType.Member, net.opengis.gml.TimeUnitType.Member2
{
    private static final long serialVersionUID = 1L;
    
    public TimeUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected TimeUnitTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of net.opengis.gml.TimeUnitType$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.gml.TimeUnitType.Member
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of net.opengis.gml.TimeUnitType$Member2.
     */
    public static class MemberImpl2 extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements net.opengis.gml.TimeUnitType.Member2
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl2(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl2(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
