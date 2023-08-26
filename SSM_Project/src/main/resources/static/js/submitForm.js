/**
 * 
 */

var urlPaths = {
	search: '/search',
	add: '/insert',
	add2: '/submit',
	update2: '/update2',
	update: '/{date}/update(date=*{attendanceDate})',
	delete: '/deleteEmployees',
	logout: '/logout'
};

// URLパスを取得する関数
function getUrlPath(key) {
	return urlPaths[key] || '';
}

function submitForm(formId, keyName, method = undefined) {
	var form = document.getElementById(formId); // フォーム要素を取得
	if (hasEmptyDate()) {
		showErrorMessage("日付は必須項目です。");
		return;
	}
	if (hasEmptyContent() && hasSelectedStatus("0")) {
		showErrorMessage("作業内容に入力してください。");
		return;
	}
	form.action = getUrlPath(keyName); // フォームのaction属性にURLを設定
	if (method !== undefined) form.method = method;    // フォームのmethod属性にHTTPメソッドを設定
	form.submit(); // フォームを送信
}

function hasEmptyDate() {
	var dateInput = document.querySelector("input[type='date']");
	return dateInput.value === "";
}

function hasEmptyContent() {
	var contentInput = document.querySelector("textarea[name='remarks']");
	return contentInput.value === "";
}

function hasSelectedStatus(statusValue) {
	var statusSelect = document.querySelector("select[name='statusId']");
	return statusSelect.value === statusValue;
}

function showErrorMessage(message) {
	var errorDiv = document.createElement("div");
	errorDiv.className = "error-message";
	errorDiv.textContent = message;

	var existingError = document.querySelector(".error-message");
	if (existingError) {
		existingError.remove();
	}

	var form = document.querySelector("form");
	form.appendChild(errorDiv);
}

