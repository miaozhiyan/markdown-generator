package com.douyu.wsd.doc.generator.domain.utils;

import com.douyu.wsd.doc.generator.domain.exceptions.MarkdownGeneratorException;
import com.douyu.wsd.doc.generator.domain.sapi.oxm.ControllerDocObject;
import com.douyu.wsd.doc.generator.domain.sapi.oxm.RequestInterface;
import com.douyu.wsd.doc.generator.domain.sapi.oxm.RequestParams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MarkdownUtil {
    public static void exportMarkDown(List<ControllerDocObject> list) throws MarkdownGeneratorException {
        for (ControllerDocObject docObject:list){
            File file = new File("D:/接口文档-"+docObject.getDescription()+".md");
            try {
                try (
                        FileWriter fileWriter = new FileWriter(file);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
                ) {
                    bufferedWriter.write("# "+docObject.getDescription()+" : "+docObject.getControllerName());
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    int i=1;
                    for (RequestInterface requestInterface:docObject.getRequestInterfaces()){
                        bufferedWriter.write("## "+ i++ +"."+requestInterface.getDescription()+"-"+requestInterface.getSummary());
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("- URI:"+requestInterface.getUri());
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("- 请求方式:"+requestInterface.getRequestMethod());
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("- 请求格式:"+requestInterface.getConsumes());
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("- 请求参数 :");
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("|参数名称|参数类型|必须|备注|");
                        bufferedWriter.newLine();
                        bufferedWriter.write("|-----|-----|-----|-----|");
                        bufferedWriter.newLine();
                        if (null != requestInterface.getParameters()){
                            for (RequestParams param : requestInterface.getParameters()){
                                bufferedWriter.write("|"+param.getName()
                                        +"|"+param.getType()
                                        +"|"+param.getRequired()
                                        +"|"+param.getDescription());
                                bufferedWriter.newLine();
                            }
                        }
                    }
                }
            } catch (IOException e) {
                throw new MarkdownGeneratorException(400,e.getMessage());
            }
        }
    }
}
