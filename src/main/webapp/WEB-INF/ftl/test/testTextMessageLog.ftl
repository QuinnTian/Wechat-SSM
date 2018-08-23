<Html>
<head>
    <title>测试界面：查询全部文本消息</title>
</head>
<body>
测试界面：查询全部文本消息
<table border="1" cellspacing="0" cellpadding="20">
    <!--1. list-->
    <tr><th>ID</th>
        <th>BID</th>
        <th>内容</th>
        <th>关键词</th>
        <th>类型</th>
        <th>发送方</th>
        <th>接收方</th>
        <th>创建时间</th>
        <th>消息类型</th>
        <th>消息ID</th>

    </tr>
			<#list textMessages as test>

			   <tr>
                   <td>${test.id!}</td>
                   <td>
                    ${test.BId?default("null")}
                   </td>
                   <td>
                       ${test.content?default("null")}
                   </td>
                   <td>
                       ${test.keyword?default("null")}
                   </td>
                   <td>
                       ${test.type?default("null")}
                   </td>
                   <td>
                       ${test.fromUserName?default("null")}
                   </td>

                   <td>
                       ${test.toUserName?default("null")}
                   </td>
                   <td>
                       ${test.createTime?default("null")}
                   </td>
                   <td>
                       ${test.msgType?default("null")}
                   </td>
                   <td>
                       ${test.msgId?default("null")}
                   </td>

               </tr>
            </#list>
</table>     <br>



<body>
</html>