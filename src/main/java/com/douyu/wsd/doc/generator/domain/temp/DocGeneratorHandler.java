package com.douyu.wsd.doc.generator.domain.temp;

import com.douyu.wsd.doc.generator.domain.exceptions.MarkdownGeneratorException;
import com.douyu.wsd.doc.generator.domain.sapi.ApiDocsJsonObject;
import com.douyu.wsd.doc.generator.domain.sapi.oxm.ControllerDocObject;
import com.douyu.wsd.doc.generator.domain.sapi.oxm.RequestInterface;
import com.douyu.wsd.doc.generator.domain.utils.MarkdownUtil;
import com.google.gson.Gson;

import java.util.List;

public class DocGeneratorHandler {
    public static void main(String[] args) throws MarkdownGeneratorException {
        //1.获取doc-api信息
        Gson gson = new Gson();
        ApiDocsJsonObject apiDocsJsonObject = gson.fromJson(TestDoc.api, ApiDocsJsonObject.class);
        //2.提取所有的 paths,并生成 RequestInterface
        List<RequestInterface> requestInterfaces = RequestInterface.map2RequestInterfaceList(apiDocsJsonObject.getPaths(),apiDocsJsonObject.getDefinitions());
       //3. 将所有的接口都归类到对应的controller中去
        List<ControllerDocObject> list = ControllerDocObject.generateControllerDocObjectList(apiDocsJsonObject.getTags(),requestInterfaces);
        /* Todo 模拟发送请求 生成request, 获得 response 写入文档
        * */

        //4.导出markdown
        MarkdownUtil.exportMarkDown(list);
    }
}
