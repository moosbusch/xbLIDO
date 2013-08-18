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
 * A document containing one sourceDimensions(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SourceDimensionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SourceDimensionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceDimensionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEDIMENSIONS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "sourceDimensions");
    
    
    /**
     * Gets the "sourceDimensions" element
     */
    public java.math.BigInteger getSourceDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDIMENSIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceDimensions" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetSourceDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(SOURCEDIMENSIONS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceDimensions" element
     */
    @Inject(optional=true) public void setSourceDimensions(java.math.BigInteger sourceDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDIMENSIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEDIMENSIONS$0);
            }
            target.setBigIntegerValue(sourceDimensions);
        }
    }
    
    /**
     * Sets (as xml) the "sourceDimensions" element
     */
    public void xsetSourceDimensions(org.apache.xmlbeans.XmlPositiveInteger sourceDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(SOURCEDIMENSIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(SOURCEDIMENSIONS$0);
            }
            target.set(sourceDimensions);
        }
    }
}
