<?php
// Aula 07 - Coerção em comparações: o "type juggling" do PHP (Sebesta 7.4.1, p. 311)
// Online: https://onecompiler.com/php  (cole o código inteiro)
// Local:  php coercao.php
var_dump("0e123" == "0e456");   // true!  as duas "parecem" números: 0 x 10^123 == 0 x 10^456
var_dump("0e123" === "0e456");  // false: === não converte
var_dump("1" == "01");          // true
var_dump(100 == "1e2");         // true
var_dump("abc" == 0);           // false no PHP 8 (era true no PHP 7!)

// Ataque clássico: dois hashes MD5 diferentes que começam com "0e" seguido só de dígitos
var_dump(md5("240610708"));
var_dump(md5("QNKCDZO"));
var_dump(md5("240610708") == md5("QNKCDZO"));   // true: um login que compara com == aceita a senha errada
