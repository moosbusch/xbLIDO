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
 * A document containing one _Operation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class OperationDocumentImpl extends net.opengis.gml.impl.SingleOperationDocumentImpl implements net.opengis.gml.OperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Operation");
    private static final org.apache.xmlbeans.QNameSet OPERATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Operation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Transformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralConversion"),
    });
    
    
    /**
     * Gets the "_Operation" element
     */
    public net.opengis.gml.AbstractCoordinateOperationType getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.AbstractCoordinateOperationType)get_store().find_element_user(OPERATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Operation" element
     */
    @Inject(optional=true) public void setOperation(net.opengis.gml.AbstractCoordinateOperationType operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.AbstractCoordinateOperationType)get_store().find_element_user(OPERATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractCoordinateOperationType)get_store().add_element_user(OPERATION$0);
            }
            target.set(operation);
        }
    }
    
    /**
     * Appends and returns a new empty "_Operation" element
     */
    public net.opengis.gml.AbstractCoordinateOperationType addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.AbstractCoordinateOperationType)get_store().add_element_user(OPERATION$0);
            return target;
        }
    }
}
