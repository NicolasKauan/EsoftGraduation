let display = document.getElementById("display");
let firstNumber = "";
let secondNumber = "";
let currentOperation = null;

function addNumber(num){
    display.value += num;
}

function setOperation(op){
    if(display.value == "") return;
    firstNumber = display.value;
    currentOperation = op;
    display.value += " " + op + " ";
}

function calculateResult(){
    if(firstNumber === "" || display.value === "") return;

    secondNumber = display.value;
    let result;
    switch (currentOperation) {
        case "+":
            result = parseFloat(firstNumber) + parseFloat(secondNumber);
            break;
        case "-":
            result = parseFloat(firstNumber) - parseFloat(secondNumber);
            break;
        case "*":
            result = parseFloat(firstNumber) * parseFloat(secondNumber);
            break;
        case "/":
            result = parseFloat(secondNumber) === 0 ? "Erro" : parseFloat(firstNumber) / parseFloat(secondNumber);
            break;
        default:
            return;
    }

    display.value = result;
    firstNumber = "";
    secondNumber = "";
    currentOperation = null;
}

function clearDisplay(){
    display.value = "";
    firstNumber = "";
    secondNumber = "";
    currentOperation = null;
}