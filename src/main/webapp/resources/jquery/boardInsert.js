/**
 * 
 */


/*$("#add").click(function() {
	console.log("add");
	alert("add");
	
});
*/

$("#btn").click(function() {
	
	let result = true;
	
	// 배열, each반복문(foreach와 비슷)
	$(".myCheck").each(function(s1, s2) {
		console.log(s1);	// index 번호
		console.log(s2);	// element
		console.log(this);	// element
		console.log($(s2).val());
		
		if($(this).val() != "") {
			result = false;
		}
	});
	
/*	let name = $("#name").val();
	let title = $("#title").val();
	let contents = $("#contents").val();
*/	
	// let name = $("#name").val() != "";
	// let title = $("#title").val().length != 0;
	// let contents = $("#contents").val().length != 0;
	
	// name.length도 가능	
	if(result) {
		$("#frm").submit();
	} else {
		alert("등록 실패");
	}

});
