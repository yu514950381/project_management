layui.use('element', function(){
    var element = layui.element;
});

var Str='<form class="layui-form" action="">\n' +
    '            <div class="memMa_min_center">\n' +
    '                <h3 style="font-size: 20px;">添加项目成员</h3>\n' +
    '                <div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">\n' +
    '                    <ul class="layui-tab-title">\n' +
    '                        <li class="layui-this">直接添加</li>\n' +
    '                        <li>从邮件邀请</li>\n' +
    '                    </ul>\n' +
    '                    <div class="layui-tab-content" style="height: 100px;">\n' +
    '                        <div class="layui-tab-item layui-show">\n' +
    '                            <div class="layui-form-item">\n' +
    '                                <div class="layui-input-inline">\n' +
    '                                    <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="用户名" class="layui-input">\n' +
    '                                </div>\n' +
    '                                <label class="layui-form-label" style="text-align: left">\n' +
    '                                    <a href="#"><i class="layui-icon">&#xe615;</i></a>\n' +
    '                                </label>\n' +
    '                            </div>\n' +
    '                        </div>\n' +
    '                        <div class="layui-tab-item">\n' +
    '                            <div class="layui-form-item">\n' +
    '                                <div class="layui-input-inline">\n' +
    '                                    <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="邮箱" class="layui-input">\n' +
    '                                </div>\n' +
    '                                <label class="layui-form-label" style="text-align: left">\n' +
    '                                    <a href="#"><i class="layui-icon">&#xe615;</i></a>\n' +
    '                                </label>\n' +
    '                            </div>\n' +
    '                        </div>\n' +
    '                    </div>\n' +
    '                </div>\n' +
    '            </div>\n' +
    '        </form>';

var Str1='<form class="layui-form" action="">\n' +
    '    <div>\n' +
    '        <div class="memMa_mainContext">\n' +
    '            <legend>成员详情</legend>\n' +
    '            <div class="memMa_mainInfo">\n' +
    '                <div class="layui-form-item">\n' +
    '                    <div class="layui-inline">\n' +
    '                        <label class="layui-form-label">编号</label>\n' +
    '                        <div class="layui-input-inline">\n' +
    '                            <input name="number" autocomplete="off" class="layui-input" type="text" value="15021321"/>\n' +
    '                        </div>\n' +
    '                    </div>\n' +
    '                </div>\n' +
    '                <div class="layui-form-item">\n' +
    '                    <div class="layui-inline">\n' +
    '                        <label class="layui-form-label">用户名</label>\n' +
    '                        <div class="layui-input-inline">\n' +
    '                            <input name="username" autocomplete="off" class="layui-input" type="text" value="aasd"/>\n' +
    '                        </div>\n' +
    '                    </div>\n' +
    '                </div>\n' +
    '                <div class="layui-form-item">\n' +
    '                    <div class="layui-inline">\n' +
    '                        <label class="layui-form-label">真实姓名</label>\n' +
    '                        <div class="layui-input-inline">\n' +
    '                            <input name="truename" autocomplete="off" class="layui-input" type="text" value="AASD"/>\n' +
    '                        </div>\n' +
    '                    </div>\n' +
    '                </div>\n' +
    '                <div class="layui-form-item">\n' +
    '                    <div class="layui-inline">\n' +
    '                        <label class="layui-form-label">性别</label>\n' +
    '                        <div class="layui-input-inline">\n' +
    '                            <input name="sex" autocomplete="off" class="layui-input" type="text" value="男"/>\n' +
    '                        </div>\n' +
    '                    </div>\n' +
    '                </div>\n' +
    '                <div class="layui-form-item">\n' +
    '                    <div class="layui-inline">\n' +
    '                        <label class="layui-form-label">QQ</label>\n' +
    '                        <div class="layui-input-inline">\n' +
    '                            <input name="QQ" autocomplete="off" class="layui-input" type="text" value="4659965484"/>\n' +
    '                        </div>\n' +
    '                    </div>\n' +
    '                </div>\n' +
    '                <div class="layui-form-item">\n' +
    '                    <div class="layui-inline">\n' +
    '                        <label class="layui-form-label">邮箱</label>\n' +
    '                        <div class="layui-input-inline">\n' +
    '                            <input name="email" autocomplete="off" class="layui-input" type="text" value="55556@233.com"/>\n' +
    '                        </div>\n' +
    '                    </div>\n' +
    '                </div>\n' +
    '                <div class="layui-form-item">\n' +
    '                    <div class="layui-inline">\n' +
    '                        <label class="layui-form-label">联系方式</label>\n' +
    '                        <div class="layui-input-inline">\n' +
    '                            <input name="tel" autocomplete="off" class="layui-input" type="text" value="杨国安"/>\n' +
    '                        </div>\n' +
    '                    </div>\n' +
    '                </div>\n' +
    '                <div class="layui-form-item">\n' +
    '                    <div class="layui-inline">\n' +
    '                        <label class="layui-form-label">权限</label>\n' +
    '                        <div class="layui-input-inline">\n' +
    '                            <select name="level" lay-filter="level">\n' +
    '                                <option value="0" selected="">管理员</option>\n' +
    '                                <option value="1" >成员</option>\n' +
    '                            </select>\n' +
    '                        </div>\n' +
    '                    </div>\n' +
    '                </div>\n' +
    '            </div>\n' +
    '        </div>\n' +
    '    </div>\n' +
    '</form>';

//table里面的操作栏对应的方法
layui.use(['table','layer'], function(){
    var table = layui.table;
    var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句


    //监听工具条
    table.on('tool(demo)', function(obj){
        var data = obj.data;
        if(obj.event === 'del'){
            layer.confirm('真的删除行么', function(index){
                obj.del();
                layer.close(index);
            });
        }else if(obj.event === 'point'){
            alert("2333")
        }else if(obj.event === 'viewDetail'){
            layer.open({
                type: 1
                ,title: false //不显示标题栏
                ,closeBtn: true
                ,area: '400px;'
                ,shade: 0
                ,id: 'LAY_layuipro1' //设定一个id，防止重复弹出
                ,btn: ['添加']
                ,btnAlign: 'c'
                ,moveType: 1 //拖拽模式，0或者1
                ,content: Str1
                ,success: function(layero){
                    var btn = layero.find('.layui-layer-btn');
                    btn.find('.layui-layer-btn0').attr({
                        href: 'http://www.layui.com/'
                    });
                }
            });
        }
    });

    //添加成员
    var active = {
        notice: function(){
            //示范一个公告层
            layer.open({
                type: 1
                ,title:'添加成员'
                ,offset: 'auto' //具体配置参考：http://www.layui.com/doc/modules/layer.html#offset
                ,id: 'layerDemo'+'auto'//防止重复弹出
                ,content: '<div style="padding: 20px 20px;">'+ '<input name="username" autocomplete="off" class="layui-input" type="text" placeholder="成员用户名"/>' +'</div>'
                ,area:'500px'
                ,btn: '添加'
                ,btnAlign: 'c' //按钮居中
                ,shade: 0
                ,yes: function(){
                    alert(2333);
                    layer.closeAll();
                }
            });
        },
        search: function(){
            alert("sousuo");
        }
    };

    $('.memMa_body_header .layui-btn').on('click', function(){
        var othis = $(this), method = othis.data('method');
        active[method] ? active[method].call(this, othis) : '';
    });
});
