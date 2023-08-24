/**
 * 
 */

//회원가입 폼 value 확인하는 자바스크립트
function sendit() {
	//아이디 ""체크(빈값), alert(), return false, focus()
	//아이디 5자이상, 16자 미만
	//비밀번호 ""체크(빈값),alert(),return false, focus()
	//비밀번호 8자이상
	//비밀번호 == 비밀번호 확인
	//이름 ""체크(빈값), alert(), return false, focus()
	//휴대폰 번호 ""체크(빈값), alert(), return false, focus()
	//submit() 전송하기까지
	let frm = document.joinForm;
	let userid = frm.userid;
	let userpw = frm.userpw;
	let userpw_re = frm.userpw_re;
	let username = frm.username;
	let userphone = frm.userphone;

	if (userid.value == "") {
		alert("아이디를 입력하세요");
		userid.focus();
		return false;
	}
	if (userid.value.length <= 4 || userid.value.length >= 16) {
		alert("아이디는 5자이상 16미만으로 입력하세요");
		userid.focus();
		return false;
	}
	if (userpw.value == "") {
		alert("비밀번호를 입력하세요");
		userpw.focus();
		return false;
	}

	if (userpw_re.value.length < 8) {
		alert("비밀번호를 8자리이상 입력하세요");
		userpw_re.focus();
		return false;
	}
	if (userpw.value != userpw_re.value) {
		alert("패스워드가 다릅니다");
		userpw_re.focus();
		return false;
	}
	if (username.value == "") {
		alert("이름을 입력하세요");
		username.focus();
		return false;
	}
	if (userphone.value == "") {
		alert("번호를 입력하세요");
		userphone.focus();
		return false;
	}
	frm.submit();

}

	//로그인시 validation check
function logincheck() {
		//아이디 "", alert
		//비밀번호 "", alert
		let frm = document.frm;
		let userid = frm.userid;
		let userpw = frm.userpw;
		
		if (userid.value == "") {
			alert("아이디 입력 필수입니다");
			userid.focus();
			return false;
		}
		if (userpw.value == "") {
			alert("비밀번호 입력 필수입니다");
			userpw.focus();
			return false;
		}
		
		frm.submit();
}