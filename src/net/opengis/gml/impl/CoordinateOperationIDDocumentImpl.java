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
 * A document containing one coordinateOperationID(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordinateOperationIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CoordinateOperationIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateOperationIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATEOPERATIONID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateOperationID");
    
    
    /**
     * Gets the "coordinateOperationID" element
     */
    public net.opengis.gml.IdentifierType getCoordinateOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(COORDINATEOPERATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateOperationID" element
     */
     public void setCoordinateOperationID(net.opengis.gml.IdentifierType coordinateOperationID)
    {
        generatedSetterHelperImpl(coordinateOperationID, COORDINATEOPERATIONID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinateOperationID" element
     */
    public net.opengis.gml.IdentifierType addNewCoordinateOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(COORDINATEOPERATIONID$0);
            return target;
        }
    }
}
