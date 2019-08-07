function onDelete(element) {
	var xhttp = new XMLHttpRequest();

	xhttp.open("DELETE", "http://localhost:8080/FlashCardWebApp/deletecard/"
			+ $(element).attr("id"), true);
	xhttp.send();
}


$(document).ready(function(){
	$('[data-toggle="tooltip"]').tooltip();
	var actions = $("table td:last-child").html();
	// Append table with add row form on add new button click
	$(".add-new").click(function(){
		$(this).attr("disabled", "disabled");
		var index = $("table tbody tr:last-child").index();
		var row = '<tr>' +
		'<td><input type="text" class="form-control" name="front" id="front"></td>' +
		'<td><input type="text" class="form-control" name="back" id="back"></td>' +
		'<td><input type="text" class="form-control" name="subject" id="subject"></td>' +
		'<td>' + actions + '</td>' +
		'</tr>';
		$("table").append(row);		
		$("table tbody tr").eq(index + 1).find(".add, .edit").toggle();
		$('[data-toggle="tooltip"]').tooltip();
	});
	// Add row on add button click
	$(document).on("click", ".add", function(){
		var empty = false;
		var input = $(this).parents("tr").find('input[type="text"]');

		card = [];
		input.each(function(){
			card.push($(this).val());
		});
		
		var xhttp = new XMLHttpRequest();
		
		xhttp.open("POST", "http://localhost:8080/FlashCardWebApp/edit/" 
				+ card[0] + "/" + card[1] + "/" + card[2], true);
		xhttp.send();
		
		input.each(function(){
			if(!$(this).val()){
				$(this).addClass("error");
				empty = true;
			} else{
				$(this).removeClass("error");
			}
		});
		$(this).parents("tr").find(".error").first().focus();
		if(!empty){
			input.each(function(){
				$(this).parent("td").html($(this).val());
			});			
			$(this).parents("tr").find(".add, .edit").toggle();
			$(".add-new").removeAttr("disabled");
		}		
	});
	// Edit row on edit button click
	$(document).on("click", ".edit", function(){		
		$(this).parents("tr").find("td:not(:last-child)").each(function(){
			$(this).html('<input type="text" class="form-control" value="' + $(this).text() + '">');
		});
		$(this).parents("tr").find(".add, .edit").toggle();
		$(".add-new").attr("disabled", "disabled");
	});
	// Delete row on delete button click
	$(document).on("click", ".delete", function(){
		$(this).parents("tr").remove();
		$(".add-new").removeAttr("disabled");
	});
});

const navSlide = () => {
    const burger = document.querySelector('.burger');
    const nav = document.querySelector('.nav-links');
    const navLinks = document.querySelectorAll('.nav-links li');


    burger.addEventListener('click', () => {
        nav.classList.toggle('nav-active');

        navLinks.forEach((link, index) => {
            if (link.style.animation) {
                link.style.animation = "";

            } else {
                link.style.animation = `navLinksFade 0.5s ease forwards ${index / 5 + 1}s`;
            }
        });
    });
}

navSlide();