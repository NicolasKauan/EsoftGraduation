/* Aula 07 - Seleção múltipla em C: switch sem break (Sebesta 8.2.2.2, p. 335-336)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc switch.c -o switch && ./switch
 */
#include <stdio.h>

void sem_break(int index) {        /* exemplo do livro, p. 335 */
    int odd = 0, even = 0;
    switch (index) {
        case 1:
        case 3: odd += 1;
        case 2:                    /* o controle "cai" para os próximos casos */
        case 4: even += 1;
        default: printf("  Error in switch, index = %d\n", index);
    }
    printf("sem break: index=%d odd=%d even=%d\n", index, odd, even);
}

void com_break(int index) {
    int odd = 0, even = 0;
    switch (index) {
        case 1:
        case 3: odd += 1; break;
        case 2:
        case 4: even += 1; break;
        default: printf("  Error in switch, index = %d\n", index);
    }
    printf("com break: index=%d odd=%d even=%d\n", index, odd, even);
}

int main(void) {
    sem_break(1);    /* odd=1, even=1 E ainda imprime o erro! */
    com_break(1);
    return 0;
}
