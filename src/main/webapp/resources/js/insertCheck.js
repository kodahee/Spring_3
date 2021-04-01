/**
 * 
 */

let frm = document.getElementById("frm");

let name = document.getElementById("name");
let title = document.getElementById("title");
let btn = document.getElementById("btn");


btn.addEventListener("click", function() {
	let check1 = name.value.length != 0;
	let check2 = title.value != "";
	
	if(check1 && check2) {
		frm.submit();
	} else {
		alert("입력 항목을 다시 확인하세요.");
	}	
});


/* function insertCheck() {
	
	alert("Insert Check");
	
	// name, title 비어있는지 확인
	// 둘다 있으면 alert OK
	// 둘 중 하나라도 없으면 alert NO
	
	let name = document.getElementById("name");
	let title = document.getElementById("title");

	if(name.value != null && title.value != null) {
		alert("OK");
	} else {
		alert("NO");
	}
	
	
	return false;
	
}*/