package com.douyu.wsd.doc.generator.domain.temp;

public class TestDoc {
    public static String api = "{\n" +
            "\t\"swagger\": \"2.0\",\n" +
            "\t\"info\": {\n" +
            "\t\t\"description\": \"wsd-活动后台-java-API,swagger自动构建,date：2018/7/23\",\n" +
            "\t\t\"version\": \"1.0\",\n" +
            "\t\t\"title\": \"wsd-活动后台-java-API\",\n" +
            "\t\t\"termsOfService\": \"mailto:wsd_group@douyu.tv\",\n" +
            "\t\t\"contact\": {\n" +
            "\t\t\t\"name\": \"缪执言\",\n" +
            "\t\t\t\"url\": \"mailto:miaozhiyan@douyu.tv\",\n" +
            "\t\t\t\"email\": \"miaozhiyan@douyu.tv\"\n" +
            "\t\t}\n" +
            "\t},\n" +
            "\t\"host\": \"wsd-carnival-admin-java.dev.dz11.com\",\n" +
            "\t\"basePath\": \"/\",\n" +
            "\t\"tags\": [{\n" +
            "\t\t\"name\": \"test-controller\",\n" +
            "\t\t\"description\": \"Test Controller\"\n" +
            "\t}, {\n" +
            "\t\t\"name\": \"actm-activity-controller\",\n" +
            "\t\t\"description\": \"活动控制器api\"\n" +
            "\t}],\n" +
            "\t\"paths\": {\n" +
            "\t\t\"/api/actmActivity/add\": {\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"actm-activity-controller\"],\n" +
            "\t\t\t\t\"summary\": \"新增活动\",\n" +
            "\t\t\t\t\"description\": \"活动后台-添加新活动\",\n" +
            "\t\t\t\t\"operationId\": \"addActUsingPOST\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"req\",\n" +
            "\t\t\t\t\t\"description\": \"req\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/AddActmActivityReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/CarnivalResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/actmActivity/edit\": {\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"actm-activity-controller\"],\n" +
            "\t\t\t\t\"summary\": \"编辑活动信息\",\n" +
            "\t\t\t\t\"description\": \"活动后台-编辑活动信息\",\n" +
            "\t\t\t\t\"operationId\": \"editActUsingPOST\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"req\",\n" +
            "\t\t\t\t\t\"description\": \"req\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/EditActmActivityReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/CarnivalResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/actmActivity/find/{id}\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"actm-activity-controller\"],\n" +
            "\t\t\t\t\"summary\": \"查看单个活动信息\",\n" +
            "\t\t\t\t\"description\": \"活动后台-查看单个活动详细信息\",\n" +
            "\t\t\t\t\"operationId\": \"findDetailUsingGET\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"name\": \"id\",\n" +
            "\t\t\t\t\t\"in\": \"path\",\n" +
            "\t\t\t\t\t\"description\": \"活动的id\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/CarnivalResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/actmActivity/list\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"actm-activity-controller\"],\n" +
            "\t\t\t\t\"summary\": \"活动列表显示\",\n" +
            "\t\t\t\t\"description\": \"活动后台-活动列表显示\",\n" +
            "\t\t\t\t\"operationId\": \"listActUsingGET\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"name\": \"searchKey\",\n" +
            "\t\t\t\t\t\"in\": \"query\",\n" +
            "\t\t\t\t\t\"description\": \"搜索关键字\",\n" +
            "\t\t\t\t\t\"required\": false,\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t}, {\n" +
            "\t\t\t\t\t\"name\": \"currentPage\",\n" +
            "\t\t\t\t\t\"in\": \"query\",\n" +
            "\t\t\t\t\t\"description\": \"当前页数（默认1，最小1）\",\n" +
            "\t\t\t\t\t\"required\": false,\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t}, {\n" +
            "\t\t\t\t\t\"name\": \"pageSize\",\n" +
            "\t\t\t\t\t\"in\": \"query\",\n" +
            "\t\t\t\t\t\"description\": \"一页展示多少条（默认10）\",\n" +
            "\t\t\t\t\t\"required\": false,\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/CarnivalResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/pms\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"test-controller\"],\n" +
            "\t\t\t\t\"summary\": \"pmstest\",\n" +
            "\t\t\t\t\"operationId\": \"pmstestUsingGET\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"type\": \"object\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/test/ping\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"test-controller\"],\n" +
            "\t\t\t\t\"summary\": \"ping\",\n" +
            "\t\t\t\t\"operationId\": \"pingUsingGET\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"type\": \"object\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/hello\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"test-controller\"],\n" +
            "\t\t\t\t\"summary\": \"ping\",\n" +
            "\t\t\t\t\"operationId\": \"pingUsingGET_1\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"type\": \"object\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t}\n" +
            "\t},\n" +
            "\t\"definitions\": {\n" +
            "\t\t\"AddActmActivityReq\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"required\": [\"description\", \"docLink\", \"endTime\", \"name\", \"nameEn\", \"ranges\", \"startTime\"],\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"addUser\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"description\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"活动的描述\",\n" +
            "\t\t\t\t\t\"description\": \"活动描述\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"docLink\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"http://XXXX(String类型)\",\n" +
            "\t\t\t\t\t\"description\": \"活动文档地址\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"endTime\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\",\n" +
            "\t\t\t\t\t\"example\": \"1525954121（10位时间戳）\",\n" +
            "\t\t\t\t\t\"description\": \"活动结束时间\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"name\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"XXX活动\",\n" +
            "\t\t\t\t\t\"description\": \"活动名称\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"nameEn\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"XXXActivity\",\n" +
            "\t\t\t\t\t\"description\": \"活动英文名称\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"ranges\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"活动范围[web,h5,pc]，多个逗号拼接\",\n" +
            "\t\t\t\t\t\"description\": \"活动范围\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"startTime\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\",\n" +
            "\t\t\t\t\t\"example\": \"1501254121（10位时间戳）\",\n" +
            "\t\t\t\t\t\"description\": \"活动开始时间\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"CarnivalResultVo\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"code\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"data\": {\n" +
            "\t\t\t\t\t\"type\": \"object\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"errorMsg\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"EditActmActivityReq\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"required\": [\"id\"],\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"description\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"这是有史以来明星阵容最多的活动\",\n" +
            "\t\t\t\t\t\"description\": \"活动描述信息\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"docLink\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"http://sdasads\",\n" +
            "\t\t\t\t\t\"description\": \"活动连接\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"editUser\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"endTime\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\",\n" +
            "\t\t\t\t\t\"example\": 1524259292,\n" +
            "\t\t\t\t\t\"description\": \"活动结束时间\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"id\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\",\n" +
            "\t\t\t\t\t\"example\": 2,\n" +
            "\t\t\t\t\t\"description\": \"活动id\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"name\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"XX活动\",\n" +
            "\t\t\t\t\t\"description\": \"活动中文名称\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"nameEn\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"someActivity\",\n" +
            "\t\t\t\t\t\"description\": \"活动英文名称\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"ranges\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"[web]\",\n" +
            "\t\t\t\t\t\"description\": \"活动范围\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"startTime\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\",\n" +
            "\t\t\t\t\t\"example\": 1524251242,\n" +
            "\t\t\t\t\t\"description\": \"活动开始时间\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t}\n" +
            "\t}\n" +
            "}";


