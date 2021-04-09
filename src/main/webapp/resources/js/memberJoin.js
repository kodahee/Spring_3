/**
 * 
 */

let id = document.getElementById("id");
let pw = document.getElementById("pw");
let pw2 = document.getElementById("pw2");
let etc = document.getElementsByClassName("etc");
let btn = document.getElementById("btn");
let check = document.getElementById("check");

let result = false;

// --------------------- ID Check -------------------------
id.addEventListener("blur", function() {
	
	// id
	let message = "6글자 미만입니다.";
	let c = "r1";

	if(id.value.length > 5) {
		message = "6글자 이상입니다.";
		c = "r2";
	}
	
	let idResult = document.getElementById("idResult");
	idResult.innerHTML = message;
	idResult.setAttribute("class", c);

});

// --------------------- PW Check -------------------------
pw.addEventListener("blur", function() {
	
		
	// pw
	let message = "8글자 미만입니다."
	let c = "r1";
	
	if(pw.value.length>7) {
		message = "8글자 이상입니다.";
		c = "r2";
	}
	
	let pwResult = document.getElementById("pwResult");
	pwResult.innerHTML = message;
	pwResult.setAttribute("class", c);
	
});

pw.addEventListener("change", function() {	// 지웠다가 똑같은걸 써도 내용이 바뀐건 아니기 때문에 실행 x
	alert("change test");
});

// --------------------- PW Equal Check -------------------------
pw2.addEventListener("blur", function() {

	// 메세지 출력 후 칸 비움
	let message = "비밀번호가 일치하지 않습니다."
		
	if(pw.value != pw2.value) {
		pw2.value = "";
		c = "r2";
	} else {
		message = "";
	}
	
	let pwResult2 = document.getElementById("pwResult2");
	pwResult2.innerHTML = message;
	
});



btn.addEventListener("click", function() {
	//id.focus();
	
	// 조건이 만족하면
	let frm = document.getElementById("frm");
	frm.submit();
});

/*check.addEventListener("click", function() {
	alert("check test");
	return false;
})*/


// ID 중복 확인

$("#id").blur(function() {
	let id = $("#id").val();
	// alert(id);
	$.get("./memberIdCheck?id="+id, function(result) {
		result = result.trim();		// 공백 제거
		let str = "사용가능한 ID 입니다.";
		
		if(result == '0') {
			str = "중복 ID 입니다.";
		}
		
		$("#idCheckResult").html(str);
	});
});
