<#include 'top.ftl'>
<#assign username = "ttt">
<h3>欢迎回来，${username}</h3>
<hr>
<#assign user={"username":"张三","password":"123"}>
<#if user??>
    欢迎您，${user.username}
<#else>
    请登录
</#if>
<hr>
<#assign myList=['张三','李四','王老五']>
<#list myList as list>
    ${list}
</#list>
<hr>
<#assign map={'张三':"132",'李四':"978"}>
<#list map?keys as key>
    ${key}----${map['${key}']}
</#list>
<hr>
<#assign mymap=[{'张三':"132"},{'李四':"978"}]>
<#list mymap as list>
    <#list list?keys as key>
        ${key}----${map['${key}']}
    </#list>
    <br>
</#list>
<hr>
<h3>常见函数</h3>
获取集合长度:${myList?size}<br>
转换数字为字符串: ${8+9} ======${8?c+9?c}<br>
<#assign member='{"1001":"张三","1002":"李四"}'?eval>
转换JSON字符串为对象:${member['1001']}<br>
日期:${.now}<br>
年月日:${.now?date}<br>
时间:${.now?time}<br>
自定义格式：${.now?string('yyyy年MM月dd日')}