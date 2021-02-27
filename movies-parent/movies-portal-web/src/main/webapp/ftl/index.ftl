<!DOCTYPE html>
<html lang="zh-cn" xmlns:v-bind="http://www.w3.org/1999/xhtml">
<head>
    <title>黑马影视-online</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
</head>

<body>
<#include 'header.ftl'>

<!-- banner -->
<div id="slidey" style="display:block;">
    <ul id="moviesList">
        <#list bannerList as banner>
            <li><img src="${banner.picPath}" alt=" "><p class="title">${banner.title}</p><p class="description"> ${banner.contentDesc}</p></li>
        </#list>
    </ul>
</div>
<script src="js/jquery.slidey.js"></script>
<script src="js/jquery.dotdotdot.min.js"></script>
<script type="text/javascript">
    $("#slidey").slidey({
        interval: 2000,
        listCount: 5,
        autoplay: false,
        showList: true
    });
    $(".slidey-list-description").dotdotdot();
</script>

<!-- general -->
<div class="general">
    <h4 class="latest-text w3_latest_text">影视列表</h4>
    <div class="container">
        <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
            <ul id="myTab" class="nav nav-tabs" role="tablist">
                <#list moviesMap?keys as key>
                    <li role="presentation" class="${(key_index==0)?string('active','')}">
                        <a href="#home${key_index}"   role="tab" data-toggle="tab"   aria-expanded="true">  ${key}</a></li>
                </#list>
            </ul>
            <div id="myTabContent" class="tab-content">
                <#list moviesMap?values as moviesList>
                <div role="tabpanel"  class="${(moviesList_index==0)?string('tab-pane fade active in','tab-pane fade')}" id="home${moviesList_index}" >
                    <div class="w3_agile_featured_movies">
                        <#list moviesList as movies>
                         <div class="col-md-2 w3l-movie-gride-agile">
                            <a href="${movies.url}" class="hvr-shutter-out-horizontal"><img src="${movies.picPath}" style="width: 150px;height: 200px" title="album-name" class="img-responsive" alt=" " />
                                <div class="w3l-action-icon"><i class="fa fa-play-circle" aria-hidden="true"></i></div>
                            </a>
                            <div class="mid-1 agileits_w3layouts_mid_1_home">
                                <div class="w3l-movie-text">
                                    <h6><a href="/single.html?id=${movies.id}">${movies.title}</a></h6>
                                </div>
                                <div class="mid-2 agile_mid_2_home">
                                    <p>${movies.showTime?string('yyyy-MM-dd')}</p>
                                    <div class="block-stars">
                                        <ul class="w3l-ratings">
                                            <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                            <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                            <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                            <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                            <li><a href="#"><i class="fa fa-star-half-o" aria-hidden="true"></i></a></li>
                                        </ul>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                            </div>
                            <div class="ribben">
                                <p>NEW</p>
                            </div>
                        </div>
                        </#list>
                        <div class="clearfix"> </div>
                    </div>
                </div>
                </#list>
            </div>
        </div>
    </div>
</div>
<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>

<#include 'footer.ftl' >

</body>
</html>
