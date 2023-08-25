/**
 * 
 */
function sendit() {
	
	let frm = document.joinForm;
	let userid = frm.userid;
	let userpw = frm.userpw;
	let userpw_re =frm.userpw_re;
	let username = frm.username;
	
	if (userid.value == "") {
		alert("아이디를 입력하세요");
		userid.focus();
		return false;
	}
	
	if (userpw.value == "") {
		alert("패스워드를 입력하세요");
		userpw.focus();
		return false;
		
	}
	if (userpw.value != userpw_re.value) {
		alert("패스워드를 다릅니다");
		userpw.focus();
		return false;
		
	}
	
	if (username.value == "") {
		alert("이름이 다릅니다");
		username.focus();
		return false;
	}
	
	frm.submit();
}
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