    public static String api2 = "{\n" +
            "\t\"swagger\": \"2.0\",\n" +
            "\t\"info\": {\n" +
            "\t\t\"description\": \"发票系统描述\",\n" +
            "\t\t\"version\": \"0.0.1\",\n" +
            "\t\t\"title\": \"发票系统\",\n" +
            "\t\t\"termsOfService\": \"mailto:wsd_group@douyu.tv\",\n" +
            "\t\t\"contact\": {\n" +
            "\t\t\t\"name\": \"缪执言\",\n" +
            "\t\t\t\"url\": \"mailto:miaozhiyan@douyu.tv\",\n" +
            "\t\t\t\"email\": \"miaozhiyan@douyu.tv\"\n" +
            "\t\t}\n" +
            "\t},\n" +
            "\t\"host\": \"waiter-service-trunk.dz11.com\",\n" +
            "\t\"basePath\": \"/\",\n" +
            "\t\"tags\": [{\n" +
            "\t\t\"name\": \"invoice-controller\",\n" +
            "\t\t\"description\": \"发票接口\"\n" +
            "\t}],\n" +
            "\t\"paths\": {\n" +
            "\t\t\"/api/invoices/create\": {\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"开票接口\",\n" +
            "\t\t\t\t\"description\": \"开票入口接口\",\n" +
            "\t\t\t\t\"operationId\": \"createUsingPOST\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"createInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"createInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/CreateInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/download/{serialNo}\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"下载发票接口\",\n" +
            "\t\t\t\t\"description\": \"根据流水号下载发票\",\n" +
            "\t\t\t\t\"operationId\": \"downloadUsingGET\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"name\": \"serialNo\",\n" +
            "\t\t\t\t\t\"in\": \"path\",\n" +
            "\t\t\t\t\t\"description\": \"serialNo\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResponseEntity\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/email\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingGET\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"head\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingHEAD\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingPOST\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"put\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingPUT\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"delete\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingDELETE\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"options\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingOPTIONS\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"patch\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingPATCH\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/inventory\": {\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"inventory\",\n" +
            "\t\t\t\t\"operationId\": \"inventoryUsingPOST\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"req\",\n" +
            "\t\t\t\t\t\"description\": \"req\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/InventoryReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/invoice/{serialNo}\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"查询开票信息\",\n" +
            "\t\t\t\t\"description\": \"查询开票信息：通过流水号查询\",\n" +
            "\t\t\t\t\"operationId\": \"getUsingGET\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"name\": \"serialNo\",\n" +
            "\t\t\t\t\t\"in\": \"path\",\n" +
            "\t\t\t\t\t\"description\": \"serialNo\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/listInvoice\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingGET\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"head\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingHEAD\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingPOST\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"put\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingPUT\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"delete\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingDELETE\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"options\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingOPTIONS\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"patch\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingPATCH\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/offset\": {\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"offsetInvoice\",\n" +
            "\t\t\t\t\"operationId\": \"offsetInvoiceUsingPOST\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"offsetInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"offsetInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/OffsetInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t}\n" +
            "\t},\n" +
            "\t\"definitions\": {\n" +
            "\t\t\"CreateInvoiceReq\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"callerAppCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerKey\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerPwd\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"companyName\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"creditCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"description\": \"creditCode\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"details\": {\n" +
            "\t\t\t\t\t\"type\": \"array\",\n" +
            "\t\t\t\t\t\"description\": \"details 发票的详细清单\",\n" +
            "\t\t\t\t\t\"items\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/InvoiceDetailVo\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"idCard\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"description\": \"idCard\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"invoiceContent\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"description\": \"invoiceContent\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"invoicePrice\": {\n" +
            "\t\t\t\t\t\"type\": \"number\",\n" +
            "\t\t\t\t\t\"description\": \"invoicePrice\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"nickName\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"openAccount\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"description\": \"openAccount\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"openBank\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"description\": \"openBank\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"receiverEmail\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"description\": \"email\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"timeStamp\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"title\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"张三\",\n" +
            "\t\t\t\t\t\"description\": \"title\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"titleType\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"PERSONAL, COMPANY\",\n" +
            "\t\t\t\t\t\"description\": \"titleType\",\n" +
            "\t\t\t\t\t\"enum\": [\"PERSONAL\", \"COMPANY\"]\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"InventoryReq\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"callerAppCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerKey\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerPwd\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"companyName\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"timeStamp\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"InvoiceDetailVo\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"lineType\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"preferentialPolicyId\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"prodAmount\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"prodCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"prodName\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"prodPrice\": {\n" +
            "\t\t\t\t\t\"type\": \"number\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"prodPriceSum\": {\n" +
            "\t\t\t\t\t\"type\": \"number\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"prodTaxRate\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"taxFlag\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"taxMoney\": {\n" +
            "\t\t\t\t\t\"type\": \"number\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"ListInvoiceReq\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"callerAppCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerKey\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerPwd\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"endTime\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"pageNo\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"pageSize\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"startTime\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"status\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"enum\": [\"TEMP\", \"WAIT_FOR_PROCESS\", \"SUCCESS\", \"FAILED\", \"ALL\"]\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"timeStamp\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"OffsetInvoiceReq\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"callerAppCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerKey\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerPwd\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"serialNo\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"timeStamp\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"ResponseEntity\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"body\": {\n" +
            "\t\t\t\t\t\"type\": \"object\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"statusCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"enum\": [\"100\", \"101\", \"102\", \"103\", \"200\", \"201\", \"202\", \"203\", \"204\", \"205\", \"206\", \"207\", \"208\", \"226\", \"300\", \"301\", \"302\", \"303\", \"304\", \"305\", \"307\", \"308\", \"400\", \"401\", \"402\", \"403\", \"404\", \"405\", \"406\", \"407\", \"408\", \"409\", \"410\", \"411\", \"412\", \"413\", \"414\", \"415\", \"416\", \"417\", \"418\", \"419\", \"420\", \"421\", \"422\", \"423\", \"424\", \"426\", \"428\", \"429\", \"431\", \"451\", \"500\", \"501\", \"502\", \"503\", \"504\", \"505\", \"506\", \"507\", \"508\", \"509\", \"510\", \"511\"]\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"statusCodeValue\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"ResultVo\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"code\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"data\": {\n" +
            "\t\t\t\t\t\"type\": \"object\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"errorMsg\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"SendEmailReq\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"callerAppCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerKey\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerPwd\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"receiverEmail\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"serialNo\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"timeStamp\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"userName\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t}\n" +
            "\t}\n" +
            "}";

    public static String api3 = "{\n" +
            "\t\"swagger\": \"2.0\",\n" +
            "\t\"info\": {\n" +
            "\t\t\"description\": \"发票系统描述\",\n" +
            "\t\t\"version\": \"0.0.1\",\n" +
            "\t\t\"title\": \"发票系统\",\n" +
            "\t\t\"termsOfService\": \"mailto:wsd_group@douyu.tv\",\n" +
            "\t\t\"contact\": {\n" +
            "\t\t\t\"name\": \"缪执言\",\n" +
            "\t\t\t\"url\": \"mailto:miaozhiyan@douyu.tv\",\n" +
            "\t\t\t\"email\": \"miaozhiyan@douyu.tv\"\n" +
            "\t\t}\n" +
            "\t},\n" +
            "\t\"host\": \"localhost:8080\",\n" +
            "\t\"basePath\": \"/\",\n" +
            "\t\"tags\": [{\n" +
            "\t\t\"name\": \"invoice-controller\",\n" +
            "\t\t\"description\": \"发票接口\"\n" +
            "\t}],\n" +
            "\t\"paths\": {\n" +
            "\t\t\"/api/invoices/create\": {\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"开票接口\",\n" +
            "\t\t\t\t\"description\": \"开票入口接口\",\n" +
            "\t\t\t\t\"operationId\": \"createUsingPOST\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"createInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"createInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/CreateInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/download/{serialNo}\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"下载发票接口\",\n" +
            "\t\t\t\t\"description\": \"根据流水号下载发票\",\n" +
            "\t\t\t\t\"operationId\": \"downloadUsingGET\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"name\": \"serialNo\",\n" +
            "\t\t\t\t\t\"in\": \"path\",\n" +
            "\t\t\t\t\t\"description\": \"serialNo\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResponseEntity\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/email\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingGET\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"head\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingHEAD\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingPOST\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"put\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingPUT\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"delete\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingDELETE\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"options\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingOPTIONS\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"patch\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"sendEmail\",\n" +
            "\t\t\t\t\"operationId\": \"sendEmailUsingPATCH\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"description\": \"sendEmailReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/SendEmailReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/inventory\": {\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"inventory\",\n" +
            "\t\t\t\t\"operationId\": \"inventoryUsingPOST\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"req\",\n" +
            "\t\t\t\t\t\"description\": \"req\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/InventoryReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/invoice/{serialNo}\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"查询开票信息\",\n" +
            "\t\t\t\t\"description\": \"查询开票信息：通过流水号查询\",\n" +
            "\t\t\t\t\"operationId\": \"getUsingGET\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"name\": \"serialNo\",\n" +
            "\t\t\t\t\t\"in\": \"path\",\n" +
            "\t\t\t\t\t\"description\": \"serialNo\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/listInvoice\": {\n" +
            "\t\t\t\"get\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingGET\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"head\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingHEAD\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingPOST\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"put\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingPUT\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"delete\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingDELETE\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"options\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingOPTIONS\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t},\n" +
            "\t\t\t\"patch\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice接口\",\n" +
            "\t\t\t\t\"description\": \"查询发票接口\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingPATCH\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"listInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/ListInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/offset\": {\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"offsetInvoice\",\n" +
            "\t\t\t\t\"operationId\": \"offsetInvoiceUsingPOST\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"offsetInvoiceReq\",\n" +
            "\t\t\t\t\t\"description\": \"offsetInvoiceReq\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/OffsetInvoiceReq\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"/api/invoices/test/listInvoice\": {\n" +
            "\t\t\t\"post\": {\n" +
            "\t\t\t\t\"tags\": [\"invoice-controller\"],\n" +
            "\t\t\t\t\"summary\": \"listInvoice\",\n" +
            "\t\t\t\t\"operationId\": \"listInvoiceUsingPOST_1\",\n" +
            "\t\t\t\t\"consumes\": [\"application/json\"],\n" +
            "\t\t\t\t\"produces\": [\"*/*\"],\n" +
            "\t\t\t\t\"parameters\": [{\n" +
            "\t\t\t\t\t\"in\": \"body\",\n" +
            "\t\t\t\t\t\"name\": \"tttt4\",\n" +
            "\t\t\t\t\t\"description\": \"tttt4\",\n" +
            "\t\t\t\t\t\"required\": true,\n" +
            "\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}],\n" +
            "\t\t\t\t\"responses\": {\n" +
            "\t\t\t\t\t\"200\": {\n" +
            "\t\t\t\t\t\t\"description\": \"OK\",\n" +
            "\t\t\t\t\t\t\"schema\": {\n" +
            "\t\t\t\t\t\t\t\"$ref\": \"#/definitions/ResultVo\"\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t}\n" +
            "\t},\n" +
            "\t\"definitions\": {\n" +
            "\t\t\"CreateInvoiceReq\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"callerAppCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerKey\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerPwd\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"companyName\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"creditCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"description\": \"creditCode\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"details\": {\n" +
            "\t\t\t\t\t\"type\": \"array\",\n" +
            "\t\t\t\t\t\"description\": \"details 发票的详细清单\",\n" +
            "\t\t\t\t\t\"items\": {\n" +
            "\t\t\t\t\t\t\"$ref\": \"#/definitions/InvoiceDetailVo\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"idCard\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"description\": \"idCard\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"invoiceContent\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"description\": \"invoiceContent\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"invoicePrice\": {\n" +
            "\t\t\t\t\t\"type\": \"number\",\n" +
            "\t\t\t\t\t\"description\": \"invoicePrice\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"nickName\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"openAccount\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"description\": \"openAccount\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"openBank\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"description\": \"openBank\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"receiverEmail\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"description\": \"email\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"test\": {\n" +
            "\t\t\t\t\t\"$ref\": \"#/definitions/test\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"timeStamp\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"title\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"张三\",\n" +
            "\t\t\t\t\t\"description\": \"title\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"titleType\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"example\": \"PERSONAL, COMPANY\",\n" +
            "\t\t\t\t\t\"description\": \"titleType\",\n" +
            "\t\t\t\t\t\"enum\": [\"PERSONAL\", \"COMPANY\"]\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"InventoryReq\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"callerAppCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerKey\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerPwd\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"companyName\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"timeStamp\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"InvoiceDetailVo\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"lineType\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"preferentialPolicyId\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"prodAmount\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"prodCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"prodName\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"prodPrice\": {\n" +
            "\t\t\t\t\t\"type\": \"number\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"prodPriceSum\": {\n" +
            "\t\t\t\t\t\"type\": \"number\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"prodTaxRate\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"taxFlag\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"taxMoney\": {\n" +
            "\t\t\t\t\t\"type\": \"number\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"ListInvoiceReq\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"callerAppCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerKey\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerPwd\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"endTime\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"pageNo\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"pageSize\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"startTime\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"status\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"enum\": [\"TEMP\", \"WAIT_FOR_PROCESS\", \"SUCCESS\", \"FAILED\", \"ALL\"]\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"timeStamp\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"OffsetInvoiceReq\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"callerAppCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerKey\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerPwd\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"serialNo\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"timeStamp\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"ResponseEntity\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"body\": {\n" +
            "\t\t\t\t\t\"type\": \"object\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"statusCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\",\n" +
            "\t\t\t\t\t\"enum\": [\"100\", \"101\", \"102\", \"103\", \"200\", \"201\", \"202\", \"203\", \"204\", \"205\", \"206\", \"207\", \"208\", \"226\", \"300\", \"301\", \"302\", \"303\", \"304\", \"305\", \"307\", \"308\", \"400\", \"401\", \"402\", \"403\", \"404\", \"405\", \"406\", \"407\", \"408\", \"409\", \"410\", \"411\", \"412\", \"413\", \"414\", \"415\", \"416\", \"417\", \"418\", \"419\", \"420\", \"421\", \"422\", \"423\", \"424\", \"426\", \"428\", \"429\", \"431\", \"451\", \"500\", \"501\", \"502\", \"503\", \"504\", \"505\", \"506\", \"507\", \"508\", \"509\", \"510\", \"511\"]\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"statusCodeValue\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"ResultVo\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"code\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int32\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"data\": {\n" +
            "\t\t\t\t\t\"type\": \"object\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"errorMsg\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"SendEmailReq\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"callerAppCode\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerKey\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"callerPwd\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"receiverEmail\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"serialNo\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"timeStamp\": {\n" +
            "\t\t\t\t\t\"type\": \"integer\",\n" +
            "\t\t\t\t\t\"format\": \"int64\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"userName\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"test\": {\n" +
            "\t\t\t\"type\": \"object\",\n" +
            "\t\t\t\"properties\": {\n" +
            "\t\t\t\t\"aaa\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"bbb\": {\n" +
            "\t\t\t\t\t\"type\": \"string\"\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t}\n" +
            "\t}\n" +
            "}";
}
