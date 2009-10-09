package com.mixercast.footprints.serializer;

import com.google.inject.Inject;  
import flex.messaging.endpoints.BaseHTTPEndpoint;  
import flex.messaging.io.SerializationContext;  
import flex.messaging.io.amf.Amf3Input;  
import flex.messaging.io.amf.Amf3Output;  
import java.io.ByteArrayInputStream;  
import java.io.ByteArrayOutputStream;  
import java.io.IOException;  
import java.io.InputStream;  
//import sun.misc.BASE64Decoder;  
//import sun.misc.BASE64Encoder;

import org.apache.commons.codec.binary.Base64;

public class AmfSerializer
{

    @Inject  
    private SerializationContext context = new SerializationContextProvider().get();  

    public <T> String toAmf(final T source) throws IOException {  
        final StringBuffer buffer = new StringBuffer();  
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();  
        final Amf3Output amf3Output = new Amf3Output(context);  
        amf3Output.setOutputStream(bout);  
        amf3Output.writeObject(source);  
        amf3Output.flush();  
        amf3Output.close();  
//        final BASE64Encoder encoder = new BASE64Encoder();  
        final Base64 encoder = new Base64();
        return encoder.encodeToString(bout.toByteArray());
    }  
  
    public <T> T fromAmf(final String amf) throws ClassNotFoundException, IOException {  
//        final BASE64Decoder decoder = new BASE64Decoder();  
        final Base64 decoder = new Base64();
        
    	byte[] input = decoder.decodeBase64(amf);  
        InputStream bIn = new ByteArrayInputStream(input);  
        Amf3Input amf3Input = new Amf3Input(context);  
        amf3Input.setInputStream(bIn);  
        return (T) amf3Input.readObject();  
    }
      
}
