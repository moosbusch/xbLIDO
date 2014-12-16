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
 * An XML FileType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class FileTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.FileType
{
    private static final long serialVersionUID = 1L;
    
    public FileTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGEPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "rangeParameters");
    private static final javax.xml.namespace.QName FILENAME$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "fileName");
    private static final javax.xml.namespace.QName FILESTRUCTURE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "fileStructure");
    private static final javax.xml.namespace.QName MIMETYPE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "mimeType");
    private static final javax.xml.namespace.QName COMPRESSION$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "compression");
    
    
    /**
     * Gets the "rangeParameters" element
     */
    public net.opengis.gml.RangeParametersType getRangeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RangeParametersType target = null;
            target = (net.opengis.gml.RangeParametersType)get_store().find_element_user(RANGEPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rangeParameters" element
     */
     public void setRangeParameters(net.opengis.gml.RangeParametersType rangeParameters)
    {
        generatedSetterHelperImpl(rangeParameters, RANGEPARAMETERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rangeParameters" element
     */
    public net.opengis.gml.RangeParametersType addNewRangeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RangeParametersType target = null;
            target = (net.opengis.gml.RangeParametersType)get_store().add_element_user(RANGEPARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "fileName" element
     */
    public java.lang.String getFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileName" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(FILENAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fileName" element
     */
     public void setFileName(java.lang.String fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$2);
            }
            target.setStringValue(fileName);
        }
    }
    
    /**
     * Sets (as xml) the "fileName" element
     */
    public void xsetFileName(org.apache.xmlbeans.XmlAnyURI fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(FILENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(FILENAME$2);
            }
            target.set(fileName);
        }
    }
    
    /**
     * Gets the "fileStructure" element
     */
    public net.opengis.gml.FileValueModelType.Enum getFileStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILESTRUCTURE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.FileValueModelType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileStructure" element
     */
    public net.opengis.gml.FileValueModelType xgetFileStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FileValueModelType target = null;
            target = (net.opengis.gml.FileValueModelType)get_store().find_element_user(FILESTRUCTURE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fileStructure" element
     */
     public void setFileStructure(net.opengis.gml.FileValueModelType.Enum fileStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILESTRUCTURE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILESTRUCTURE$4);
            }
            target.setEnumValue(fileStructure);
        }
    }
    
    /**
     * Sets (as xml) the "fileStructure" element
     */
    public void xsetFileStructure(net.opengis.gml.FileValueModelType fileStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FileValueModelType target = null;
            target = (net.opengis.gml.FileValueModelType)get_store().find_element_user(FILESTRUCTURE$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.FileValueModelType)get_store().add_element_user(FILESTRUCTURE$4);
            }
            target.set(fileStructure);
        }
    }
    
    /**
     * Gets the "mimeType" element
     */
    public java.lang.String getMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mimeType" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(MIMETYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "mimeType" element
     */
    public boolean isSetMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIMETYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "mimeType" element
     */
     public void setMimeType(java.lang.String mimeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMETYPE$6);
            }
            target.setStringValue(mimeType);
        }
    }
    
    /**
     * Sets (as xml) the "mimeType" element
     */
    public void xsetMimeType(org.apache.xmlbeans.XmlAnyURI mimeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(MIMETYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(MIMETYPE$6);
            }
            target.set(mimeType);
        }
    }
    
    /**
     * Unsets the "mimeType" element
     */
    public void unsetMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIMETYPE$6, 0);
        }
    }
    
    /**
     * Gets the "compression" element
     */
    public java.lang.String getCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "compression" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COMPRESSION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "compression" element
     */
    public boolean isSetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPRESSION$8) != 0;
        }
    }
    
    /**
     * Sets the "compression" element
     */
     public void setCompression(java.lang.String compression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPRESSION$8);
            }
            target.setStringValue(compression);
        }
    }
    
    /**
     * Sets (as xml) the "compression" element
     */
    public void xsetCompression(org.apache.xmlbeans.XmlAnyURI compression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COMPRESSION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(COMPRESSION$8);
            }
            target.set(compression);
        }
    }
    
    /**
     * Unsets the "compression" element
     */
    public void unsetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPRESSION$8, 0);
        }
    }
}
