package com.douyu.wsd.doc.generator.domain.sapi.oxm;

import java.util.List;
import java.util.Map;

public class Property {
    private String type;
    private String format;
    private List<String> enumCode;
    private String example;
    private Items items;
    private String description;

    public static Property map2Property(Map map){
        Property property = new Property();
        property.setDescription( (String)map.get("description") );
        property.setEnumCode( (List<String>)map.get("enum") );
        property.setExample( (String)map.get("example") );
        property.setFormat( (String)map.get("format") );
        Map item = (Map)map.get("items");
        Items items = new Items();
        if (null !=item ){
            items.set$ref( (String)item.get("$ref") );
            items.setType( (String)item.get("type") );
            property.setItems(items);
        }
        String type = (String)map.get("type");
        property.setType( type );

        String ref = (String)map.get("$ref");
        if (type == null  &&  ref != null){
            property.setType(  "object" );
            if (items.get$ref() == null){
                items.set$ref(ref);
                property.setItems(items);
            }
        }

        return property;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<String> getEnumCode() {
        return enumCode;
    }

    public void setEnumCode(List<String> enumCode) {
        this.enumCode = enumCode;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
