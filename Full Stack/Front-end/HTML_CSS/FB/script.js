$(document).ready(function(){
    $("#sign").validate({
        rules:{
            fne:{
            required:true,
            minlength: 4,
            maxlength:12
        },
            sne:{
            required:true,
            minlength: 4,
            maxlength:12
        },
            em:{
                required:true,
                email:true
            },
            pas:{
                minlength:8,
                maxlength:16,
                equalTo:"#password"
            },
            day:{
                required:true
            },
            a:{
                required:true
            }

        },
        messages:{
            fne:{
            required:"Enter the title belongs to you.",
            minlength:"Enter atleast 4 letters."
        }    //fne:"Enter First name."
        }
    })
})