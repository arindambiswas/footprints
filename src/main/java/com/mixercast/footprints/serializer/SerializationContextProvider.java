package com.mixercast.footprints.serializer;

import com.google.inject.Provider;
import flex.messaging.io.SerializationContext;

public class SerializationContextProvider implements Provider<SerializationContext>
{
/*    @Override
 *   (non-Javadoc)
 * @see com.google.inject.Provider#get()
 */
    public SerializationContext get() {  
    	SerializationContext serializationContext = SerializationContext.getSerializationContext();// Threadlocal SerializationContent  
        serializationContext.enableSmallMessages = true;  
        serializationContext.instantiateTypes = true;  
        serializationContext.supportRemoteClass = true;// use _remoteClass field  
        serializationContext.legacyCollection = false;// false  Legacy Flex 1.5 behavior was to return a java.util.Collection for Array, New Flex 2+ behavior is to return Object[] for AS3 Array  
        serializationContext.legacyMap = false;// false Legacy flash.xml.XMLDocument Type  
        serializationContext.legacyXMLDocument = false;// true New E4X XML Type  
        serializationContext.legacyXMLNamespaces = false;// determines whether the constructed Document is name-space aware  
        serializationContext.legacyThrowable = false;  
        serializationContext.legacyBigNumbers = false;  
        serializationContext.restoreReferences = false;  
        serializationContext.logPropertyErrors = false;  
        serializationContext.ignorePropertyErrors = true;  
        return serializationContext;  
  
    /* 
    serializationContext.enableSmallMessages = serialization.getPropertyAsBoolean(ENABLE_SMALL_MESSAGES, true); 
    serializationContext.instantiateTypes = serialization.getPropertyAsBoolean(INSTANTIATE_TYPES, true); 
    serializationContext.supportRemoteClass = serialization.getPropertyAsBoolean(SUPPORT_REMOTE_CLASS, false); 
    serializationContext.legacyCollection = serialization.getPropertyAsBoolean(LEGACY_COLLECTION, false); 
    serializationContext.legacyMap = serialization.getPropertyAsBoolean(LEGACY_MAP, false); 
    serializationContext.legacyXMLDocument = serialization.getPropertyAsBoolean(LEGACY_XML, false); 
    serializationContext.legacyXMLNamespaces = serialization.getPropertyAsBoolean(LEGACY_XML_NAMESPACES, false); 
    serializationContext.legacyThrowable = serialization.getPropertyAsBoolean(LEGACY_THROWABLE, false); 
    serializationContext.legacyBigNumbers = serialization.getPropertyAsBoolean(LEGACY_BIG_NUMBERS, false); 
    boolean showStacktraces = serialization.getPropertyAsBoolean(SHOW_STACKTRACES, false); 
    if (showStacktraces && Log.isWarn()) 
    log.warn("The " + SHOW_STACKTRACES + " configuration option is deprecated and non-functional. Please remove this from your configuration file."); 
    serializationContext.restoreReferences = serialization.getPropertyAsBoolean(RESTORE_REFERENCES, false); 
    serializationContext.logPropertyErrors = serialization.getPropertyAsBoolean(LOG_PROPERTY_ERRORS, false); 
    serializationContext.ignorePropertyErrors = serialization.getPropertyAsBoolean(IGNORE_PROPERTY_ERRORS, true); 
     */  
    }  
}
