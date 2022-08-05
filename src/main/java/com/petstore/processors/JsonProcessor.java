package com.petstore.processors;

import org.testng.log4testng.Logger;
import com.google.gson.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonProcessor {
    private static final Logger LOGGER = Logger.getLogger(JsonProcessor.class);
    JsonObject jarray;
    public String addIDPropertyToJson(String filePath, String propKey, Long propValue) throws FileNotFoundException {
        LOGGER.info("Adding a New Property to json input");
        jarray = new JsonParser().parse(new FileReader(filePath)).getAsJsonObject();
        jarray.addProperty(propKey,propValue);
        return jarray.toString();
    }

}
