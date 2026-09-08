import { test, expect } from '@playwright/test';

const casos = [
  { senha: 'Abcdef1x', confirmacao: 'Abcdef1x', mensagem: 'Senha cadastrada', valido: true, classe: 'senha com 8 caracteres' },
  { senha: 'Abcdefghijklmno12345', confirmacao: 'Abcdefghijklmno12345', mensagem: 'Senha cadastrada', valido: true, classe: 'senha com 20 caracteres' },
  { senha: 'Abcdef1', confirmacao: 'Abcdef1', mensagem: 'Senha fora do padrão', valido: false, classe: 'menos de 8 caracteres' },
  { senha: 'Abcdefghijklmnopqrs1X', confirmacao: 'Abcdefghijklmnopqrs1X', mensagem: 'Senha fora do padrão', valido: false, classe: 'mais de 20 caracteres' },
  { senha: 'abcdef123', confirmacao: 'abcdef123', mensagem: 'Senha fora do padrão', valido: false, classe: 'sem letra maiúscula' },
  { senha: 'ABCDEF123', confirmacao: 'ABCDEF123', mensagem: 'Senha fora do padrão', valido: false, classe: 'sem letra minúscula' },
  { senha: 'Abcdefghi', confirmacao: 'Abcdefghi', mensagem: 'Senha fora do padrão', valido: false, classe: 'sem número' },
  { senha: 'Abc def1', confirmacao: 'Abc def1', mensagem: 'Senha fora do padrão', valido: false, classe: 'com espaço' },
  { senha: 'Abcdef1x', confirmacao: 'Abcdef1y', mensagem: 'As senhas não coincidem', valido: false, classe: 'confirmação diferente' },
  { senha: '', confirmacao: '', mensagem: 'Senha fora do padrão', valido: false, classe: 'campos vazios' },
];

for (const caso of casos) {
  test(`senha: ${caso.classe}`, async ({ page }) => {
    await page.goto('/senha');
    await page.getByLabel('Nova senha').fill(caso.senha);
    await page.getByLabel('Confirmar senha').fill(caso.confirmacao);
    await page.getByRole('button', { name: 'Cadastrar senha' }).click();

    const resultado = page.locator('#resultado');
    await expect(resultado).toBeVisible();
    await expect(resultado).toHaveText(caso.mensagem);
    await expect(resultado).toHaveAttribute('role', caso.valido ? 'status' : 'alert');
  });
}

