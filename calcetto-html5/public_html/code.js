/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//
//var init = function() {        
//        console.log("It works!");
//    };
//    
//    $(document).ready(init);




var code = {
    init: function () {
        $.get("http://localhost:8090/calcetto-server/partite")
                .done(code.onGetSuccesYeah)
                .fail(code.onErrorBoooh);
    }
};

$(document).ready(code.init);

var partita = {

    data: "12/09/2018",
    struttura: "Agrese - Nocera Inf.",
    partecipanti: ["destefano86", "tafuri92", "demaio90", "rossi88"]


};

$(".site-heading").html(partita.data);