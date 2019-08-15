/**
 * 
 */
console.log($('#correctANS').val());
$("label.btn").on('click',function () {
	var choice = $(this).find('input:radio').val();
	var ans = $(this).parents("#quiz").find('#correctANS').val();

	if(ans == choice){
		$(this).parents("#quiz").find("span#answer").html("CORRECT");
	}
	else{
		$(this).parents("#quiz").find("span#answer").html("INCORRECT");
	}
});



/*
$(function(){
    var loading = $('#loadbar').hide();
    $(document)
    .ajaxStart(function () {
        loading.show();
    }).ajaxStop(function () {
    	loading.hide();
    });
    
    $("label.btn").on('click',function () {
    	var choice = $(this).find('input:radio').val();
    	$('#loadbar').show();
    	$('#quiz').fadeOut();
    	setTimeout(function(){
           $( "#answer" ).html(  $(this).checking(choice) );      
            $('#quiz').show();
            $('#loadbar').fadeOut();
            something else 
    	}, 1500);
    });

    $ans = $("#correctANS").val();
    console.log($ans);

    $.fn.checking = function(ck) {
        if (ck != $ans)
            return 'INCORRECT';
        else
            return 'CORRECT';
    };
    $("label.btn").on('click').find("#answer").attr('id', "answered");
});	*/