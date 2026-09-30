// Aula 06 - Uniões discriminadas (Sebesta 6.10.2, p. 271)
// Online (recomendado): https://www.typescriptlang.org/play  (VERIFICA os tipos: mostra o erro do never)
// Online (alternativa): https://onecompiler.com/typescript    (só executa; NÃO verifica os tipos)
// Local:  npx tsc --strict uniao.ts && node uniao.js
type Forma =
  | { tipo: "circulo"; raio: number }
  | { tipo: "retangulo"; largura: number; altura: number }
  | { tipo: "triangulo"; base: number; altura: number };

function area(f: Forma): number {
  switch (f.tipo) {                  // "tipo" é a etiqueta (discriminante)
    case "circulo":
      return Math.PI * f.raio ** 2;  // aqui o TS sabe que f tem "raio"
    case "retangulo":
      return f.largura * f.altura;
    case "triangulo":
      return (f.base * f.altura) / 2;
    default: {
      const impossivel: never = f;   // se faltar um case, ERRO de compilação aqui
      return impossivel;
    }
  }
}

const formas: Forma[] = [
  { tipo: "circulo", raio: 1 },
  { tipo: "retangulo", largura: 2, altura: 3 },
  { tipo: "triangulo", base: 4, altura: 5 },
];
for (const f of formas) console.log(f.tipo, area(f).toFixed(2));
