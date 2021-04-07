/**
 * 
 */



let count = 0;

$("#add").click(function() {
	// console.log($("#sample").html());
	
	if(count < 5) {
		$("#files").append($("#sample").html());
		count++;
	} else {
		alert("파일은 최대 5개까지 첨부 가능합니다.");
	}
	
});


$("#del").click(function() {
	// $("#files").remove();	// files div 태그까지 삭제
	$("#files").empty();		// files div 태그만 남아있음
});

$("#files").on("click", ".delete", function() {
	$(this).parent().remove();
	count--;
});