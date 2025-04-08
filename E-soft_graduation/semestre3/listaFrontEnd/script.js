function alerta() {
    alert("Olá mundo!");
}

function pConsole() {
    console.log("Meu Primeiro script em JavaScript");
}

function pedirNome(){
    let nome1 = prompt("Qual o seu nome: ");
    if(nome1){
        alert( "Olá "+ nome1 + "!");
    } else{
       alert("Você não digitou seu nome!");
    }
}

function somar() {

    let n1 = document.getElementById("primeiroN").value;
    let num1 = document.getElementById("primeiroN1").value;
    let n2 = document.getElementById("segundoN").value;
    let num2 = document.getElementById("segundoN1").value;


    let r = parseInt(n1) + parseInt(n2);
    let r1 = parseInt(num1) + parseInt(num2);
    if(r){
        console.log("A soma é:", r);
    } else{
        console.log("A soma é:", r1);
    }
    
}

function stringToInt(){
    let num1 = prompt("Qual o numero:");
    console.log("Seu numero: ",parseInt(num1));
}

function booleano(){
    alert("Vamos ver se você pode dirigir:");
    let idade = prompt("Digite sua idade: ");
    let  veri = verificadorDeIdade(idade);
    if (veri){
        console.log(veri);
    } else{
        console.log(veri);
    }

}

function verificadorDeIdade(x){
    if (x >= 18){
        return true;
    }
    return null
    
}

function tipoVariavel(op){
    let tin = document.getElementById("tipo").value;
    let numero = parseFloat(tin); 
    console.log("numero: "+numero+" Tipo: "+typeof(tin));
}

function mostrarMudanca(){
    let coisa = document.getElementById("muda").value;
    console.log("Antes: "+coisa);
    coisa = "hahahahhaha"
    console.log("Depois: "+coisa);
}

function imparP(){
    let num = document.getElementById("imparPar").value;
    if(num%2===0){
        alert("Par");
    } else{
        alert("Impar");
    }
}
// Exercicio 34
// const imu = "DADOS";
// imu = "2 dados";

// Exercicio 35: 
// let mud = "Nicolas"
// console.log(mud);
// mud = "Sara";
// console.log(mud);