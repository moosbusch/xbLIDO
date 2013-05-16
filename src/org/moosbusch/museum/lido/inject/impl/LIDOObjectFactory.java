/*

 *
 */
package org.moosbusch.museum.lido.inject.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.lidoSchema.LidoWrapDocument;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlObjectFactory;
import org.moosbusch.museum.lido.inject.LIDOModule;

/**
 *
 * @author moosbusch
 */
public class LIDOObjectFactory extends AbstractMuseumXmlObjectFactory
        <LIDOModule, LidoWrapDocument> {

    public static final String LIDO_NS_URI = "http://www.lido-schema.org";
    public static final String LIDO_NS_PREFIX = "lido";
    public static final String LIDO_SCHEMA_LOCATION =
            "http://www.lido-schema.org http://www.lido-schema.org/schema/v1.0/lido-v1.0.xsd";

    @Override
    protected LIDOModule createModule() {
        return new LIDOModuleImpl();
    }

    protected void addSchemaLocation(LidoWrapDocument lidoWrapDocument) {
        XmlCursor cursor = lidoWrapDocument.newCursor();

        if (cursor.toFirstChild()) {
            cursor.setAttributeText(new QName(XML_SCHEMA_NS_URI,
                    SCHEMA_LOCATION_ATTR), LIDO_SCHEMA_LOCATION);
        }

        cursor.dispose();
    }

    @Override
    public LidoWrapDocument createRootElement() {
        return createTypedObject(LidoWrapDocument.class);
    }

    @Override
    public LidoWrapDocument loadDocument(InputStream in)
            throws IOException, XmlException {
        return LidoWrapDocument.Factory.parse(in);
    }

    @Override
    public void saveDocument(LidoWrapDocument lidoWrapDocument,
            OutputStream out) throws IOException {
        XmlOptions xmlOptions = new XmlOptions();
        HashMap<String, String> namespaceMap = new HashMap<String, String>();
        namespaceMap.put(LIDO_NS_URI, LIDO_NS_PREFIX);
        xmlOptions.setSaveSuggestedPrefixes(namespaceMap);
        xmlOptions.setSavePrettyPrint();
        xmlOptions.setValidateStrict();
        addSchemaLocation(lidoWrapDocument);
        lidoWrapDocument.save(out, xmlOptions);
    }

}
