/*

 *
 */
package org.moosbusch.museum.lido.document.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.lidoSchema.LidoWrapDocument;
import org.moosbusch.museum.lido.document.spi.AbstractDocument;
import org.moosbusch.museum.lido.inject.impl.LIDOObjectFactory;

/**
 *
 * @author moosbusch
 */
public class DocumentImpl extends AbstractDocument<LIDOObjectFactory> {

    public DocumentImpl() {
    }

    public DocumentImpl(InputStream in) throws IOException, XmlException {
        super(in);
    }

    @Override
    protected void addSchemaLocation(LidoWrapDocument lidoWrapDocument) {
        XmlCursor cursor = lidoWrapDocument.newCursor();

        if (cursor.toFirstChild()) {
            cursor.setAttributeText(new QName(XML_SCHEMA_NS_URI,
                    SCHEMA_LOCATION_ATTR), LIDO_SCHEMA_LOCATION);
        }

        cursor.dispose();
    }

    @Override
    protected LidoWrapDocument loadDocumentImpl(InputStream in)
            throws IOException, XmlException {
        return LidoWrapDocument.Factory.parse(in);
    }

    @Override
    protected void saveDocumentImpl(LidoWrapDocument lidoWrapDocument,
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

    @Override
    protected LIDOObjectFactory createObjectFactory() {
        return new LIDOObjectFactory();
    }

}
