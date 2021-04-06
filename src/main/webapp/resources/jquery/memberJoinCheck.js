/**
 * 
 */



$("#all").click(function() {
	
	let all = $("#all").prop("checked");
	// let all = $("#all").attr("checked");		// undefined, 안됨
	console.log(all);

	$(".ch").prop("checked", all);

});

$(".ch").click(function() {
	let result = true;
	
	$(".ch").each(function() {
		let check = $(this).prop("checked");
		if(!check) {
			result = false;
		}
	});

	$("#all").prop("checked", result);
	
});

$("#btn").click(function() {
	if($("#all").prop("checked")) {
		location.href="./memberJoin";
	} else {
		alert("약관에 모두 동의하세요.");
	}
});