# Aula 10 - asyncio em Python: tarefas cooperativas em uma só linha de execução
# Online: https://onecompiler.com/python  (cole o código inteiro)
# Local:  python assincrono.py
import asyncio
import time


async def baixar(nome, segundos):
    await asyncio.sleep(segundos)       # "espera" sem bloquear, como numa chamada de rede
    return f"{nome} ok"


async def main():
    t = time.perf_counter()
    resultados = await asyncio.gather(baixar("a", 0.3), baixar("b", 0.3), baixar("c", 0.3))
    print(resultados, f"em {time.perf_counter() - t:.1f} s")   # ~0.3 s, e não 0.9 s


asyncio.run(main())
