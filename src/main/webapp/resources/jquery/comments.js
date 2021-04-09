/**
 * 
 */
let num = $("#commnets").attr("title");
$.get("../comments/commentsList?num="+num, function(data) {
	
	console.log(data);
});