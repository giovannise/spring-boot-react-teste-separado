#language: pt
  Funcionalidade: Visualizar clientes
    Como um usuário não logado
    Eu quero visualizar os clientes cadastrados
    Para poder escolher qual cliente vou interagir

  Cenário: Mostra cliente com nome e e-mail na primeira linha da lista de clientes
    Dado que estou na página inicial
    Quando não estou logado
    Então visualizo o cliente "Joana Junqueira" com o e-mail "lais.ribeiro@live.com" na posição "1"