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
 * A document containing one TopoVolume(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoVolumeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoVolumeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoVolumeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOVOLUME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoVolume");
    
    
    /**
     * Gets the "TopoVolume" element
     */
    public net.opengis.gml.TopoVolumeType getTopoVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoVolumeType target = null;
            target = (net.opengis.gml.TopoVolumeType)get_store().find_element_user(TOPOVOLUME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoVolume" element
     */
    @Inject(optional=true) public void setTopoVolume(net.opengis.gml.TopoVolumeType topoVolume)
    {
        generatedSetterHelperImpl(topoVolume, TOPOVOLUME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoVolume" element
     */
    public net.opengis.gml.TopoVolumeType addNewTopoVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoVolumeType target = null;
            target = (net.opengis.gml.TopoVolumeType)get_store().add_element_user(TOPOVOLUME$0);
            return target;
        }
    }
}
