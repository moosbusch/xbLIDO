/*

 *
 */
package org.moosbusch.museum.lido.document;

import org.lidoSchema.LidoWrapDocument;
import org.lidoSchema.LidoWrapDocument.LidoWrap;
import org.lidoSchema.LidoWrapDocument.LidoWrap.Lido;
import org.moosbusch.museum.document.XmlDocument;
import org.moosbusch.museum.lido.inject.impl.LIDOObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface Document<T extends LIDOObjectFactory>
    extends XmlDocument<LidoWrapDocument, T, LidoWrap, Lido> {
    
    public static final String LIDO_NS_URI = "http://www.lido-schema.org";
    public static final String LIDO_NS_PREFIX = "lido";
    public static final String LIDO_SCHEMA_LOCATION =
            "http://www.lido-schema.org http://www.lido-schema.org/schema/v1.0/lido-v1.0.xsd";
}
