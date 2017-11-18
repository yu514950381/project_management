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

layui.use('table', function(){
    var table = layui.table;
    //监听工具条
    table.on('tool(demo)', function(obj){
        var data = obj.data;
        if(obj.event === 'detail'){
            layer.msg('ID：'+ data.id + ' 的查看操作');
        } else if(obj.event === 'del'){
            layer.confirm('真的删除行么', function(index){
                obj.del();
                layer.close(index);
            });
        }
        else if(obj.event === 'setMission'){
            layer.prompt({
                formType: 2
                ,title: '修改 ID 为 ['+ data.id +'] 的正在执行的任务'
                ,value: data.mission
            }, function(value, index){
                layer.close(index);
                //这里一般是发送修改的Ajax请求
                //同步更新表格和缓存对应的值
                obj.update({
                    mission: value
                });
            });
        }
        else if(obj.event === 'setRemark'){
            layer.prompt({
                formType: 2
                ,title: '修改 ID 为 ['+ data.id +'] 的正在执行的备注'
                ,value: data.remark
            }, function(value, index){
                layer.close(index);
                //这里一般是发送修改的Ajax请求
                //同步更新表格和缓存对应的值
                obj.update({
                    remark: value
                });
            });
        }
    });

});

layui.use('layer', function(){ //独立版的layer无需执行这一句
    var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句

    //触发事件
    var active = {
        notice: function(){
            //示范一个公告层
            layer.open({
                type: 1
                ,title: false //不显示标题栏
                ,closeBtn: true
                ,area: '400px;'
                ,shade: 0.8
                ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
                ,btn: ['添加']
                ,btnAlign: 'c'
                ,moveType: 1 //拖拽模式，0或者1
                ,content: Str
                ,success: function(layero){
                    var btn = layero.find('.layui-layer-btn');
                    btn.find('.layui-layer-btn0').attr({
                        href: 'http://www.layui.com/'
                        ,target: '_blank'
                    });
                }
            });
        }
    };

    $('#addMember').on('click', function(){
        var othis = $(this), method = othis.data('method');
        active[method] ? active[method].call(this, othis) : '';
    });
});