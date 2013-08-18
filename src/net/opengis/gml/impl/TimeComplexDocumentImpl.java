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
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _TimeComplex(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeComplexDocumentImpl extends net.opengis.gml.impl.TimeObjectDocumentImpl implements net.opengis.gml.TimeComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeComplex");
    private static final org.apache.xmlbeans.QNameSet TIMECOMPLEX$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeTopologyComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeComplex"),
    });
    
    
    /**
     * Gets the "_TimeComplex" element
     */
    public net.opengis.gml.AbstractTimeComplexType getTimeComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeComplexType target = null;
            target = (net.opengis.gml.AbstractTimeComplexType)get_store().find_element_user(TIMECOMPLEX$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TimeComplex" element
     */
    @Inject(optional=true) public void setTimeComplex(net.opengis.gml.AbstractTimeComplexType timeComplex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeComplexType target = null;
            target = (net.opengis.gml.AbstractTimeComplexType)get_store().find_element_user(TIMECOMPLEX$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTimeComplexType)get_store().add_element_user(TIMECOMPLEX$0);
            }
            target.set(timeComplex);
        }
    }
    
    /**
     * Appends and returns a new empty "_TimeComplex" element
     */
    public net.opengis.gml.AbstractTimeComplexType addNewTimeComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeComplexType target = null;
            target = (net.opengis.gml.AbstractTimeComplexType)get_store().add_element_user(TIMECOMPLEX$0);
            return target;
        }
    }
}
