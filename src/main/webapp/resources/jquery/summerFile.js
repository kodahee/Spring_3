/**
 * 
 */

$("#contents").summernote({
	height: 500,		// 처음 시작 크기
	placeholder: 'write here...',
	callbacks: {
	    onImageUpload: function(files) {		// files 는 이미지파일, 배열
	      // upload image to server and create imgNode...
	      // $summernote.summernote('insertNode', imgNode);
	    	uploadFile(files);
	    }
	}
});

function uploadFile(files) {
	// alert("img upload File function");
	
	// 파일 업로드 method : post, encType : multipart/form-data
	const formData = new FormData();		// form 태그 생성
	formData.append('file', files[0]);		// input type="file" name="file"
	let filName = "";
	
	// ajax를 통해 보냄
	$.ajax({						// 여기에 작성하는 거는 대부분 form 태그의 속성
		type: "POST",
		url: "./summerFileUpload",	// 하는 일이 같음, 하는 일이 같다면 또다른 컨트롤러 하나로 작동도 가능
		data: formData,
		enctype: "multipart/form-data",
		cache: false,
		processData: false,
		contentType: false,
		success: function(result) {		// summerFile을 여러곳에서 사용될 수도 있기도 하고 폴더가 다를 수도 있으니까 경로명을 받음
			fileName = result.trim();
			$("#contents").summernote('insertImage', fileName);
		}
	});
	return result;
}