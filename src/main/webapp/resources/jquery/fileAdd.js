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