window.onload = function() {
    var dragContainer = document.getElementById("dragContainer");
    var dragBg = document.getElementById("dragBg");
    var dragText = document.getElementById("dragText");
    var dragHandler = document.getElementById("dragHandler");

    //滑块最大偏移量
    var maxHandlerOffset = dragContainer.clientWidth - dragHandler.clientWidth;
    //是否验证成功的标记
    var isVertifySucc = false;
    initDrag();

    function initDrag() {
        dragText.textContent = "拖动滑块验证";
        dragHandler.addEventListener("mousedown", onDragHandlerMouseDown);
    }

    function onDragHandlerMouseDown() {
        document.addEventListener("mousemove", onDragHandlerMouseMove);
        document.addEventListener("mouseup", onDragHandlerMouseUp);
    }

    function onDragHandlerMouseMove() {
        /*
        html元素不存在width属性,只有clientWidth
        offsetX是相对当前元素的,clientX和pageX是相对其父元素的
        */
        var left = event.clientX - dragHandler.clientWidth / 2;
        if(left < 0) {
            left = 0;
        } else if(left > maxHandlerOffset) {
            left = maxHandlerOffset;
            verifySucc();
        }
        dragHandler.style.left = left + "px";
        dragBg.style.width = dragHandler.style.left;
    }
    function onDragHandlerMouseUp() {
        document.removeEventListener("mousemove", onDragHandlerMouseMove);
        document.removeEventListener("mouseup", onDragHandlerMouseUp);
        dragHandler.style.left = 0;
        dragBg.style.width = 0;
    }

    //验证成功
    function verifySucc() {
        isVertifySucc = true;
        dragText.textContent = "验证通过";
        dragText.style.color = "white";
        dragHandler.setAttribute("class", "dragHandlerOkBg");
        dragHandler.removeEventListener("mousedown", onDragHandlerMouseDown);
        document.removeEventListener("mousemove", onDragHandlerMouseMove);
        document.removeEventListener("mouseup", onDragHandlerMouseUp);
    };
}