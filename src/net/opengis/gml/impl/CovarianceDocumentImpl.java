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
 * A document containing one covariance(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CovarianceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CovarianceDocument
{
    private static final long serialVersionUID = 1L;
    
    public CovarianceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COVARIANCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "covariance");
    
    
    /**
     * Gets the "covariance" element
     */
    public double getCovariance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COVARIANCE$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "covariance" element
     */
    public org.apache.xmlbeans.XmlDouble xgetCovariance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(COVARIANCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "covariance" element
     */
     public void setCovariance(double covariance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COVARIANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COVARIANCE$0);
            }
            target.setDoubleValue(covariance);
        }
    }
    
    /**
     * Sets (as xml) the "covariance" element
     */
    public void xsetCovariance(org.apache.xmlbeans.XmlDouble covariance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(COVARIANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(COVARIANCE$0);
            }
            target.set(covariance);
        }
    }
}
