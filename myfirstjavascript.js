function f1()
{
    alert("Welcome to TTA")
}

function msg()
{
    document.getElementById("p1").innerText=" You have clicked on the button";
}

function add()
{
    var n1 = document.getElementById("num1").value;
    var n2 = document.getElementById("num2").value;

    var num1 = parseFloat(n1); // string to number
    var num2 = parseFloat(n2);

    var r = num1 + num2;
    document.getElementById("result").innerText = r;
}

/*var name = "Andy";
var number = 20;
var status = 'Y';
var score = 90.89;

var x = 21;
var y = 2;
var result;
result = x/y; // division
result = x%y; //reminder

/*  Logical Operator*/
/* x1 = 10
 y1 = 20

 x2 = 30
 y2 = 20

 result = x1 > y1 // stmt 1-> false
 result = x2 < y2 // stmt 2-> false*/

