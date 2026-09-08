import { test, expect } from '@playwright/test';

const casos = [
  { cep: '81234567', valor: '100', mensagem: 'Frete: R$ 15,00', valido: true, classe: 'CEP iniciado por 8' },
  { cep: '71234567', valor: '100', mensagem: 'Frete: R$ 25,00', valido: true, classe: 'demais CEPs' },
  { cep: '71234567', valor: '199,99', mensagem: 'Frete: R$ 25,00', valido: true, classe: 'abaixo do limite de frete grátis' },
  { cep: '71234567', valor: '200', mensagem: 'Frete grátis', valido: true, classe: 'limite de frete grátis' },
  { cep: '81234567', valor: '250', mensagem: 'Frete grátis', valido: true, classe: 'acima do limite de frete grátis' },
  { cep: '8123456', valor: '100', mensagem: 'Dados inválidos', valido: false, classe: 'CEP com 7 dígitos' },
  { cep: '812345678', valor: '100', mensagem: 'Dados inválidos', valido: false, classe: 'CEP com 9 dígitos' },
  { cep: 'abcdefgh', valor: '100', mensagem: 'Dados inválidos', valido: false, classe: 'CEP com letras' },
  { cep: '81234567', valor: '0', mensagem: 'Dados inválidos', valido: false, classe: 'valor zero' },
  { cep: '81234567', valor: '', mensagem: 'Dados inválidos', valido: false, classe: 'valor vazio' },
];

for (const caso of casos) {
  test(`frete: ${caso.classe}`, async ({ page }) => {
    await page.goto('/frete');
    await page.getByLabel('CEP').fill(caso.cep);
    await page.getByLabel('Valor do pedido').fill(caso.valor);
    await page.getByRole('button', { name: 'Calcular frete' }).click();

    const resultado = page.locator('#resultado');
    await expect(resultado).toBeVisible();
    await expect(resultado).toHaveText(caso.mensagem);
    await expect(resultado).toHaveAttribute('role', caso.valido ? 'status' : 'alert');
  });
}

