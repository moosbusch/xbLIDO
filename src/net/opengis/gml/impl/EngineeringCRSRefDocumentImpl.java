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
 * A document containing one engineeringCRSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EngineeringCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.EngineeringCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public EngineeringCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENGINEERINGCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "engineeringCRSRef");
    
    
    /**
     * Gets the "engineeringCRSRef" element
     */
    public net.opengis.gml.EngineeringCRSRefType getEngineeringCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EngineeringCRSRefType target = null;
            target = (net.opengis.gml.EngineeringCRSRefType)get_store().find_element_user(ENGINEERINGCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "engineeringCRSRef" element
     */
    @Inject(optional=true) public void setEngineeringCRSRef(net.opengis.gml.EngineeringCRSRefType engineeringCRSRef)
    {
        generatedSetterHelperImpl(engineeringCRSRef, ENGINEERINGCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "engineeringCRSRef" element
     */
    public net.opengis.gml.EngineeringCRSRefType addNewEngineeringCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EngineeringCRSRefType target = null;
            target = (net.opengis.gml.EngineeringCRSRefType)get_store().add_element_user(ENGINEERINGCRSREF$0);
            return target;
        }
    }
}
