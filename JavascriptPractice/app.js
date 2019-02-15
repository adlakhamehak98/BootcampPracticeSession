(function() {
    'use strict';

    var a = prompt("Enter Amount = ");
    while(a<0 || isNaN(a)){
        var a = prompt("Please enter valid Amount = ");
    }
    document.getElementById("amount").innerHTML = a;

    var i = prompt("Enter Interest Rate = ");
    while(i<0 || isNaN(i)){
        var i = prompt("Please enter valid Interest Rate = ");
    }

    document.getElementById("interest_rate").innerHTML = i;

    var y = prompt("Enter Number of Years = ");
    while(y<0 || isNaN(y)){
        var y = prompt("Please enter valid Number of Years = ");
    }
    document.getElementById("no_of_years").innerHTML = y;

    function si (a, i, y) {
        return a*i*y / 100;
    }
    document.getElementById("simple_interest").innerHTML = si(a,i,y);
}());