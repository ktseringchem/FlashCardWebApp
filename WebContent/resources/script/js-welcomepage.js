$(document).ready(function() {
	document.getElementById("deletecard").onclick = function() {
		$.ajax({
			url : $("#sampleForm").attr("action"),
			data : data,
			type : "GET",

			success : function(response) {
				alert(response);
			},
			error : function(xhr, status, error) {
				alert(xhr.responseText);
			}
		});
	}
});